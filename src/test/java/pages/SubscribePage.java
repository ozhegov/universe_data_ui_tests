package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SubscribePage {

    SelenideElement emailInputField = $("input[name='FIELDS[EMAIL]']"),
                    sendButton = $(".btn_gradient"),
                    successSubscriptionMessage = $(".alert-success"),
                    warningMessage = $(".alert-danger");


    @Step("Открываем страницу с формой подписки")
    public SubscribePage openPage() {
        open("/news-subscribe");

        return this;
    }

    @Step("Вводим email {email}")
    public SubscribePage setEmail(String email) {
        emailInputField.setValue(email);

        return this;
    }

    @Step("Нажимаем кнопку отправки формы")
    public SubscribePage clickSendButton() {
        sendButton.click();

        return this;
    }

    @Step("Проверяем, что сообщение об отправке заявки на подписку появилось на странице")
    public SubscribePage checkSuccessMessageAppeared() {
        successSubscriptionMessage.shouldHave(text("Ваша заявка подписки отправлена"));

        return this;
    }

    @Step("Проверяем, что сообщение о попытке отправить пустую форму появилось на странице")
    public SubscribePage checkEmptyFormMessageAppeared() {
        warningMessage.shouldHave(text("Вы пытаетесь отправить пустую форму! Ваш E-mail - обязательное поле."));

        return this;
    }

    @Step("Проверяем, что сообщение об отправке формы с некорректным email появилось на странице")
    public SubscribePage checkInvalidEmailMessageAppeared() {
        warningMessage.shouldHave(text("Вы указали некорректный e-mail"));

        return this;
    }



}
