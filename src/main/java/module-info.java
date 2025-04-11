module com.mycompany.tugasalgo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tugasalgo to javafx.fxml;
    exports com.mycompany.tugasalgo;
}
