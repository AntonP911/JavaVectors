package ru.solomid92.javavectors;

public class Vector {
    double x;
    double y;


    Vector (double X, double Y) {
        this.x = X;
        this.y = Y;
    }

    void useVectorNormalize() {
        double len = this.getVectorLength();
        double inverselen = 1 / len;
        this.x *= inverselen;
        this.y *= inverselen;
    }

    double getVectorLength() {
        return Math.sqrt(this.x * this.x + this.y * this. y);
    }

    void vectorSubstractionVector(Vector vector) {
        this.x -= vector.x;
        this.y -= vector.y;
    }

    void vectorSubtractionNumber(double number) {
        this.x -= number;
        this.y -= number;
    }

    void vectorAdditionVector (Vector vector) {
        this.x += vector.x;
        this.y += vector.y;
    }

    void vectorAdditionNumber (double number) {
        this.x += number;
        this.y += number;
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
