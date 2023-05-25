package com.tallerconpatron.certificacion.colorlib.step;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.pageobject.*;
import net.thucydides.core.annotations.Step;

public class TaskAcction extends BasePage {

    private PaginaLogin paginaLogin;
    private PaginaComprobateInsertion comprobateInsertion;

    private PaginaSubMenuForm subMenuForm;

    private PaginaComprobateTitle title;

    private PaginaFillFields fillFields;

    private PaginaClickValidate validate;

    private PaginaNullFields nul;

    public void openPage() {
        openApp();
    }

    @Step
    public void singIn(String strUser, String strPassword) {
        senKeysUser(strUser);
        senKeysPassword(strPassword);
        paginaLogin.btnSingIn.waitUntilClickable().click();

    }

    public void comprobateInsert(){
        comprobateInsertion.comprobate.waitUntilClickable().click();
    }

    public void fieldAllFields(String strRequired,String strUrl,String strEmail,String strPass, String strConPass, String strMinimum, String strNumber, String strIp, String date1, String date2) {
        senFielRequired(strRequired);
        //fillFields.required.waitUntilClickable().click();
        fillFields.objetiveFirstChoosen.click();
        fillFields.chooseOnefield.waitUntilClickable().click();
        fillFields.objetiveSecondChoosen.waitUntilClickable().click();
        fillFields.delete.click();
        fillFields.delete.clear();
        sendFieldUrl(strUrl);
        sendFieldEmail(strEmail);
        sendFieldPass(strPass);
        sendFieldConPass(strConPass);
        sendFieldMinimum(strMinimum);
        sendFieldNumber(strNumber);
        sendFieldIp(strIp);
        sendFieldDate(date1);
        sendFieldSDate(date2);
    }


    public void Validation(){
        validate.validate.waitUntilClickable().click();
    }

    public boolean ConfirmValidation(){
        return nul.required.getText().equals("");
    }



    public void goToSubmenu(){
        subMenuForm.firstForm.waitUntilClickable().click();
        subMenuForm.secondForm.waitUntilClickable().click();
    }

    public void titleSpecific(){
        title.equalText.waitUntilClickable().click();
        title.equalText.waitUntilClickable().click();
    }




    public void senKeysUser(String strUser){
        paginaLogin.user.click();
        paginaLogin.user.clear();
        paginaLogin.user.sendKeys(strUser);
    }

    public void senKeysPassword(String strPassword){
        paginaLogin.password.click();
        paginaLogin.password.clear();
        paginaLogin.password.sendKeys(strPassword);
    }

    public void senFielRequired(String strRequired){
        fillFields.required.click();
        fillFields.required.clear();
        fillFields.required.sendKeys(strRequired);
    }

    public void sendFieldUrl(String strUrl){
        fillFields.url.click();
        fillFields.url.clear();
        fillFields.url.sendKeys(strUrl);
    }

    public void sendFieldEmail(String strEmail){
        fillFields.email.click();
        fillFields.email.clear();
        fillFields.email.sendKeys(strEmail);
    }

    public void sendFieldPass(String strPass){
        fillFields.pss.click();
        fillFields.pss.clear();
        fillFields.pss.sendKeys(strPass);
    }

    public void sendFieldConPass(String strConPass){
        fillFields.cPss.click();
        fillFields.cPss.clear();
        fillFields.cPss.sendKeys(strConPass);
    }

    public void sendFieldMinimum(String strConPass){
        fillFields.minimun.click();
        fillFields.minimun.clear();
        fillFields.minimun.sendKeys(strConPass);
    }

    public void sendFieldNumber(String strNumber){
        fillFields.number.click();
        fillFields.number.clear();
        fillFields.number.sendKeys(strNumber);
    }

    public void sendFieldIp(String strIp){
        fillFields.ip.click();
        fillFields.ip.clear();
        fillFields.ip.sendKeys(strIp);
    }

    public void sendFieldDate(String strDate){
        fillFields.firstDate.click();
        fillFields.firstDate.clear();
        fillFields.firstDate.sendKeys(strDate);
    }

    public void sendFieldSDate(String strSDate){
        fillFields.secondDate.click();
        fillFields.secondDate.clear();
        fillFields.secondDate.sendKeys(strSDate);
    }



}
