package com.dvlasenko.server.entity;

public class Contact {

    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;

    public Contact(Integer id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "id - " + this.getId() +
                ", " + this.getLastName() + " " + this.getFirstName() +
                ", email: " + this.getPhoneNumber() + "\n";
    }
}
