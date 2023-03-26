package someSite.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import someSite.pageObjects.LoginPage;


class LoginPageTest {
    LoginPage log = new LoginPage();

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        Configuration.timeout = 60000;
        log.openPage();
    }

    @Test
    public void login() {

        log.logIn();
        log.MAIN_PAGE.shouldBe(Condition.visible);
    }

    @AfterEach
    public void tearDown() {
        log.closePage();
    }

}