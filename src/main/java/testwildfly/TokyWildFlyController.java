package tokywildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokyWildFlyController {


    @RequestMapping("toky")
    public String Andrana(){
        return ("Akory aby ô , Wildfly ity an !!!");
    }
}