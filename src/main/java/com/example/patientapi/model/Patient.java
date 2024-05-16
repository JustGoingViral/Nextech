package com.example.patientapi.model;

import javax.persistence.*;

@Entity
@Table(name = "test")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientsName;
    private String appointmentBookings;


   public Patient() {
   }

    // Getters and setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getPatientsName() { return patientsName; }

    public void setPatientsName(String patientsName) { this.patientsName = patientsName; }

    public String getAppointmentBookings() { return appointmentBookings; }

    public void setAppointmentBookings(String appointmentBookings) { this.appointmentBookings = appointmentBookings; }
}
