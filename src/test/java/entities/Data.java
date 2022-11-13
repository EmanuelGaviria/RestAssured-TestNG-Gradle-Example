package entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    private int id;
    private String email;
    @JsonProperty("first_name") private String firstName;
    @JsonProperty("last_name") private String lastName;
    private String avatar;

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAvatar() {
        return avatar;
    }
}
