package oop.libraryBorrowingAndFineCalculationSystem;

public class StudentMember extends LibraryMember {

    public StudentMember(String memberId, String memberName) {
        super(memberId, memberName);
    }

    @Override
    public int getMaxBorrowingDates() {
        return 0;
    }

    @Override
    public double getDailyFind() {
        return 0;
    }

    @Override
    public String getMemberType() {
        return "";
    }
}
