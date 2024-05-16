package com.example.patientapi.controller;

import com.example.patientapi.model.Patient;
import com.example.patientapi.repository.PatientRepository;
import com.example.patientapi.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Nextech/test")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/")
    public Patient createUser(@RequestBody Patient patient) {return PatientRepository.save(patient); }

//    @GetMapping
//    public List<Patient> getAllPatients() {
//        return patientService.getAllPatients();
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getUserById(@PathVariable Long id) {
        Patient patient = PatientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return ResponseEntity.ok(patient);
    }

//    @GetMapping("/{id}")
//    public Patient getPatientById(@PathVariable Long id) {
//        return patientService.getPatientById(id);

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updateUser(@PathVariable Long id, @RequestBody Patient patientDetails) {
        Patient patient  = PatientRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        patient.setPatientsName(patientDetails.getPatientsName());
        patient.setId(patientDetails.getId());
        patient.setAppointmentBookings(patientDetails.getAppointmentBookings());

        final Patient updatedPatient = PatientRepository.save(patient);
        return ResponseEntity.ok(updatedPatient);
    }

 //   @PostMapping
  //  public Patient addPatient(@RequestBody Patient patient) {
    //    return patientService.savePatient(patient);
   // }
}
