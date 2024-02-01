package com.aysin.libarary;

import java.util.Date;

public abstract class MemberRecord {
    private int memberId;
    private String type;
    private Date dateOfMembership;
    private int noBooksIssued;
    public int maxBookLimit= 5;
    private String name;
    private String address;
    private long phoneNo;

    public MemberRecord(int memberId, String type, Date dateOfMembership, String name, String address, long phoneNo) {
        this.memberId = memberId;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getType() {
        return type;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public int getNoBooksIssued() {
        return noBooksIssued;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
    public String getMember(MemberRecord memberRecord){
        return memberRecord.getName();
    }

    public void payBill(){
        System.out.println("Bill has been payed!");
    }

}
