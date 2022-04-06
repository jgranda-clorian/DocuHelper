package com.clorian.docuhelper.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHelper {
    public static String getProp(String key) throws IOException {
        try (InputStream input =  PropertiesHelper.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            return prop.getProperty(key);
        }
    }
}
