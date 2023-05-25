package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://colorlib.com/polygon/metis/dashboard.html")
public class PaginaSubMenuForm extends PageObject {

    @FindBy(xpath = "//*[@id=\"menu\"]/li[6]/a")
    public WebElementFacade firstForm;

    @FindBy(xpath = "//*[@class=\"collapse in\"]/li[2]/a")
    public WebElementFacade secondForm;


}
