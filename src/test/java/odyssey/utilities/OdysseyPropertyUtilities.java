package odyssey.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class OdysseyPropertyUtilities {
    Properties probables;
    public OdysseyPropertyUtilities() throws IOException {
        probables=new Properties();
        InputStream input=new FileInputStream("C:\\Users\\santhosh.krishnan\\eclipse-workspace\\Odyssey\\src\\test\\java\\odyssey\\testdata\\Odyseey.properties");
        probables.load(input);
    }

    public String getUrl()
    {
        String urls=probables.getProperty("url");
        return urls;
    }
    public String getbrowser()
    {
        String browsers=probables.getProperty("browser");
        return browsers;
    }


    public String getUname()
    {
        String uname=probables.getProperty("username");
        return uname;
    }

    public String getPassword()
    {
        String pword= probables.getProperty("password");
        return pword;
    }


}

