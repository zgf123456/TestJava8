package com.zgf.java8.other;

import java.util.Base64;
import java.util.UUID;

/**
 * Created by zgf on 17/11/7.
 */
public class TestBase64 {
    public static void main(String[] args) throws Exception {
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();

        String str = UUID.randomUUID().toString();
        System.out.println(encoder.encodeToString(str.getBytes("UTF-8")));
        System.out.println(mimeEncoder.encodeToString(str.getBytes("UTF-8")));
        System.out.println(urlEncoder.encodeToString(str.getBytes("UTF-8")));
    }
}
