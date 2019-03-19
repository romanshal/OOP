package com.netcracker.courses.triangles;

public abstract class Triangle {
    private int sideA,sideB,sideC,nameOfTriangle;
    public Triangle(int sideA,int sideB,int sideC,int nameOfTriangle) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        this.nameOfTriangle=nameOfTriangle;
    }
    public Triangle(int sideA,int sideB,int nameOfTriangle) {
        this.sideA=sideA;
        this.sideB=sideB;
        this.nameOfTriangle=nameOfTriangle;
    }
    public int getSideA() {
        return sideA;
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public int getSideC() {
        return sideC;
    }
    public void setSideC(int sideC) {
        this.sideC = sideC;
    }
    public int getNameOfTriangle() {
        return nameOfTriangle;
    }
    public void setNameOfTriangle(int nameOfTriangle) {
        this.nameOfTriangle = nameOfTriangle;
    }
    public abstract double square() ;
}
