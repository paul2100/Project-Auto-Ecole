package sio.autoecoleprojet;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sio.autoecoleprojet.tools.ConnexionBDD;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class PageConnexionController implements Initializable {

    ConnexionBDD connexionBDD;


    @javafx.fxml.FXML
    private AnchorPane apProfilE;
    @javafx.fxml.FXML
    private AnchorPane apPlanningE;
    @javafx.fxml.FXML
    private AnchorPane apStatistiqueE;
    @javafx.fxml.FXML
    private AnchorPane apInscriptionE;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            connexionBDD = new ConnexionBDD();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Deprecated
    public void clickedBtnConnexion(Event event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("pageEleve.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("ELEVE");
        stage.setScene(scene);
        stage.show();
    }


}
