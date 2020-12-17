package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IUserDAO;
import service.IUserService;
import util.MD5;
import vo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDao;


    @Override
    public Map<String, Object> select() {
        ArrayList<Product> list = userDao.getAll();
        Map<String,Object> map = new HashMap<String, Object>();
        ArrayList<String> ca=new ArrayList<String>();
        ArrayList<Double> y=new ArrayList<Double>();
        for (Product p:list
             ) {
            ca.add(p.getName());
            y.add(p.getPrice());
        }
        map.put("name",ca);
        map.put("price",y);
        return map;
    }

    @Override
    public ArrayList<Tem> selectTemperature() {
        ArrayList<Temper> list =userDao.getTemperAll();
        ArrayList<Tem> list1 = new ArrayList<Tem>();
        for (Temper tem:
             list) {
            double[]data = {tem.getTemperatureA(),tem.getTemperatureB(),tem.getTemperatureC(),tem.getTemperatureD(),tem.getTemperatureE(),tem.getTemperatureF(),tem.getTemperatureG(),tem.getTemperatureH(),tem.getTemperatureI(),tem.getTemperatureJ(),tem.getTemperatureK(),tem.getTemperatureL()};
            list1.add(new Tem(tem.getCity(),data));
        }

        return list1;
    }

    @Override
    public ArrayList<Browser> selectBrowser() {

        return userDao.getBrowser();
    }

    @Override
    public ArrayList<String> selectName() {

        return userDao.getName();
    }
}
