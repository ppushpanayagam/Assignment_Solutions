package pages;

import utils.reusbaleMethods;

public class homePage extends reusbaleMethods {

    public homePage verifyHomePage(){
        verifyTitle(prop.getProperty("Home_Page_Title"));
        return this;
    }
    public homePage clickSignInLink(){
        clickButtonbyXpath(prop.getProperty("HomePage_Click_SignIn_Link"));
        return this;
    }
    public homePage clickTshirtLink(){
        clickButtonbyXpath(prop.getProperty("HomePage_Tshirt_click_Link"));
        return this;
    }
    public homePage clickTshirtImage(){
        clickButtonbyXpath(prop.getProperty("HomePage_Click_Tshirt_Image"));
        clickButtonbyXpath(prop.getProperty("HomePage_Click_Form_AddToCartButton"));
        return this;
    }
    public homePage clickAddToCartButton(){
        clickButtonbyXpath(prop.getProperty("HomePage_Click_AddToCart_Button"));
        return this;
    }
    public homePage clickProceedToCheckOutButton(){
        clickButtonbyXpath(prop.getProperty("HomePage_Click_ProceedToCheckOut_Button"));
        return this;
    }
    public homePage clickProceedToCheckOutButtonInSummarySection(){
        clickButtonbyXpath(prop.getProperty("HomePage_SummarySection_Click_ProceedToCheckOut_Button"));
        return this;
    }
    public homePage enterUserName(String data){
        enterTextById(prop.getProperty("HomePage_Enter_UserName"), data);
        return this;
    }
    public homePage enterPassword(String data){
        enterTextById(prop.getProperty("HomePage_Enter_Password"), data);
        return this;
    }
    public homePage clickSignInButtonn(){
        clickButtonbyId(prop.getProperty("HomePage_Click_SignIn_Button"));
        return this;
    }
    public homePage clickProceedToCheckOutButtonInAddressSection(){
        clickButtonbyXpath(prop.getProperty("HomePage_AddressSection_Click_ProceedToCheckOut_Button"));
        return this;
    }
    public homePage clickCheckBox(){
        clickButtonbyId(prop.getProperty("HomePage_ShippingsSection_Click_CheckBox"));
        return this;
    }
    public homePage clickProceedToCheckOutButtonInShippingSection(){
        clickButtonbyXpath(prop.getProperty("HomePage_ShippingsSection_Click_ProceedToCheckOut_Button"));
        return this;
    }
    public homePage clickBankWireOptionInShippingSection(){
        clickButtonbyXpath(prop.getProperty("HomePage_PaymentSection_ClickBankWireOption_Button"));
        return this;
    }
    public homePage clickConfirmOrderInShippingSection(){
        clickButtonbyXpath(prop.getProperty("HomePage_PaymentSection_Click_ConfirmOrder_Button"));
        return this;
    }
    public homePage verifyMessage(String data){
        verifyTextByXpath(prop.getProperty("HomePage_PaymentSection_VerifyText"), data);
        return this;
    }
    public personalInformationPage clickPersonalInformationLink(){
        clickButtonbyXpath(prop.getProperty("HomePage_Click_My_Personal_Information"));
        return new personalInformationPage();
    }
}
