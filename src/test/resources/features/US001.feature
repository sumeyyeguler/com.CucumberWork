@wip
Feature: US001

  Scenario: TC01 Vendor olarak kayit yapilabilmeli

    Given Belirtilen URL` ye gidilir
    And Regester' a tıklanır
    Then Become a Vendor yazısının görünür olduğu test edilir
    And Become a Vendor a tıklanır

  @us05
  Scenario:
    Given Belirtilen URL` ye gidilir
    And Singin butonuna tıklanır
    And Username or email adress bölümüne vendor email girilir
    And Password bölümüne verdor password girilir
    And Sign in butonuna tıklanır
    And 3 sn beklenir
    And My Account’a tıklanır
    And Store manager’a tıklanır
    And Product’a tıklanır
    And Add new butonuna tıklanır
    Then Kategorilerin seçilebildiği test edilir