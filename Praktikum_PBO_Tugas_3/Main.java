/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanmodul3;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari subclass Circle
        Circle circle = new Circle(5.0);
        System.out.println("Luas Lingkaran: " + circle.getArea());
        circle.draw();
        System.out.println();

        // Membuat objek dari subclass Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());
        rectangle.draw();
        System.out.println();

        // Contoh Polimorfisme
        System.out.println("=== Polimorfisme ===");
        Shape shape1 = new Circle(7.0);
        Shape shape2 = new Rectangle(8.0, 5.0);

        System.out.println("Luas Shape 1 (Lingkaran): " + shape1.getArea());
        System.out.println("Luas Shape 2 (Persegi Panjang): " + shape2.getArea());
        System.out.println();

        Drawable drawable1 = new Circle(3.0);
        Drawable drawable2 = new Rectangle(9.0, 2.0);

        drawable1.draw();
        drawable2.draw();
    }
}
