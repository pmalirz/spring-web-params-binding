package pl.malirz.web.controllers;

import java.util.function.Function;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Binding path parameters to model.
 */
@RestController
@RequestMapping("/path-params")
public class PathParamController implements Function<Model, String> {

    @Override
    @GetMapping("/firstName/{firstName}/lastName/{lastName}")
    public String apply(@Valid @ModelAttribute Model model) {
        return "Hello " + model.firstName() + " " + model.lastName();
    }

}
