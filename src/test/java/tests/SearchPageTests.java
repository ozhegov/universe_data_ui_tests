package tests;

import data.Products;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.SearchPage;
import utils.TestData;

@DisplayName("Проверки страницы поиска")
public class SearchPageTests extends TestBase{

    SearchPage searchPage = new SearchPage();
    TestData testData = new TestData();


    @DisplayName("При вводе названия продукта в поле поиска в результатах отображается название искомого продукта")
    @ParameterizedTest(name = "{0}")
    @EnumSource(Products.class)
    @Tag("UiTest")
    @Severity(SeverityLevel.CRITICAL)
    void searchingProductNameItShouldAppearsInSearchResults(Products products){

        searchPage.openPage()
                .setProductName(products.description)
                .clickSearchButton()
                .checkSearchResultAppears(products.description);

    }

    @Test
    @DisplayName("При вводе одного символа в поле поиска отображается сообщение об ошибке")
    @Tag("UiTest")
    @Severity(SeverityLevel.TRIVIAL)
    void searchingOneCharacterErrorMessageShouldAppears(){

        searchPage.openPage()
                .setOneCharacterValue(testData.oneCharacterValue)
                .clickSearchButton()
                .checkErrorMessageAppears(testData.oneCharacterValue);

    }

}
