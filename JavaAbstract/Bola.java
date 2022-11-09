package JavaAbstract;

import JavaAbstract.serve.BangunRuangServe;

public class Bola extends Lingkaran implements BangunRuangServe{

  
    @Override
    public void Luas(){
        System.out.println("Luas Permukaan adalah : " + super.getLuas());
      }

    public double getVolume(){
        return 4 * super.getLuas();  
    }

    public void Volume(){
        System.out.println("Volume Bola adalah : " + getVolume());
    }

    public void setCharacter(){
        System.out.println("1. idak memiliki rusuk, titik sudut, diagonal bidang, dan bidang diagonal\n2. Komponen yang khas ada dalam bangun ruang bola adalah adanya jari-jari dan diameter");
      }
  
      public void setGambar(){
        System.out.println("\nBangun Ruang Bola\n");
      }
}
