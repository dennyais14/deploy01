package co.develhope.deploy01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevNameController {
    @GetMapping("/devName")
    public String getDevName() {
        return "Giacomo";
    }
}
