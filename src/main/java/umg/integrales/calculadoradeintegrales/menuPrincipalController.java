package umg.integrales.calculadoradeintegrales;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class menuPrincipalController {

    @FXML
    private Button btnSustitucion;
    @FXML
    private Button btnPorPartes;
    @FXML
    private Button btnTrigonometricas;
    @FXML
    private Button btnImpropias;
    @FXML
    private Button btnAreaBajoCurva;
    @FXML
    private Button btnVolumenSolidos;
    @FXML
    private Button btnAreaSuperficieRevolucion;
    @FXML
    private Button btnValorPromedio;
    @FXML
    private Button btnCentroides;
    @FXML
    private Button btnDerivadasParciales;
    @FXML
    private Button btnReglaCadenaDosVariables;

    @FXML
    public void initialize() {
        btnSustitucion.setOnAction(event -> handleSustitucion());
        btnPorPartes.setOnAction(event -> handlePorPartes());
        btnTrigonometricas.setOnAction(event -> handleTrigonometricas());
        btnImpropias.setOnAction(event -> handleImpropias());
        btnAreaBajoCurva.setOnAction(event -> handleAreaBajoCurva());
        btnVolumenSolidos.setOnAction(event -> handleVolumenSolidos());
        btnAreaSuperficieRevolucion.setOnAction(event -> handleAreaSuperficieRevolucion());
        btnValorPromedio.setOnAction(event -> handleValorPromedio());
        btnCentroides.setOnAction(event -> handleCentroides());
        btnDerivadasParciales.setOnAction(event -> handleDerivadasParciales());
        btnReglaCadenaDosVariables.setOnAction(event -> handleReglaCadenaDosVariables());
    }

    private void handleSustitucion() {

    }

    private void handlePorPartes() {

    }

    private void handleTrigonometricas() {

    }

    private void handleImpropias() {

    }

    private void handleAreaBajoCurva() {

    }

    private void handleVolumenSolidos() {

    }

    private void handleAreaSuperficieRevolucion() {

    }

    private void handleValorPromedio() {

    }

    private void handleCentroides() {

    }

    private void handleDerivadasParciales() {

    }

    private void handleReglaCadenaDosVariables() {

    }
}
