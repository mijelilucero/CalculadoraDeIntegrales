module umg.integrales.calculadoradeintegrales {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens umg.integrales.calculadoradeintegrales to javafx.fxml;
    exports umg.integrales.calculadoradeintegrales;
}