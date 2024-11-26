package sio.autoecoleprojet.services;

import sio.autoecoleprojet.repositories.EleveRepository;


public class EleveService
{

    private EleveRepository eleveRepository;

    public EleveService() {
        this.eleveRepository = new EleveRepository() ;
    }

}
