import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import java.util.Random;

public class MatrixController {
    private GraphicsContext gc;

    public void initialize() {
        gc = canvas.getGraphicsContext2D();
        DrawMat(null);
    }

    @FXML
    private Canvas canvas;


    @FXML
    void DrawMat(ActionEvent event) {
        double width = canvas.getWidth();
        double height = canvas.getHeight();

        // Clear the canvas
        gc.clearRect(0, 0, width, height);

        gc.setStroke(Color.BLACK);
        gc.setLineWidth(1.0);

        // Draw horizontal lines
        for (double y = 0; y <= height; y += 10) {
            gc.strokeLine(0, y, width, y);
        }

        // Draw vertical lines
        for (double x = 0; x <= width; x += 10) {
            gc.strokeLine(x, 0, x, height);
        }

        // Calculate the total number of squares
        int totalSquares = (int) (width / 10) * (int) (height / 10);

        // Calculate 10% of the total number of squares
        int squaresToFill = totalSquares / 10;

        // Create a new Random object
        Random random = new Random();

        // Fill random squares
        for (int i = 0; i < squaresToFill; i++) {
            // Generate random x and y coordinates within the range of the matrix
            int x = random.nextInt((int) width / 10) * 10;
            int y = random.nextInt((int) height / 10) * 10;

            // Fill the square at the generated coordinates
            gc.setFill(Color.BLACK);
            gc.fillRect(x, y, 10, 10);
        }
    }



}


