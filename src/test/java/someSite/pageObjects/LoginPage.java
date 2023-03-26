package someSite.pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private static final String SITE_URL = "https://app.tca.deltixuat.com/login";
    private static final SelenideElement USER_NAME_WEB_ELEMENT = $x("//input[@formcontrolname ='username']");
    private static final SelenideElement USER_PASSWORD_WEB_ELEMENT = $x("//input[@formcontrolname ='password']");
    private static final SelenideElement SIGN_IN_WEB_ELEMENT = $x("//button");

    public static final SelenideElement MAIN_PAGE = $x("//div[contains(@title, 'Benchmark')]/../../../../../../../..");
    private static final String USER_NAME = "selenium_chrome";
    private static final String USER_PASSWORD = "Axa@Demo";


    public void openPage() {
        Selenide.open(SITE_URL);
    }

    public void logIn() {
        USER_NAME_WEB_ELEMENT.sendKeys(USER_NAME);
        USER_PASSWORD_WEB_ELEMENT.sendKeys(USER_PASSWORD);
        SIGN_IN_WEB_ELEMENT.click();
    }

    public void closePage() {
        WebDriverRunner.getWebDriver().quit();
        Selenide.closeWebDriver();
    }
}
