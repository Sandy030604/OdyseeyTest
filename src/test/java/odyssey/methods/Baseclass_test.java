package odyssey.methods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Baseclass_test {
    WebDriver BaseDriver;

//    public Baseclass_test(WebDriver mainbaseDriver) {
//        BaseDriver = mainbaseDriver;
//    }

    public WebDriver setup(String baseurl, String basebrowser)
        {
            switch(basebrowser)
            {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    BaseDriver=new ChromeDriver();
                    BaseDriver.get(baseurl);
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    BaseDriver=new EdgeDriver();
                    BaseDriver.get(baseurl);
                    break;
            }
            return BaseDriver;
        }
        public void teardown(String baseurl)
        {
            BaseDriver.quit();

        }
}
