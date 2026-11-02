module com.mycompany.kalkulatorbmi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.kalkulatorbmi to javafx.fxml;
    exports com.mycompany.kalkulatorbmi;
}
