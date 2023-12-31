package com.example.staff.domain.staff;

import com.example.staff.domain.common.ValueObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@Getter//remove when DTO added
public class FullName extends ValueObject {
    private String firstName;
    private String surname;

    public FullName(String firstName, String surname){
        setFirstName(firstName);
        setSurname(surname);
    }

    //Shallow copy (unit testing)
    public FullName(FullName fullName){
        this(fullName.firstName, fullName.surname);
    }

    public boolean equals(Object o){
        if (o == null && o.getClass() != this.getClass()){
            return false;
        }
        FullName fullName = (FullName) o;

        return fullName.firstName.equals(this.firstName) &&
                fullName.surname.equals(this.surname);
    }

    private void setFirstName(String firstName){
        this.assertArgumentNotEmpty(firstName,"Name cannot be empty");
        this.assertArgumentLength(firstName, 1,20,"first name must be no more than 20 characters");
        this.firstName = firstName;
    }

    private void setSurname(String surname){
        this.assertArgumentLength(surname, 1,20,"surname must be no more than 20 characters");
        this.surname = surname;
    }

    public String toString(){
        return String.format("%s %s", firstName, surname);
    }

    public String firstName(){
        return this.firstName;
    }

    public String surname(){
        return this.surname;
    }
}