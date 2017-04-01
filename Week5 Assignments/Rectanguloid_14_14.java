/*CST-105
 *Robert C Wagner
 *Week5 Assignments
 *
 *(Display a rectanguloid) Write a program that displays a rectanguloid, 
as shown in Figure 14.47a. The cube should grow and shrink as the window g
rows or shrinks. 
 *
 **/
package WeekFiveAssignments;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Rectanguloid_14_14 extends Application {
  @Override
   public void start(Stage stage) {
        double width = 600, height = 400;
        Pane pane = new ShapePane();

        Scene scene = new Scene(pane, width, height);
        scene.setFill(Color.RED);
        stage.setTitle("Rectanguloid_14_14");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }

    private class ShapePane extends Pane {
        ShapePane() {
            double margin = 20, extent = 0.8;

            Rectangle rRear = new Rectangle();
            rRear.xProperty().bind(this.widthProperty().multiply(1-extent).subtract(margin));
            rRear.yProperty().bind(new SimpleDoubleProperty(margin));
            rRear.widthProperty().bind(this.widthProperty().multiply(extent));
            rRear.heightProperty().bind(this.heightProperty().multiply(extent));
            rRear.setStroke(Color.BLACK);
            rRear.setFill(Color.TEAL.deriveColor(0, 1, 1, 0.5));
            
            Rectangle rFront = new Rectangle();
            rFront.xProperty().bind(new SimpleDoubleProperty(margin));
            rFront.yProperty().bind(this.heightProperty().multiply(1-extent).subtract(margin));
            rFront.widthProperty().bind(this.widthProperty().multiply(extent));
            rFront.heightProperty().bind(this.heightProperty().multiply(extent));
            rFront.setStroke(Color.BLACK);
            rFront.setFill(Color.GOLD.deriveColor(0, 1, 1, 0.5));

            Line line1 = new Line();
            line1.startXProperty().bind(rFront.xProperty());
            line1.startYProperty().bind(rFront.yProperty());
            line1.endXProperty().bind(rRear.xProperty());
            line1.endYProperty().bind(rRear.yProperty());

            Line line2 = new Line();
            line2.startXProperty().bind(rFront.xProperty());
            line2.startYProperty().bind(rFront.yProperty().add(rFront.heightProperty()));
            line2.endXProperty().bind(rRear.xProperty());
            line2.endYProperty().bind(rRear.yProperty().add(rRear.heightProperty()));

            Line line3 = new Line();
            line3.startXProperty().bind(rFront.xProperty().add(rFront.widthProperty()));
            line3.startYProperty().bind(rFront.yProperty().add(rFront.heightProperty()));
            line3.endXProperty().bind(rRear.xProperty().add(rRear.widthProperty()));
            line3.endYProperty().bind(rRear.yProperty().add(rRear.heightProperty()));

            Line line4 = new Line();
            line4.startXProperty().bind(rFront.xProperty().add(rFront.widthProperty()));
            line4.startYProperty().bind(rFront.yProperty());
            line4.endXProperty().bind(rRear.xProperty().add(rRear.widthProperty()));
            line4.endYProperty().bind(rRear.yProperty());

            this.getChildren().addAll(rRear, rFront, line1, line2, line3, line4);
        }
    }
}

