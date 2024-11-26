package sio.autoecoleprojet.repositories;

import sio.autoecoleprojet.models.Eleve;
import sio.autoecoleprojet.tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class EleveRepository implements RepositoryInterface<Eleve,String>{


    private Connection connection;

    public EleveRepository() {
        this.connection = ConnexionBDD.getCnx();
    }


    @Override
    public void create(Eleve eleve) {

    }

    @Override
    public void update(Eleve eleve) {

    }

    @Override
    public void delete(Eleve eleve) {

    }

    @Override
    public Eleve get(String s) {
        return null;
    }

    @Override
    public ArrayList<Eleve> getAll() throws SQLException {
        return null;
    }
}
