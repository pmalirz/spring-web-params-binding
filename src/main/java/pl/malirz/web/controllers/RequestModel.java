package pl.malirz.web.controllers;

import jakarta.validation.constraints.NotBlank;

/**
 * Regular, old POJO also works.
 */
record RequestModel(@NotBlank String firstName, @NotBlank String lastName) {
}
