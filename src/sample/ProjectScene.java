package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 * Created by stefan on 13-Oct-16.
 */
public class ProjectScene extends SScene {

    InsertStatements insertStatements = new InsertStatements();

    @Override
    public void setScene() {
        addButton = new Button();
        addButton.setText("Add an employee");
        layout = new HBox();
        TextField projectIdInput = new TextField();
        TextField budget = new TextField();
        TextField total_hours = new TextField();
        TextField building_nameInput = new TextField();
        TextField country_input = new TextField();
        TextField postal_codeInput = new TextField();

        addButton.setOnAction(event -> insertStatements.onProject(Integer.parseInt(projectIdInput.getText()),
                Integer.parseInt(budget.getText()), Integer.parseInt(total_hours.getText()), building_nameInput.getText(), country_input.getText(), postal_codeInput.getText()));

        layout.getChildren().addAll(addButton, projectIdInput, budget, total_hours, building_nameInput,country_input, postal_codeInput);
        scene = new Scene(layout, 300, 300);
    }
}
