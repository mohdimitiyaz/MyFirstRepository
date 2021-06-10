package com.ecom.util;

import com.ecom.dto.Order;
import com.ecom.dto.Student;

import java.util.ArrayList;
import java.util.List;

public class CSVUtil {
    public static Student retrieveStdDetails(String studentFirstName,String studentLastName,String fathersName,String  mothersName,String  dateOfAdmission,String  rollNumber,String   schoolName,String  studentAge,String streetName,String   columnTen,String   columnEleven,String   columnTwelve,String   columnThirteen,String   columnFourteen,String   columnFifteen,String   columnSixteen,String   columnSeventeen,String   columnEighteen,String   columnNineteen,String   columnTwenty) {
        Student std = new Student();
        std.setStudentFirstName(studentFirstName);
        std.setStudentLastName(studentLastName);
        std.setFathersName(fathersName);
        std.setMothersName(mothersName);
        std.setSchoolName(schoolName);
        std.setDateOfAdmission(dateOfAdmission);
        std.setSchoolName(schoolName);
        std.setStreetName(streetName);
        std.setRollNumber(rollNumber);
        std.setColumnTen(columnTen);
        std.setColumnEleven(columnEleven);
        std.setColumnTwelve(columnTwelve);
        std.setColumnThirteen(columnThirteen);
        std.setColumnFourteen(columnFourteen);
        std.setColumnFifteen(columnFifteen);
        std.setColumnSixteen(columnSixteen);
        std.setColumnSeventeen(columnSeventeen);
        std.setColumnEighteen(columnEighteen);
        std.setColumnNineteen(columnNineteen);
        std.setColumnTwenty(columnTwenty);
        return std;
//    System.out.print(ord);
    }

    public static List<Student> getCvsForStudents(List<Student> students){
List<Student> studentList= new ArrayList<>();
       for(Student student:students){
           studentList.add(student);
       }

return studentList;
    }

}
