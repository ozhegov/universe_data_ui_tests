package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchPage {

    SelenideElement searchField = $(".search-block__text"),
                    searchButton = $(".form__submit"),
                    successSearchResultTitle = $(".news__title"),
                    unsuccessSearchResultMessage = $(".errortext");


    @Step("Открываем страницу с формой поиска")
    public SearchPage openPage() {
        open("/search");

        return this;
    }

    @Step("Вводим в поисковую строку название продукта {productName}")
    public SearchPage setProductName(String productName) {
        searchField.setValue(productName);

        return this;
    }

    @Step("Вводим в поисковую строку символ {oneCharacter}")
    public SearchPage setOneCharacterValue(String oneCharacter) {
        searchField.setValue(oneCharacter);

        return this;
    }

    @Step("Нажимаем кнопку поиска")
    public SearchPage clickSearchButton() {
        searchButton.click();

        return this;
    }

    @Step("Проверяем, что при поиске названия продукта {productName} оно отображается в результатах поиска")
    public SearchPage checkSearchResultAppears(String productName) {
        successSearchResultTitle.shouldBe(visible);
        successSearchResultTitle.shouldHave(text(productName));

        return this;
    }

    @Step("Проверяем, что при поиске одного символа {oneCharacter} отображается сообщение об ошибке")
    public SearchPage checkErrorMessageAppears(String oneCharacter) {
        successSearchResultTitle.shouldNotBe(visible);
        unsuccessSearchResultMessage.shouldHave(text("Пустой поисковый запрос (запрос не содержит букв или цифр)."));

        return this;
    }



}
