package com.kunming.mysqldemo;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mysql/user")
public class UserRestController {

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String demo(){
        return "hello Restlight!";
    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public boolean addUser( User user) {
        System.out.println("开始新增...");
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public boolean updateUser( User user) {
        System.out.println("开始更新...");
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "userName", required = true) int userId) {
        System.out.println("开始删除...");
        return userService.deleteUser(userId);
    }


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User findByUserName(@RequestParam(value = "userName", required = true) String userName) {
        System.out.println("开始查询...");
        return userService.findUserByName(userName);
    }


    @RequestMapping(value = "/userAll", method = RequestMethod.GET)
    public List<User> findByUserAge() {
        System.out.println("开始查询所有数据...");
        return userService.findAll();
    }
}
