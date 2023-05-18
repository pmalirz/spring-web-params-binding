package pl.malirz.web.controllers;

import java.util.function.Function;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Binding JSON request body to model.
 */
@RestController
@RequestMapping("/json-body-params")
public class JsonBodyParamController implements Function<RequestModel, String> {

    @Override
    @PostMapping
    public String apply(@Valid @RequestBody RequestModel requestModel) {
        return "Hello " + requestModel.firstName() + " " + requestModel.lastName();
    }

}
