package com.example.staff.domain.staff;

import com.example.staff.domain.common.ValueObject;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum UserType{
    // SHOULD THIS ENUM BE A VALUE OBJECT
    STAFF,
    MANAGER,
    ADMIN
}
