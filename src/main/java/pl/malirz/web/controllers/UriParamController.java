package pl.malirz.web.controllers;

import java.util.function.Function;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Binding URI parameters to the request model.
 */
@RestController
@RequestMapping("/uri-params")
public class UriParamController implements Function<RequestModel, String> {

    @Override
    @GetMapping
    public String apply(@Valid @ModelAttribute RequestModel requestModel) {
        return "Hello " + requestModel.firstName() + " " + requestModel.lastName();
    }

}
