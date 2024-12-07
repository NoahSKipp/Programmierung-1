package exercises.Musterklausur.Aufgabe01;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private final String description;
    private final CourseOfStudies courseOfStudies;
    private final List<Lecture> lectures;
    private final List<Student> students;

    public Class(String description, CourseOfStudies courseOfStudies){
        this.description = description;
        this.courseOfStudies = courseOfStudies;
        lectures = new ArrayList<>();
        students = new ArrayList<>();
    }
    public String getDescription() {
        return description;
    }
    public CourseOfStudies courseOfStudies(){
        return courseOfStudies;
    }
    public List<Lecture> lectures() {
        return new ArrayList<>(lectures);
    }
    public List<Student> students() {
        return new ArrayList<>(students);
    }
    public void addLecture(Lecture lecture){
        if (lecture != null){
            lectures.add(lecture);
        }
    }
    public void addStudent(Student student){
        if (student != null){
            students.add(student);
        }
    }
    public Lecture getLectureWithMostCreditPoints(){
        if (lectures.isEmpty()){
            return null;
        }
        Lecture maxCreditLecture = lectures.get(0);
        for (Lecture lecture : lectures){
            if (lecture.getCreditPoints() > maxCreditLecture.getCreditPoints()){
                maxCreditLecture = lecture;
            }
        }
        return maxCreditLecture;
    }
    public String toString(){
        return "Class [description=" + description + ", courseOfStudies=" + courseOfStudies + ", lectures=" + lectures + ", students=" + students + "]";
    }


}
