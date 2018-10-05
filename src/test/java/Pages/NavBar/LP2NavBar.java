package Pages.NavBar;

import org.openqa.selenium.By;
import seleniumControls.Icon;
import seleniumControls.Label;
import seleniumControls.MenuOption;
import seleniumControls.TextBox;

public class LP2NavBar {
    public MenuOption MyProgressMenuOption;
    public MenuOption TeacherFeedbackMenuoption;
    public MenuOption ActivitiesMenuoption;

    public MenuOption UnitAndLessonsMenuOption;
    public MenuOption PracticeMenuOption;
    public MenuOption IntroductionMenuOption;

    public MenuOption LiveChatMenuOption;
    public MenuOption NotificationsMenuOption;

    public Icon userProfileIcon;
    public Label userNameLabel;
    public MenuOption ContactUsMenuOption;
    public MenuOption LiveClassSetupMenuOption;
    public MenuOption LiveClassGuideMenuOption;
    public MenuOption FAQMenuOption;
    public MenuOption BillingDetailsMenuOption;
    public MenuOption ProfileMenuOption;

    public MenuOption SignOutMenuOption;


    public LP2NavBar(){

        userProfileIcon = new Icon(By.xpath("//a[@id='nav-account']/img[@src='/profile/image/123/123']"));
        SignOutMenuOption = new MenuOption(By.xpath("//a[@id='nav-logout']"));
    }



}
