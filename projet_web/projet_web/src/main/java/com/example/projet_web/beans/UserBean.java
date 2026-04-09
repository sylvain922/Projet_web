package com.example.projet_web.beans;

public class UserBean {
    private String login;
    private String attribut2;
    private String attribut3;

    public UserBean() {
    }

    public UserBean(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAttribut2() {
        return attribut2;
    }

    public void setAttribut2(String attribut2) {
        this.attribut2 = attribut2;
    }

    public String getAttribut3() {
        return attribut3;
    }

    public void setAttribut3(String attribut3) {
        this.attribut3 = attribut3;
    }
}