# Aufgabe: Monte-Carlo-Algorithmus zur Annäherung von π

## Lernziele

Eine Schleife in mehrere nebenläufige aufteilen und konkurrierenden Zugriff auf Speicher kontrollieren. Auswirkungen der Thread-Sicherheit von Zufallszahlengeneratoren, speziell bei Monte-Carlo-Algorithmen. 


## Umgebung

  * Eclipse

## Monte-Carlo-Algorithmus zur Annäherung von π

Monte-Carlo-Algorithmen sind randomisierte Algorithmen, die durch fortgesetzte Wahl von Zufallszahlen versuchen, ein Ergebnis anzunähern. Es gibt bei ihnen aber keine Garantie für Korrektheit.

Ein bekannter Monte-Carlo-Algorithmus zur Annäherung von π basiert darauf, dass zufällig Punkte `(x y)` im Koordinatenbereich von `(0, 0)` bis `(1, 1)` gezogen werden. Für jeden gezogenen Punkt wird vermerkt, ob er innerhalb eines Einheitsviertelkreises (Radius=1) liegt. Durch Anwendung des Satzes des Pythagoras, kann dies geprüft werden.

1. Im folgenden Fall wurde zufällig ein Punkt mit den Koordinaten `x` und `y` gewählt, so dass gilt: `sqrt(x*x + y*y) = 1`. Der Punkt liegt also zufällig genau auf dem Kreisbogen.<br/>
![sqrt(x*x + y*y) = 1](doc/on.png "sqrt(x*x + y*y) = 1") 

2. Im nächsten Fall wurde zufällig ein Punkt mit den Koordinaten `x` und `y` gewählt, so dass gilt: `sqrt(x*x + y*y) < 1`. Der Punkt liegt also zufällig innerhalb des Kreisbogens.<br/>
![sqrt(x*x + y*y) < 1](doc/in.png "sqrt(x*x + y*y) < 1") 

3. Im letzten Fall wurde zufällig ein Punkt mit den Koordinaten `x` und `y` gewählt, so dass gilt: `sqrt(x*x + y*y) > 1`. Der Punkt liegt also zufällig außerhalb des Kreises.<br/>
![sqrt(x*x + y*y) > 1](doc/out.png "sqrt(x*x + y*y) > 1") 

Werden sehr viele Punkte gezogen, die sich innerhalb der Koordinaten `(0, 0)` und `(1, 1)` gleichmäßig verteilen, sollte sich für das Verhältnis der Anzahl der Punkte innerhalb des Kreises (einschließlich auf dem Kreisbogen) zu allen innerhalb des Quadrats das Verhältnis der Fläche des Viertelkreises (Radius 1) zur Fläche des Quadrats (Kantenlänge 1) ergeben.


Anzahl der Punkte innerhalb und auf dem Kreis (`sqrt(x*x + y*y) <= 1`) / Anzahl aller Punkte = (π r^2 / 4) / r^2

Da `r=1` kann π angenähert werden als `pi = 4.0 * in / (in + out)`, wobei `in` die Anzahl der Punkte innerhalb des Kreises ist, für die gilt `sqrt(x*x + y*y) <= 1` und `out` die restlichen, die außerhalb des Kreises liegen. 

Falls die zufällig gezogenen Punkte gleichmäßig über die Fläche verteilt sind, nähert sich `pi` der [Konstante π](https://3.141592653589793238462643383279502884197169399375105820974944592.eu/)
 an. Es liegt in der Natur der Sache von Monte-Carlo-Algorithmen, dass dies nicht in jedem Fall zu einem korrekten Ergebnis führt. Je mehr Punkte gezogen werden, desto sollte im Mittel der Wert von π angenähert werden. Es ist also sinnvoll, so viele Punkte wie möglich zu ziehen. Im Package `io.dama.ffi.concurrency.pi`  ist die Klasse `Const` enthalten, die drei Konstanten beinhaltet.

* `TOTAL_CYCLES` gibt an, wieviele Punkte insgesamt gezogen werden sollen. Das ist sozusagen das Rechenziel. 
* `PARALLELISM` gibt an, wieviele Threads neben dem Main-Thread gestartet werden sollen, um das Rechenziel zu erreichen. Die beiden Programme `MonteCarloPiSeq` und `MonteCarloPiSeqThreadLocal` verwenden nur den Main-Thread und arbeiten sequentiell statt nebenläufig.
* `CYCLES` ist `TOTAL_CYCLES / PARALLELISM`. Das ist das *anteilige Rechenziel* in jedem einzelnen Thread, wenn mit Nebenläufigkeit gearbeitet wird. 

## Aufgaben

* Bauen Sie das Programm `MonteCarloPiSeq` so um, dass die `TOTAL_CYCLES` Ziehungen der Zufallszahlen `x` und `y` auf `PARALLELISM` Threads verteilt werden.
* Ist die dadurch errechnete Näherung von π mit der des sequenziellen Programms vergleichbar?
* Welche Geschwindigkeitssteigerung können Sie bei der Berechnung mit Parallelisierung erreichen?

