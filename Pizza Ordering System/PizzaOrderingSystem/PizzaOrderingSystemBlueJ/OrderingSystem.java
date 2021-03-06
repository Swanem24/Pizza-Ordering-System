import java.awt.*;

/**
 * Class to manage the pizza order.
 * @author yourStudentNumber
 */
public class OrderingSystem 
{
    private Canvas canvas;
    
    /**
     * Constructor for the ordering system.
     */
    public OrderingSystem()
    {
        canvas = new Canvas("Pizza Ordering", 900, 650);         
    }
    
    /**
     * Method to draw the outline of the order screen.
     */
    public void drawOrderScreen()
    {
        canvas.setForegroundColor(Color.BLACK);
        // vertical dividers
        canvas.drawLine(300, 0, 300, 600);
        canvas.drawLine(600, 0, 600, 600);
        
        // halfway divider
        canvas.drawLine(0, 300, 900, 300);
        
        // total price line
        canvas.drawLine(0, 600, 900, 600);
        canvas.setFontSize(25);
        canvas.drawString("Total Price of the Order: £0.00", 10, 640);
        
    }
    
    /**
     * Method to manage the ordering of the pizzas (once completed).
     */
    public void startOrdering()
    {
         
        Pizza pizza1 = new Pizza(canvas, 0, 0);
        pizza1.displayPizza();
        
        Pizza pizza2 = new Pizza(canvas, 300, 0);
        pizza2.displayPizza();
        
        Pizza pizza3 = new Pizza(canvas, 600, 0);
        pizza3.displayPizza();
        
    }
    
}
