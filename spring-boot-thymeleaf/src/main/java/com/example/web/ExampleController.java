package com.example.web;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExampleController {

    @RequestMapping("/eq")
    public String eq(ModelMap map) {
        map.addAttribute("name", "zhangsan");
        map.addAttribute("age", 30);
        map.addAttribute("flag", "yes");
        return "eq";
    }

    @RequestMapping("/if")
    public String if1(ModelMap map) {
        map.addAttribute("flag", "no");
        return "if";
    }

    @RequestMapping("/list")
    public String list(ModelMap map) {
        map.addAttribute("users", getUserList());
        return "list";
    }

    @RequestMapping("/string")
    public String string(ModelMap map) {
        map.addAttribute("userName", "sayString");
        return "string";
    }

    @RequestMapping("/switch")
    public String switch2(ModelMap map) {
        map.addAttribute("sex", "woman");
        return "switch";
    }

    @RequestMapping("url")
    public String url(ModelMap map) {
        map.addAttribute("type", "type111");
        map.addAttribute("pageId", "pageId111");
        map.addAttribute("img", "http://www.ityouknow.com/assets/images/neo.jpg");
        return "url";
    }

    private List<User> getUserList() {
        List<User> list = new ArrayList<>();
        User user1 = new User("xiaoming", 29, "xm");
        User user2 = new User("xiaohong", 27, "xh");
        User user3 = new User("xiaoli", 18, "xl");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }

}
