# Binding HTTP parameters directly to a model

This is to showcase how to bind HTTP parameters to the model object (context).
Although a trivial task it is often forgotten by developers.

## 🚫 Don't bind parameters via method arguments 

```java
@Override
@GetMapping
public String apply(@RequestParam String firstName, @RequestParam String lastName) {
    return "Hello " + firstName + " " + lastName;
}
```
or

```java
@Override
@GetMapping("/{firstName}/{lastName}")
public String apply(@PathVariable String firstName, @PathVariable String lastName) {
    return "Hello " + firstName + " " + lastName;
}
```

## ✅ Do bind parameters using a context object (model object)

It eliminates number of separated method parameters
using the context model - [context design pattern](https://www.baeldung.com/cs/context-design-pattern).
An additional benefit is that one get the Spring Framework's validation mechanizm (using ```@Valid```).

### Path variable binding 
```java
@Override
@GetMapping("/{firstName}/{lastName}")
public String apply(@Valid @ModelAttribute RequestModel requestModel) {
    return "Hello " + requestModel.firstName() + " " + requestModel.lastName();
}
```

### URI parameters binding
```java
@Override
@GetMapping
public String apply(@Valid @ModelAttribute RequestModel requestModel) {
    return "Hello " + requestModel.firstName() + " " + requestModel.lastName();
}
```

### JSON binding
```java
@Override
@PostMapping
public String apply(@Valid @RequestBody RequestModel requestModel) {
    return "Hello " + requestModel.firstName() + " " + requestModel.lastName();
}
```

### Regular \<form/> parameter binding
```java
@Override
@PostMapping(consumes = "application/x-www-form-urlencoded")
public String apply(@Valid @ModelAttribute RequestModel requestModel) {
    return "Hello " + requestModel.firstName() + " " + requestModel.lastName();
}
```

### The request model (context)
```java
record RequestModel(@NotBlank String firstName, @NotBlank String lastName) {}
```
See how all the above methods use the same model (same parameter). All can use the same interface. 