package com.baixing;

public class EncryptLicense {
    String data;
    String key;
    String iv;

    public EncryptLicense(String data, String key, String iv) {
        this.data = data;
        this.key = key;
        this.iv = iv;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIv() {
        return iv;
    }

    public void setIv(String iv) {
        this.iv = iv;
    }
}
