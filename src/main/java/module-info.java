module edu.guiford {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.guiford to javafx.fxml;
    exports edu.guiford;
}
