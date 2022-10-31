package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuappPage {

    public HerokuappPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
