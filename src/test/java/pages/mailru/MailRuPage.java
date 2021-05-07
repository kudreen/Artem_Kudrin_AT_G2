package pages.mailru;

import org.openqa.selenium.By;

public class MailRuPage {

    public static By loginEnterAdress() {
        By obj = By.xpath("//input[@class='email-input svelte-1eyrl7y']");
        return obj;
    }

    public static By loginButton() {
        By obj = By.xpath("//button[@data-testid='enter-password']");
        return obj;
    }

    public static By  loginEnterPass() {
        By obj = By.xpath("//input[@data-testid='password-input']");
        return obj;
    }

    public static By  loginClickPassButton() {
        By obj = By.xpath("//button[@data-testid='login-to-mail']");
        return obj;
    }
    public static By  findAndClickConfirmationLetter() {
        By obj = By.xpath("(//span[contains(@title, 'Booking.com')])[1]");
        return obj;
    }


    public static By clickConfirmationButton() {
        By obj = By.xpath("//td[@class='button-inner_mr_css_attr']");
        return obj;
    }

    public static By bookingHeader() {
        By obj = By.xpath("//h1[@class='bui_font_display_two bui_font_heading--bold bui-spacer--medium nw-step-header']");
        return obj;
    }
}
