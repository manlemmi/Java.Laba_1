package com.company.classes;


public class Triangle {
    Triangle(int Side_1, int Side_2, int Side_3)
    {
        this.setSide_1(Side_1);
        this.setSide_2(Side_2);
        this.setSide_3(Side_3);
    }

    public int getSide_1() {
        return Side_1;
    }

    private void setSide_1(int side_1) {
        Side_1 = side_1 > 0 ? side_1 : 0;
    }

    public int getSide_2() {
        return Side_2;
    }

    private void setSide_2(int side_2) {
        Side_2 = side_2 > 0 ? side_2 : 0;
    }

    public int getSide_3() {
        return Side_3;
    }

    private void setSide_3(int side_3) {
        Side_3 = side_3 > 0 ? side_3 : 0;
    }

    private int Side_1;
    private int Side_2;
    private int Side_3;

    double getAngleAlpha()
    {
        return Math.toDegrees(calculateAngle(this.Side_1, this.Side_2, this.Side_3));
    }
    double getAngleBeta() {
        return Math.toDegrees(calculateAngle(this.Side_2, this.Side_3, this.Side_1));
    }
    double getAngleGamma() {
        return 180 - (getAngleAlpha() + getAngleBeta());
    }
    public boolean getCheck()
    {
        return this.Side_1 + this.Side_2 > this.Side_3 && this.Side_1 + this.Side_3 > this.Side_2 &&
                this.Side_2 + this.Side_3 > this.Side_1;
    }

    private double getPerimeter()
    {
        return this.Side_1 + this.Side_2 + this.Side_3;
    }

    public double getSquare() {
        double p = (this.Side_1 + this.Side_2 + this.Side_3) / 2.0;
        return Math.sqrt(p * (p - this.Side_1) * (p - this.Side_2) * (p - this.Side_3));
    }

    private double calculateAngle(int SideX, int SideY, int SideZ)
    {
        return Math.acos( (Math.pow(SideX, 2) + Math.pow(SideY, 2) - Math.pow(SideZ, 2)) /
                (2 * SideX * SideY) );
    }

    public String getInfo()
    {
        return  "Triangle:\n\tSide A = " + this.Side_1
                + "\n\tSide B = " + this.Side_2
                + "\n\tSide C = " + this.Side_3
                + "\n\tSquare = " + getSquare()
                + "\n\tPerimeter = " + getPerimeter()
                + "\n\tAngle alpha = " + getAngleAlpha()
                + "\n\t\tbeta = " + getAngleBeta()
                + "\n\t\tgamma = " + getAngleGamma();
    }
}
