package org.project.pos.projectpos.auth.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRes {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private List<String> roles;
}
