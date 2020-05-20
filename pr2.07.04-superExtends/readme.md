# Aufgabe: `super` und `extends` einsetzen

## Lernziel

Methoden unter Verwendung von `super` und `extends` gestalten, sodass sie flexibel auch mit Sub- bzw. Supertypen umgehen können.

## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe sollen Sie die Klasse `Stack` (ehem. `StringStack`) aus dem Projekt `pr2.07.01-GenerischerStack` erweitern. 

Im Vergleich zur Musterlösung von `Stack` aus `pr2.07.01-GenerischerStack` sind zwei Methoden hinzu gekommen:

  * `fillFrom`: befüllt den Stack mit den Daten aus einem anderen (übergebenen) Stack.
  * `copyInto`: kopiert die Daten des Stacks in einen anderen (übergebenen) Stack hinein.

Die Signaturen dieser beiden neuen Methoden sind aber noch nicht optimal. Es lässt sich zwar alles compilieren und benutzen, aber es wird nur der *raw type* von Stack verwendet. Deshalb können bestimmte Typ-Inkompatibilitäten nicht vom Typ-System des Compilers zur Übersetzungszeit erkannt werden. In der Methode `compilerTest` in der Klasse `TestListeSuperExtends` ist solch ein Fall vorhanden: 

`stackVonStrings` ist ein `Stack<String>` und `stackVonIntegern` ist vom Typ `Stack<Integer>`. Das Umkopieren der Elemente von `stackVonStrings` in `stackVonIntegern` bei `stackVonStrings.copyInto(stackVonIntegern)` ist sinnlos, bzw. führt zu einer Typ-Verletzung: `stackVonIntegern` kann nur `Integer` Objekte speichern.

Ändern Sie die Signaturen der beiden Methoden `fillFrom` und `copyInto` so, dass nicht mehr der *raw type*  für den Typ des Parameters `other` verwendet wird. Benutzen Sie für Ihre Lösung `super` und `extends` zusammen mit Wildcards (`?`).

Wenn Sie erfolgreich waren, sollte die Klasse `TestListeSuperExtends` sich nicht mehr compilieren lassen, da der Compiler die Typ-Inkompatibilität bei `stackVonStrings.copyInto(stackVonIntegern)` in der Methode `compilerTest`  erkennt. Kommentieren Sie die Methode `compilerTest` aus, damit es den Compiler-Fehler nicht mehr gibt.