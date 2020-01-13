package club.banyuan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {
    @GetMapping("/users/{username:[a-z0-9_]+}")
    @ResponseBody
    public String getIndex(@PathVariable String username){
        return String.format("user %s",username);
    }
}
