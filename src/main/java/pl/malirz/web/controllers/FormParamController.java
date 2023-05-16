package pl.malirz.web.controllers;

import java.util.function.Function;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Binding regular form to model.
 */
@RestController
@RequestMapping("/form-params")
public class FormParamController implements Function<Model, String> {

    @Override
    @PostMapping(consumes = "application/x-www-form-urlencoded")
    public String apply(@Valid @ModelAttribute Model model) {
        return "Hello " + model.firstName() + " " + model.lastName();
    }

}
