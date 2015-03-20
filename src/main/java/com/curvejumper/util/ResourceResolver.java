/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curvejumper.util;

import java.io.File;

/**
 *
 * @author curvejumper
 */
public class ResourceResolver {

    /**
     * The base folder to store all the data used by this project.
     */
    private static final String BASE_DIR = System.getProperty("user.home") + "/goAndSpear";

    /**
     * Get the file used to store the user object JSON
     *
     * @return
     */
    public static File getUserFile() {
        File file = new File(BASE_DIR + "/" + "weather-map.json");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return file;
    }
}
