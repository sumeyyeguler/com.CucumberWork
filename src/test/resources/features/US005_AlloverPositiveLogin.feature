Feature: US1005 dogru kullanici adi ve sifre ile giris yapabilmeli

  @hh
  Scenario: TC08 positive login test
    Given kullanici "AlloverUrl" anasayfasinda
    Then Sign in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Sign in butonuna basar
    And kullanici 3 sn bekler
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir
