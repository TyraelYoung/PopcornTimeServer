package wang.tyrael.PopcornTimeServer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleProxyController {
    @RequestMapping("**")
    public String proxyALl(){
        return "all";
    }

    @RequestMapping("adpater")
    public String adpater(){
        return "adpater";
    }
}
