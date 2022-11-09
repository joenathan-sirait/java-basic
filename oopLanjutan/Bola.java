package oopLanjutan;

public class Bola extends Lingkaran {

  
    @Override
    public double getLuas() {   
      return super.getLuas();  
    }

    public double getVolume(){
        return 4 * super.getLuas();  
    }

    public void Volume(){
        System.out.println("Volume Bola adalah : " + getVolume());
    }
}
