package exercises.Musterklausur.Aufgabe01;

public class Student {
    private final String matriculationNumber;
    private final String name;

    public Student(String matriculationNumber, String name) {
        this.matriculationNumber = matriculationNumber;
        this.name = name;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public String getName() {
        return name;
    }
}

