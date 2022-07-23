import com.codeborne.selenide.Configuration;
import org.junit.Before;

public class BaseTest {

    @Before
    public void init() {
        //Configuration.browser = "Yandex";
        Configuration.browser = "firefox";
        // Configuration.browser="chrome";
        Configuration.startMaximized = true;
    }
}

