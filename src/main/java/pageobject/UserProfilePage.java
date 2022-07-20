package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class UserProfilePage {

    // Локатор кнопки выход
    @FindBy(how = How.XPATH, using = "//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']")
    private SelenideElement exitLogin;

    // Метод клика на кнопку выйти
    @Step("Нажать на кнопку выход")
    public LoginPage clickExitLogin() {
        exitLogin.click();
        return page(LoginPage.class);
    }

    // Локатор кнопки конструктор
    @FindBy(how = How.XPATH, using = "//p[text()='Конструктор']")
    private SelenideElement constructorButton;

    // Метод клика на кнопку конструктор
    @Step("Нажать на кнопку конструктор")
    public MainPage clickConstructorButton() {
        constructorButton.click();
        return page(MainPage.class);
    }

    // Локатор  логотипа Stellar Burgers
    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']/a")
    private SelenideElement logoButton;

    // Метод клика по  логотипу Stellar Burgers
    @Step("Нажать на  Stellar Burgers")
    public MainPage clickLogoButton() {
        logoButton.click();
        return page(MainPage.class);

    }


}