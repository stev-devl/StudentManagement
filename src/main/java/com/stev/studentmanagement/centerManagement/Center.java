package com.stev.studentmanagement.centerManagement;

import com.stev.studentmanagement.student.Student;

public class Center {
    //Number of Students
    private final Student[] students;
    private int count;

    public Center(int max_students) {
        students = new Student[max_students];
        count = 0;
    }

    public Student[] getStudents() {
        return students;  //obtener estudiantes
    }

    //check students
    public boolean newStudents(int id, String name, String lName, String phoneNumber) {
        if (count < students.length){
            students[count] = new Student(id,name,lName, phoneNumber);//create student & valid
            count++;
            return true;
        }
        return false;
    }

    public boolean checkId(){

    }

    //if the student have the same ID, delete the student
    public boolean deleteStudent(){

    }
}
