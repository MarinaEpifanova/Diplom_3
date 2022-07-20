package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    // локатор поля ввода email
    @FindBy(how = How.XPATH, using = "//form[@ class='Auth_form__3qKeq mb-20']/fieldset[1]/div/div/input")
    private SelenideElement emailField;

    // метод заполнения поля ввода email
    @Step("Заполнить поле ввода email")
    public LoginPage setEmail(String email) {
        emailField.setValue(email);
        return page(LoginPage.class);
    }

    // локатор поля ввода пароля
    @FindBy(how = How.XPATH, using = "//form[@ class='Auth_form__3qKeq mb-20']/fieldset[2]/div/div/input")
    private SelenideElement passwordField;

    // метод заполнения поля ввода пароля
    @Step("Заполнить поле ввода пароля")
    public LoginPage setPassword(String password) {
        passwordField.setValue(password);
        return page(LoginPage.class);
    }

    // Локатор кнопки войти
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    private SelenideElement openLogin;

    // Метод клика на кнопку войти
    @Step("Нажать на кнопку войти")
    public MainPage clickLoginButton() {
        openLogin.click();
        return page(MainPage.class);
    }

    // Локатор кнопки регистрация
    @FindBy(how = How.XPATH, using = "//a[text()='Зарегистрироваться']")
    private SelenideElement registerLogin;

    // Метод клика на кнопку регистрация
    @Step("Нажать на кнопку регистрация")
    public UserDetailsPage clickRegisterLogin() {
        registerLogin.scrollIntoView(true).click();
        return page(UserDetailsPage.class);
    }

    // Локатор кнопки восстановления пароля
    @FindBy(how = How.XPATH, using = "//a[text()='Восстановить пароль']")
    private SelenideElement recoverLogin;

    @Step("Нажать на восстановления пароля")
    // Метод клика на кнопку восстановить
    public RecoverDetailsPage clickRecoverLogin() {
        recoverLogin.scrollIntoView(true).click();
        return page(RecoverDetailsPage.class);

    }

    // Локатор кнопки вход
    @FindBy(how = How.XPATH, using = "//h2[text()='Вход']")
    private SelenideElement openUserLogin;

    @Step("Отображается вход")
    // Метод проверки отображения вход
    public LoginPage isVisibleOpenUserLogin() {
        openUserLogin.shouldBe(Condition.visible);
        return this;
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

}