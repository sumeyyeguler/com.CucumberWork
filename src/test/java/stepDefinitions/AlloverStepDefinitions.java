package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AlloverPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AlloverStepDefinitions {
    AlloverPage alloverPage = new AlloverPage();

    @Then("Sign in yazisina tiklar")
    public void sign_in_yazisina_tiklar() {
     alloverPage.homePageSignIn.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
   alloverPage.signInEmail.sendKeys(ConfigReader.getProperty("alloverValidEmail"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
       alloverPage.signInPassword.sendKeys(ConfigReader.getProperty("alloverValidPassword"));
    }
    @Then("Sign in butonuna basar")
    public void login_butonuna_basar() {
     alloverPage.signInButton.click();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        String expectedUrl="https://allovercommerce.com/";
       String actualUrl=Driver.getDriver().getCurrentUrl();
       Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Then("kullanici {int} sn bekler")
    public void kullaniciSnBekler(int beklemeSuresi) {
        try {
            Thread.sleep(beklemeSuresi);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
