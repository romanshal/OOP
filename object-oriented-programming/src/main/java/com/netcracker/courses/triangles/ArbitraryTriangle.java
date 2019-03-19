package com.netcracker.courses.triangles;
import java.util.Random;
public class ArbitraryTriangle extends Triangle {
    public ArbitraryTriangle(int sideA, int sideB, int sideC, int nameOfTriangle) {
        super(sideA, sideB, sideC, nameOfTriangle);
    }

    @Override
    public String toString() {
        return "ArbitraryTriangle № "+getNameOfTriangle()+" [SideA=" + getSideA() + ", SideB=" + getSideB() + ", SideC="+ getSideC() +"]";
    }

    @Override
    public double square() {
        double p=(getSideA()+getSideB()+getSideC())/2;
        double square=Math.sqrt(p*(p-getSideA())*(p-getSideB())*(p-getSideC()));
        return square;
    }
    public static ArbitraryTriangle createTreangle() {
        int a=0,b=0,c=0;
        Random rand=new Random();
        int name=rand.nextInt(100);
        for(int i=0;i<3;i++) {
            Random r=new Random();
            if(i==0) a=r.nextInt(31);
            else if(i==1) b=r.nextInt(31);
            else if(i==2) c=r.nextInt(31);
        }
        ArbitraryTriangle figure=new ArbitraryTriangle(a,b,c,name);
        return figure;
    }
}
