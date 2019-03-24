package com.vip.zh.util;

import java.util.Random;

public class PasswordUtil {
    public final static String[] word = {
            "a", "b", "c", "d", "e", "f",
            "g", "h", "j", "k", "m", "n",
            "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F",
            "G", "H", "J", "K", "M", "N",
            "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z",
    };

    public static String[] num = {
            "2", "3", "4", "5", "6", "7", "8", "9"
    };

    /**
     * 随机生成密码
     */
    public static String randomPassword(int pwdLength) {
        StringBuilder stringBuffer = new StringBuilder();
        //以当前时间生成random
        Random random = new Random();
        boolean flag = false;
        //设置默认密码的长度为1+6位
        int length = random.nextInt(1) + pwdLength;
        for (int i = 0; i < length; i++) {
            if (flag) {
                stringBuffer.append(num[random.nextInt(num.length)]);
            } else {
                stringBuffer.append(word[random.nextInt(word.length)]);
            }
            flag = !flag;
        }
        return stringBuffer.toString();
    }

    /**
     * 生成随机盐
     *
     * @return
     */
    public static int randomSalt() {
        return (int) ((Math.random() * 9 + 1) * 100000);
    }

}
