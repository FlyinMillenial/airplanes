package com.bates;

public class Plane {
    private String make;
    private String model;
    private String registration;
    private SpeedProfile speedProfile;

    public Plane(String make, String model, String registration, SpeedProfile speedProfile) {
        this.make = make;
        this.model = model;
        this.registration = registration;
        this.speedProfile = speedProfile;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getRegistration() {
        return this.registration;
    }

    public SpeedProfile getSpeedProfile() {
        return this.speedProfile;
    }

}
