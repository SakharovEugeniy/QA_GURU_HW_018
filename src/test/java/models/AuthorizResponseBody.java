package models;

import lombok.Data;

@Data
public class AuthorizResponseBody {
    private String token;
    private String expires;
    private String status;
    private String result;
}
