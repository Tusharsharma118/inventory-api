package com.helixcry.inventory.dtos;

import com.helixcry.inventory.models.constants.UserCategory;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {
    String userName;
    String encodedPassword;
    String mobileNumber;
    String email;
    String address;
    UserCategory userType;
}
