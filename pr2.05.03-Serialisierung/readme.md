# Aufgabe: Serialisierung

## Lernziel

Serialisierung einsetzen können, um Objekte zu persistieren und wieder zu laden.

## Aufgabe

In dieser Aufgabe finden Sie bereits eine fertig implementierte Klasse `Board` vor, die ein Schachbrett repräsentiert. Allerdings wird dieses nicht für Schach benutzt, sondern für ein Spiel, bei dem man nur schwarze und weiße Steine auf das Brett stellen kann (z.B. Dame). Die Farbe der Steine wird durch die Enumeration `Color` dargestellt.

Was bei dem Schachbrett allerdings noch fehlt, ist eine Möglichkeit den Spielstand zu speichern und später wieder einzulesen.

Schauen Sie sich die Klassen `Board` und `Color` genau an und versuchen Sie diese zu verstehen. Sie können auch testweise ein Brett anlegen und mit Daten befüllen. (Wie dies geht, sehen Sie im JUnit-Test). Die `toString()`-Methode liefert eine anschauliche Darstellung des Spielfeldes.

Implementieren Sie nun die Methoden `writeToFile` und `loadFromFile` unter Zuhilfenahme von De-/Serialisierung. Verwenden Sie einen `ObjectOutputStream` bzw. `ObjectInputStream`. 


Lassen Sie den JUnit-Test laufen, um zu sehen, ob die Daten korrekt verarbeitet werden.
