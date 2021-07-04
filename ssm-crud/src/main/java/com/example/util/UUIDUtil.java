package com.example.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.UUID;
/**
 * @PROJECT_NAME: ssm-crud
 * @DESCRIPTION:
 * @USER: 冰淇淋分你一半
 * @DATE: 2021/7/1 23:07
 */
public class UUIDUtil {
    private static SecureRandom random = new SecureRandom();


    public static String getIP() {
        InetAddress addr = null;
        try {
            addr = InetAddress.getLocalHost();
            return addr.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "获取IP错误";
    }
    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间有-分割.
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }

    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
     */
    public static String uuid2() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 使用SecureRandom随机生成Long.
     */
    public static long randomLong() {
        return Math.abs(random.nextLong());
    }

    /**
     * 基于Base62编码的SecureRandom随机生成bytes.
     */
//    public static String randomBase62(int length) {
//        byte[] randomBytes = new byte[length];
//        random.nextBytes(randomBytes);
//        return Encodes.encodeBase62(randomBytes);
//    }
}
