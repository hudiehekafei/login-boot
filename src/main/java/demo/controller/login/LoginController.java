package demo.controller.login;

import demo.mapper.user.UserMapper;
import demo.po.UserPo;
import demo.vo.UserVo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoginController {

    @Resource
    private UserMapper userMapper;

    @PostMapping("login")
    public String login(@RequestBody UserVo userVo) {
        String name = userVo.getName();
        String password = userVo.getPassword();
        if (StringUtils.isBlank(name) || StringUtils.isBlank(password)) {
            return "failure1";
        }
        UserPo userPo = userMapper.selectOne(name);
        if (userPo == null || !password.equals(userPo.getPassword())) {
            return "failure2";
        }
        return "success";
    }
}
