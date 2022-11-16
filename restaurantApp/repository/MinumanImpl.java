package restaurantApp.repository;

import restaurantApp.service.restaurantService;

import java.util.ArrayList;
import java.util.List;
import  restaurantApp.model.Minuman;
public class MinumanImpl implements restaurantService<Minuman, Integer> {
    List<Minuman> minumans = new ArrayList<>();

    @Override
    public List<Minuman> findAll() {
      // TODO Auto-generated method stub
    //   for(Minuman minuman : minumans){
    //     System.out.println(minuman);
    // }
      return minumans;
    }
  
    @Override
    public Minuman findById(Integer id) {
      // TODO Auto-generated method stub
      return minumans.get(id);
    }
  
    @Override
    public void save(Minuman data) {
      // TODO Auto-generated method stub
      minumans.add(data);
    }
  
    @Override
    public void update(Integer id, Minuman data) {
      // TODO Auto-generated method stub
      minumans.set(id, data);
    }
  
    @Override
    public void delete(Integer id) {
      // TODO Auto-generated method stub
      minumans.remove((int) id);
    }

    public  void showMinuman(){
        
      for (int i = 0; i < this.findAll().size(); i++) {
          System.out.println(Integer.toString(i+1)+ ". " + this.findById(i));
      }
      
  }

   
    

   
}
