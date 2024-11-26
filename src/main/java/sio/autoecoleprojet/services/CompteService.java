package sio.autoecoleprojet.services;


import sio.autoecoleprojet.repositories.CompteRepository;

import java.sql.SQLException;
import java.util.ArrayList;


public class CompteService {

    private CompteRepository compteRepository;

    public CompteService() {
        this.compteRepository = new CompteRepository() ;
    }

    public ArrayList<String> getAllLogins() throws SQLException {
        return compteRepository.getAllLogins();
    }
}
