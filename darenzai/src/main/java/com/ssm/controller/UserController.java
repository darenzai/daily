package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.service.UserService;
import com.ssm.utitle.User;

@Controller
@RequestMapping("/user")
/**
 * ����:�û�controller<BR>
 * ������:<BR>
 * ʱ��:2017��7��10������7:15:58<BR>
 * @version
 */
public class UserController {

    @Autowired
    private UserService userService;  

    /**
     *��ת������û�����
     */
    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "addUser";
    }

    /**
     * ����û����ض���  
     * @param model
     * @param user
     * @return
     */
    @RequestMapping("addUser") 
    public String addUser(Model model,User user){
        if(user != null){
            userService.saveUser(user);
        }
        return "redirect:/user/userInfo";
    }

    /**
     * �޸��û�
     * @param model
     * @param request
     * @param user
     * @return
     */
    @RequestMapping("updateUser")  
    public String UpdateUser(Model model,User user){
             if(userService.updateUser(user)){  
                    user = userService.findUserById(user.getDorm());  
                    model.addAttribute("user", user);  
                    return "redirect:/user/userInfo";  
                } 
         return "/error";  
    }

    /**
     * ��ѯ�����û�
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("getAllUser")  
    public String getAllUser(Model model){
        List<User> user = userService.findAll();
        model.addAttribute("userList",user);
        return "allUser";
    }

    /**
     * ��ѯ�����û�
     * @param id
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/getUser")  
    public String getUser(int dorm,Model model){
        model.addAttribute("user", userService.findUserById(dorm));  
        return "editUser";
    }
    /**
     * ����idɾ���û�
     * @param id
     * @param request
     * @param response
     */
    @RequestMapping("/delUser") 
    public String deleteUser(int id,Model model){
        model.addAttribute("user", userService.deleteUser(id));  
        return "redirect:/user/userInfo";
    }

    /**
     * ��ҳ��ѯ�û���Ϣ
     * @param pn Ĭ�ϴӵ�һҳ��ʼ  �������
     * @param model
     * @return
     */
    @RequestMapping("userInfo")
    public String getUsers(@RequestParam(value="pn",defaultValue="1")Integer pn,Model model){
        //�ӵ�һ����ʼ ÿҳ��ѯ��������
        PageHelper.startPage(pn, 5);
        List<User> users = userService.findAll();
        //���û���Ϣ����PageInfo������
        PageInfo page = new PageInfo(users,5);
        model.addAttribute("pageInfo", page);
        return "allUser";
    }
}
