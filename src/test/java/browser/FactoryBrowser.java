package browser;

public class FactoryBrowser {
    public static IBrowser make (String browserType){
        IBrowser browser;
        switch (browserType){
            case "chrome":
                browser=new Chrome();
                break;
            case "fireFox":
                browser=new firefox();
                break;
            case "ie":
                browser=new ie();
                break;
            case "safari":
                browser=new safari();
                break;

            default:
                browser=new Chrome();
                break;
        }
        return browser;
    }
}
