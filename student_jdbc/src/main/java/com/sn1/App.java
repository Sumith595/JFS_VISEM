package com.sn1;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
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
                        System.out.print("Enter name: ");
                        s.setName(sc.nextLine());
                        System.out.print("Enter semester: ");
                        s.setSem(sc.nextLine());
                        System.out.print("Enter department: ");
                        s.setdept(sc.nextLine());
                        dao.addStudent(s);
                        System.out.println("Student inserted successfully.");
                        break;
                    case 2:
                        System.out.print("Enter student ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine(); // consume newline
                        Student updateStu = new Student();
                        updateStu.setId(updateId);
                        System.out.print("Enter new name: ");
                        updateStu.setName(sc.nextLine());
                        System.out.print("Enter new semester: ");
                        updateStu.setSem(sc.nextLine());
                        System.out.print("Enter new department: ");
                        updateStu.setdept(sc.nextLine());
                        dao.updateStudent(updateStu);
                        System.out.println("Student updated successfully.");
                        break;  
                    case 3:
                        System.out.print("Enter student ID to delete: ");
                        int deleteId = sc.nextInt();
                        dao.deleteStudent(deleteId);
                        System.out.println("Student deleted successfully.");
                        break;      
                    case 4:
                        List<Student> students = dao.getAllStudents();  
                        System.out.println("\n--- Student List ---");
                        for (Student stu : students) {
                            System.out.println(stu);
                        }   
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");    
                        break;
                }    
                        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
