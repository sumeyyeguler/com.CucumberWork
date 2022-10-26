package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitons {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Given("iPhone icin arama yapar")
    public void i_phone_icin_arama_yapar() {
        String searchedWord = "iphone";
        amazonPage.searcBox.sendKeys(searchedWord, Keys.ENTER);

    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarin_iphone_icerdigini_test_eder() {
        String searchedWord = "iphone";
        Assert.assertTrue(amazonPage.searchResultText.getText().contains(searchedWord));
    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @And("tea pot icin arama yapar")
    public void teaPotIcinAramaYapar() {
        amazonPage.searcBox.sendKeys("tea pot",Keys.ENTER);
    }

    @Then("sonuclarin tea pot icerdigini test eder")
    public void sonuclarinTeaPotIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.searchResultText.getText().contains("tea pot"));
    }

    @And("flower icin arama yapar")
    public void flowerIcinAramaYapar() {
        amazonPage.searcBox.sendKeys("flower",Keys.ENTER);

    }

    @Then("sonuclarin flower icerdigini test eder")
    public void sonuclarinFlowerIcerdiginiTestEder() {
        Assert.assertTrue(amazonPage.searchResultText.getText().contains("flower"));
    }

    @And("kullanici nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.searcBox.sendKeys("nutella",Keys.ENTER);
    }

    @Then("sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
       Assert.assertTrue(amazonPage.searchResultText.getText().contains("nutella"));
    }


    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.searcBox.sendKeys(istenenKelime+Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String istenenKelime) {
        String arananKelime=istenenKelime;
        Assert.assertTrue(amazonPage.searchResultText.getText().contains(arananKelime));
    }
}
