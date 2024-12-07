package exercises.Musterklausur.Aufgabe01;

public class ExamTask01 { // 0,5

    public static void main(String[] args) { // 0,5

        Class class1 = new Class("WWIBE122", CourseOfStudies.WI);
        class1.addStudent(new Student("8271625", "Hans Maier"));
        class1.addStudent(new Student("9102934", "Peter Müller"));
        class1.addLecture(new Lecture("Mathe", 5));
        class1.addLecture(new Lecture("Programmierung", 10));

        System.out.println(class1.toString());
        System.out.println(class1.getLectureWithMostCreditPoints());

    } // 7,5

} // 8
