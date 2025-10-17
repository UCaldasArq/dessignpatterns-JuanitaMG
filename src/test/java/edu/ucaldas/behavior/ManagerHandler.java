package edu.ucaldas.behavior;

public class ManagerHandler extends BaseHandler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("avanzada")) {
            return "Atendido por Gerente";
        } else {
            return super.handleRequest(request);
        }
    }
}
