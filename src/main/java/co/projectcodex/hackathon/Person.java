package co.projectcodex.hackathon;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class Person {
    String firstName;
    String lastName;
    String email;


    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}