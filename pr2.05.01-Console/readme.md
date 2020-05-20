# Aufgabe: Konsolen Input/Output

## Lernziel

Daten von der Konsole lesen und über eine Ausgabeumlenkung in eine Datei umlenken. `PrintStream` und `InputStreamReader` einsetzen.


## Aufgabe

Lesen Sie zeilenweise mit Hilfe eines `BufferedReaders` von der Konsole Zeichen ein. Geben Sie diese wieder auf `System.out` aus und zeigen Sie die aktuelle Zeilennummer auf `System.err` an.

Testen Sie das Programm.

Lenken Sie nun die Ausgabe von `System.out` in die Datei `output/console.log` um (siehe Konstante `LOGFILE`). Recherchieren Sie dazu die passende Methode von ``System``. Lassen Sie das Programm erneut laufen und betrachten Sie danach die Datei mit den umgeleiteten Daten.

Sorgen Sie dafür, dass ``IOException`` in ``main`` sinnvoll mit *try-with-resources* behandelt wird.