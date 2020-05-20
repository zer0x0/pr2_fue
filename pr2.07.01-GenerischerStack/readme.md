# Aufgabe: Einen generischen Typ schreiben

## Lernziel

Einen vorhandenen Typ so umgestalten, dass er als generischer Typ verwendet werden kann.


## Umgebung

  * Eclipse


## Aufgabe

Sie finden mit `StringStack` eine einfach Implementierung eines Stapelspeichers (*Stack*, bzw. Kellerspeicher). Zusätzlich gib es auch noch Tests, die diese Datenstruktur testen.

Führen Sie die Tests aus und überzeugen Sie sich, dass der `StringStack` korrekt funktioniert.

Schreiben Sie die Klasse `StringStack` so um, dass sie zu einem generischen Typ wird. In der Datenstuktur sollen also nicht nur `String`-Objekte gespeichert werden, sondern Objekte beliebiger Klassen. Dies bedeutet insbesondere, dass die Methoden `push`, `peek` und `pop` nicht mehr mit `String` arbeiten, sondern auch andere Typen verwenden können. Die resultierende Datenstruktur soll aber typsicher sein. Sie müssen die Klasse `StringStack` generisch machen und einen Typ-Parameter verwenden. Sie müssen sich auch mit der Klasse `StringStackIterator` und den Tests befassen.

Es bietet sich an, die resultierenden Klassen umzubenennen, um mit dem neuen Namen deutlich zu machen, dass auch Objekte eines anderes Typs als `String` darin gespeichert werden können.

Führen Sie die Tests erneut aus, um sicher zu gehen, dass Sie bei Ihren Änderungen nichts kaputt gemacht haben.
