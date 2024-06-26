package com.example.patientapi.controller;

import com.example.patientapi.model.Patient;
import com.example.patientapi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Nextech/test")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping("/")
    public Patient createUser(@RequestBody Patient patient) {return patientRepository.save(patient); }

//    @GetMapping
//    public List<Patient> getAllPatients() {
//        return patientService.getAllPatients();
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getUserById(@PathVariable Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return ResponseEntity.ok(patient);
    }

//    @GetMapping("/{id}")
//    public Patient getPatientById(@PathVariable Long id) {
//        return patientService.getPatientById(id);

    @PutMapping("/{id}")
    public ResponseEntity<Patient> updateUser(@PathVariable Long id, @RequestBody Patient patientDetails) {
        Patient patient  = patientRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        patient.setPatientsName(patientDetails.getPatientsName());
        patient.setId(patientDetails.getId());
        patient.setAppointmentBookings(patientDetails.getAppointmentBookings());

        final Patient updatedPatient = patientRepository.save(patient);
        return ResponseEntity.ok(updatedPatient);
    }

 //   @PostMapping
  //  public Patient addPatient(@RequestBody Patient patient) {
    //    return patientService.savePatient(patient);
   // }
}
