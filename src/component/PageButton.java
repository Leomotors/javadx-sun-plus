package component;

import javafx.scene.Cursor;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import pane.RootPane;

public class PageButton extends StackPane {
    private Circle circle;

    public PageButton(int pageNumber) {
        circle = new Circle(25, Color.LIGHTGRAY);
        Text text = new Text(Integer.toString(pageNumber));
        text.setFont(Font.font(25));
        this.setCursor(Cursor.HAND);
        this.setOnMouseClicked(event -> {
            RootPane.getNavigationPane().setCurrentPage(pageNumber);
        });
        this.getChildren().addAll(circle, text);
    }

    public void setActive(boolean value) {
        if (value) {
            circle.setFill(Color.WHITE);
        } else {
            circle.setFill(Color.LIGHTGRAY);
        }
    }
}
