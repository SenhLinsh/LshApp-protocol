package com.linsh.protocol;

import java.util.HashMap;

class ConfigImpl implements Config {

    private final HashMap<String, Object> map;

    public ConfigImpl() {
        map = new HashMap<>();
    }

    @Override
    public Config put(String key, Object value) {
        map.put(key, value);
        return this;
    }

    @Override
    public Object get(String key) {
        return map.get(key);
    }

    @Override
    public <T> T getOrDefault(String key, T defaultValue) {
        T o;
        return (o = (T) map.get(key)) == null ? defaultValue : o;
    }

    @Override
    public int getInt(String key) {
        return (int) map.get(key);
    }

    @Override
    public long getLong(String key) {
        return (long) map.get(key);
    }

    @Override
    public String getString(String key) {
        return (String) map.get(key);
    }

    @Override
    public boolean getBoolean(String key) {
        return (boolean) map.get(key);
    }

    @Override
    public float getFloat(String key) {
        return (float) map.get(key);
    }

    @Override
    public double getDouble(String key) {
        return (double) map.get(key);
    }

    @Override
    public char getChar(String key) {
        return (char) map.get(key);
    }
}