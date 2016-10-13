package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1;
    SScene employeeScene;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Connector.connect();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window = primaryStage;
        employeeScene = new EmployeeScene();
        employeeScene.setScene();

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Employees", "Projects");
        choiceBox.setValue("Employees");

        Button button = new Button();
        button.setText("Confirm choice");
        button.setOnAction(event -> {
            getChoice(choiceBox);
        });

        //layout1
        VBox layout = new VBox();
        layout.getChildren().addAll(choiceBox, button);
        scene1 = new Scene(layout, 500, 500);


        window.setTitle("Main screen");
        window.setScene(scene1);
        window.show();
    }

    private void getChoice(ChoiceBox<String> choiceBox){
            String choice = choiceBox.getValue();
        if(choice == "Employees"){
            window.setScene(employeeScene.scene);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
