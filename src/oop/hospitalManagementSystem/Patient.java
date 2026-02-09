package oop.hospitalManagementSystem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Patient {


    private final String patientID;
    private String patientName;
    private int age;
    protected String bloodGroup;
    private int wardNumber;

    private String [] bloodGroups = {"A+","A-","B+","B-","O+","O-","AB+","AB-"};

    public Patient(String patientID, String patientName, int age, String bloodGroup, int wardNumber){
        if (patientID == null || patientID.isBlank()) throw new IllegalArgumentException("Patient ID cant be Null");
        if (age <0 || age>150 ) throw new IllegalArgumentException("Patient age must between 0 and 150");
        if (Arrays.stream(bloodGroups).anyMatch(x-> x!=bloodGroup)) throw new IllegalArgumentException("Invalid Blood Group");

        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.wardNumber = wardNumber;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(int age) {
        if (age <0 || age>150 ) throw new IllegalArgumentException("Patient age must between 0 and 150");
        this.age = age;
    }

    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }

    public double calculateBill(){
        return 5_000;
    }

    public String getPatientSummery(){
        return "Patient ID:"+patientID+" Patient Name:"+patientName+" Patient Age:"+age+" Patient Blood Group:"+bloodGroup+" Patient Ward Number:"+wardNumber;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID='" + patientID + '\'' +
                ", patientName='" + patientName + '\'' +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", wardNumber=" + wardNumber +
                ", bloodGroups=" + Arrays.toString(bloodGroups) +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age && wardNumber == patient.wardNumber && Objects.equals(patientID, patient.patientID) && Objects.equals(patientName, patient.patientName) && Objects.equals(bloodGroup, patient.bloodGroup) && Objects.deepEquals(bloodGroups, patient.bloodGroups);
    }

    public String getPatientID() {
        return patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getAge() {
        return age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public int getWardNumber() {
        return wardNumber;
    }





}
