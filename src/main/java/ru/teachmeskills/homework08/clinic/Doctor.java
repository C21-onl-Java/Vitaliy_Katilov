package ru.teachmeskills.homework08.clinic;

public abstract class Doctor {
    private Patient patient;
    abstract public void treatPatient();

    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
