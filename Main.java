// NAMA: ARIEL NAVIANDANA PUTRA
// NIM : [ISI NIM ANDA]
// Ascii Art: https://www.askapache.com/online-tools/figlet-ascii/

package mains;

import java.util.Scanner;
import utp.shapes.PrismaSegitiga;
import utp.shapes.LimasPersegi;
import utp.shapes.Tabung;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("ARIEL NAVIANDANA PUTRA");
        System.out.println("[ISI NIM ANDA]");
        System.out.println("=============================================");

        // Prisma
        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("=============================================");
        System.out.print("Isikan alas     : ");
        double alas = sc.nextDouble();
        System.out.print("Isikan kaki     : ");
        double kaki = sc.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiPrisma = sc.nextDouble();
        PrismaSegitiga prisma = new PrismaSegitiga(alas, kaki, tinggiPrisma);
        System.out.println("=============================================");
        prisma.printInfo();

        // Limas
        System.out.println("=============================================");
        System.out.println("Limas Persegi");
        System.out.println("=============================================");
        System.out.print("Isikan sisi     : ");
        double sisi = sc.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiLimas = sc.nextDouble();
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        System.out.println("=============================================");
        limas.printInfo();

        // Tabung
        System.out.println("=============================================");
        System.out.println("Tabung");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = sc.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiTabung = sc.nextDouble();
        Tabung tabung = new Tabung(radius, tinggiTabung);
        System.out.println("=============================================");
        tabung.printInfo();
        System.out.println("=============================================");
    }
}
