package com.fanlun.controller;

import com.fanlun.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FirstController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("ap")
    public String ap(){
        System.out.println("ap.html");
        return "ap";
    }

    @RequestMapping("testuser")
    public String testUser(User user, String code){
        System.out.println(user);
        System.out.println("----");
        System.out.println(code);
        return "testUser";
    }

    @RequestMapping("login")
    public String login(User user, Map map){
        String loginUser = user.getUsername();
        String loginPassword = user.getPassword();
        String sql = "select * from user where username = ? and password = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
        User user1 = jdbcTemplate.queryForObject(sql, rowMapper, loginUser, loginPassword);
        if (user1 != null) {
            map.put("user", user1);
        }
        return "login";
    }
}
