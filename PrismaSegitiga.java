package utp.shapes;

public class PrismaSegitiga {
    private double alas;
    private double kaki;
    private double tinggi;
    private final double PI = 22.0 / 7.0;

    public PrismaSegitiga(double alas, double kaki, double tinggi) {
        this.alas = alas;
        this.kaki = kaki;
        this.tinggi = tinggi;
    }

    public double hitungLuasAlas() {
        return (alas * tinggi) / 2;
    }

    public double hitungKelilingAlas() {
        return 2 * kaki + alas;
    }

    public double hitungLuasPermukaan() {
        return 2 * hitungLuasAlas() + hitungKelilingAlas() * tinggi;
    }

    public double hitungVolume() {
        return hitungLuasAlas() * tinggi;
    }

    public void printInfo() {
        System.out.println("Nama            : Prisma Segitiga Sama Kaki");
        System.out.println("Luas permukaan  : " + hitungLuasPermukaan());
        System.out.println("Volume          : " + hitungVolume());
    }
}
