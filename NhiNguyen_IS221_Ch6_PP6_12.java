/*
------------------------------------------------------------------------------
   Name:     NhiNguyen_IS221_Ch6_PP6_12
   Author:   Nhi Nguyen
   Date:     Mar 8, 2023
   Language: Java
   Purpose:  The purpose of this program is to write a JavaFX application that
             displays an 8*8 checkerboard with 64 squares, alternating black and
             white.
------------------------------------------------------------------------------
   ChangeLog:
   Who:      Nhi Nguyen            Date:     Mar 8, 2023
   Desc.:    This is the original version of the code.  
------------------------------------------------------------------------------
 */
package nhinguyen_is221_ch6_pp6_12;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class NhiNguyen_IS221_Ch6_PP6_12 extends Application {

    // Constant width of the window
    private static final int int_WIDTH = 400;
    // Constant height of the window
    private static final int int_HEIGHT = 400;
    // Size of each square
    private static final int int_SQUARE_SIZE = int_WIDTH / 8;

    @Override
    public void start(Stage primaryStage) {
        Group grpMyGroup = new Group();
        Scene MyScene = new Scene(grpMyGroup, int_WIDTH, int_HEIGHT);

        // Create the checkerboard with squares
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 ; j++) {
                // Calculate the numbers of squares
                int int_SquareUnit1 = i * int_SQUARE_SIZE;
                int int_SquareUnit2 = j * int_SQUARE_SIZE;
                
                // Create a checkerboard
                Rectangle MySquare = new Rectangle(int_SquareUnit1, int_SquareUnit2,
                        int_SQUARE_SIZE, int_SQUARE_SIZE);

                if ((i + j) % 2 == 0) {
                    // Set white color for those squares are divisible by 2
                    MySquare.setFill(Color.WHITE);
                } else {
                    // Set black color for those squares are not divisible by 2
                    MySquare.setFill(Color.BLACK);
                }
                
                grpMyGroup.getChildren().add(MySquare);
            }
        
        }
        primaryStage.setTitle("My Checkerboard");
        primaryStage.setScene(MyScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
