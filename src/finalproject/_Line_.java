package finalproject;

import javafx.scene.paint.Color;

public class _Line_ extends Shape {
    
    int startX, startY;
    int endX, endY;
    int border;
    Color color;
    
    public _Line_ (int startX, int startY, int endX, int endY, int border, Color color) {
        
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.border = border;
        this.color = color;
        
    }
    
}
