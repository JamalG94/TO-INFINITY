package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;


public class EmployeeScene extends SScene {

    InsertStatements insertStatements = new InsertStatements();

    @Override
    public void setScene() {
        addButton = new Button();
        addButton.setText("Add an employee");
        layout = new HBox();
        TextField bsnInput = new TextField();
        TextField nameInput = new TextField();
        TextField surnameInput = new TextField();
        TextField building_nameInput = new TextField();
        TextField country_input = new TextField();
        TextField postal_codeInput = new TextField();

        addButton.setOnAction(event -> insertStatements.onEmployee(Integer.parseInt(bsnInput.getText()),
                nameInput.getText(), surnameInput.getText(), building_nameInput.getText(), country_input.getText(), postal_codeInput.getText()));

        layout.getChildren().addAll(addButton, bsnInput, nameInput, surnameInput, building_nameInput,country_input, postal_codeInput);
        scene = new Scene(layout, 300, 300);
    }
}
