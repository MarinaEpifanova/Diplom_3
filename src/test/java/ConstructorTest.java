

import io.qameta.allure.Description;
import io.qameta.allure.Story;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.MainPage;

import static com.codeborne.selenide.Selenide.open;


@Story("Проверяем, что работают переходы к разделам в конструкторе")
public class ConstructorTest extends BaseTest {

    @Test
    @DisplayName("Проверяем переход к разделу «Начинки»")
    @Description("Проверяем:\n" + " - переход к разделу выполняется")
    public void ChapterFillingTest() {
        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .clickConstructorButton()
                .clickFillingBurger()
                .isVisibleIngredientFillingBurger();

    }

    @Test
    @DisplayName("Проверяем переход к разделу «Соусы»")
    @Description("Проверяем:\n" + " - переход к разделу выполняется")
    public void ChapterSouseTest() {
        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .clickConstructorButton()
                .clickSouseBurger()
                .isVisibleIngredientSouseBurger();

    }

    @Test
    @DisplayName("Проверяем переход к разделу «Булки»")
    @Description("Проверяем:\n" + " - переход к разделу выполняется")
    public void ChapterBunTest() {
        open(MainPage.URL, MainPage.class)
                .clickPersonalAccountButtonNotAuth()
                .clickConstructorButton()
                .clickFillingBurger()
                .clickBunBurger()
                .isVisibleIngredientBunBurger();

    }
}