Feature: US005 kullanici parametre ile configration file'ı kullanabilmeli
@tk
  Scenario: TC07 configration properties dosyasinda parametre kullanimi

    Given  kullanici "amazonUrl" anasayfasinda
    And url'in "amazon" icerdigini test eder
    Then sayfayi kapatir

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "techproeducationUrl" anasayfasinda
    Then kullanici 12 sn bekler
    And url'in "techproeducation" icerdigini test eder
    Then sayfayi kapatir