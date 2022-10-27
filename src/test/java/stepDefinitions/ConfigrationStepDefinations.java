package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class ConfigrationStepDefinations {
    /*
    Bu classta gitmek istediğimiz url'i paramaetre olarak göndererek kodu dinamik hale getirmiş olacağız
   (configration.properties de bulunan "amazonURL","hmcUR" gibi)
     */
    @Given("kullanici {string} anasayfasinda")
    public void kullanici_anasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Given("url'in {string} icerdigini test eder")
    public void url_in_icerdigini_test_eder(String istenenURL) {
      String url=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains(istenenURL));
    }

}
