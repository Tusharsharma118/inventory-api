package com.helixcry.inventory.models;

import com.helixcry.inventory.models.constants.UserCategory;
import lombok.Data;
import org.hibernate.usertype.UserType;

import javax.persistence.Entity;

@Data
@Entity
public class User {
    String userName;
    String encodedPassword;
    String mobileNumber;
    String email;
    String address;
    UserCategory userType;
}
