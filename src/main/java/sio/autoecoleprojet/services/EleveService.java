package sio.autoecoleprojet.services;

import sio.autoecoleprojet.models.Eleve;
import sio.autoecoleprojet.repositories.RepositoryInterface;

import java.sql.SQLException;
import java.util.ArrayList;

public class EleveService implements RepositoryInterface<Eleve, String> {
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
