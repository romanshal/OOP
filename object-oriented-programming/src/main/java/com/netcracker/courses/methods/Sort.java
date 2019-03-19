package com.netcracker.courses.methods;
import com.netcracker.courses.triangles.Triangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sort {
    public static List<Triangle> sortOfSide(List<Triangle> group){
        int side=0;
        int value=0;
        Iterator<Triangle> itr = group.iterator();
        List<Triangle> list=new ArrayList<Triangle>();
        System.out.println("Выбор треугольников по выбранной стороне больше заданной");
        System.out.print("Выберите сторону(1,2 или 3): ");
        Scanner sc=new Scanner(System.in);
        if (sc.hasNextInt()) {
            side=sc.nextInt();
            System.out.println("Выберите значение: ");
            Scanner scn=new Scanner(System.in);
            if (scn.hasNextInt()) {
                value=scn.nextInt();
            }
            scn.close();
            sc.close();
        }
        while (itr.hasNext()) {
            Triangle element = itr.next();
            if(side==1) {
                if(value<=element.getSideA()) {
                    list.add(element);
                }
            }else if(side==2) {
                if(value<=element.getSideB()) {
                    list.add(element);
                }
            }else if(side==3) {
                if(value<=element.getSideC()) {
                    list.add(element);
                }
            }
        }
        return list;
    }
}
