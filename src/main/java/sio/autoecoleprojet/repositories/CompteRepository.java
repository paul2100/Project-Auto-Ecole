package sio.autoecoleprojet.repositories;

import sio.autoecoleprojet.models.Compte;
import sio.autoecoleprojet.tools.ConnexionBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CompteRepository implements RepositoryInterface<Compte, String>{

    private Connection connection;

    public CompteRepository() {
        this.connection = ConnexionBDD.getCnx();
    }

    public ArrayList<String> getAllLogins() throws SQLException {
        ArrayList<String> logins = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT login FROM compte;");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            logins.add(new String(resultSet.getString("login")));
        }
        return logins;
    }

    @Override
    public void create(Compte compte) {

    }

    @Override
    public void update(Compte compte) {

    }

    @Override
    public void delete(Compte compte) {

    }

    @Override
    public Compte get(String s) {
        return null;
    }

    @Override
    public ArrayList<Compte> getAll() throws SQLException {
        return null;
    }
}
