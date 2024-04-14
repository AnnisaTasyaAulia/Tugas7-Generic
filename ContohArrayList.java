
package Tugas7;

import java.util.ArrayList;

public class ContohArrayList {
    
    public static void main(String[] args){
        
        ArrayList<String> nama = new ArrayList<>();
        
        nama.add("Annisa");
        nama.add("Tasya");
        nama.add("annisa");
        
        System.out.println("Isi ArrayList: " + nama);
        
        nama.remove("annisa");
        
          boolean adaTasya = nama.contains("Tasya");

        System.out.println("Apakah ada Tasya? " + adaTasya);

        
        System.out.println("Isi ArrayList setelah dihapus: " + nama);
    }
}
