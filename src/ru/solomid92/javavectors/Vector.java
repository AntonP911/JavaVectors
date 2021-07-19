package ru.solomid92.javavectors;

public class Vector {
    double x;
    double y;


    void Vector (double X, double Y) {
        this.x = X;
        this.y = Y;
    }

    double getScalar() {
        return Math.sqrt(this.x * this.x + this.y * this. y);
    }
}
