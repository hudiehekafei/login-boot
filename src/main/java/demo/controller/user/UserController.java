package demo.controller.user;

import demo.mapper.user.UserMapper;
import demo.po.UserPo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @GetMapping("list")
    public String current(Model model) {
        List<UserPo> userList = userMapper.selectAll();
        model.addAttribute("users", userList);
        return "/user/list";
    }
}
