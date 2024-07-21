package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.UniverseMdmPage;

@DisplayName("Проверки страницы продукта Юниверс MDM")
public class UniverseMdmPageTests extends TestBase {

    UniverseMdmPage universeMdmPage = new UniverseMdmPage();

    @Test
    @DisplayName("При клике на вопрос в блоке F.A.Q. отображается ответ на него")
    @Tag("UiTest")
    @Severity(SeverityLevel.NORMAL)
    void allFaqAnswersShouldBeVisibleAfterClicking() {

        universeMdmPage.openPage()
                .clickFaqItems()
                .checkAllFaqItemsTextAreVisible();

    }

}
