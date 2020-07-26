package com.privateschool.server.dto;

import com.privateschool.server.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter //No need setters in here.
@NoArgsConstructor //new UserDto();
//Data Transfer Object
public class UserDto {

    @NotBlank
    private String name;

    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public User convertToUser() {
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        return user;
    }

}
