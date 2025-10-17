package edu.ucaldas.behavior;

public class SupervisorHandler extends BaseHandler {
    @Override
    public String handleRequest(String request) {
        if (request.equalsIgnoreCase("intermedia")) {
            return "Atendido por Supervisor";
        } else {
            return super.handleRequest(request);
        }
    }
}
