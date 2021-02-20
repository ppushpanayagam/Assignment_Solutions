package pages;

import utils.reusbaleMethods;

public class personalInformationPage extends reusbaleMethods {
    public personalInformationPage verifyPersonalPage(){
        verifyTitle(prop.getProperty("Personal_Page_Title"));
        return this;
    }
    public personalInformationPage clickMyPersonalPageLink(){
        clickButtonbyXpath(prop.getProperty("PersonalPage_Click_My_Personal_Information"));
        return this;
    }
    public personalInformationPage UpdateFirstName(String data){
        enterTextById(prop.getProperty("Personal_Page_Update_FirstName"), data);
        return this;
    }
    public personalInformationPage enterOldPassword(String data){
        enterTextById(prop.getProperty("Personal_Page_Old_Password"), data);
        return this;
    }
    public personalInformationPage clickSaveButton(){
        clickButtonbyXpath(prop.getProperty("Personal_Page_Click_Save_Button"));
        return this;
    }
    public  personalInformationPage verifySuccessfulMessage(String data){
        verifyTextByXpath(prop.getProperty("Personal_Page_Success_Message"), data);
        return this;
    }

}
