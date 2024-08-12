package com.gerito.Services;

import jakarta.servlet.http.HttpServletRequest;

public interface CookieService {
    String getCookieName(HttpServletRequest request);
}
