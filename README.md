# PDP Odev Örnek

### Calculations used. NOTE !! they might be wrong
```text
/**/ = 0
/*{anything}*/ = 0
/***/ = 0

/*
*/ = 0

/**
*/ = 0

/*

*/ = 1

//{Anything Or Nothing} = 1

class SomeName { //Comment = 1 code line and 1 comment line

class SomeName { /*Comment*/ = 1 code line 0 comment line
```

### Output. NOTE !! it might be wrong
```text
Sınıf Main.java
Javadoc Satır Sayısı 1
Yorum Satır Sayısı 9 
Kod Satır Sayısı 18 
LOC 50 Fonksiyon Sayısı 9 
Yorum Sapma Yüzdesi % 48.15 
-----------------------------------------
Sınıf Three.java 
Javadoc Satır Sayısı 1 
Yorum Satır Sayısı 11 
Kod Satır Sayısı 24 
LOC 60 Fonksiyon Sayısı 9 
Yorum Sapma Yüzdesi % 33.33 
-----------------------------------------
Sınıf Two.java 
Javadoc Satır Sayısı 1 
Yorum Satır Sayısı 8 
Kod Satır Sayısı 24 
LOC 58 
Fonksiyon Sayısı 10 
Yorum Sapma Yüzdesi % 0.00
```
