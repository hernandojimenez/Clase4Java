package demo.practica4.sort;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        Properties prop = new Properties();

        prop.load(new FileInputStream(new File("MiFactory.properties")));

        String className = (String)prop.get(objName);

        return Class.forName(className).newInstance();
    }
}
