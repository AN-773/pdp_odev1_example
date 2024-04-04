# PDP Odev Örnek

### Calculations used. NOTE !! they might be wrong
```text
/**/ = 0

/***/ = 0

/*
*/ = 0

/**
*/ = 0

/*

*/ = 1

//{Anything} = 1

class SomeName { //Comment = 1 code line and 1 comment line

class SomeName { /*Comment*/ = 1 code line 0 comment line
```

### Output. NOTE !! it might be wrong
```text
Sınıf: Main.java
Javadoc Satır Sayısı: 1
Yorum Satır Sayısı: 9
Kod Satır Sayısı: 18
LOC: 50
Fonksiyon Sayısı: 9
Yorum Sapma Yüzdesi: % 48.15
-----------------------------------------
Sınıf: Three.java
Javadoc Satır Sayısı: 1
Yorum Satır Sayısı: 11
Kod Satır Sayısı: 22
LOC: 59
Fonksiyon Sayısı: 10
Yorum Sapma Yüzdesi: % 45.45
-----------------------------------------
Sınıf: Two.java
Javadoc Satır Sayısı: 1
Yorum Satır Sayısı: 9
Kod Satır Sayısı: 19
LOC: 51
Fonksiyon Sayısı: 9
Yorum Sapma Yüzdesi: % 40.35
```
