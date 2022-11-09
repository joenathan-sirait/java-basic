package JavaAbstract;

import JavaAbstract.serve.BangunDatarServe;

public class Lingkaran implements BangunDatarServe {


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
    @Override
    public void setCharacter() {
        System.out.println(" 1. Memiliki jumlah sudut 180 derajat\n2. Memiliki diameter yang membagi lingkaran menjadi 2 sisi seimbang\n3. Memiliki jari-jari yang menghubungkan titik pusat dengan titik busur lingkaran");
        
    }
    public void setGambar() {
        System.out.println("**********\n**      **\n*        *\n**      **\n**********\n");    
    }

    public void Luas() {
        System.out.println("++++Lingkaran++++");
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
    
    
    
  
}
