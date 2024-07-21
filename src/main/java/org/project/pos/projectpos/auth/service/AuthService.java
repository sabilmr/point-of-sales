package org.project.pos.projectpos.auth.service;

import org.project.pos.projectpos.auth.model.request.ChangePasswordReq;

import java.security.Principal;

public interface AuthService {
    void changePassword(ChangePasswordReq request, Principal connectedUser);

}
