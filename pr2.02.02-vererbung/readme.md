# Aufgabe: Vererbung von Figuren

## Lernziel

Einfache Klassen schreiben und eine Vererbungshierarchie bilden.


## Umgebung

  * Eclipse
  * [plantUML](http://www.plantuml.com/plantuml/uml/)


## Aufgabe

Denken Sie bei den folgenden Aufgaben daran, Pakete zu verwenden.


### Figur und Rechteck

Schreiben Sie ein Klasse `Figur`, die als einziges Attribut die Fl&auml;che der Figur hat. Bieten Sie weiterhin eine Methode `getFlaeche()` an, mit der die Fl&auml;che wieder ausgelesen werden kann. Sorgen Sie daf&uuml;r, dass nur Subklassen den Konstruktor dieser Klasse aufrufen k&ouml;nnen. Machen Sie das Attribut `flaeche` private.

Leiten Sie von der Klasse `Figur` eine Klasse `Rechteck` ab. Das Rechteck soll durch H&ouml;he und Breite beschrieben werden und diese Werte sollen benutzt werden, um die Fl&auml;che der Figur zu setzen.


### Erweiterung der Figur

Erweitern Sie die Klasse `Figur` so, dass man Objekte ohne Angabe einer Fl&auml;che erzeugen kann. Diese Objekte sollen dann die Fl&auml;che `0` haben. Die Klasse `Rechteck` soll weiter funktionieren.


### Dreieck

Schreiben Sie eine Klasse `Dreieck`, die von der Klasse `Figur` abgeleitet ist und &uuml;ber Grundseite und H&ouml;he definiert wird.


### Gerade

Schreiben Sie eine Klasse `Gerade`, die von `Figur` abgeleitet ist und als Attribut die L&auml;nge der Geraden hat, deren Fl&auml;che aber logischerweise `0` ist.


### Quadrat

Schreiben Sie eine Klasse `Quadrat` und leiten Sie diese sinnvoll von den bereits vorhandenen Klassen ab. &Uuml;berlegen Sie sich, welche Informationen Sie f&uuml;r die Berechnung der Fl&auml;che ben&ouml;tigen.


### Tests

Schreiben Sie Unit-Tests, die die von Ihnen entwickelten Klassen testen.


### UML-Diagramm

Zeichnen Sie ein UML-Diagramm von Ihrer L&ouml;sung.
