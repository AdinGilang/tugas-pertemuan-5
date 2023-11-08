
package Pertemuan5;
import java.util.Scanner;



public class diskon {
    public static void main(String[] args) {
        
        int diskon;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Total pembelian Rp.: ");
        int totalBelanja = input.nextInt();
        
        if (totalBelanja <50000){
            diskon = totalBelanja*5/100;
            System.out.println("Besar diskon yang anda dapatkan Rp. " + diskon);
            System.out.println("Jumlah yang harus dibayarkan Rp. " + (totalBelanja-diskon));
        }else{
            diskon = totalBelanja*20/100;
            System.out.println("Besar diskon yang anda dapatkan Rp. " + diskon);
            System.out.println("Jumlah yang harus dibayarkan Rp. " + (totalBelanja-diskon));
        }
    }
    
}

  