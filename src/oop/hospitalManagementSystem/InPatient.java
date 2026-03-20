package oop.hospitalManagementSystem;

public class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;
    private boolean hasSurgery;
    private final double surgeryCharge;

    public InPatient (int daysAdmitted, double dailyRate, boolean hasSurgery, double surgeryCharge){
        super();
        if (daysAdmitted<=0) throw new IllegalArgumentException("Days Admitted Cant be Negative or Zero");
        if (dailyRate<=0) throw new IllegalArgumentException("Daily Rate Cant be Negative or Zero");
        if (surgeryCharge<=0) throw new IllegalArgumentException("Surgery Charge Cant be Negative or Zero");

        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.hasSurgery = hasSurgery;
        this.surgeryCharge = surgeryCharge;
    }

    public InPatient (int daysAdmitted, double dailyRate){
        super();
        if (daysAdmitted<=0) throw new IllegalArgumentException("Days Admitted Cant be Negative or Zero");
        if (dailyRate<=0) throw new IllegalArgumentException("Daily Rate Cant be Negative or Zero");


        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.hasSurgery = false;
        this.surgeryCharge = 0;
    }

    @Override
    public double calculateBill() {
        return super.calculateBill()+surgeryCharge+(daysAdmitted*dailyRate);
    }

    public void addDays(int days){
        daysAdmitted =+ days;
    }

    @Override
    public String getPatientSummery() {
        return super.getPatientSummery()+" Days Admitted:"+daysAdmitted+" Daily Rate:"+dailyRate+" Has Surgery:"+hasSurgery+"Surgery Charge:"+surgeryCharge;
    }

}
