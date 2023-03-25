package org.example;

import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        String webappDirLocation = "webapps/";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }
}
