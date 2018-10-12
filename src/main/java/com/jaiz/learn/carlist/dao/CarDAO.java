package com.jaiz.learn.carlist.dao;

import com.jaiz.learn.carlist.entities.CarPO;

import java.util.List;

public interface CarDAO {

    List<CarPO> queryCarPage();
}
