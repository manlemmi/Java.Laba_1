package com.company;


import com.company.classes.RightTriangles;
import com.company.classes.Triangles;

import java.util.Locale;

class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int quantityTriangle = 10;
        int quantityRightTriangle = 10;

        Triangles triangles = new Triangles(quantityTriangle);
        RightTriangles rightTriangles = new RightTriangles(quantityRightTriangle);

        triangles.initArray();
        triangles.outputArray();


        System.out.println(triangles.getSumSquare());

        rightTriangles.initArray();
        rightTriangles.outputArray();



        System.out.println(rightTriangles.getMaxHypotenuse());


    }
}

