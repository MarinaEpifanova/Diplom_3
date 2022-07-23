import data.Customer;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static data.Customer.getRandomCustomer;

@Story("Проверяем регистрацию пользователя")
public class RegistrationTest extends BaseTest {

    @Test
    @DisplayName("Регистрация пользователя при корректном заполнении данных")
    @Description("Проверяем:\n" +
            " - пользователь успешно зарегистрирован")
    public void CorrectRegistrationTest() {
        Customer customer = getRandomCustomer();

        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .clickRegisterLogin()
                .setUsername(customer.getUsername())
                .setEmail(customer.getEmail())
                .setPassword(customer.getPassword())
                .clickRegisterUserDetail()
                .setEmail(customer.getEmail())
                .setPassword(customer.getPassword())
                .clickLoginButton()
                .isVisibleOrderButtonMain()
                .clickPersonalAccountButtonAuth()
                .clickExitLogin();
    }

    @Test
    @DisplayName("Регистрация пользователя при не корректном заполнении пароля")
    @Description("Проверяем:\n" +
            " - пользователь не зарегистрирован,выводится предупреждение о некорректном пароле")
    public void InCorrectRegistrationTest() {
        Customer customer = getRandomCustomer();

        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .clickRegisterLogin()
                .setUsername(customer.getUsername())
                .setPassword("12")
                .setEmail(customer.getEmail())
                .isVisibleIncorrectPasswordPage();
    }
}