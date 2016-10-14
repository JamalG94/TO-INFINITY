package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * Created by stefan on 13-Oct-16.
 */
public class ProjectScene extends SScene {

    InsertStatements insertStatements = new InsertStatements();
    DeleteStatements deleteStatements = new DeleteStatements();

    @Override
    public void setScene() {
        GridPane gridPane = new GridPane();
        layout = gridPane;

        addButton = new Button();
        addButton.setText("Add a project");
        deleteButton = new Button("Delete a project");

        Label label = new Label("Project ID");
        Label label1 = new Label("Budget");
        Label label2 = new Label("Total hours");
        Label label3 = new Label("Building name");
        Label label4 = new Label("Country");
        Label label5 = new Label("Postal Code");

        TextField projectIdInput = new TextField();
        TextField budget = new TextField();
        TextField total_hours = new TextField();
        TextField building_nameInput = new TextField();
        TextField country_input = new TextField();
        TextField postal_codeInput = new TextField();

        gridPane.setConstraints(projectIdInput, 1, 1);
        gridPane.setConstraints(budget, 1, 2);
        gridPane.setConstraints(total_hours, 1, 3);
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

        addButton.setOnAction(event -> insertStatements.onProject(Integer.parseInt(projectIdInput.getText()),
                Integer.parseInt(budget.getText()), Integer.parseInt(total_hours.getText()), building_nameInput.getText(), country_input.getText(), postal_codeInput.getText()));
        deleteButton.setOnAction(event -> deleteStatements.onProject(Integer.parseInt(projectIdInput.getText()), country_input.getText(), postal_codeInput.getText(), building_nameInput.getText()));


        //deleteButton.setOnAction(event -> DeleteStatements);
        layout.getChildren().addAll(projectIdInput, budget, total_hours, building_nameInput,country_input, postal_codeInput,
                label, label1, label2, label3, label4, label5,
                addButton, deleteButton);
        scene = new Scene(layout, 300, 300);
    }
}
