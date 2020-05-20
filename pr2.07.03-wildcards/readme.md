# Aufgabe: Generische Typen zusammen mit Wildcards einsetzen

## Lernziel

Gebundene und ungebundene Wildcards einsetzen.


## Umgebung

  * Eclipse


## Aufgabe

Entwickeln Sie eine _nicht generische_ Klasse `ListHelper`, die zwei statische Methoden enthält:

  * `printList`: Diese Methode bekommt eine beliebige `java.util.List` übergeben und druckt deren Inhalt einfach auf der Konsole aus. Deswegen hat die Methode auch den Rückgabetyp `void`.
  * `sumList`: Diese Methode nimmt als Parameter `java.util.List`-Objekte, die irgendeine Form von Zahlen enthalten (`Number` oder Subklassen davon) und berechnet deren Summe. Das Ergebnis wird als `double`-Wert zurückgegeben.

Verwenden Sie für die Methoden gebundene bzw. ungebundene Wildcards.

Kommentieren Sie die entsprechenden Zeilen in der Klasse `Main` aus und überprüfen Sie, ob Ihre Implementierungen auch wie gewünscht funktionieren. Die Ausgabe sollte sein:

    Dies
    ist
    ein
    Test
    .
    1
    2
    3
    4
    5
    15.0
