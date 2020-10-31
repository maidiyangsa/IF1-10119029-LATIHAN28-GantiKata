/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gantikata;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program ganti kata, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat, gantiKata, jadiKata;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        gantiKata = scanner.next();
        System.out.print("Menjadi Kata : ");
        jadiKata = scanner.next();
        
        System.out.println("\n===Hasil Formatting===");
        System.out.println("Kalimat Awal : ".concat(kalimat));
        System.out.println("Kalimat Baru : ".concat(kalimat.replaceAll(gantiKata, jadiKata)));
    }
    
}
