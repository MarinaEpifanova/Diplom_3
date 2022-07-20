import data.Customer;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.MainPage;
import static com.codeborne.selenide.Selenide.open;
import static data.Customer.getFirstCustomer;
import static data.Customer.getRandomCustomer;



@Story("Проверяем вход пользователя")
public class LoginTest extends BaseTest {


    @Test
    @DisplayName("Вход по кнопке Войти в аккаунт на главной")
    @Description("Проверяем:\n" + " - пользователь успешно залогинился")
    public void LoginEnterTest() {
        Customer customer = getFirstCustomer();

        open(MainPage.URL, MainPage.class)
                .clickEnterButtonMain()
                .setEmail(customer.getEmail())
                .setPassword(customer.getPassword())
                .clickLoginButton()
                .isVisibleOrderButtonMain()
                .clickPersonalAccountButtonAuth()
                .clickExitLogin();
    }

    @Test
    @DisplayName("Вход по кнопке Личный кабинет на главной")
    @Description("Проверяем:\n" + " - пользователь успешно залогинился")
    public void LoginPersonalAccountTest() {
        Customer customer = getFirstCustomer();

        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .setEmail(customer.getEmail())
                .setPassword(customer.getPassword())
                .clickLoginButton()
                .isVisibleOrderButtonMain()
                .clickPersonalAccountButtonAuth()
                .clickExitLogin();
    }

    @Test
    @DisplayName("Вход по кнопке Регистрация")
    @Description("Проверяем:\n" + " - пользователь успешно залогинился")
    public void LoginRegistrationTest() {
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
    @DisplayName("Вход по кнопке Восстановление пароля")
    @Description("Проверяем:\n" + " -  пользователь успешно залогинился")
    public void LoginRecoverTest() {
        Customer customer = getFirstCustomer();

        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .clickRecoverLogin()
                .clickOpenRememberPassword()
                .setEmail(customer.getEmail())
                .setPassword(customer.getPassword())
                .clickLoginButton()
                .isVisibleOrderButtonMain()
                .clickPersonalAccountButtonAuth()
                .clickExitLogin();
        }

    @Test
    @DisplayName("Переход в личный кабинет")
    @Description("Проверяем:\n" + " - осуществляется переход по клику в «Личный кабинет»")
    public void LoginOpenPersonalAccountTest() {
              open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .isVisibleOpenUserLogin();
    }

    @Test
    @DisplayName("Переход из личного кабинета на конструктор")
    @Description("Проверяем:\n" + " - осуществляется переход из личного кабинета на конструктор")
    public void TransitionConstructorTest() {
        Customer customer = getFirstCustomer();

        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .setEmail(customer.getEmail())
                .setPassword(customer.getPassword())
                .clickLoginButton()
                .clickPersonalAccountButtonAuth()
                .clickConstructorButton()
                .isVisibleSatBurgerMain()
                .clickPersonalAccountButtonAuth()
                .clickExitLogin();

    }


    @Test
    @DisplayName("Переход из личного кабинета на логотип Stellar Burgers")
    @Description("Проверяем:\n" + " - осуществляется переход из личного кабинета логотип Stellar Burgers")
    public void TransitionLogoTest() {
        Customer customer = getFirstCustomer();

        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .setEmail(customer.getEmail())
                .setPassword(customer.getPassword())
                .clickLoginButton()
                .clickPersonalAccountButtonAuth()
                .clickLogoButton()
                .isVisibleSatBurgerMain()
                .clickPersonalAccountButtonAuth()
                .clickExitLogin();

    }

    @Test
    @DisplayName("Выход по кнопке «Выйти» в личном кабинете")
    @Description("Проверяем:\n" + " - осуществляется выход из личного кабинета")
    public void LogOutTest() {
        Customer customer = getFirstCustomer();

        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .setEmail(customer.getEmail())
                .setPassword(customer.getPassword())
                .clickLoginButton()
                .clickPersonalAccountButtonAuth()
                .clickExitLogin()
                .isVisibleOpenUserLogin();

    }
}

