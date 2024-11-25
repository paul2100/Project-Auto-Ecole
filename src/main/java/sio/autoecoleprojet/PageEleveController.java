package sio.autoecoleprojet;

import javafx.event.Event;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PageEleveController implements Initializable {

    @javafx.fxml.FXML
    private AnchorPane apProfilE;
    @javafx.fxml.FXML
    private AnchorPane apPlanningE;
    @javafx.fxml.FXML
    private AnchorPane apStatistiqueE;
    @javafx.fxml.FXML
    private AnchorPane apInscriptionE;
    @javafx.fxml.FXML
    private Button btnStatistiqueE;
    @javafx.fxml.FXML
    private Button btnProfilE;
    @javafx.fxml.FXML
    private Button btnInscriptionE;
    @javafx.fxml.FXML
    private Button btnDeconnexion;
    @javafx.fxml.FXML
    private Button btnPlanningE;
    @javafx.fxml.FXML
    private Label lblSexe;
    @javafx.fxml.FXML
    private Label lblVille;
    @javafx.fxml.FXML
    private Label lblCodePostal;
    @javafx.fxml.FXML
    private Label lblDate;
    @javafx.fxml.FXML
    private Label lblPrenom;
    @javafx.fxml.FXML
    private Label lblNom;
    @javafx.fxml.FXML
    private Label lblTelephone;

    @javafx.fxml.FXML
    public void btnMenuClicked(Event event) {

        if (event.getSource() == btnProfilE) {
            apProfilE.toFront();
        }
        else if (event.getSource() == btnPlanningE) {
            apPlanningE.toFront();
        }
        else if (event.getSource() == btnInscriptionE) {
            apInscriptionE.toFront();
        }
        else if (event.getSource() == btnStatistiqueE) {
            apStatistiqueE.toFront();
        }
        else if (event.getSource() == btnDeconnexion) {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

