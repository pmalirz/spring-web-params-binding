package pl.malirz.web.controller;

class Model {
    private final String firstName;
    private final String lastName;

    public Model(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
