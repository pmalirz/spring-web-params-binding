package pl.malirz.web.controllers;

import jakarta.validation.constraints.NotBlank;

record Model(@NotBlank String firstName, @NotBlank String lastName) {
}
