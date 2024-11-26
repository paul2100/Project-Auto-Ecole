package sio.autoecoleprojet.controllers;

import sio.autoecoleprojet.services.CompteService;

import java.sql.SQLException;
import java.util.ArrayList;


public class CompteController {

    private CompteService compteService;

    public CompteController() {
        this.compteService = new CompteService();
    }

    public ArrayList<String> getAllLogins() throws SQLException {
        return compteService.getAllLogins();
    }
}
