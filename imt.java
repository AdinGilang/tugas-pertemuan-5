package Pertemuan5;
import java.util.Scanner;

public class imt {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan anda (dalam kilogram) : ");
        double bb = input.nextDouble();
        System.out.print("Masukkan tinggi badan anda (dalam meter) : ");
        double tb = input.nextDouble();
        
        double imt = bb/(tb*tb);
        
        String kriteria;
        if(imt <= 18.4){
            kriteria = "Berat Badan Kurang";
            System.out.println("Kriteria Indeks Masa Tubuh anda adalah " + kriteria);
        }else if(imt <= 24.9){
            kriteria = "Berat Badan Ideal";
            System.out.println("Kriteria Indeks Masa Tubuh anda adalah " + kriteria);
        }else if(imt <= 29.9){
            kriteria = "Berat Badan Lebih";
            System.out.println("Kriteria Indeks Masa Tubuh anda adalah " + kriteria);
        }else if(imt <= 39.9){
            kriteria = "Gemuk";
            System.out.println("Kriteria Indeks Masa Tubuh anda adalah " + kriteria);
        }else{
            kriteria = "Sangat Gemuk";
            System.out.println("Kriteria Indeks Masa Tubuh anda adalah " + kriteria);
        }
        
    }
    
}