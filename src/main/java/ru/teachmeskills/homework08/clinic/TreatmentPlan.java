package ru.teachmeskills.homework08.clinic;

public class TreatmentPlan {

    public void assignDoctor(int code, Patient patient) {

        switch (code) {
            case 1:
                System.out.print("Пациенту " + patient.getNamePatient() + ", назначить хирурга -");
                patient.setDoctor(new Surgeon());
                break;
            case 2:
                System.out.print("Пациенту " + patient.getNamePatient() + ", назначить дантиста -");
                patient.setDoctor(new Dentist());
                break;
            default:
                System.out.print("Пациенту " + patient.getNamePatient() + ", назначить терапевта -");
                patient.setDoctor(new Therapist());
        }
        patient.getDoctor().treatPatient();
    }

}




