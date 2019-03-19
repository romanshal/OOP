package com.netcracker.courses.methods;
import com.netcracker.courses.triangles.Triangle;
import java.util.*;

public class TranspositionList {
    public static void transposition(List<Triangle> group) {
        System.out.println("Сортировка треугольников по названию");
        Comparator<Triangle> comp=new Comparator<Triangle>(){
            @Override
            public int compare(Triangle arg0, Triangle arg1) {
                return Integer.compare(arg0.getNameOfTriangle(), arg1.getNameOfTriangle());
            }
        };
        Set<Triangle> list=new TreeSet<Triangle>(comp);
        list.addAll(group);
        Iterator<Triangle> itr = list.iterator();
        while (itr.hasNext()) {
            Triangle element = itr.next();
            System.out.println(element.toString() + " ");
        }
    }
}
