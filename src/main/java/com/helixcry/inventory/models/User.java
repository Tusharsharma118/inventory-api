package com.helixcry.inventory.models;

import com.helixcry.inventory.models.constants.UserCategory;
import lombok.Builder;
import lombok.Data;
import org.hibernate.usertype.UserType;

import javax.persistence.Entity;

@Data
@Entity
@Builder
public class User {
    String userName;
    String encodedPassword;
    String mobileNumber;
    String email;
    String address;
    UserCategory userType;
}
