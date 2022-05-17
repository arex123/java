package Aditya;

import Aditya.com.student.Student;
import Aditya.com.student.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("welcome to student management app");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit app");

            int c = Integer.parseInt(br.readLine());

            if(c==1){
                //add student, for that ask info about student from user
                System.out.println("Enter name of user: ");
                String name = br.readLine();

                System.out.println("Enter phone number:");
                String phone = br.readLine();

                System.out.println("Enter city:");
                String city = br.readLine();

                Student st = new Student(name,phone,city); //now we are going to save this student to out database
                //for saving we needed to connect to db

                boolean result = StudentDao.insertStToDB(st);
                if(result)
                    System.out.println("Student added successfully :) ");
                else
                    System.out.println("Something went wrong :( ");


                System.out.println(st);

            }else if(c==2){
                //delete student, we will delete using student id

                System.out.println("enter id of student for deletion: ");
                int userId = Integer.parseInt(br.readLine());
                boolean res = StudentDao.deleteUsingId(userId);
                StudentDao.setIds();
                if(res)
                    System.out.println("Successfully deleted :) ");
                else
                    System.out.println("Something went wrong :( ");


            }else if(c==3){
                //display student
                StudentDao.showAllStudents();

            }else if(c==4){
                //exit
                break;
            }else{
                continue;
            }
        }

        System.out.println("thank you for using my app");
    }
}