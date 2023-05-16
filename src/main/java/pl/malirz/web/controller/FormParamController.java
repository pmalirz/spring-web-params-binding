package pl.malirz.web.controller;

import java.util.function.Function;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/formParam")
public class FormParamController implements Function<Model, String> {

    @Override
    @PostMapping(consumes = "application/x-www-form-urlencoded")
    public String apply(@ModelAttribute Model model) {
        return "Hello " + model.getFirstName() + " " + model.getLastName();
    }

}
