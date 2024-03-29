package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class ChromeGrid implements IBrowser {
    @Override
    public WebDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browser","chrome");
        capabilities.setCapability("browserstack.debug", true);
        capabilities.setCapability("os", "Windows");
        capabilities.setCapability("os_version", "7");

        String username = "daniel2151";
        String accessKey = "ALLt9qUJ2ypn9s4Zypc5";

        String app = System.getenv("BROWSERSTACK_APP_ID");
        if(app != null && !app.isEmpty()) {
            capabilities.setCapability("app", app);
        }

        try {
            return new RemoteWebDriver(new URL("http://"+username+":"+accessKey+"@hub-cloud.browserstack.com"), capabilities);
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
