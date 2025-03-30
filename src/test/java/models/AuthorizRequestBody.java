package models;

import lombok.Data;

@Data
public class AuthorizRequestBody {
    private String userName;
    private String password;
}
