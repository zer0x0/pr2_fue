# PR2 - Objektorientierung

## Lernziele

* Unterschied und Bedeutung von statischem und dynamischen Typ kennen und anwenden k&ouml;nnen. 
* Unterschied zwischen statischer und dynamischer Bindung verstehen. 
* Polymorphismus verstehen.

## Umgebung

  * Eclipse

Eine Variable hat immer einen **statischen Typ (*static type*)**. Das ist der Typ, mit dem sie deklariert wurde.

	Mitarbeiter m;
	
``m`` hat den statischen Typ ``Mitarbeiter``, obwohl sie noch nicht initialisiert wurde. Der statische Typ wird zur Compile-Zeit bestimmt. Er &auml;ndert sich w&auml;hrend der Laufzeit des Programms nicht. Der statische Typ bestimmt, welche Methoden und Felder sichtbar sind.

Der **dynamische Typ (*dynamic type*)** ist der Typ des referenzierten Objekts. Er kann gleich dem statischen Typ sein, ist es aber (u.a. aufgrund von Vererbung) nicht unbedingt. Der dynamische Typ kann sich mit jeder Zuweisung &auml;ndern.

	m = new Manager();
	
``m`` hat nun den dynamischen Typ ``Manager``. Falls der statische Typ von ``m`` ``Mitarbeiter`` ist und ``Manager`` eine Unterklasse von ``Mitarbeiter`` ist, funktioniert diese Zuweisung.

Polymorphie kann nur funktionieren, wenn bei &uuml;berschriebenen Methoden die richtige Variante aufgerufen wird. Dies hei&szlig;t auch **virtueller Methodenaufruf**, denn zur *Laufzeit* und nicht zur *Compile-Zeit* wird entschieden, welche Methode aufzurufen ist.

## Aufgabe

1. Schreiben Sie ein Programm, mit dem Sie herausfinden k&ouml;nnen, ob der statische oder dynamische Typ bestimmt, welche Methode zur Laufzeit aufgerufen wird. 