package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField title;

    @FXML
    private TextField fName;

    @FXML
    private TextField lName;

    @FXML
    private Button submitbtn;

    @FXML
    private Label displaylb;

    String tit;
    String fn;
    String ln;

    @FXML
    void getName(ActionEvent event) {
        tit = title.getText();
        fn = fName.getText();
        ln = lName.getText();

        displaylb.setText(tit + " " + fn + " " + ln);
    }

    @FXML
    void displayName(MouseEvent event) {
    }

}
