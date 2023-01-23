package com.stev.studentmanagement.student;

public class Student {

    public final int id; //NIA
    public final String name;
    public final String lName;
    public final String phoneNumber;
   // public final String course; //Degreee

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getlName(){
        return lName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    //Constructor
    public Student(int id, String name, String lName, String phoneNumber){
        this.id = id;
        this.name = name;
        this.lName = lName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return String.format("Student"  +
                "{ id/NIA: %d" + id,  //add propierties
                "Name %s"+ name,
                "Last Name %s"+ lName,
                "Number Phone %s" + phoneNumber,
                "}"
        );
    }


}
