package com.app.model.cars;

import java.util.List;

public interface CarsDBInterface {
  public List<Car> selectAll();

  public void insert(Car car);

  public void update(String licensenumber, Car car);

  public void delete(String licensenumber);

  public Car exist(String licensenumber);
}
