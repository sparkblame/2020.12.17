package dao;

import vo.Browser;
import vo.Product;
import vo.Temper;

import java.util.ArrayList;

public interface IUserDAO {
    //按用户名进行查询，返回User对象
    public ArrayList<Product> getAll();
    public ArrayList<Temper> getTemperAll();
    public ArrayList<String> getName();
    public ArrayList<Browser> getBrowser();
}
