package demo.controller.current;

import demo.mapper.current.CurrentMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("current")
public class CurrentController {

    @Resource
    private CurrentMapper currentMapper;

    @GetMapping("time")
    public String current() {
        return currentMapper.selectCurrentDate();
    }
}
