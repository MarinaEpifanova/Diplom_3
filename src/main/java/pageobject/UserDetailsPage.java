package pageobject;

import com.codeborne.selenide.SelenideElement;
import data.Customer;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class UserDetailsPage {

    // локатор поля ввода имени

    @FindBy(how = How.XPATH, using = "//form[@ class='Auth_form__3qKeq mb-20']/fieldset[1]/div/div/input")
    private SelenideElement usernameField;

    // метод заполнения поля ввода имени
    @Step("Заполнить поле ввода имени")
    public UserDetailsPage setUsername(String username) {
        usernameField.setValue(username);
        return this;
    }

    // локатор поля ввода email
    @FindBy(how = How.XPATH, using = "//form[@ class='Auth_form__3qKeq mb-20']/fieldset[2]/div/div/input")
    private SelenideElement emailField;

    // метод заполнения поля ввода email
    @Step("Заполнить поле ввода email")
    public UserDetailsPage setEmail(String email) {
        emailField.setValue(email);
        return this;
    }

    // локатор поля ввода пароля
    @FindBy(how = How.XPATH, using = "//form[@ class='Auth_form__3qKeq mb-20']/fieldset[3]/div/div/input")
    private SelenideElement passwordField;

    // метод заполнения поля ввода пароля
    @Step("Заполнить поле ввода пароля")
    public UserDetailsPage setPassword(String password) {
        passwordField.setValue(password);
        return this;
    }


    //Заполнение данных пользователя
    public UserDetailsPage inputUserDetails(Customer customer) {
        usernameField.setValue(customer.getUsername());
        emailField.setValue(customer.getEmail());
        passwordField.setValue(customer.getPassword());
        return this;
    }

    // Локатор кнопки регистрация
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    private SelenideElement registerUserDetail;

    // Метод клика на кнопку регистрация
    @Step("Нажать на кнопку регистрация")
    public LoginPage clickRegisterUserDetail() {
        registerUserDetail.scrollIntoView(true).click();
        return page(LoginPage.class);
    }

    // Локатор некорректный пароль
    @FindBy(how = How.XPATH, using = "//p[text()='Некорректный пароль']")
    private SelenideElement incorrectPassword;


    @Step("Вывод предупреждения о некорректном пароле")
    // Метод проверки вывода предупреждения о некорректном пароле
    public boolean isVisibleIncorrectPasswordPage() {
        return incorrectPassword.isDisplayed();
    }

}
