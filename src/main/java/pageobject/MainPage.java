package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.page;


public class MainPage {

    public static String URL = "https://stellarburgers.nomoreparties.site/";

    // Локатор кнопки раздела булки
    @FindBy(how = How.XPATH, using = "//span[text()='Булки']")
    private SelenideElement bunBurger;

    // Метод клика на кнопку раздела булки
    @Step("Перейти в раздел булки")
    public MainPage clickBunBurger() {
        bunBurger.scrollIntoView(true).click();
        return this;
    }

    // Локатор кнопки раздела соусы
    @FindBy(how = How.XPATH, using = "//span[text()='Соусы']")
    private SelenideElement souseBurger;

    // Метод клика на кнопку раздела соусы
    @Step("Перейти в раздел соусы")
    public MainPage clickSouseBurger() {
        souseBurger.scrollIntoView(true).click();
        return this;
    }

    // Локатор кнопки раздела начинки
    @FindBy(how = How.XPATH, using = "//span[text()='Начинки']")
    private SelenideElement fillingBurger;

    // Метод клика на кнопку раздела начинки
    @Step("Перейти в раздел начинки")
    public MainPage clickFillingBurger() {
        fillingBurger.scrollIntoView(true).click();
        return this;
    }

    // Локатор выделенного раздела
    @FindBy(how = How.XPATH, using = "//div[@Class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span")
    private SelenideElement constructorSelectedSection;

    // Проверка выделения нужного раздела
    @Step("Проверка выделения нужного раздела")
    public MainPage checkSelectedSection(String txt) {
        constructorSelectedSection.shouldHave(Condition.text(txt));
        return this;
    }

    // Локатор кнопки войти в аккаунт
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']")
    private SelenideElement enterButtonMain;

    @Step("Нажать на кнопку войти в аккаунт")
    // Метод клика на кнопку войти в аккаунт
    public LoginPage clickEnterButtonMain() {
        enterButtonMain.scrollIntoView(true).click();
        return page(LoginPage.class);
    }

    // Локатор кнопки оформить заказ
    @FindBy(how = How.XPATH, using = "//button[text()='Оформить заказ']")
    private SelenideElement orderButtonMain;


    // Метод клика на кнопку оформить заказ
    @Step("Отображение кнопки оформить заказ")
    public MainPage isVisibleOrderButtonMain() {
        orderButtonMain.shouldBe(Condition.visible);
        return this;
    }

    // Локатор соберите бургер
    @FindBy(how = How.XPATH, using = "//h1[text()='Соберите бургер']")
    private SelenideElement satBurgerMain;

    // Метод проверяющие отображение надписи соберите бургер
    @Step("Отображение соберите бургер")
    public MainPage isVisibleSatBurgerMain() {
        satBurgerMain.shouldBe(Condition.visible);
        return this;
    }

    // Локатор кнопки личный кабинет
    @FindBy(how = How.XPATH, using = "//p[text()='Личный Кабинет']")
    private SelenideElement personalAccountButton;

    // Метод клика на кнопку личный кабинет
    @Step("Нажать на кнопку личный кабинет")
    public UserProfilePage clickPersonalAccountButtonAuth() {
        personalAccountButton.click();
        return page(UserProfilePage.class);
    }

    // Метод клика на кнопку личный кабинет
    @Step("Нажать на кнопку личный кабинет")
    public LoginPage clickPersonalAccountButtonNotAuth() {
        personalAccountButton.click();
        return page(LoginPage.class);
    }
}