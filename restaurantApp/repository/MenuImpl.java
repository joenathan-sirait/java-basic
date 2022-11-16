package restaurantApp.repository;

import java.util.ArrayList;
import java.util.List;

import restaurantApp.model.Menu;
import restaurantApp.service.restaurantService;

public class MenuImpl implements restaurantService<Menu, Integer>   {
    List<Menu> menus = new ArrayList<>();
    Menu menu ;

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

    public void showMenu(){
            menu = new Menu("Yamprek", 14000);
            this.save(menu);
            menu = new Menu("Leprek", 10000 );
            this.save(menu);
            menu = new Menu("Nasprek", 4000 );
            this.save(menu);
            menu = new Menu("Temprek", 1500 );
            this.save(menu);
            menu = new Menu("Teh Manis Anget", 14000);
            this.save(menu);
            menu = new Menu("Teh Manis Dingin", 10000 );
            this.save(menu);
            menu = new Menu("Fanta", 5000 );
            this.save(menu);
            menu = new Menu("Air iIneral", 500 );
            this.save(menu);
            menu = new Menu("YamPrek + NasPrek + Es teh manis anget", 30000);
            this.save(menu);
            menu = new Menu("LePrek + NasPrek + teh manis dingin", 20000 );
            this.save(menu);
            menu = new Menu("Yamprek + LePrek + Nasprek + Temprek + Air MIneral", 25000 );
            this.save(menu); 
            for (int i = 0; i < this.findAll().size(); i++) {
                Menu makanan = this.findById(i);
                if (i == 0 ) {
                    System.out.println("+++++++MENU MAKANAN+++++++ \n");
                } else if ( i == 4  ) {
                    System.out.println("+++++++MENU MINUMAN+++++++ \n");
                } else if (i == 8 ){
                    System.out.println("+++++++Paket+++++++ \n");
                }
                System.out.println(Integer.toString(i+1) + ". "+makanan.getNamaMenu() + "\tHarga :" + makanan.getHarga() + "\n");
            }
    }
    
}
