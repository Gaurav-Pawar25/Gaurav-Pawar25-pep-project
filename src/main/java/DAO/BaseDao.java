package DAO;

import java.util.List;
import java.util.Optional;

/*
  This Generic Data Access Object (DAO) interface provides an abstraction for
   performing CRUD (Create, Read, Update, Delete) operations
   on any type of model object. Each model object can have a specific class
   implementing this interface.
 */

public interface BaseDao<T> {


 
    Optional<T> getById(int id);


    List<T> getAll();

    T insert(T t);


    boolean update(T t);


    boolean delete(T t);
}