package com.jaiz.learn.carlist.controllers;

import com.jaiz.learn.carlist.common.BaseController;
import com.jaiz.learn.carlist.common.ResultVO;
import com.jaiz.learn.carlist.services.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cars")
public class CarController extends BaseController {

    private Logger logger= LoggerFactory.getLogger(CarController.class);

    @Autowired
    private CarService carService;

    @RequestMapping(value = "list",method = RequestMethod.POST)
    @ResponseBody
    public ResultVO carList(){
        return carService.carList();
    }
}
