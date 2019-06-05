package com.baixing;

import com.alibaba.fastjson.JSONObject;

import java.util.Base64;
import java.util.Random;

public class LicenseGen {
    public static String GITLAB_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0Hxv3MkkZbMrKtIs6np9\n" +
            "ccP4OwGBkNhIvhPjcQP48hbbascv5RqsOquQGrYSD2ZrE/kbkRdkIcoHEeTZLif+\n" +
            "bDKFZFI7o5x0H92o9/GSvxHJhQ8mkmvwxD7lssGShwZEm8WG+U7BZqUV/gGmCDqe\n" +
            "9W8H8Fq2B0ck8IXjbQ4Zz+JlyV/NHZTZcs69plFiLKh4N6GYVftOVwSomh0bbypP\n" +
            "OB9WnLC7RC9a2LRrhtf8sqa2rRFmtyMMfgFFzLMzS+w+1K4+QLnWP1gKQVzaFnzk\n" +
            "pnwKPrqbGFYbRztIVEWbs8jPYlLkGb8ME4C84YVtQgbQcbyisU/VW3wUGkhT+J0k\n" +
            "xwIDAQAB";

    private static String IVPARAMETER = "0102030405060708";

    static String decrypt(String license, String publicKey) throws Exception {
        byte[] dataBytes = Base64.getMimeDecoder().decode(license);
        JSONObject jsonObject = JSONObject.parseObject(dataBytes,JSONObject.class);
        System.out.println(jsonObject);
        byte[] encryptedData = Base64.getMimeDecoder().decode(jsonObject.getString("data"));
        byte[] encryptedKey = Base64.getMimeDecoder().decode(jsonObject.getString("key"));
        byte[] aesIv = Base64.getMimeDecoder().decode(jsonObject.getString("iv"));

        byte[] aesKey = RSAUtil.decryptByPublicKey(encryptedKey,publicKey);

        return AES.Decrypt(encryptedData,aesKey,aesIv);
    }

    static String encrypt(String license, String privateKey) throws Exception{
        byte[] key = new byte[16];
        new Random().nextBytes(key);
        byte[] bIv = IVPARAMETER.getBytes();
        byte[] encryptedData = AES.Encrypt(license,key, bIv);
        byte[] encryptedKey = RSAUtil.encryptByPrivateKey(key,Base64.getMimeDecoder().decode(privateKey));
        EncryptLicense encryptLicense = new EncryptLicense(Base64.getMimeEncoder().encodeToString(encryptedData), Base64.getMimeEncoder().encodeToString(encryptedKey),Base64.getMimeEncoder().encodeToString(bIv));

        return Base64.getMimeEncoder().encodeToString(JSONObject.toJSONBytes(encryptLicense));
    }
}
