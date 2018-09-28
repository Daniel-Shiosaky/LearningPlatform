package Pages.Login;

import org.openqa.selenium.By;
import seleniumControls.*;

public class LP2LoginPage {
    public TextBox userTextBox;
    public TextBox pwdTextBox;
    public Button loginButton;
    public Checkbox rememberCheckbox;
    public Link resetPasswordLink;
    public Link registerLink;
    public Link retirnToLoginLink;
    public Label BienvenidoLabel;

    public LP2LoginPage() {

        userTextBox = new TextBox(By.id("login-email"));
        pwdTextBox = new TextBox(By.id("login-password"));
        loginButton = new Button(By.id("login-submit"));
        rememberCheckbox = new Checkbox(By.id("login-remember"));
        resetPasswordLink = new Link(By.xpath("//div[@id='login-holder']/lp2-login-page/lp2-login-box/div[@class='box']//a[@href='/recovery.html']"));
        BienvenidoLabel = new Label(By.xpath("//div[@id='login-holder']/lp2-login-page/lp2-login-box//h1[text()='Welcome' or text()='Bienvenido']"));
    }
}