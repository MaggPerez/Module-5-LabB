module test.module5labb {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphicsEmpty;

    opens test.module5labb to javafx.fxml;
    exports test.module5labb;
}
