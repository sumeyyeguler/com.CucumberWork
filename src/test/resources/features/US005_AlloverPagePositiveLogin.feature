Feature: US005 dogru kullanici ve sifre ile giris yapabilmeli

  @wipe
  Scenario: TC01 Positive Login Testi
    Given kullanici "AlloverUrl" anasayfasinda
    Then sign in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And sign in butonuna tiklar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir

