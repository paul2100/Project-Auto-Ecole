package sio.autoecoleprojet.controllers;

import sio.autoecoleprojet.services.EleveService;
import sio.autoecoleprojet.services.MoniteurService;

public class MoniteurController {

    private MoniteurService moniteurService;

    public MoniteurController() {
        this.moniteurService = new MoniteurService();
    }
}
