package edu.ucaldas.behavior;

public class BasicSupportHandler extends BaseHandler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("básica")) {
            return "Atendido por Soporte Básico";
        } else {
            return super.handleRequest(request);
        }
    }
}

