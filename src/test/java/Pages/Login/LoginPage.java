package Pages.Login;

import org.openqa.selenium.By;
import seleniumControls.Button;
import seleniumControls.Checkbox;
import seleniumControls.TextBox;

public class LoginPage {
    public TextBox userTextBox;
    public TextBox pwdTextBox;
    public Button loginButton;
    public Checkbox rememberCheckbox;

    public LoginPage() {

        userTextBox = new TextBox(By.id("login-email"));
        pwdTextBox = new TextBox(By.id("login-password"));
        loginButton = new Button(By.id("login-submit"));
        rememberCheckbox = new Checkbox(By.id("login-remember"));
    }
}
