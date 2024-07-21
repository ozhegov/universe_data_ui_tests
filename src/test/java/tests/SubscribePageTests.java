package tests;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.SubscribePage;
import utils.TestData;

@DisplayName("Проверки страницы подписки на рассылку")
public class SubscribePageTests extends TestBase {

    SubscribePage subscribePage = new SubscribePage();
    TestData testData = new TestData();

    @Test
    @DisplayName("При отправке формы подписки на рассылку с валидным email отображается сообщение об отправке заявки")
    @Tag("UiTest")
    @Severity(SeverityLevel.CRITICAL)
    void sucessMessageShouldAppearAfterValidEmailSpecified() {

        subscribePage.openPage()
                .setEmail(testData.email)
                .clickSendButton()
                .checkSuccessMessageAppeared();
    }

    @Test
    @DisplayName("При отправке формы подписки на рассылку без указания email отображается сообщение о попытке отправить пустую форму")
    @Tag("UiTest")
    @Severity(SeverityLevel.MINOR)
    void emptyFormMessageShouldAppearAfterEmailNotSpecified() {

        subscribePage.openPage()
                .clickSendButton()
                .checkEmptyFormMessageAppeared();
    }

    @DisplayName("При отправке формы подписки на рассылку с невалидным email отображается сообщение о попытке отправить форму с некорретным email")
    @ParameterizedTest(name = "{0}")
    @ValueSource(strings = {
            "universe_data@",
            "universe_data@mail",
            "@mail.ru",
            "!fkf_оаа(8"
    })
    @Tag("UiTest")
    @Severity(SeverityLevel.MINOR)
    void invalidEmailMessageShouldAppearAfterInvalidEmailSpecified(String invalidEmail) {

        subscribePage.openPage()
                .setEmail(invalidEmail)
                .clickSendButton()
                .checkInvalidEmailMessageAppeared();
    }

}
