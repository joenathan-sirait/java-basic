package restaurantApp.repository;

import java.util.ArrayList;
import java.util.List;

import restaurantApp.model.Menu;
import restaurantApp.service.restaurantService;

public class MenuImpl implements restaurantService<Menu, Integer>   {
    List<Menu> menus = new ArrayList<>();

    @Override
    public List<Menu> findAll() {
        // for(Menu menu : menus){
        //     System.out.println(menu);
        // }
        // TODO Auto-generated method stub
        return menus;
    }

    @Override
    public Menu findById(Integer id) {
        // TODO Auto-generated method stub
        return menus.get(id);
    }

    @Override
    public void save(Menu data) {
        // TODO Auto-generated method stub
        menus.add(data);
    }

    @Override
    public void update(Integer id, Menu data) {
        // TODO Auto-generated method stub
        menus.set(id, data);
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        menus.remove((int) id);
    }
    
}
