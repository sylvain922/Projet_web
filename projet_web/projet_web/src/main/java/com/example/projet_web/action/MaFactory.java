package com.example.projet_web.action;

import java.util.HashMap;
import java.util.Map;

public class MaFactory {

    private Map<String, Action> actions;

    public MaFactory() {
        actions = new HashMap<>();

        actions.put("/actionDebut.perform", new ActionDebut());
        actions.put("/loginAction.perform", new LoginAction());
        actions.put("/actionUn.perform", new ActionUn());
        actions.put("/logoutAction.perform", new LogoutAction());
    }

    public Action getAction(String chemin) {
        return actions.get(chemin);
    }
}