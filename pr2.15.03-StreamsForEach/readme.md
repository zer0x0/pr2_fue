# Aufgabe: Streams mit interner Iteration

## Lernziel

Einen Stream mit einer internen Iteration verwenden. Die Iteration hierbei mit einem Lambda-Ausdruck durchführen.

## Aufgabe

In dieser Aufgabe geht es um Datensätze vom Typ `Employee`. Eine so repräsentierte Mitarbeiterin oder Mitarbeiter hat vier Eigenschaften:

- **`name` (Typ: `String`)**: der Name des/der Mitarbeiter/in
- **`license` (Typ: `Boolean`)**: Information darüber, ob eine Lizenz vorhanden ist oder nicht
- **`birthYear` (Typ: `Integer`)**: das Geburtsjahr des/der Mitarbeiter/in
- **`id` (Typ: `Integer`)**: eindeutige Personenkennzahl

Die Klasse `CompanyDatabaseEmployees` liest die CSV-Datei `company.txt` aus dem Verzeichnis `assets/` ein, in der zeilenweise Datensätze über Mitarbeiterinnen und Mitarbeiter gespeichert sind. Sie können als Stream abgerufen werden. 

Geben Sie jeweils mit Hilfe einer internen Iteration und eines Lambda-Ausdrucks folgendes aus:
  1. alle Mitarbeiterinnen und Mitarbeiter  
  2. nur die Mitarbeiterinnen und Mitarbeiter, die 1972 geboren sind  

Lassen Sie Ihr Programm laufen und überprüfen Sie, ob anhand von `assets/company.txt` die richtigen Informationen ausgegeben werden.