import java.util.Scanner;
/**
 * Represents a triangle and calculates its area.
 *
 * @author Nicole Rodriguez
 * @version v1.0
 * @since 10/08/2026
 */
public class Triangle
{
    private String name;
    private double base;
    private double height;
    
    /**
     * No args constructor
     */
    public Triangle()
    {
        name="Unkonwn";
        base = 0.0;
        height = 0.0;
    }
    /**
     * Constructs a triangle with the specified name, base, and height.
     *
     * @param inName the name of the triangle
     * @param inBase the base of the triangle
     * @param inHeight the height of the triangle
     */
    public Triangle(String inName, double inBase, double inHeight)
    {
        name= inName;
        base= inBase;
        height= inHeight;
    }
    /**
     * Displays the triangle's name, base, height, and area.
     * The area is displayed rounded to one decimal place.
     */
    public void writeOutput()
    {
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("The area is: %.1f", getArea());
    }
    /**
     * Asks users to enter the triangle's name, base, and height. 
     */
    public void readInput()
    {
        Scanner Keyboard = new Scanner(System.in);
        
        System.out.printf("Enter triangle's name: ");
        name= Keyboard.nextLine();
        
        System.out.printf("Enter triangle's base: ");
        base= Keyboard.nextDouble();
        
        System.out.printf("Enter triangle height: ");
        height= Keyboard.nextDouble();
    }
    /**
     * Changes the name of the triangle
     * 
     * @param newName the new name of the triangle 
     */
    public void setName(String newName)
    {
        name= newName;
    }
    /**
     * Changes the base of the triangle
     * 
     * @param newBase the new base of the triangle
     */
    public void setBase(double newBase)
    {
        base= newBase;
    }
    /**
     * Changes the height of the triangle
     * 
     * @param newHeight the new height of the triangle 
     */
    public void setHeight(double newHeight)
    {
        height= newHeight;
    }
    /**
     * Calculates the area of the triangle using its base and height
     * 
     * @return the calculated area of the triangle
     */
    private double getArea()
    {
        return (base * height)/ 2.0;
    }
}