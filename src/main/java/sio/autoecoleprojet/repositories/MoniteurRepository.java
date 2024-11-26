package sio.autoecoleprojet.repositories;

import sio.autoecoleprojet.models.Moniteur;
import sio.autoecoleprojet.tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class MoniteurRepository implements RepositoryInterface<Moniteur,String> {

    private Connection connection;

    public MoniteurRepository() {
        this.connection = ConnexionBDD.getCnx();
    }




    @Override
    public void create(Moniteur moniteur) {

    }

    @Override
    public void update(Moniteur moniteur) {

    }

    @Override
    public void delete(Moniteur moniteur) {

    }

    @Override
    public Moniteur get(String s) {
        return null;
    }

    @Override
    public ArrayList<Moniteur> getAll() throws SQLException {
        return null;
    }
}
