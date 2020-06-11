package dama.io.ffi.streams.iterate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Database of Employees.
 */
public class Database {

    private final List<Employee> employees;

    public Database() {
        this.employees = new ArrayList<>();
        try (var br = new BufferedReader(new FileReader("assets/company.txt"))) {
            var line = "";
            while ((line = br.readLine()) != null) {
                var tokens = line.split(";");
                var name = tokens[0];
                var licensed = tokens[1].equals("+") ? true : false;
                var birthYear = Integer.parseInt(tokens[2]);
                var id = Integer.parseInt(tokens[3]);
                this.employees.add(new Employee(name, licensed, birthYear, id));
            }
        } catch (final IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Gibt die Liste der Mitarbeiter zurück.
     *
     * @return Liste der Mitarbeiter
     */
    public Stream<Employee> getEmployeeStream() {
        return this.employees.stream();
    }
}
