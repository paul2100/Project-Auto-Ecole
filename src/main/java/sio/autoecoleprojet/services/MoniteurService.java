package sio.autoecoleprojet.services;


import sio.autoecoleprojet.repositories.MoniteurRepository;

public class MoniteurService {

    private MoniteurRepository moniteurRepository;

    public MoniteurService() {
        this.moniteurRepository = new MoniteurRepository() ;
    }
}
