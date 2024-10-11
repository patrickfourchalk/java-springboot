package user_service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users-table")
class User {
    private @Id @GeneratedValue Long id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private Long phone_number;

    User() {
    }

    // Initializer
    User(String username, String first_name, String last_name, String email, Long phone_number) {
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    // Getters
    public Long getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public String getEmail() {
        return this.email;
    }

    public Long getPhoneNumber() {
        return this.phone_number;
    }

    // Setters
    public void setId(Long id) {
        if (id != null) {
            this.id = id;
        }
    }

    public void setUsername(String username) {
        if (username != null) {
            this.username = username;
        }
    }

    public void setFirstName(String first_name) {
        if (first_name != null) {
            this.first_name = first_name;
        }
    }

    public void setLastName(String last_name) {
        if (last_name != null) {
            this.last_name = last_name;
        }
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    public void setPhoneNumber(Long phone_number) {
        if (phone_number != null) {
            this.phone_number = phone_number;
        }
    }

    @Override
    public String toString() {
        return "User{" + "id=" + this.id + ", name='" + this.first_name + " " + this.last_name + "', email="
                + this.email + ", phone_number=" + String.valueOf(this.phone_number) + "}";
    }
}
