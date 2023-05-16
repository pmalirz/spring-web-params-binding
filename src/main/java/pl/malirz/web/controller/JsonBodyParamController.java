package pl.malirz.web.controller;

import java.util.function.Function;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jsonBodyParam")
public class JsonBodyParamController implements Function<Model, String> {

    @Override
    @PostMapping
    public String apply(@RequestBody Model model) {
        return "Hello " + model.getFirstName() + " " + model.getLastName();
    }

}
