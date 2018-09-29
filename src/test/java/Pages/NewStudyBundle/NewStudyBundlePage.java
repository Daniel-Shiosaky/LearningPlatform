package Pages.NewStudyBundle;

import org.openqa.selenium.By;
import seleniumControls.*;

public class NewStudyBundlePage {
    public Button RegistertoLiveClassButton;
    public Tab DictionarioTab;
    public Tab CorrectorTab;
    public Tab GuiaDeGramaticaTab;
    public Tab TraductorTab;
    public Link facebookLink;
    public Link instagramLink;
    public Link youtubeLink;
    public Link tweeterLink;
    public Link TerminosLink;
    public Link privacidadLink;
    public Label TitleBarLabel;
    public Tile LessonsTile;
    public Tile LiveClassTile;
    public Tile PrivateClassTile;
    public Tile DailyNewsTile;
    public Tile CommonExpressionsTile;
    public Tile EnglishCentralTile;

    public NewStudyBundlePage(){
        TitleBarLabel = new Label(By.xpath("//div[@class='title-bar']//h1[text()='Plan de Estudio' or text()='Plan de estudio']"));
    }
}
