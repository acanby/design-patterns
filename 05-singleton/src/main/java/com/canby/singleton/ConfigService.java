package com.canby.singleton;

/**
 * Created by acanby on 23/10/2014.
 */
public class ConfigService {
    private static ConfigService configService;

    public synchronized static ConfigService getInstance() {
        if (configService == null) {
            configService = new ConfigService();
        }

        return configService;
    }

    private boolean isEnabled;
    private int count;
    private String name;

    // Private constructor because singleton
    private ConfigService() {

    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
