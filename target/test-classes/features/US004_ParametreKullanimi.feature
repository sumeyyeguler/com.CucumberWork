@th
Feature: US004 kullanici parametre kullanarak arama yapabilmeli

  @td
  Scenario: TC01 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon sayfasina gider
    And kullanici "java" icin arama yapar
    And sonuclarin "java" icerdigini test eder
    Then  sayfayi kapatir