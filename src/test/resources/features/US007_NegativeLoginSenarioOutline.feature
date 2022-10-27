@negativeLogin
Feature: US007 kullanici farklı yanlis sifreler ve kullanici adiyla giris yapamaz

  Scenario Outline: TC01 yanlis kullanici adi ve sifrelerle giris yapilamaz
    Given  kullanici "AlloverUrl" anasayfasinda
    And sign in yazisina tiklar
    And gecersiz username olarak "<username>" girer
    And gecersiz password olarak "<password>" girer
    And sign in butonuna tiklar
    And sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

    Examples:
      | username | password  |
      | manager5 | manager5! |
      | manager6 | manager6! |
      | manager7 | manager7! |
      | manager7 | manager7! |
      | manager8 | manager8! |