package exercises.Musterklausur.Aufgabe01;

public enum CourseOfStudies {

    BWL("BWL"), INF("Informatik"), WI("Wirtschaftsinformatik");

    private final String description;

    private CourseOfStudies(String description) {
        this.description = description;
    }

    public String description() {
        return description;
    }

}
