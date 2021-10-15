class Odol {
    public String odol;
    public String ciptaden;
    public String pepsoden;
    public void jenis(){
        System.out.println("=============================================");
        System.out.println("                 Macam-Macam Odol           ");
        System.out.println("=============================================");
    }
    //getter
    public String getOdol(){
        return odol;
    }
    //Setter
    public void setOdol(String newOdol){
        this.odol = newOdol;
    }
}

class Ciptaden extends Odol{
    public void V1 (){
        System.out.println("odol ciptaden dapat menghilangkan kuman di sela gigi");
    }
    public void V2(){
        System.out.println("odol ciptaden dapat menghilangkan bau mulut");
    }
    //getter
    public String getCiptaden(){
        return ciptaden;
    }
    //Setter
    public void setCiptaden(String newCiptaden){
        this.ciptaden = newCiptaden;
    }
}

class Pepsoden extends Odol{
    public void W1(){
        System.out.println("odol pepsoden mampu membersihkan gigi kuning");
    }
    public void W2(){
        System.out.println("odol pepsoden dapat memperbaiki gigi berlubang");
    }
    //getter
    public String getPepsoden(){
        return pepsoden;
    }
    //Setter
    public void setPepsoden(String newPepsoden){
        this.pepsoden = newPepsoden;
    }
    public static void main(String[] args) {
        //objek
        Odol myOdol = new Odol();
        Ciptaden myCiptaden = new Ciptaden();
        Pepsoden myPepsoden = new Pepsoden();
        
        //pemanggilan function
        myOdol.jenis();
        myOdol.setOdol("contoh odol");
        System.out.println(myOdol.getOdol());
        System.out.println("---------------------------------------------");

        myCiptaden.setCiptaden("odol ciptaden");
        System.out.println(myCiptaden.getCiptaden());
        myCiptaden.V1();
        myCiptaden.V2();
       
        myPepsoden.setPepsoden("odol pepsoden");
        System.out.println(myPepsoden.getPepsoden());
        myPepsoden.W1(); 
        myPepsoden.W2();
    }
}