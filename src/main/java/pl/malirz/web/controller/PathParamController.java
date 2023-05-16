package pl.malirz.web.controller;

import java.util.function.Function;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathParam")
public class PathParamController implements Function<Model, String> {

    @Override
    @GetMapping("/firstName/{firstName}/lastName/{lastName}")
    public String apply(@ModelAttribute Model model) {
        return "Hello " + model.getFirstName() + " " + model.getLastName();
    }

}
