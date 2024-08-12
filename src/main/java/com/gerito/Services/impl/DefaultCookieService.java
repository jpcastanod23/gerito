package com.gerito.Services.impl;

import com.gerito.Services.CookieService;
import jakarta.servlet.http.Cookie;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

import jakarta.servlet.http.HttpServletRequest;


@Service
public class DefaultCookieService implements CookieService {

    @Override
    public String getCookieName(HttpServletRequest request) {
        Optional<Cookie> cookieOpt = Arrays.stream(request.getCookies())
                .filter(cookie -> cookie.getName().equals("userName")).findFirst();
        return cookieOpt.isPresent() ? cookieOpt.get().getValue() : "";
    }
}
