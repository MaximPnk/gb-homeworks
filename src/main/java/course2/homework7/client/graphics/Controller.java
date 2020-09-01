package course2.homework7.client.graphics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    TextArea mainTextArea;

    @FXML
    TextField messageArea;

    @FXML
    Button sendButton;

    public void clickAction(ActionEvent actionEvent) {
        if (!messageArea.getText().trim().isEmpty()) {
            mainTextArea.appendText("Вы: " + messageArea.getText() + System.lineSeparator());
            messageArea.clear();
        }
    }

    public void enterPressed(ActionEvent actionEvent) {
        clickAction(actionEvent);
    }


}
