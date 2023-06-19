package kz.bitlab.techorda.springboot.studentboot.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Long studentId = 6L;
    static {
        students.add(new Student(1L, "Akhmed", "Rakhman", 95, "A"));
        students.add(new Student(2L, "Beknazar", "Kuanysh", 98, "A"));
        students.add(new Student(3L, "Rakhat", "Adil", 45, "F"));
        students.add(new Student(4L, "Bektas", "Ali", 48, "F"));
        students.add(new Student(5L, "Oralbek", "Asylbek", 67, "C"));
    }

    public static ArrayList<Student> getStudents(){
        return students;
    }

    public static void addStudent(Student student){
        student.setId(studentId);
        studentId++;

        int examScore = student.getExam();
        String mark;
        if (examScore >= 90) {mark = "A";}
        else if (examScore >= 75 && examScore < 90) {mark = "B";}
        else if (examScore >= 60 && examScore < 75) {mark = "C";}
        else if (examScore >= 50 && examScore < 60) {mark = "D";}
        else {mark = "F";}

        student.setMark(mark);
        students.add(student);
    }
}