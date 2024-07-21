package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class UniverseMdmPage {

    ElementsCollection faqItems = $$(".spoller__item"),
                       faqText = $$(".spoller__text");

    @Step("Открываем страницу продукта Юниверс MDM")
    public UniverseMdmPage openPage() {
        open("/products/unidata-upravlenie-dannymi");

        return this;
    }

    @Step("Нажимаем на каждый вопрос из блока F.A.Q.")
    public UniverseMdmPage clickFaqItems() {
        for (SelenideElement item : faqItems) {
            item.click();
        }

        return this;
    }

    @Step("Проверяем, что отображаются ответы на все вопросы из блока F.A.Q.")
    public UniverseMdmPage checkAllFaqItemsTextAreVisible() {
        for (SelenideElement itemText : faqText) {
            itemText.shouldNotHave(attribute("hidden"));
        }

        return this;
    }

}
