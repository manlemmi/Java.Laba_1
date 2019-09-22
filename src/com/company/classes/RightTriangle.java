package com.company.classes;

public class RightTriangle extends Triangle {

    public RightTriangle(int Side_1, int Side_2, int Side_3) {

        super(Side_1, Side_2, Side_3);
    }

    @Override
    public boolean getCheck() {
        return super.getCheck() && (super.getAngleAlpha() == 90.0 ||
                super.getAngleBeta() == 90.0 ||
                super.getAngleGamma() == 90.0);
    }
}
