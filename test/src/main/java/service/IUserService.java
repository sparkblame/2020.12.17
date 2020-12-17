package service;

import vo.Browser;
import vo.Tem;

import java.util.ArrayList;
import java.util.Map;

public interface IUserService {
    //检查登录，返回检查结果，存放在map中
    public Map<String,Object> select();
    public ArrayList<Tem> selectTemperature();
    public ArrayList<Browser> selectBrowser();
    public ArrayList<String> selectName();
}
