package com.aysin.libarary;

import java.util.Date;

public class Faculty extends MemberRecord {
    public Faculty(int memberId, String type, Date dateOfMembership, String name, String address, long phoneNo) {
        super(memberId, type, dateOfMembership, name, address, phoneNo);
    }
}
