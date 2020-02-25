package br.com.selenide.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class PesquisaGoogleTest {

    @Test
    public void pesquisaGoogleComSuceso() {
        isChrome();
        open("http://www.google.com.br");

        $(By.name("q")).setValue("Selenide");
        $(By.name("btnK")).click();

        $(By.className("r")).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
