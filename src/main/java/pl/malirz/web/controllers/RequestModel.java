package pl.malirz.web.controllers;

import jakarta.validation.constraints.NotBlank;

record RequestModel(@NotBlank String firstName, @NotBlank String lastName) {
}
