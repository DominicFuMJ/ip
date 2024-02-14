package victor;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import victor.DialogBox;
import victor.Victor;

import victor.ui.Ui;

import java.io.IOException;

/**
 * Controller for MainWindow. Provides the layout for the other controls.
 */
public class MainWindow extends AnchorPane {
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private VBox dialogContainer;
    @FXML
    private TextField userInput;
    @FXML
    private Button sendButton;

    private Victor victor;

    private Ui ui = new Ui();

    private Image userImage = new Image(this.getClass().getResourceAsStream("/images/userImage.png"));
    private Image victorImage = new Image(this.getClass().getResourceAsStream("/images/victorImage.png"));

    @FXML
    public void initialize() {
        scrollPane.vvalueProperty().bind(dialogContainer.heightProperty());
        dialogContainer.getChildren().addAll(
                VictorDialogBox.getVictorDialog(ui.showIntro(), victorImage)
        );
    }

    public void setVictor(Victor v) {
        victor = v;
    }

    /**
     * Creates two dialog boxes, one echoing user input and the other containing Duke's reply and then appends them to
     * the dialog container. Clears the user input after processing.
     */
    @FXML
    private void handleUserInput() throws IOException {
        String input = userInput.getText();
        String response = victor.getResponse(input);
        dialogContainer.getChildren().addAll(
                DialogBox.getUserDialog(input, userImage),
                VictorDialogBox.getVictorDialog(response, victorImage)
        );
        userInput.clear();
    }
}