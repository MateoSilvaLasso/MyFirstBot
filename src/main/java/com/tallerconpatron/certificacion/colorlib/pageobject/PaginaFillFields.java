package com.tallerconpatron.certificacion.colorlib.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/form-validation.html")
public class PaginaFillFields extends PageObject {

    @FindBy(xpath = "//*[@class=\"validate[required] form-control\"]")
    public WebElementFacade required;

    @FindBy(xpath = "//*[@id=\"sport\"]")
    public WebElementFacade objetiveFirstChoosen;

    @FindBy(xpath = "//*[@value=\"option3\"]")
    public WebElementFacade chooseOnefield;


    @FindBy(xpath = "//*[@id=\"sport2\"]/option[3]")
    public WebElementFacade objetiveSecondChoosen;

    @FindBy(xpath = "//*[@id=\"url1\"]")
    public WebElementFacade url;

    @FindBy(xpath = "//*[@id=\"email1\"]")
    public WebElementFacade email;

    @FindBy(xpath = "//*[@id=\"pass1\"]")
    public WebElementFacade pss;

    @FindBy(xpath = "//*[@id=\"pass2\"]")
    public WebElementFacade cPss;

    @FindBy(xpath = "//*[@id=\"minsize1\"]")
    public WebElementFacade minimun;

    @FindBy(xpath = "//*[@id=\"number2\"]")
    public WebElementFacade number;

    @FindBy(xpath = "//*[@id=\"ip\"]")
    public WebElementFacade ip;

    @FindBy(xpath = "//*[@id=\"date3\"]")
    public WebElementFacade firstDate;

    @FindBy(xpath = "//*[@id=\"past\"]")
    public WebElementFacade secondDate;

    @FindBy(xpath = "//*[@id=\"maxsize1\"]")
    public WebElementFacade delete;







}
