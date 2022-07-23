package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class RecoverDetailsPage {

    // Локатор кнопки, если вспомнили пароль, войти
    @FindBy(how = How.XPATH, using = "//a[@class='Auth_link__1fOlj']")
    private SelenideElement openRememberPassword;

    // Метод клика на кнопку войти, если вспонили пароль
    @Step("Нажать на кнопку войти, если вспомнили пароль")
    public LoginPage clickOpenRememberPassword() {
        openRememberPassword.click();
        return page(LoginPage.class);
    }
}
