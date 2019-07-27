package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component("requestscope")
@RequestScope
@SessionScope
@ApplicationScope
public class RequestScopeBean {

}
