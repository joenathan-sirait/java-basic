package oopLanjutan;

public class Kubus extends Persegi {
    @Override
    public int getLuas() {   
      return  super.getLuas();  
    }

    public int getVolume() {
        return  super.getLuas() * super.getSisi();  
    }

    public void Volume(){
        System.out.println("Volume Bola adalah : " + getVolume());
    }
    
}
