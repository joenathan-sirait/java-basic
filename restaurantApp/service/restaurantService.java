package restaurantApp.service;

import java.util.List;
    public interface restaurantService<T, K> {
        // untuk membuat methods findAll, findByid, save, update, delete
        List<T> findAll();
      
        T findById(K id);
      
        void save(T data);
      
        void update(K id, T data);
      
        void delete(K id);

      }
