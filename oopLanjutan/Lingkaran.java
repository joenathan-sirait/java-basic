package oopLanjutan;

public class Lingkaran {


    private double jari;
    
    public Lingkaran() {

    }
    public Lingkaran(double jari) {

        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }


    public void setJari(Double jari) {
        this.jari = jari;
    }



    public double getLuas(){
        if (this.jari % 7 == 0) {
        return  22 * this.jari * this.jari / 7;   
        } else {
           return 3.14 * this.jari * this.jari;
        }
    }

    public double getKeliling(){
        if (this.jari % 7 == 0) {
            return 2 * 22 * this.jari / 7;
            } else {
                return 2 * 3.14 * this.jari;
            }
        
    }

    public void Luas() {
        System.out.println("++++Persegi++++");
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
  
}
