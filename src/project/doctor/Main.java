package project.doctor;

public class Main {

    public static void main(String[] args) {

        Doctors doctor = new Doctors(new DoctorMakeFactory());
        Doctor Aizhan = doctor.makeDoctor("Aizhan" , "Therapist");
        Doctor Aldana = doctor.makeDoctor("Aldana" , "Pediatrician");
        Doctor Leva = doctor.makeDoctor("Leva" , "Dermatologist");

        Patients patient = new Patients(new PatientMakeFactory());
        Patient Yerassyl = patient.makePatient("Yerassyl" , "kid");
        Patient Bob = patient.makePatient("Bob" , "Old");

        Yerassyl.GoToDoctor(Aldana);
        System.out.println();

        Bob.GoToDoctor(Leva);
        System.out.println();

        Doctor John = doctor.makeDoctor("John","Dermatologist");
        Position John_pos = new ExperiencedDoctor(John);

        John_pos.position();
        System.out.println();

        Bob.GoToDoctor(John);
        System.out.println();

        Position D1 = new TalentedDoctor(Aizhan);
        D1.position();

        ManagePriority manage = new ManagePriority();
        Priority stage = manage.getPriority();
        System.out.println();
        stage.priority(Yerassyl);


    }
}
