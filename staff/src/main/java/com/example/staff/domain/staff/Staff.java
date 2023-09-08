package com.example.staff.domain.staff;

import com.example.staff.domain.common.Entity;
import com.example.staff.domain.common.Identity;
import lombok.ToString;

import java.lang.reflect.Array;
import java.util.List;

@ToString
public class Staff extends Entity {
    private FullName fullName;
    private Address address;
    private UserType userType;
    private List<Staff> subordinates;

    public Staff(Identity id, FullName fullName, Address address, UserType userType) {
        super(id);
        this.fullName = fullName;
        this.address = address;
        this.userType = userType;
    }

    public static Staff staffOf(Identity id, FullName fullName, Address address, UserType userType) {
        return new Staff(id, fullName, address, userType);
    }

    public void updateFullName(FullName fullName) { this.fullName = fullName; }

    public void updateAddress(Address address) { this.address = address; }

    public void updateUserType(UserType userType) { this.userType = userType; }

    public void addSubordinate(Staff subordinate) { this.subordinates.add(subordinate); }

    public void removeSubordinate(Staff subordinate) { this.subordinates.remove(subordinate); }

    public Identity id() { return id; }

    public FullName fullName() { return fullName; }

    public Address address() { return address; }

    public UserType userType() { return userType; }

    public List<Staff> subordinates() { return subordinates; }
}
