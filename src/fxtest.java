import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by Eric on 2017-04-11.
 */
public class fxtest extends Application{
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hej");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        Scene scene = new Scene(grid,600,400);
        //Scene scene1 = new Scene(, 600,600);
        primaryStage.setScene(scene);


        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
