package utils;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private  Properties properties;

    public  Properties getData() throws IOException {
        FileInputStream input=new FileInputStream("./src/test/resources/configData/Config.properties");
        properties=new Properties();
        properties.load(input);

        return properties;
    }

    public static void main(String[] args) throws IOException {
        ConfigReader configReader=new ConfigReader();
        configReader.getData();
    }



}
