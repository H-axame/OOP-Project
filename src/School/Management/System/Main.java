package School.Management.System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Teacher ahmad = new Teacher(1,"Ahmad" , 1000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(ahmad);

        Student hazim = new Student(1,"Muhammad Hazim" , 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(hazim);

        School school = new School(teacherList,studentList);

        hazim.payFees(5000);

        System.out.println("School has earned : RM " + school.getTotalMoneyEarned());
    }
}
