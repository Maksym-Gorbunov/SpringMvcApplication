package com.app.model.cars.fake;

import com.app.model.cars.Car;
import com.app.model.cars.CarsDBInterface;

import java.util.List;

public class FakeCarsDBHelper implements CarsDBInterface {

  private List<Car> fakeData = FakeCarsData.fakeData;

  @Override
  public List<Car> selectAll() {
    if (fakeData != null) {
      return fakeData;
    }
    return null;
  }

  @Override
  public void insert(Car car) {
    if (car != null) {
      fakeData.add(car);
    }
  }

  @Override
  public void update(String licensenumber, Car car) {
    for (Car c : fakeData) {
      if (c.getLicensenumber().equals(licensenumber)) {
        c.setMake(car.getMake());
        c.setColor(car.getColor());
      }
    }
  }

  @Override
  public void delete(String licensenumber) {
    Car car = null;
    for (Car c : fakeData) {
      if (c.getLicensenumber().equals(licensenumber)) {
        car = c;
      }
    }
    if(car!=null){
      fakeData.remove(car);
    }
  }

  @Override
  public Car exist(String licensenumber) {
    for (Car c : fakeData) {
      if (c.getLicensenumber().equals(licensenumber)) {
        return c;
      }
    }
    return null;
  }
}
