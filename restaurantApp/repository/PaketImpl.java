package restaurantApp.repository;

import restaurantApp.service.restaurantService;

import java.util.ArrayList;
import java.util.List;
import  restaurantApp.model.Paket;
public class PaketImpl implements restaurantService<Paket, Integer> {
    List<Paket> pakets = new ArrayList<>();

    @Override
    public List<Paket> findAll() {
      // TODO Auto-generated method stub
    //   for(Paket paket : pakets){
    //     System.out.println(paket);
    // }
      return pakets;
    }
  
    @Override
    public Paket findById(Integer id) {
      // TODO Auto-generated method stub
      return pakets.get(id);
    }
  
    @Override
    public void save(Paket data) {
      // TODO Auto-generated method stub
      pakets.add(data);
    }
  
    @Override
    public void update(Integer id, Paket data) {
      // TODO Auto-generated method stub
      pakets.set(id, data);
    }
  
    @Override
    public void delete(Integer id) {
      // TODO Auto-generated method stub
      pakets.remove((int) id);
    }

    public  void showPaket(){
        
      for (int i = 0; i < this.findAll().size(); i++) {
          System.out.println(Integer.toString(i+1)+ ". " + this.findById(i));
      }
      
  }

   
    

   
}
