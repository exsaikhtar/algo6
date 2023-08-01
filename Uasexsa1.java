/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasexsa1;
// Contoh penggunaan konsep class abstract pada pemrograman berorientasi objek Java

// Abstract class sebagai bentuk geometris umum
abstract class BentukGeometris {
    // Method abstrak untuk menghitung luas
    public abstract double hitungLuas();

    // Method abstrak untuk menghitung keliling
    public abstract double hitungKeliling();

    // Method konkrit yang dapat digunakan oleh seluruh bentuk geometris
    public void tampilkanInfo() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}

// Kelas konkrit Persegi yang merupakan turunan dari BentukGeometris
class Persegi extends BentukGeometris {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Implementasi method abstrak hitungLuas() untuk Persegi
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Implementasi method abstrak hitungKeliling() untuk Persegi
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Kelas konkrit Lingkaran yang merupakan turunan dari BentukGeometris
class Lingkaran extends BentukGeometris {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Implementasi method abstrak hitungLuas() untuk Lingkaran
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Implementasi method abstrak hitungKeliling() untuk Lingkaran
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class Uasexsa1 {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(5);
        System.out.println("Info Persegi:");
        persegi.tampilkanInfo();
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(3);
        System.out.println("Info Lingkaran:");
        lingkaran.tampilkanInfo();
    }
}
