package com.sn1;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            StudentDAO dao = new StudentDAO();

            while (true) {
                System.out.println("\n===== STUDENT MENU =====");
                System.out.println("1. Insert student");
                System.out.println("2. Update student");
                System.out.println("3. Delete student");
                System.out.println("4. Select student");
                System.out.println("5. Exit");
                System.out.print("Enter your option: ");

                int option = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (option) {

                    case 1:
                        Student s = new Student();
                        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
