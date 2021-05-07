package pages.trashmail;

import org.openqa.selenium.By;

public class TrashmailMainPage {

    public static By disposableEmail() {
        By obj = By.xpath("(//input[@class='form-control text-right'])[1]");
        return obj;
    }

    public static By realEmail () {
        By obj = By.xpath("(//input[@ng-model='user.email'])[1]");
        return obj;
    }

    public static By formDomain () {
        By obj = By.xpath("//select[@name='form_domain']");
    return obj;
    }

    public static By exactDomain() {
        By obj = By.xpath("//option[@value='trashmail.es']");
        return obj;
    }

    public static By formRedirections() {
        By obj = By.xpath("//select[@name='form_nb_redirections']");
        return obj;
    }

    public static By exactNumbersOfRedirections() {
        By obj = By.xpath("//option[@value='10']");
        return obj;
    }

    public static By deactivateCapcha(){
        By obj = By.xpath("(//input[@name='form_whitelisting'])[2]");
        return obj;
    }

    public static By pushRegisterButton() {
        By obj = By.xpath("(//button[@class='btn btn-primary'])[1]");
        return obj;
    }

    public static By getCreatedEmail(){
        By obj = By.xpath("//div[@class='jumbotron']//h4[@class='text-center']");
        return obj;
    }


//trash
    /*public static By newUserTab() {
        By obj = By.xpath("//a[@href= '#tab-mob-register']");
        return obj;
    }

    public static By usernameInput() {
        By obj = By.xpath("(//div[@class='form-group']//input[@ng-model='user.name'])[2]");
        return obj;
    }

    public static By passwordInput() {
        By obj = By.xpath("(//div[@class='form-group']//input[@ng-model='user.password'])[2]");
        return obj;
    }

    public static By passwordInputRepeat() {
        By obj = By.xpath("(//div[@class='form-group']//input[@ng-model='user.passwordRepeat'])[1]");
        return obj;
    }

    public static By mirrorEmailInput() {
        By obj = By.xpath("(//div[@class='form-group']//input[@ng-model='user.email'])[2]");
        return obj;
    }

    public static By pushRegisterButton() {
        By obj =
                By.xpath("(//div[@class='pull-right tm-home-page-button']//button[@ng-click='registerAccount(true);'])");
        return obj;
    }
*/




}
