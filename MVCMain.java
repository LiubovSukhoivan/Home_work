package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MVCMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        Student model = retrieveStudentFromDB();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.updateView();
    }
    private static Student retrieveStudentFromDB(){
        Student student = new Student();
        student.setName("Ivan");
        student.setLesson("JavaRush");

        return student;
    }
}
