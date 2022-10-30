package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Project modal form should appear on main page")
    void generatedTest() {
        step("Open https://e-legion.ru", () -> {
            step("// todo: just add selenium action");
        });

        step("Click on '+' button", () -> {
            step("// todo: just add selenium action");
        });

        step("Project modal form should be visible", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://e-legion.ru'", () ->
            open("https://e-legion.ru"));

        step("Page title should have text 'e-legion — разработка мобильных приложений на заказ. Создание приложений для iPhone, iPad, Android и Windows'", () -> {
            String expectedTitle = "e-legion — разработка мобильных приложений на заказ. Создание приложений для iPhone, iPad, Android и Windows";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://e-legion.ru'", () ->
            open("https://e-legion.ru"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}