package oopLanjutan;

public class Prisma extends Segitiga {

    private int tinggiPrisma;

    public Prisma() {
  
    }
    // constructor ber parameter
    public Prisma(int tinggiPrisma) {
      this.tinggiPrisma = tinggiPrisma;
    }
  
    
  
    // setter dan getter
    public void setTinggiPrisma(int tinggiPrisma) {
      this.tinggiPrisma = tinggiPrisma;
    }
  
    public int getTinggiPrisma() {
      return tinggiPrisma;
    }
  
    @Override
    public int getLuas() {   
      return super.getLuas();  
    }

    public int getVolume() {
      return 2 * super.getKeliling() * super.getLuas() * this.tinggiPrisma;  
    }

    public void Volume(){
        System.out.println("Volume Prisma adalah : " + getVolume());
    }
    
}
