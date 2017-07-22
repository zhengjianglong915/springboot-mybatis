package com.along.mapper;

import com.along.model.User;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    /**
     * 查看用户信息
     * @return
     */
    User findUserInfo();

    /**
     * 插入用户
     * @param user
     * @return
     */
    Integer insertUser(User user);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    Integer deleteUser(int userId);

    /**
     * 更新用户
     * @param name
     * @param userId
     * @return
     */
    Integer updateUser(String name, String userId);
}
