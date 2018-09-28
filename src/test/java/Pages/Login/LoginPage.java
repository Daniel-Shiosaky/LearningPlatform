package Pages.Login;

import org.openqa.selenium.By;
import seleniumControls.*;

public class LoginPage {
    public TextBox userTextBox;
    public TextBox pwdTextBox;
    public Button loginButton;
    public Checkbox rememberCheckbox;
    public Link resetPasswordLink;
    public Label BienvenidoLabel;

    public LoginPage() {

        userTextBox = new TextBox(By.id("login-email"));
        pwdTextBox = new TextBox(By.id("login-password"));
        loginButton = new Button(By.id("login-submit"));
        rememberCheckbox = new Checkbox(By.id("login-remember"));
        resetPasswordLink = new Link(By.id(""));
        BienvenidoLabel = new Label(By.xpath("//div[@id='login-holder']/lp2-login-page/lp2-login-box//h1[.='Bienvenido']"));
    }
}