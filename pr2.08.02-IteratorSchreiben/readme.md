# Aufgabe: Iterator schreiben

## Lernziel

Für eine gegebenen Klasse einen Iterator schreiben.


## Umgebung

  * Eclipse


## Aufgabe

In dieser Aufgabe sollen Sie für eine bereits vorhandene Klasse einen Iterator schreiben. Bei dieser Klasse (`StringStack`) handelt es sich um einen sehr einfach (und nicht sehr sicher) programmierten Stack, der Elemente vom Typ `String` speichern soll.

Implementieren Sie in `StringStack` das Interface `Iterable<T>` und schreiben Sie, wie vom Interface verlangt einen `Iterator` für die Klasse. 

Dazu müssen Sie eine neue Klasse implementieren, die den `Iterator` für den `StringStack`  enthält. Diese Klasse braucht Instanzvariablen, um die Daten des `StringStack` zu speichern, die beim Iterieren zurückgegeben werden sollen, und um sich zu merken, an welcher Stelle der Iterator gerade ist.

Benutzen Sie die Tests in `TestStack`, um zu überprüfen, dass Ihre Implementierung des Iterators richtig funktioniert. Hierzu müssen Sie die entsprechenden Tests allerdings erst einkommentieren.
