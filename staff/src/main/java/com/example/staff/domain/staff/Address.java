package com.example.staff.domain.staff;

import com.example.staff.domain.common.ValueObject;
import lombok.*;

@ToString
@Getter
public class Address extends ValueObject {
    private String houseNameNumber;
    private String street;
    private String town;

    public Address(String houseNameNumber, String street, String town){
        setHouseNameNumber(houseNameNumber);
        setStreet(street);
        setTown(town);
    }

    //Shallow copy
    public Address(Address address){
        this(address.houseNameNumber, address.street, address.town);
    }

    public boolean equals(Object o){
        if (o == null && o.getClass() != this.getClass()){
            return false;
        }
        Address anotherAddress = (Address) o;

        return anotherAddress.houseNameNumber.equals(this.houseNameNumber) &&
               anotherAddress.street.equals(this.street) &&
               anotherAddress.town.equals(this.town);
    }

    private void setHouseNameNumber(String houseNameNumber){
        assertArgumentNotEmpty(houseNameNumber,"House name/number cannot be empty");
        this.houseNameNumber = houseNameNumber;
    }

    private void setStreet(String street){
        assertArgumentNotEmpty(street,"Street cannot be empty");
        this.street = street;
    }

    private void setTown(String town){
        assertArgumentNotEmpty(town,"Town cannot be empty");
        this.town = town;
    }

    public String houseNameNumber(){
        return this.houseNameNumber;
    }

    public String street(){
        return this.street;
    }

    public String town(){
        return this.town;
    }
}
