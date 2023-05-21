package ru.teachmeskills.homework08.clinic;

public class Main {
    public static void main(String[] args) {

        TreatmentPlan treatmentPlan = new TreatmentPlan();
        Patient patient = new Patient("Александр");
        Patient patient2 = new Patient("Валентин");
        Patient patient3 = new Patient("Наталья");
        treatmentPlan.assignDoctor(1, patient);
        treatmentPlan.assignDoctor(2, patient2);
        treatmentPlan.assignDoctor(5, patient3);
    }
}
