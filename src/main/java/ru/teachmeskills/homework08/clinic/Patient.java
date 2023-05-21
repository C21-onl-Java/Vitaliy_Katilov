package ru.teachmeskills.homework08.clinic;

public class Patient {

    private final String namePatient;
    //private TreatmentPlan treatmentPlan;
    private Doctor doctor;

    public Patient(String name) {
        namePatient = name;
    }

    public String getNamePatient() {
        return namePatient;
    }

//    public TreatmentPlan getTreatmentPlan() {
//        return treatmentPlan;
//    }
//
//    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
//        this.treatmentPlan = treatmentPlan;
//    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}





