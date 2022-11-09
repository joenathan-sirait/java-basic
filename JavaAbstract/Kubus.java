package JavaAbstract;

import JavaAbstract.serve.BangunRuangServe;

public class Kubus extends Persegi implements BangunRuangServe {
    @Override
    public void Luas(){
      System.out.println("Luas Permukaan adalah : " + super.getLuas());
    }

    public int getVolume() {
        return  super.getLuas() * super.getSisi();  
    }

    public void Volume(){
        System.out.println("Volume Bola adalah : " + getVolume());
    }

    public void setCharacter(){
        System.out.println("1. Jumlah bidang sisi pada kubus ada 6 yang berbentuk persegi dengan ukuran panjang dan luas yang sama\n Prisma segitiga mempunyai 6 titik sudut\n2.  Mempunyai 8 titik sudut. Mempunyai 12 rusuk yang sama panjang. Semua sudutnya siku-siku");
      }
  
      public void setGambar(){
        System.out.println("\nBangun Ruang Kubus\n");
      }
    
}
