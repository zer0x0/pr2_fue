# Aufgabe: `Comparator<T>` verwenden und Objekte sortieren

## Lernziel

Verschiedene Sortierreihenfolgen durch die Implementierung von `Comparator<T>` realisieren.


## Umgebung

  * Eclipse


## Aufgabe

Sie finden in der Aufgabe bereits den Aufzählungstyp `SortOrder`, die Klasse `Sorter` und den JUnit-Test `TestSorter` vor. Schauen Sie sich die Klasse `Sorter` an und versuchen Sie anhand der JavaDoc und des bereits vorhandenen Codes zu verstehen, was die Klasse machen soll.

Lassen Sie den Test laufen. Sie werden feststellen, dass ein Testfall grün ist, obwohl in `Sorter` gar keine Implementierung vorhanden ist. Versuchen Sie herauszufinden, warum dies so ist.

Fügen Sie nun den fehlenden Code in die Klasse `Sorter` ein, und geben Sie entsprechende `Comparator`-Objekte zurück, sodass die Daten entsprechend dem Parameter `order` sortiert werden können. Dazu müssen Sie eine neue Klasse programmieren, die das Interface `Comparator` implementiert.

