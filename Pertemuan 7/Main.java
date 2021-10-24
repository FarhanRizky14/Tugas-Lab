//package pertemuan5;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) { 
        Main m = new Main();
        System.out.println("Fetching  Pepsodent");
        m.generatePepsodent("H:/Lab-Pemograman_Berbasis-Objek/Pertemuan 7/Pepsodent.txt");
            
        System.out.println();
        System.out.println("=========================================");
        System.out.println();
        System.out.println("Fetching  Ciptadent");
        m.generateCiptadent("H:/Lab-Pemograman_Berbasis-Objek/Pertemuan 7/Ciptadent.txt");
        }

    public void generatePepsodent(String path){

        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Pepsodent> listOdol = new ArrayList<Pepsodent>();

        try {
            fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            //System.out.println("File "+file.getName()+ "ditemukan");
            while(dis.available() != 0){               
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Pepsodent i = new Pepsodent();
                i.setVarian(data[0]);               
                i.setBentuk(data[1]);
                i.setWarna(data[2]);
                double Harga = Double.parseDouble(data[3]);
                i.setHarga(Harga);
                

                listOdol.add(i); 
             }

            } catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
            }


        //memanggil keluaran array
        int Number = 1; 
        for(Pepsodent i : listOdol){
            
            System.out.println("=======["+Number+"]=========");
            System.out.println("Varian: "+i.getVarian());
            System.out.println("Bentuk: "+i.getBentuk());
            System.out.println("Warna: "+i.getWarna());
            System.out.println("Harga: "+i.getHarga());
            Number++;       
        }
    }

    public void generateCiptadent(String path){

        File file = new File(path);
        FileInputStream fis = null; 
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        List<Ciptadent> listOdol = new ArrayList<Ciptadent>();

        try {
            fis = new FileInputStream(file); 
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
            //System.out.println("File "+file.getName()+ "ditemukan");
            while(dis.available() != 0){               
                String line = dis.readLine();
				String[] data = line.split(",");
                
                Ciptadent a = new Ciptadent();
                a.setVarian(data[0]);
                a.setBentuk(data[1]);
                a.setWarna(data[2]);
                double Harga = Double.parseDouble(data[3]);
                a.setHarga(Harga);


                listOdol.add(a); 
            }      
        }catch (IOException ex) {//error handling
            System.out.println("File "+file.getName()+" tidak ditemukan..!!");
            System.out.println("Error: "+ex.getMessage());
        }

        //memanggil keluaran array
        int Number = 1; 
        for(Ciptadent a : listOdol){
            
            System.out.println("=======["+Number+"]=========");
            System.out.println("Varian: "+a.getVarian());
            System.out.println("Bentuk: "+a.getBentuk());
            System.out.println("Warna: "+a.getWarna());
            System.out.println("Harga: "+a.getHarga());
            Number++;       

 }
    }
}

