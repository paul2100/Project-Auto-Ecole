package sio.autoecoleprojet.controllers;

import sio.autoecoleprojet.services.EleveService;

public class EleveController {
    private EleveService eleveService;

    public EleveController() {
        this.eleveService = new EleveService();
    }
}
