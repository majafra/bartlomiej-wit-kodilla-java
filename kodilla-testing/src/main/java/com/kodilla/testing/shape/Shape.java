package com.kodilla.testing.shape;

import java.util.ArrayList;

public interface Shape {

    public String getShapeName();
    public double getField();
}
class Triangle implements Shape{

    private double a;
    private double b;

    public Triangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public String getShapeName(){
        return "Triangle";
    }
    public double getField(){
        return a*b/3;
    }
}
class Circle implements Shape{

    private double a;

    public Circle(double a) {
        this.a=a;
    }
    public String getShapeName(){
        return "Circle";
    }
    public double getField(){
      return Math.PI*a*a;
    }
}
class Square implements Shape{

    private double a;

    public Square(double a) {
        this.a = a;
    }
    public String getShapeName(){
        return "Square";
    }
    public double getField(){
        return a*a;
    }
}
class ShapeCollector{

    Shape shape;
    private ArrayList<Shape> figure = new ArrayList<Shape>();

    public ArrayList<Shape> addFigure(Shape shape){
        figure.add(shape);
        return figure;
    }
    public ArrayList<Shape> removeFigure(Shape shape){
        figure.remove(shape);
        return figure;
    }
    public Shape getFigure(int n) {
        figure.get(n);
        return shape;
    }
}

