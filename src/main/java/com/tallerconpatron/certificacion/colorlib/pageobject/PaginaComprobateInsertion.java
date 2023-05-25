package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://colorlib.com/polygon/metis/index.html?")
public class PaginaComprobateInsertion extends PageObject {

    @FindBy(xpath = "//*[@id=\"menu\"]/li/a")
    public WebElementFacade comprobate;


}
