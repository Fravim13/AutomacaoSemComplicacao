package pages;

import core.Driver;
import maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }
    public void clickBtnLogin(){
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }
    public void clickBtnFechar(){
        loginMap.btnFechar.click();
    }
    public void clickDivFechaModal(){
        loginMap.divFecharModal.click();
    }
    public void setInpUserName(String username){
        loginMap.inpUserName.sendKeys();
    }
    public void setInpPassword(String password){
        loginMap.btnPassword.sendKeys(password);
    }
    public void clickInpRemember(){
        loginMap.inpRemember.click();
    }
    public void clickLinkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }
    public void clickBtnSingIn(){
        loginMap.btnSignIn.click();
    }
    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }
    public void visibilityOfBtnfechar(){
        Driver.visibilityOf(loginMap.btnFechar);
    }
    public void invisibilityOfBtnfechar(){
        Driver.invisibilityOf(loginMap.btnFechar);
    }
}
