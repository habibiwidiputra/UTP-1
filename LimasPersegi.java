package utp.shapes;

public class LimasPersegi {
    private double sisi;
    private double tinggi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public double hitungLuasSisi() {
        return (tinggi * sisi) / 2;
    }

    public double hitungLuasAlas() {
        return sisi * sisi;
    }

    public double hitungLuasPermukaan() {
        return 4 * hitungLuasSisi() + hitungLuasAlas();
    }

    public double hitungVolume() {
        return hitungLuasAlas() * tinggi / 3;
    }

    public void printInfo() {
        System.out.println("Nama            : Limas Persegi");
        System.out.println("Luas permukaan  : " + hitungLuasPermukaan());
        System.out.println("Volume          : " + hitungVolume());
    }
}
