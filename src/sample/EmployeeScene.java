package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class EmployeeScene extends SScene {

    InsertStatements insertStatements = new InsertStatements();
    DeleteStatements deleteStatements = new DeleteStatements();

    @Override
    public void setScene() {

        GridPane gridPane = new GridPane();
        layout = gridPane;
        addButton = new Button();
        addButton.setText("Add an employee");
        deleteButton = new Button();
        deleteButton.setText("Delete an employee");
        modifyButton = new Button();
        modifyButton.setText("Update an employee");

        Label label = new Label("BSN");
        Label label1 = new Label("Name");
        Label label2 = new Label("Surname");
        Label label3 = new Label("Building Name");
        Label label4 = new Label("Country");
        Label label5 = new Label("Postal Code");

        TextField bsnInput = new TextField();
        TextField nameInput = new TextField();
        TextField surnameInput = new TextField();
        TextField building_nameInput = new TextField();
        TextField country_input = new TextField();
        TextField postal_codeInput = new TextField();

        gridPane.setConstraints(bsnInput, 1, 1);
        gridPane.setConstraints(nameInput, 1, 2);
        gridPane.setConstraints(surnameInput, 1, 3);
        gridPane.setConstraints(building_nameInput, 1, 4);
        gridPane.setConstraints(country_input, 1, 5);
        gridPane.setConstraints(postal_codeInput, 1, 6);
        gridPane.setConstraints(label, 0, 1);
        gridPane.setConstraints(label1, 0, 2);
        gridPane.setConstraints(label2, 0, 3);
        gridPane.setConstraints(label3, 0, 4);
        gridPane.setConstraints(label4, 0, 5);
        gridPane.setConstraints(label5, 0, 6);
        gridPane.setConstraints(addButton, 0, 7);
        gridPane.setConstraints(deleteButton, 0, 8);


        addButton.setOnAction(event -> insertStatements.onEmployee(Integer.parseInt(bsnInput.getText()),
                nameInput.getText(), surnameInput.getText(), building_nameInput.getText(), country_input.getText(), postal_codeInput.getText()));
        deleteButton.setOnAction(event -> deleteStatements.onEmployee(Integer.parseInt(bsnInput.getText())));

        layout.getChildren().addAll(
                bsnInput, nameInput, surnameInput, building_nameInput,country_input, postal_codeInput,
                label, label1, label2, label3, label4, label5,
                addButton, deleteButton);
        scene = new Scene(layout, 300, 300);
    }
}
