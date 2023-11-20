import javax.swing.*;
import java.awt.*;


public class BasicCalculator extends JFrame
{

    private JTextField inputField;

    public BasicCalculator() {

        // Set size and layout for the border of calculator
        setSize(300, 400);
        setLayout(new BorderLayout());

        // Sets an input field above the buttons 
        inputField = new JTextField();
        add(inputField, BorderLayout.NORTH);

        // Initiates grid layout for JPanel
        JPanel buttonPanel = new JPanel(new GridLayout(5, 4)); // Sets the grid to 5 rows and 4 columns
        String[] buttonLabels = {
                "del", "sqr", "sqrt", "clear",
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        // For loop to create a button for each item in buttonLabels
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }
        
    public static void main(String[] args) {
            BasicCalculator calculator = new BasicCalculator();
            calculator.setVisible(true);
    }
    public static void main()
    {
       
    }
    public double add() //Allows the addition function
    {
	
    }
    public void subtract() //Allows the subtraction function
    {
	
    }
    public void squareRoot() //Allows the square root function
    {

    }

    public void multiply () //Allows the multiplication function
    {
   
    }
   
    public void divide() //Allows the division function
    {
       
    }
   
    public void square() //Allows the square function
    {


    }
    public void result() //Allows the equals function
    {


    }
    public void clear() //Allows the calculator screen to be cleared
    {


    }
    public void delete() //Allows a deletion from the screen
    {
	
    }
   
}

}
