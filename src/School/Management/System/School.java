package School.Management.System;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;


    public School (List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    //add a teacher to the school
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    //list of student in school
    public List<Student> getStudents() {
        return students;
    }

    //add a student to the school
    public void addStudents(Student student) {
        students.add(student);
    }

    //return the total money earned by the school
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //add the total earned by the school
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    //return the total money spent by the school
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //update the money that is spent by the school which is the salary given to its teachers
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}