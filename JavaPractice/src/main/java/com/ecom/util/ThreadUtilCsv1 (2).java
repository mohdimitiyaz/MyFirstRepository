package com.ecom.util;

import com.ecom.dto.Student;
import lombok.SneakyThrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ThreadUtilCsv1 extends Thread {

    private long thread1TIme;
    public ThreadUtilCsv1(long thread1TIme) {
        this.thread1TIme = thread1TIme;
    }

    /*public double getthread1TIme() {
        return thread1TIme;
    }*/

    @SneakyThrows
    @Override
    public void run() {

        //Long duration = (long) (Math.random() * 10);
        Thread.sleep(thread1TIme);

        //TimeUnit.SECONDS.sleep(duration);
        String filePath = "F:\\Imtiyaz\\Test3.csv";

        write(filePath);
        try {
            FileWriter fstream = new FileWriter(filePath, true);
            BufferedWriter out = new BufferedWriter(fstream);
            //out.write("\n");
            out.write(populateFileData(5, 5, "Imtiyaz"));

            System.out.println("Appending has done successfully");
            out.close();
        } catch (Exception e) {
            System.err.println("Error while writing to file: " +
                    e.getMessage());
        }

       /* String line = "";
        String splitBy = ",";
        try {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("CSVDemo.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] employee = line.split(splitBy);    // use comma as separator
                //System.out.println(employee[0],employee[1],employee[2],employee[3],employee[4],employee[5],employee[6],employee[7],employee[8],employee[9],employee[10],employee[11],employee[12],employee[13],employee[14],employee[15],employee[16],employee[17],employee[18],employee[19]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }    //closes the scanner
        /*String line = "";
        String splitBy = ",";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("CSVDemo.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] employee = line.split(splitBy);    // use comma as separator
                System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/


    //It writes data as csv file for a given location.
    public static void write(String filePath) {

       /* List<Student> studentList = new ArrayList<>();
       Student student = CSVUtil.retrieveStdDetails("Imtiyaz", "Ahmed", "Ghulam Rasool", "absd", "cdcsdc", "cdscdsc", "jdhhdh", "jajjaj", "ssss", "fvvfvfv", "kkamah", "1222", "13", "14", "15", "16", "17", "18", "19", "20");
        //System.out.println(student);

        List<Student> students = CSVUtil.getCvsForStudents(studentList);
        //for (int i = 0; i <= 1; i++){

        students.add(student);
        //System.out.println(student);
        //}

*/

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.append(populateFileData(5, 5, "Imtiyaz"));
            //populateFileData();
            /*fileWriter.append("studentFirstName, studentLastName, fathersName,  mothersName,  dateOfAdmission,  rollNumber,   schoolName,  studentAge, streetName,   columnTen,   columnEleven,   columnTwelve,   columnThirteen,   columnFourteen,   columnFifteen,   columnSixteen,   columnSeventeen,  columnEighteen,   columnNineteen,   columnTwenty");

            fileWriter.append("\n");
            for (int i = 0; i <= 1; i++) {
                for (Student std : students) {
                    fileWriter.append(std.getStudentFirstName()).append(",").append(std.getStudentFirstName()).append(",").append(std.getStudentFirstName())
                            .append(",")
                            .append(std.getStudentFirstName())
                            .append("\n");
                }
//                fileWriter.append("\n");
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }

    public static String populateFileData(int rowCount, int columnCount, String cellData) {
        StringBuilder data = new StringBuilder();
        data.append("studentFirstName, studentLastName, fathersName,  mothersName,  dateOfAdmission,  rollNumber,   schoolName,  studentAge, streetName,   columnTen,   columnEleven,   columnTwelve,   columnThirteen,   columnFourteen,   columnFifteen,   columnSixteen,   columnSeventeen,  columnEighteen,   columnNineteen,   columnTwenty");
        data.append("\n");
        List<Student> studentList = new ArrayList<>();
        Student student = CSVUtil.retrieveStdDetails("Imtiyaz", "Ahmed", "Ghulam Rasool", "absd", "cdcsdc", "cdscdsc", "jdhhdh", "jajjaj", "ssss", "fvvfvfv", "kkamah", "1222", "13", "14", "15", "16", "17", "18", "19", "20");
        //System.out.println(student);
        List<Student> students = CSVUtil.getCvsForStudents(studentList);
        //for (int i = 0; i <= 1; i++){
        students.add(student);
        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= columnCount; j++) {
                data.append(cellData + i + j + ",");

            }
            if (data.length() > 0)
                data.deleteCharAt(data.length() - 1);
            //data.delete(data.length()-1,data.length());
//                return data.toString();
            //System.out.println(",");
            //data.append(std.getStudentFirstName()).append(rowCount)//.append(",").append(std.getStudentFirstName()).append(",").append(std.getStudentFirstName())
            //.append(",")
            //.append(std.getStudentFirstName())
            // .append("\n");

            data.append("\n");


//                fileWriter.append("\n");
        }
        return data.toString();
    }

}
