# Aufgabe: Polymorphie einsetzen

## Lernziel

Durch Polymorphie Subklassen wie Basisklassen behandeln k&ouml;nnen.


## Umgebung

  * Eclipse
  * [plantUML](http://www.plantuml.com/plantuml/uml/)


## Aufgabe

In dieser Aufgabe geht es darum, einen Zoo zu simulieren. In dem Zoo gibt es _Affen_, _Gorillas_ und _Giraffen_. Die Tiere sind oft hungrig und m&uuml;ssen deshalb gef&uuml;ttert werden. Hierzu dient die Klasse `Futterstelle`, die f&uuml;r die verschiedenen Tierarten entsprechende F&uuml;tterungsmethoden hat.


### UML-Diagramm

Sehen Sie sich die Klassen f&uuml;r die verschiedenen Tiere, die `Futterstelle` und `ZooSimulation` genau an und zeichnen Sie danach ein UML-Diagramm der Klassen und ihrer Beziehungen.


### Futterstelle

Schreiben Sie die Klasse `Futterstelle` so um, dass sie Polymorphie nutzt, um alle Tiere mit nur einer einzigen Methode zu f&uuml;ttern.

Schreiben Sie danach die Klasse `ZooSimulation` so um, dass Sie anstatt von drei Variablen `charlie`, `buck` und `debbie` ein einziges Array `tiere` verwendet.
