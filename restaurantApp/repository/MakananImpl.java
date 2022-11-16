package restaurantApp.repository;

import restaurantApp.service.restaurantService;

import java.util.ArrayList;
import java.util.List;

import  restaurantApp.model.Makanan;

public class MakananImpl implements restaurantService<Makanan, Integer> {
    List<Makanan> makanans = new ArrayList<>();

    @Override
    public List<Makanan> findAll() {
      // TODO Auto-generated method stub
    //   for(Makanan makanan : makanans){
    //     System.out.println(makanan);
    // }
      return makanans;
    }
    // public int getAllHarga() {
    //   int sum = 0;
    //   for (int i = 0; i < makanans.size(); i++) {
    //     sum = sum + makanans.get(i);
    //   }
    //   return sum;
    // }
    public  void showMakanan(){
        
      for (int i = 0; i < this.findAll().size(); i++) {
          System.out.println(Integer.toString(i+1)+ ". " + this.findById(i));
      }
      
  }
  
    @Override
    public Makanan findById(Integer id) {
      // TODO Auto-generated method stub
      return makanans.get(id);
    }
  
    @Override
    public void save(Makanan data) {
      // TODO Auto-generated method stub
      makanans.add(data);
    }
  
    @Override
    public void update(Integer id, Makanan data) {
      // TODO Auto-generated method stub
      makanans.set(id, data);
    }
  
    @Override
    public void delete(Integer id) {
      // TODO Auto-generated method stub
      makanans.remove((int) id);
    }
  
}
