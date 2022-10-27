package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AlloverPage;
import utilities.ConfigReader;

public class AlloverStepDefinitions {
    AlloverPage alloverPage=new AlloverPage();

    @Then("sign in yazisina tiklar")
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
    @Then("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
    alloverPage.signInButton.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(alloverPage.welcomeToAllover.isDisplayed());
    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        alloverPage.signInEmail.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        alloverPage.signInPassword.sendKeys(password);
    }

    @And("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(alloverPage.signInButton.isDisplayed());
    }
}
