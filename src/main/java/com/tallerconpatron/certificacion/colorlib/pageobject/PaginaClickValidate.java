package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PaginaClickValidate extends PageObject {

    @FindBy(xpath = "//*[@value=\"Validate\"]")
    public WebElementFacade validate;

}
