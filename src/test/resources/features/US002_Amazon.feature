Feature: US002 Amazon Search

  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon sayfasina gider
    And iPhone icin arama yapar
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir


  Scenario: TC01 kullanici amazonda tea pot aratir
    Given kullanici amazon sayfasina gider
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder
    And sayfayi kapatir


  Scenario: TC01 kullanici amazonda flower aratir
    Given kullanici amazon sayfasina gider
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    And sayfayi kapatir