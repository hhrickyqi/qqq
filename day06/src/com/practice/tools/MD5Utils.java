package com.practice.tools;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MD5Utils {
    public static String getMessageDigest(final String psd){
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] bytes = psd.getBytes("utf-8");
            byte[] bytes1 = md.digest(bytes);

            String str = Base64.getEncoder().encodeToString(bytes1);
            return str;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
