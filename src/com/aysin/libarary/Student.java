package com.aysin.libarary;

import java.util.Date;

public class Student extends MemberRecord{
    public Student(int memberId, String type, Date dateOfMembership, String name, String address, long phoneNo) {
        super(memberId, type, dateOfMembership, name, address, phoneNo);
    }
}
