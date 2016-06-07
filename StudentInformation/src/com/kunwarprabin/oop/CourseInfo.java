/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.oop;

import com.kunwarprabin.oop.entity.Courses;
import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class CourseInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Courses course = new Courses();
        System.out.println("Enter Course Id :");
        course.setId(input.nextInt());
        System.out.println("Enter Course :");
        course.setCourseName(input.next());
        System.out.println("Enter Credit Hours :");
        course.setCreditHours(input.nextInt());
        System.out.println("Enter Status :");
        course.setStatus(input.nextBoolean());
        System.out.println("====================================================");

        System.out.println(course.getCourseName());
        System.out.println(course.getCreditHours());
        System.out.println(course.isStatus());

    }

}
