package utp.mains;

/*
 * ACHMAD HABIBIE WIDIPUTRA - 25150701111019                                                      
   / __      ___     / __     ( ) / __     ( )  ___    
  //   ) ) //   ) ) //   ) ) / / //   ) ) / / //___) ) 
 //   / / //   / / //   / / / / //   / / / / //        
//   / / ((___( ( ((___/ / / / ((___/ / / / ((____           
 */

import java.util.Scanner;
import utp.shapes.PrismaSegitiga;
import utp.shapes.LimasPersegi;
import utp.shapes.Tabung;

public class Main {
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(CYAN + "=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("ACHMAD HABIBIE WIDIPUTRA");
        System.out.println("25150701111019");
        System.out.println("=============================================" + RESET);

        // Prisma
        System.out.println(YELLOW + "Prisma Segitiga Sama Kaki" + RESET);
        System.out.println("=============================================");
        System.out.print(GREEN + "Isikan alas     : ");
        double alas = sc.nextDouble();     
        System.out.print("Isikan kaki     : ");
        double kaki = sc.nextDouble();     
        System.out.print("Isikan tinggi   : " + RESET);
        double tinggiPrisma = sc.nextDouble(); 
        PrismaSegitiga prisma = new PrismaSegitiga(alas, kaki, tinggiPrisma);
        System.out.println("=============================================");
        prisma.printInfo();

        // Limas
        System.out.println("=============================================");
        System.out.println(YELLOW + "Limas Persegi" + RESET);
        System.out.println("=============================================");
        System.out.print( GREEN + "Isikan sisi     : ");
        double sisi = sc.nextDouble();    
        System.out.print("Isikan tinggi   : " + RESET);
        double tinggiLimas = sc.nextDouble(); 
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        System.out.println("=============================================");
        limas.printInfo();

        // Tabung
        System.out.println("=============================================");
        System.out.println(YELLOW + "Tabung" + RESET);
        System.out.println("=============================================");
        System.out.print(GREEN + "Isikan radius   : " );
        double radius = sc.nextDouble();   
        System.out.print("Isikan tinggi   : "+ RESET);
        double tinggiTabung = sc.nextDouble(); 
        Tabung tabung = new Tabung(radius, tinggiTabung);
        System.out.println("=============================================");
        tabung.printInfo();
        System.out.println(CYAN + "=============================================" + RESET);
    }
}
