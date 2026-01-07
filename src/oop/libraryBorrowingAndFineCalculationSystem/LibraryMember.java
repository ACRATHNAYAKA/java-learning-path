package oop.libraryBorrowingAndFineCalculationSystem;

public abstract class LibraryMember {
    private final String memberId;
    private final String memberName;

    public LibraryMember(String memberId, String memberName){
        if (memberId == null || memberId.isBlank()){
            throw new IllegalArgumentException("MemberId cant be Null");
        }

        if (memberName == null || memberName.isBlank()){
            throw new IllegalArgumentException("Member name cant be Null");
        }

        this.memberId = memberId;
        this.memberName = memberName;
    }

    public abstract int getMaxBorrowingDates();
    public abstract double getDailyFind();
    public abstract String getMemberType();

}
