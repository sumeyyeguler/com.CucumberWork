@wip
Feature: Kullanici ortak adimlari background ile calistirir

  Background: ortak adim
    Given kullanici amazon sayfasina gider

    Scenario: TC04 amazon nutella arama
      And kullanici nutella icin arama yapar
      Then sonuclarin nutella icerdigini test eder
      And  sayfayi kapatir