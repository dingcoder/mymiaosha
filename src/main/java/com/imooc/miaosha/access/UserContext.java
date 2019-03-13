package com.imooc.miaosha.access;

import com.imooc.miaosha.domain.MiaoshaUser;
//得到当前线程的登录的用户
public class UserContext {

    private static ThreadLocal<MiaoshaUser> userHolder = new ThreadLocal<MiaoshaUser>();

    public static void setUser(MiaoshaUser user) {
        userHolder.set(user);
    }

    public static MiaoshaUser getUser() {
        return userHolder.get();
    }
}
