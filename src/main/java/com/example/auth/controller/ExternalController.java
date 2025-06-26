package com.example.auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalController {

    @GetMapping("/api/external")
    public Jwt external(@AuthenticationPrincipal Jwt jwt) {
        return jwt;
    }

    @PreAuthorize("hasAuthority('read:user')")
    @GetMapping("/api/external-protected")
    public Object externalProtected(@AuthenticationPrincipal Jwt jwt) {
        return jwt.getClaim("permissions");
    }
}
