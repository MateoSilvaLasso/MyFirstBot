package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://colorlib.com/polygon/metis/form-validation.html")
public class PaginaComprobateTitle extends PageObject {

    @FindBy(xpath = "//*[@class=\"toolbar\"]/nav/a/i")
    public WebElementFacade equalText;
}
