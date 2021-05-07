package pages.booking;

import org.openqa.selenium.By;

public class BookingRegistrationPages {

    public static By mailboxInput() {
        By obj = By.xpath("//input[@type='email']");
        return obj;
    }

    public static By confirmMailAdress(){
    By obj = By.xpath("//button[@type='submit']");
        return obj;
}
    public static By enterPassword() {
        By obj = By.xpath("//input[@id='new_password']");
        return obj;
    }

    public static By confirmPassword() {
        By obj =By.xpath("//input[@id='confirmed_password']");
        return obj;
    }

    public static By submitPasswords() {
        By obj = By.xpath("//button[@type='submit']");
        return obj;
    }

    public static By holdButton() {
        By obj =  By.xpath("//*[@id='px-captcha']/iframe");
        return  obj;
    }
}
