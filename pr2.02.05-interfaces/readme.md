# Aufgabe: Interfaces anwenden und entwerfen

## Lernziel

Ein vorhandenes Interface implementieren und ein eigenes Interface programmieren. Klassen schreiben, die mehrere Interfaces implementieren. Die Kollision von gleichnamigen Interface-Methoden und deren Konsequenzen verstehen.

## Umgebung

  * Eclipse


## Aufgabe

Bei dieser Aufgabe geht es um Spielecontroller (Joysticks) und deren Abbildung in einem Programm. Schauen Sie sich das Interface `DigitalController` und die dazugeh&ouml;rige Implementierung `DigitalControllerImpl` an. F&uuml;hren Sie die passenden Tests aus.

Schreiben Sie nun eine neues Interface `AnalogController` im Paket `api`, das dieselben Methoden wie `DigitalController` hat, mit dem Unterschied, dass die Methoden `up`, `down`, `left` und `right` einen Prozentsatz (Wert zwischen `0.0` und `1.0`) bekommen, der die Auslenkung des Joysticks anzeigt. Die Methode `getPosition` bleibt im Vergleich zum `DigitalController` unver&auml;ndert. Aus z.B. der Methode `void up()` aus `DigitalController` wird also `void up(double percentage)` in `AnalogController`.

Implementieren Sie das Interface jetzt in einer Klasse `AnalogControllerImpl` im Paket `impl` und testen Sie Ihre Implementierung mit dem Test `TestAnalogController`. Damit der Test ausgef&uuml;hrt werden kann, m&uuml;ssen Sie die Tests noch einkommentieren.

__Hinweis:__ Lassen Sie sich bei der Implementierung der Klasse `AnalogControllerImpl` nicht zu sehr von `DigitalControllerImpl` beeinflussen. Sie m&uuml;ssen einen anderen Weg w&auml;hlen und die Position als `double`-Werte speichern. Eine direkte Verwendung von `Point` wird nicht funktionieren, da `Point` nur ganzzahlige Positionen verwalten kann. Erst in `getPosition` sollten Sie die `double`-Werte runden.

Schreiben Sie nun eine Klasse `DualShock4` im Paket `impl`, die beide Interfaces implementiert. Beachten Sie, dass der Controller zwar zwei Steuerkn&uuml;ppel hat (einen analogen und einen digitalen), aber aus beiden nur eine gemeinsame Position errechnet.

__Hinweis:__ `DualShock4` implementiert zwar die Interfaces, er erbt aber nicht von den Implementierungen. Modellieren Sie die Beziehung zwischen `DualShock4` und `DigitalControllerImpl` bzw. `AnalogControllerImpl` als Assoziation. Leiten Sie dann die Aufrufe der implementierten Methoden an diese Instanzvariablen weiter.

Testen Sie die Implementierung mit dem entsprechenden Test `TestDualShock4`. Auch hier m&uuml;ssen Sie erst die Kommentarzeichen entfernen, bevor der Test laufen kann.


