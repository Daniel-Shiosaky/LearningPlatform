package Pages.Footer;

import org.openqa.selenium.By;
import seleniumControls.Link;

public class TermsandConditions {
    public Link TermsLink;
    public Link PrivacyLink;
    public Link FacebookLink;
    public Link InstagramLink;
    public Link TweeterLink;
    public Link YoutubeLink;


    public TermsandConditions(){
        TermsLink = new Link(By.id("terms-link"));
        PrivacyLink = new Link(By.id("privacy-link"));
        FacebookLink = new Link(By.id("facebook-link"));
        InstagramLink = new Link(By.id("instagram-link"));
        TweeterLink = new Link(By.id("twitter-link"));
        YoutubeLink = new Link(By.id("youtube-link"));

    }
}
