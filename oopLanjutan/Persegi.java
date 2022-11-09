package oopLanjutan;

public class Persegi {

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

    public void Luas() {
        System.out.println("++++Persegi++++");
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
  
}
