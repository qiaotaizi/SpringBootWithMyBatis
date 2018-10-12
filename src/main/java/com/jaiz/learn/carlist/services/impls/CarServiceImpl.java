package com.jaiz.learn.carlist.services.impls;

import com.jaiz.learn.carlist.common.BaseService;
import com.jaiz.learn.carlist.common.ResultVO;
import com.jaiz.learn.carlist.dao.CarDAO;
import com.jaiz.learn.carlist.entities.CarPO;
import com.jaiz.learn.carlist.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl extends BaseService implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Override
    public ResultVO carList() {

        List<CarPO> carList=carDAO.queryCarPage();

        return success("cars",carList);
    }
}
