package pages.booking;

import org.openqa.selenium.By;

public class BookingLoginPages {

    public static By sendMailAdress() {
        By obj = By.xpath("//input[@type='email']");
        return obj;
    }

    public static By loginClickButton() {
        By obj = By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']");
        return obj;
    }

    public static By  sendPass() {
        By obj = By.xpath("//input[@id='password']");
        return obj;
    }

    public static By passClickButton(){
        By obj = By.xpath("//button[@class='bui-button bui-button--large bui-button--wide']");
        return obj;
    }

    public static By profileButtonClick() {
        By obj = By.xpath("//div[@class='bui-avatar-block']");
        return obj;
    }

    public static By profileDropdownButtonClick() {
        By obj = By.xpath("//a[@class='bui-dropdown-menu__button']");
        return obj;
    }

    public static By personDetailsClick() {
        By obj = By.xpath("//a[@aria-labelledby='personaldetails_title']");
        return obj;
    }
    public static By notification() {
        By obj = By.xpath("//span[@class='bui-badge__text']");
        return obj;
    }
    }



