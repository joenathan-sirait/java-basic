package JavaAbstract;

import JavaAbstract.serve.BangunDatarServe;

public class Persegi implements BangunDatarServe {

    private int sisi;
    
    public Persegi(){
        
    }

    public Persegi(int sisi) {
        this.sisi = sisi;

    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    

    public int getLuas(){
        return this.sisi *  this.sisi ;
    }

    public int getKeliling(){
        return this.sisi * 4;
    }

    public void setCharacter(){
        System.out.println("1. Memiliki sisi-sisi yang sama panjang\n2. Memiliki dua diagonal yang sama panjang (keduanya saling berpotongan dan membentuk tegak lurus serta membaginya menjadi dua bagian sama panjang)\n3. Memiliki empat sudut siku-siku yang sama besar, yakni 90 derajat.");
    }

    public void setGambar() {
        int size = 5;
        
        System.out.println();
        
        for(int i=1; i<=size; i++) {
          for(int j=1; j<=size; j++) {
            System.out.print(" *");
          }
          System.out.println();
        }
    }

    public void Luas() {
        System.out.println("++++Persegi++++");
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
  
}
