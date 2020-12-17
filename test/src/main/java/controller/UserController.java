package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.IUserService;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping(value = "/sendmessage.do",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> SendMessage(HttpSession session, HttpServletResponse response){
        Map<String,Object> map = new HashMap<String, Object>();
        map = userService.select();
        return map;
    }
    @RequestMapping(value = "/sendTemperature.do",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> SendTemperature(HttpSession session, HttpServletResponse response){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("info",userService.selectTemperature());
        return map;
    }
    @RequestMapping(value = "/sendBrowser.do",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> SendBrowser(HttpSession session, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("browser", userService.selectBrowser());
        map.put("name",userService.selectName());
        return map;
    }
}