package JavaAbstract;

import JavaAbstract.serve.BangunDatarServe;

public class Segitiga implements BangunDatarServe {

    private int alas;
    private int tinggi;
    private int sisi1 ;
    private int sisi2 ;
    private int sisi3 ;
    
    public Segitiga(){

    }

    public Segitiga(int alas, int tinggi, int sisi1, int sisi2 , int sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

   

    public int getSisi1() {
        return sisi1;
    }

    public void setSisi1(int sisi1) {
        this.sisi1 = sisi1;
    }

    public int getSisi2() {
        return sisi2;
    }

    public void setSisi2(int sisi2) {
        this.sisi2 = sisi2;
    }

    public int getSisi3() {
        return sisi3;
    }

    public void setSisi3(int sisi3) {
        this.sisi3 = sisi3;
    }

    public int getLuas(){
        return this.alas * this.tinggi / 2 ;
    }

    public int getKeliling(){
        return this.sisi1 + this.sisi2 + this.sisi3;
    }
    public void setCharacter(){
        System.out.println("1. Memiliki tiga sudut yang sama besarnya, yakni 60 derajat\n2. Memiliki tiga sumbu simetri lipat. Memiliki tiga sumbu simetri putar.");
    }

    public void setGambar() {
        int size = 5;
       for ( int i = 1; i <= size; i++){
           for (int j = 4; j >= i; j--) {
               System.out.print(' ');
           }
           for (int k = 1; k <= i; k++){
               System.out.print('*');
           }
           for (int l = 1; l <= i - 1; l++){
               System.out.print('*');
           }
           System.out.println();
       }
    }

    public void Luas() {
        System.out.println("++++SEGITIGA++++");
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
  
}
