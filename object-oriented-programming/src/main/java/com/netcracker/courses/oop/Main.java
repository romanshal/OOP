package com.netcracker.courses.oop;
import com.netcracker.courses.methods.Group;
import com.netcracker.courses.methods.Sort;
import com.netcracker.courses.methods.TranspositionList;
import com.netcracker.courses.triangles.Triangle;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Triangle> list=new ArrayList(Group.createGroup());
        Group.show(list);
        TranspositionList.transposition(list);
        Group.show(Sort.sortOfSide(list));
    }
}