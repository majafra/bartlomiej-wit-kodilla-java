package com.kodilla.testing.shape;

import java.util.ArrayList;

class ShapeCollector{

    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public ArrayList<Shape> getFigures() {
        return figures;
    }

    public void addFigure(Shape shape){
        getFigures().add(shape);
    }
    public boolean removeFigure(Shape shape){
        getFigures().remove(shape);
        if (getFigures().size()==0) {
            return true;
        }else{
            return false;
        }
    }
    public Shape getFigure(int n) {
        return figures.get(n);
    }
    public int checkSize(){
        return getFigures().size();
    }
}

