### Aufgabe: Eine generische Methode schreiben

## Lernziel

Eine generische Methode schreiben.

## Umgebung

  * Eclipse



Die Klasse `ArrayHelper` enthält zwei statische Methoden namens `contains`, die benutzt werden können, um herauszufinden, ob sich ein gegebenes Element (zweiter Parameter `other`) in einem gegebenen Array (erster Parameter `array`) befindet.

Die Klasse enthält zweimal dieselbe Implementierung: Einmal für `String`-Arrays und einmal für `Integer`-Arrays. Das ist sehr unbefriedigend: 
* Alle anderen Array-Arten können mit diesen beiden Methoden nicht durchsucht werden.
* Beide Methoden enthalten exakt denselben Code.

## Aufgabe

Überarbeiten Sie die Klasse `ArrayHelper`, indem Sie generische Typen verwenden. Machen Sie aus den zwei redundanten Methoden eine generische Methode, die nicht nur für `Integer` und `String` anwendbar ist, sondern für Arrays mit allen Klassen für den Inhalt.

Verwenden Sie nicht `Object` als Typ, sondern Typ-Parameter.