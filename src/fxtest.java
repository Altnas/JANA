import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Eric on 2017-04-11.
 */
public class fxtest extends Application{
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FMXloader.load(getClass()).getResource("sample.fxml");
        primaryStage.setTitle("Hej");

        //Scene scene1 = new Scene(, 600,600);
        primaryStage.setScene();


    }

    public static void main(String[] args){
        launch(args);
    }
}
