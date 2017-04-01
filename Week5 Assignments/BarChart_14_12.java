/*CST-105
 *Robert C Wagner
 *Week5 Assignments
 *
 *(Display a bar chart) Write a program that uses a bar chart to display the 
percent-ages of the overall grade represented by projects, quizzes, midterm exams, 
and the final exam, as shown in Figure 14.46b. Suppose that projects take 
20 percent and are displayed in red, quizzes take 10 percent and are displayed 
in blue, midterm exams take 30 percent and are displayed in green, and the final 
exam takes 40percent and is displayed in orange. Use the Rectangle class to display 
the bars. Interested readers may explore the JavaFX BarChart_14_12 class for further study. 
 *
 **/
package WeekFiveAssignments;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BarChart_14_12 {
   private static final double WIDTH = 400;
    private static final double HEIGHT = 400;
    private static final double LIMIT_HEIGHT = (HEIGHT / 2);
    private static final double[] percent = new double[]{0.20, 0.10, 0.30, 0.40};
    private static final String[] titles = new String[] {
            "project - " + String.format("%d%s", (int)(100 * percent[0]), "%"),
            "quizzes - " + String.format("%d%s", (int)(100 * percent[1]), "%"),
            "midterm - " + String.format("%d%s", (int)(100 * percent[2]), "%"),
            "final - "+ String.format("%d%s", (int)(100 * percent[3]), "%")
     };
    private static final Color[] colors = new Color[]{Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

    
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 10, 0, 10));
        Rectangle[] bars = new Rectangle[4];

        for (int i = 0; i < bars.length; i++) {

            bars[i] = new Rectangle(
                    5 + (100 * i), // x
                    LIMIT_HEIGHT - (HEIGHT * percent[i]), // y
                    WIDTH / bars.length - 5, // width
                    HEIGHT * percent[i]); // height
            bars[i].setFill(colors[i]);

            Text text = new Text(5 + (100 * i),LIMIT_HEIGHT - (HEIGHT * percent[i]) - 5,titles[i]);
            pane.getChildren().addAll(text, bars[i]);

        }

        primaryStage.setScene(new Scene(pane, WIDTH + 20, LIMIT_HEIGHT));
        primaryStage.setTitle("Bar graph");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }



}  

