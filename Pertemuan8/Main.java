package Pertemuan8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Pertemuan8.module.Pepsodent;
import Pertemuan8.module.Ciptadent;

public class Main {
    public static void main(String[] args) { 
        Scanner myObj = new Scanner(System.in);       
        Main m = new Main();
        m.GeneratePepsodent(myObj);
        m.GenerateCiptadent(myObj);
    }
        
    private void GeneratePepsodent(Scanner myObj){
        List<Pepsodent> listPepsodent = new ArrayList<Pepsodent>(); 
        System.out.println("\n==Mengisi class Pepsodent==");
        for (int i = 1; i < 3; i++) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+i);
            System.out.println("------------------------------");

            Pepsodent l = new Pepsodent();
            System.out.print("Masukan Varian:");
            String Varian = myObj.nextLine(); 
            l.setVarian(Varian);

            System.out.print("Masukan Bentuk:");
            String Bentuk = myObj.nextLine();
            l.setBentuk(Bentuk);

            System.out.print("Masukan Warna:");
            String Warna = myObj.nextLine();
            l.setWarna(Warna); 

            System.out.print("Masukan Harga:");
            String Harga = myObj.nextLine();
            l.setHarga( Double.parseDouble(Harga) ); 

            listPepsodent.add(l); 
        }

         System.out.println("\n=Mencetak array List Pepsodent=");
        int index = 1;
        for (Pepsodent l : listPepsodent) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+index);
            System.out.println("------------------------------");
            System.out.println("Varian : "+l.getVarian() );
            System.out.println("Harga : "+l.getHarga() );
            System.out.println("Bentuk : "+l.getBentuk() );
            System.out.println("Warna : "+l.getWarna());
            System.out.println("------------------------------");
            index++;
        }
    }
        private void GenerateCiptadent(Scanner myObj){
        List<Ciptadent> listCiptadent = new ArrayList<Ciptadent>(); 
        System.out.println("\n==Mengisi class Ciptadent==");
        for (int i = 1; i < 3; i++) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+i);
            System.out.println("------------------------------");

            Ciptadent a = new Ciptadent();
            System.out.print("Masukan Varian:");
            String Varian = myObj.nextLine(); 
            a.setVarian(Varian); 

            System.out.print("Masukan Bentuk:");
            String Bentuk = myObj.nextLine();
            a.setBentuk(Bentuk);

            System.out.print("Masukan Warna:");
            String Warna = myObj.nextLine();
            a.setWarna(Warna); 

            System.out.print("Masukan Harga:");
            String Harga = myObj.nextLine();
            a.setHarga( Double.parseDouble(Harga) );

            listCiptadent.add(a); 
        }
            
         System.out.println("\n=Mencetak array List Ciptadent=");
        int index = 1;
        for (Ciptadent a : listCiptadent) {
            System.out.println("------------------------------");
            System.out.println("Data isian ke-"+index);
            System.out.println("------------------------------");
            System.out.println("Varian : "+a.getVarian() );
            System.out.println("Bentuk : "+a.getBentuk() );
            System.out.println("Warna : "+a.getWarna());
            System.out.println("Harga : "+a.getHarga());
            System.out.println("------------------------------");
            index++;
        }
    }
}

