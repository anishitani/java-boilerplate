package org.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class HelloBean {

    private String message = "Hello World!";

    public String getGreeting() {
        return message;
    }

    public void setGreeting(String greeting) {
        this.message = greeting;
    }

}
