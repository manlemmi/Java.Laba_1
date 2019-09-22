package com.company.classes;
import java.util.concurrent.ThreadLocalRandom;

public class Triangles {

    public Triangles(int quantityTriangles){
        triangles = new Triangle[quantityTriangles];
    }
    private final Triangle[] triangles;

    public void initArray()
    {
        for (int i = 0; i < triangles.length; ++i) {
            do {
                triangles[i] = new Triangle(ThreadLocalRandom.current().nextInt(3, 10),
                ThreadLocalRandom.current().nextInt(4, 12),
                ThreadLocalRandom.current().nextInt(5, 14));
            } while (!triangles[i].getCheck());
        }
    }

    public double getSumSquare() {
        double totalSum = 0;
        for (Triangle triangle : triangles) {
            totalSum += triangle.getSquare();
        }
        return totalSum;
    }

    public void outputArray()
    {
        for (Triangle triangle : triangles) {
            System.out.println(triangle.getInfo());
        }
    }
}
