package com.example.identity.infrastructure;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotNull;

@Entity(name = "app_user")
@Table(name = "app_user")
@Getter
@Setter
public class AppUserJpa {
    //Needed for JWT
    public final static String EMAIL = "email";
    public final static  String FIRST_NAME = "first name";
    public final static String PASSWORD = "password";
    public final static String ROLE = "role";
    public final static String SURNAME = "surname";
    public final static String USERNAME = "username";
    public final static String ID = "id";

    @Id
    @Column(name="id")
    private String userUUID;

    @NotNull
    @Column(name = "username")
    private String userName;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "surname")
    private String surname;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="role_id")
    private RoleJpa role;

    public String toString(){
        return String.format("%s, %s, %s, %s %s" , userUUID,
                userName, password, email, role);
    }
}
