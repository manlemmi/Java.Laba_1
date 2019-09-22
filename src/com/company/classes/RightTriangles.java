package com.company.classes;

import java.util.concurrent.ThreadLocalRandom;

public class RightTriangles {
    public RightTriangles(int quantityTriangles) {
        rightTriangles = new RightTriangle[quantityTriangles];
    }
    private final RightTriangle[] rightTriangles;

    public void initArray()
    {
        for (int i = 0; i < rightTriangles.length; ++i) {
            do {
                rightTriangles[i] = new RightTriangle(ThreadLocalRandom.current().nextInt(1000),
                        ThreadLocalRandom.current().nextInt(1000),
                        ThreadLocalRandom.current().nextInt(1000));
            } while (!rightTriangles[i].getCheck());
        }
    }

    public int getMaxHypotenuse()
    {
        int temp = 0, expression;
        for (RightTriangle rightTriangle : rightTriangles) {
            expression = Math.max(rightTriangle.getSide_1(), Math.max(rightTriangle.getSide_2(), rightTriangle.getSide_3()));
            temp = expression > temp ? expression : temp;
        }
        return temp;
    }
    public void outputArray()
    {
        for (RightTriangle rightTriangle : rightTriangles) {
            System.out.println(rightTriangle.getInfo());
        }
    }

}
