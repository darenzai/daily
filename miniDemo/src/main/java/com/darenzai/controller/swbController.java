package com.darenzai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.darenzai.pojo.Swb;
import com.darenzai.service.SwbService;

@Controller
@RequestMapping("")
public class swbController {
    @Autowired
    SwbService swbService;
 
    @RequestMapping("listSwb")
    public ModelAndView listCategory(){
        ModelAndView mav = new ModelAndView();
        List<Swb> cs= swbService.list();
         
        // ����ת������
        mav.addObject("cs", cs);
        // ����jsp·��
        mav.setViewName("listSwb");
        return mav;
    }
 
}
