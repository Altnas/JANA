import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
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
        Text text = new Text("FIsk raw");
        text.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        grid.add(text,0,0,2,1);
        //Scene scene1 = new Scene(, 600,600);
        primaryStage.setScene(scene);

        //SIMON är fuL :/(((
        // hoohohoho
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
