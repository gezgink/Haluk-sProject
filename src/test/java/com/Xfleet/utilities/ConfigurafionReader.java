package com.Xfleet.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurafionReader {


    private static Properties properties = new Properties();

    static {
        try {

            //2-
            FileInputStream file = new FileInputStream("configuration.properties");
            //3-
            properties.load(file);

            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("Something happened in the ConfigurationReader class");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword) {

        return properties.getProperty(keyword);

    }

}

