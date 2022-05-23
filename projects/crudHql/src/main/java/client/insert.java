package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.Student;

import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        Configuration confg = new Configuration();
        confg.configure("hibernate.cfg.xml");
        SessionFactory sf = confg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction txn;

        Scanner scn = new Scanner(System.in);

        txn = session.beginTransaction();

        Student st = new Student();

        System.out.println("enter roll of student");
        st.setRoll(scn.nextInt());

        System.out.println("enter name of student");
        st.setName(scn.nextLine());

        System.out.println("enter cgpa of student");
        st.setCgpa(scn.nextFloat());

        System.out.println("enter college of student");
        st.setCollege(scn.nextLine());

        session.save(st);
        session.flush();

        txn.commit();
        System.out.println("record saved");


        session.close();
        sf.close();

    }
}

/*https://roytuts.com/how-to-create-java-based-hibernate-configurations/*/