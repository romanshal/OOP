package com.netcracker.courses.methods;
import com.netcracker.courses.triangles.ArbitraryTriangle;
import com.netcracker.courses.triangles.IsoscelesTriangle;
import com.netcracker.courses.triangles.Triangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Group {
    private static int quantity;
    public static List<Triangle> createGroup() {
        List<Triangle> group=new ArrayList<Triangle>();
        quantity=quantityOfTriangle();
        if(quantity%2==0) {
            for(int i=0;i<quantity/2;i++) {
                group.add(IsoscelesTriangle.createTreangle());
            }
            for(int i=0;i<quantity/2;i++) {
                group.add(ArbitraryTriangle.createTreangle());
            }
        }else {
            int numberOne=quantity/2;
            int numberTwo=quantity-numberOne;
            for(int i=0;i<numberOne;i++) {
                group.add(IsoscelesTriangle.createTreangle());
            }
            for(int i=0;i<numberTwo;i++) {
                group.add(ArbitraryTriangle.createTreangle());
            }
        }
        return group;
    }
    public static int quantityOfTriangle() {
        System.out.println("Введите целое число: ");
        Scanner sc=new Scanner(System.in);
        if (sc.hasNextInt()) {
            quantity=sc.nextInt();
        }else {
            System.out.println("Вы ввели не целое число");
        }
        return quantity;
    }
    public static void showList(List<Triangle> group) {
        Iterator<Triangle> itr = group.iterator();
        while (itr.hasNext()) {
            Triangle element = itr.next();
            System.out.println(element.toString() + " ");
        }
        System.out.println();
    }
}
