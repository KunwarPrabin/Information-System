/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.oop;

import com.kunwarprabin.oop.entity.Student;
import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class StudentInformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter Id :");
        student.setId(input.nextInt());
        System.out.println("Enter First Name :");
        student.setFirstName(input.next());
        System.out.println("Enter Last Name :");
        student.setLastName(input.next());
        System.out.println("Enter email :");
        student.setEmail(input.next());
        System.out.println("Enter ContactNo :");
        student.setContactNo(input.next());
        System.out.println("Enter Status :");
        student.setStatus(input.nextBoolean());
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println(student.getFullName());
        System.out.println(student.getEmail());
        System.out.println(student.getContactNo());
        System.out.println(student.isStatus());
        
    }
    
}
