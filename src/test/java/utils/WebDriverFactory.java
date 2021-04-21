package utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
	
	private WebDriverFactory() {}

    private static WebDriver instance ;

    /**
     * This method initializes a lazy singleton instance of the webdriver incase it isnt already created, then returns it to the caller.
     * @return instance of WebDriver
     */
	public static synchronized WebDriver getChromeInstance() throws IOException{
    		System.setProperty("webdriver.chrome.driver", ActionFactory.getProperty("pathToDriver"));
            ChromeOptions options = new ChromeOptions();  
			options.addArguments("--ignore-certificate-errors");
    		instance = new ChromeDriver(options);
  		  	instance.manage().window().maximize();
			instance.manage().timeouts().implicitlyWait(Long.parseLong(ActionFactory.getProperty("minTimeout")), TimeUnit.SECONDS);
        
        return instance;
    }
}
