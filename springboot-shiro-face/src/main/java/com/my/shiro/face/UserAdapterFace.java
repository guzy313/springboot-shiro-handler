package com.my.shiro.face;

import com.my.shiro.pojo.ShPermission;
import com.my.shiro.pojo.ShRoles;
import com.my.shiro.pojo.ShUsers;

import java.util.List;

/**
 * @author Gzy
 * @version 1.0
 * @Description: 用户服务接口定义
 */
public interface UserAdapterFace {

    /**
     * @param loginName
     * @return
     * @Description 通过 登录名 查询 用户列表
     */
    List<ShUsers> findUserByLoginName(String loginName);


    /**
     * @param
     * @return
     * @Description 查询所有权限对象列表
     */
    List<ShPermission> findAllPermissions();

    /**
     * @param userId
     * @return
     * @Description 通过 用户id 查询权限对象列表
     */
    List<ShPermission> findPermissionsByUserId(String userId);

    /**
     * @param userId
     * @return
     * @Description 通过 用户id 查询角色对象列表
     */
    List<ShRoles> findRolesByUserId(String userId);


}
