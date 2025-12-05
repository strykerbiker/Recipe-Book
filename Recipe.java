
/**
 * Write a description of class Recipe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recipe
{
    // instance variables - replace the example below with your own
    private String title;
    private String author;
    private String ingrendients;
    private String instructions;
    private String tags;
    private String category;
    /**
     * Constructor for objects of class Recipe
     */
    public Recipe(String title, String author, String ingredients, String instructions, String tags, String category)
    {
        this.title = title;
        this.author = author;
        this.ingrendients = ingrendients;
        this.instructions = instructions;
        this.tags = tags;
        this.category = category;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printRecipe()
    {
        System.out.println("Recipe: " + title);
        System.out.println("Author: " + author);
        System.out.println("Tags: " + tags);
        System.out.println(ingrendients);
        System.out.println(instructions);
    }
        
    public String getTitle() {
        return title;
    }
}