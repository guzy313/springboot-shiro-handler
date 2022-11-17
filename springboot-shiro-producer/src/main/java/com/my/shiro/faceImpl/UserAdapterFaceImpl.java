package com.my.shiro.faceImpl;


import com.my.shiro.core.adapter.ShUserAdapter;
import com.my.shiro.face.UserAdapterFace;
import com.my.shiro.mapper.ShPermissionMapper;
import com.my.shiro.mapper.ShRolesMapper;
import com.my.shiro.mapper.ShUsersMapper;
import com.my.shiro.pojo.ShPermission;
import com.my.shiro.pojo.ShRoles;
import com.my.shiro.pojo.ShUsers;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guzy
 * @version 1.0
 * @description 
 */
@DubboService(version = "1.0.0",retries = 3,timeout = 5000)
public class UserAdapterFaceImpl implements UserAdapterFace {

    @Autowired
    ShUserAdapter shUserAdapter;



    @Override
    public List<ShUsers> findUserByLoginName(String loginName){
        List<ShUsers> users = shUserAdapter.findUserByLoginName(loginName);
        return users;
    }


    @Override
    public List<ShPermission> findAllPermissions() {
        List<ShPermission> shPermissionList = shUserAdapter.findAllPermissions();
        return shPermissionList;
    }

    @Override
    public List<ShPermission> findPermissionsByUserId(String userId) {
        List<ShPermission> shPermissionList = shUserAdapter.findPermissionsByUserId(userId);
        return shPermissionList;
    }

    @Override
    public List<ShRoles> findRolesByUserId(String userId) {
        return shUserAdapter.findRolesByUserId(userId);
    }
}
