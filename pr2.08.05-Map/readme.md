# Aufgabe: `Map<T>` verwenden

## Lernziel

Das Interface `Map<T>` und seine Implementierungen verwenden, um Daten effizient zu verarbeiten.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe geht es darum, die Häufigkeit von Wörtern in einem Text zu analysieren. Ein grundlegendes Gerüst für das Programm ist auch bereits vorgegeben, damit Sie sich auf das Wesentliche konzentrieren können.

Betrachten Sie die Klasse `WordCount`. In dieser fehlen noch einige Elemente, damit das Programm korrekt funktionieren kann.

Die Klasse `WordFrequency` muss das Sortieren unterstützen. Implementieren Sie daher das Interface `Comparable`.

Fügen Sie in der Klasse `WordCount` an den durch TODO-Kommentare markierten Stellen Code hinzu, der mit Hilfe einer Map die Worthäufigkeiten bestimmt.

Lassen Sie das Programm laufen. Es sollte eine Ausgabe wie folgt erzeugen:

    er: 80
    sie: 66
    und: 64
    die: 59
    der: 51
    zu: 46
    es: 45
    nicht: 41
    das: 38
    in: 35
    ...
 