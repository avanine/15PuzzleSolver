# 15PuzzleSolver

15-pelin ratkaisija Javalla.

Projekti on tehty Helsingin yliopiston kurssille Aineopintojen harjoitustyö: Tietorakenteet ja algoritmit.

## Dokumentaatio
* [Määrittelydokumentti](https://github.com/avanine/15PuzzleSolver/blob/main/dokumentaatio/maarittelydokumentti.md)

### Viikkoraportit
* [Viikko 1](https://github.com/avanine/15PuzzleSolver/blob/main/dokumentaatio/viikkoraportti1.md)

## Komentorivitoiminnot

### Testaus

Testit suoritetaan komennolla

```
mvn test
```

ja testikattavuusraportin saat komennolla

```
mvn test jacoco:report
```

Kattavuusraportti löytyy tiedostosta _target/site/jacoco/index.html_


### JavaDoc

JavaDoc generoidaan komennolla

```
mvn javadoc:javadoc
```

ja se tallentuu tiedostoon _target/site/apidocs/index.html_

### Checkstyle

Tiedoston [checkstyle.xml](https://github.com/avanine/15PuzzleSolver/blob/main/checkstyle.xml) määrittelemät tarkistukset suoritetaan komennolla

```
 mvn jxr:jxr checkstyle:checkstyle
```

Mahdolliset virheilmoitukset löytyvät tiedostosta _target/site/checkstyle.html_
