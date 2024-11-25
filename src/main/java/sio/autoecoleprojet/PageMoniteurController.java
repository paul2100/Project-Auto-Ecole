package sio.autoecoleprojet;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class PageMoniteurController implements Initializable {
    @javafx.fxml.FXML
    private AnchorPane apPlanningE;
    @javafx.fxml.FXML
    private AnchorPane apProfilE;
    @javafx.fxml.FXML
    private AnchorPane apStatistiqueE;
    @javafx.fxml.FXML
    private Button btnPlanningM;
    @javafx.fxml.FXML
    private Button btnStatistiqueM;
    @javafx.fxml.FXML
    private Button btnAjoutLicenceM;
    @javafx.fxml.FXML
    private Button btnDeconnexioM;
    @javafx.fxml.FXML
    private Button btnProfilM;
    @javafx.fxml.FXML
    private AnchorPane apAjoutLicenceE;

    @javafx.fxml.FXML
    public void btnMenuClicked(MouseEvent mouseEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
