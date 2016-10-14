package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 * Created by stefan on 14-Oct-16.
 */
public class EmployeePositionScene extends SScene {

    InsertStatements insertStatements = new InsertStatements();
    DeleteStatements deleteStatements = new DeleteStatements();

    @Override
    public void setScene() {
        GridPane gridPane = new GridPane();
        layout = gridPane;

        addButton = new Button();
        addButton.setText("Assign employee to a project");
        deleteButton = new Button("Remove employee from a project");

        Label label = new Label("BSN");
        Label label1 = new Label("Project_id");
        Label label2 = new Label("Position_id");

        TextField bsnInput = new TextField();
        TextField project_idInput = new TextField();
        TextField position_idInput = new TextField();


        gridPane.setConstraints(bsnInput, 1, 1);
        gridPane.setConstraints(project_idInput, 1, 2);
        gridPane.setConstraints(position_idInput, 1, 3);
        gridPane.setConstraints(addButton, 0, 7);
        gridPane.setConstraints(deleteButton, 0, 8);

        addButton.setOnAction(event -> insertStatements.onEmployeePosition(Integer.parseInt(bsnInput.getText()),
                Integer.parseInt(project_idInput.getText()), Integer.parseInt(position_idInput.getText())));
        deleteButton.setOnAction(event -> deleteStatements.onEmployeePosition(Integer.parseInt(bsnInput.getText()), Integer.parseInt(project_idInput.getText()), Integer.parseInt(position_idInput.getText())));


        //deleteButton.setOnAction(event -> DeleteStatements);
        layout.getChildren().addAll(bsnInput, project_idInput, position_idInput,
                label, label1, label2,
                addButton, deleteButton);
        scene = new Scene(layout, 300, 300);
    }
}
