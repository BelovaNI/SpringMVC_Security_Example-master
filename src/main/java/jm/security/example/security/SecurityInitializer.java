package jm.security.example.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
    //обязателен для не boot-приложения. Кода в нем нет, но требуется для регистрации секьюрити в Спринг-контейнере.
}
