package edu.ucaldas.behavior;

public abstract class BaseHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        if (next != null) {
            return next.handleRequest(request);
        } else {
            return "No se puede atender la solicitud.";
        }
    }
}
