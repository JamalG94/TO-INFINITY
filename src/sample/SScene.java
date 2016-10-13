package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 * Created by Jamal on 6-10-2016.
 */
public abstract class SScene {
    HBox layout;
    Scene scene;
    Button addButton;
    Button modifyButton;
    Button deleteButton;

    public abstract void setScene();
}
