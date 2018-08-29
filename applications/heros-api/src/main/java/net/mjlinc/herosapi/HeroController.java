package net.mjlinc.herosapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {

    @GetMapping("/test/")
    public @ResponseBody String test() {
        return "{status: 'OK'}";
    }
}
