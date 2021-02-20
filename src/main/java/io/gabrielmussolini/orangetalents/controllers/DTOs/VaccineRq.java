package io.gabrielmussolini.orangetalents.controllers.DTOs;

import java.util.Date;

public class VaccineRq {
    private String name;
    private String email;
    private Date appliedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getAppliedAt() {
        return appliedAt;
    }

    public void setAppliedAt(Date appliedAt) {
        this.appliedAt = appliedAt;
    }
}
