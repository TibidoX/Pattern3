package org.example;

import java.nio.charset.StandardCharsets;


public class StringData implements Data {
    private String data;

    public StringData(String data) {
        this.data = data;
    }

    @Override
    public byte[] toBytes() {
        return data.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public Data fromBytes(byte[] bytes) {
        return new StringData(new String(bytes, StandardCharsets.UTF_8));
    }
}