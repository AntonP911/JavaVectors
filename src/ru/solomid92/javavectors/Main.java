package ru.solomid92.javavectors;

public class Main {

    public double voidFloat = 0.0;
    public int voidInt = 0;

    public static void main(String[] args) {
	    Vector vect1 = new Vector(3, 4);
	    Vector vect2 = new Vector(6,9);
	    System.out.println(" vect1(" + vect1.x + ";" + vect1.y +")");
        System.out.println(" vect2(" + vect2.x + ";" + vect2.y +")");
        vect1.vectorAdditionVector(vect2);
        System.out.println("теперь vect1(" + vect1.x + ";" + vect1.y +")");
        vect1.useVectorNormalize();
        System.out.println("а после нормализации vect1(" + vect1.x + ";" + vect1.y +")");
    }
}
