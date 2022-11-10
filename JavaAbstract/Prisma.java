package JavaAbstract;

import JavaAbstract.serve.BangunRuangServe;

public class Prisma extends Segitiga implements BangunRuangServe{

    private int tinggiPrisma;

    public Prisma() {
  
    }
    // constructor ber parameter
    public Prisma(int tinggiPrisma) {
      this.tinggiPrisma = tinggiPrisma;
    }
  
    public void setCharacter(){
      System.out.println("1. mempunyai 5 sisi, 3 sisi di samping yang bentuknya persegi panjang dan 2 sisi alas dan atap yang bentuknya segitiga Prisma segitiga mempunyai 6 titik sudut\n2. Prisma segitiga mempunyai 9 rusuk, 3 di antara rusuk tersebut adalah rusuk tegak");
    }

    public void setGambar(){
      System.out.println("\nBangun Ruang Prisma\n");
    }
  
    // setter dan getter
    public void setTinggiPrisma(int tinggiPrisma) {
      this.tinggiPrisma = tinggiPrisma;
    }
  
    public int getTinggiPrisma() {
      return tinggiPrisma;
    }
  
    public void Luas(){
      System.out.println("Luas Permukaan adalah : " + 2 * super.getLuas() + (super.getKeliling() * this.tinggiPrisma));
    }

    public int getVolume() {
      return 2 * super.getKeliling() * super.getLuas() * this.tinggiPrisma;  
    }

    public void Volume(){
        System.out.println("Volume Prisma adalah : " + getVolume());
    }
    
}
