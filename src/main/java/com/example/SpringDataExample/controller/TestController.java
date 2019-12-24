package com.example.SpringDataExample.controller;

import com.example.SpringDataExample.dao.PersonDAO;
import com.example.SpringDataExample.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private PersonDAO personDAO;

    @ResponseBody
    @RequestMapping("/")
    public String index() {
        Iterable<Person> all = personDAO.findAll();

        StringBuilder sb = new StringBuilder();

        all.forEach(p -> sb.append(p.getFullName() + "<br>"));

        return sb.toString();
    }
}
