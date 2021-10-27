//package pertemuan5;
public class Odol {
    public String Varian;
    public String Bentuk;
    public String Warna;
    
    public String getVarian() {
        return Varian;
    }

    public void setVarian(String Varian) {
        this.Varian = Varian;
    }

    public String getBentuk(){
        return Bentuk;
    }
    
    public void setBentuk(String Bentuk){
        this.Bentuk = Bentuk;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }   
   
    public class Pepsodent extends Odol {
    public Double Harga;
    
    public Double getHarga(){
        return Harga;
    }
    
    public void setHarga(Double Harga){
        this.Harga = Harga;
    }
    }

   public class Ciptadent extends Odol {
    public Double Harga;
    
    public Double getHarga(){
        return Harga;
    }
    
    public void setHarga(Double Harga){
        this.Harga = Harga;
    }
    }
   

    
}
