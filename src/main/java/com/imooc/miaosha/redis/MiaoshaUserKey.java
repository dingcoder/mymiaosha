package com.imooc.miaosha.redis;

public class MiaoshaUserKey extends BasePrefix {

    public static final int TOKEN_EXPIRE = 3600 * 24 * 2;

    private MiaoshaUserKey(int expireSeconds, String prefix) {
        super(expireSeconds, prefix);
    }

    public static MiaoshaUserKey token = new MiaoshaUserKey(TOKEN_EXPIRE, "tk");
    //过期时间为0，前缀为id
    public static MiaoshaUserKey getById = new MiaoshaUserKey(0, "id");
}
