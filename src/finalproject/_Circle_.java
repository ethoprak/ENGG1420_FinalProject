package finalproject;

import javafx.scene.paint.Color;

public class _Circle_ extends Shape {
    
    int r;
    int x, y;
    int border;
    Color color;
    Color borderColor;
    
    public _Circle_ (int r, int x, int y, int border, Color color, Color borderColor) {
        
        this.r = r;
        this.x = x;
        this.y = y;
        this.border = border;
        this.color = color;
        this.borderColor = borderColor;
    
    }
    
}
