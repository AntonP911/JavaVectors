package ru.solomid92.javavectors;

public class Vector {
    double x;
    double y;


    void Vector (double X, double Y) {
        this.x = X;
        this.y = Y;
    }

    double getLength() {
        return Math.sqrt(this.x * this.x + this.y * this. y);
    }

    void vectorMultiplyNumber(double number) {
        this.x *= number;
        this.y *= number;
    }

    void vectorMultiplyVector(Vector vector) {
        this.x *= vector.x;
        this.y *= vector.y;
    }
}
