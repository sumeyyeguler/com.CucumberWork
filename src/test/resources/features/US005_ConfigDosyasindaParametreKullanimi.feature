Feature: US005 kullanici parametre ile configration file'ı kullanabilmeli

  Scenario: TC07 configration properties dosyasinda parametre kullanimi

    Given  kullanici "amazonUrl" anasayfasinda
    And url'in "amazon" icerdigini test eder
    Then sayfayi kapatir