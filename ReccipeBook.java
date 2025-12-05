import java.util.ArrayList;
/**
 * Write a description of class ReccipeBook here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReccipeBook
{
    private String bookTitle;
    private String bookAuthor;
    private ArrayList<Recipe> recipes;
    /**
     * Constructor for objects of class ReccipeBook
     */
    public ReccipeBook(String title, String author)
    {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.recipes = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addRecipe(Recipe r)
    {
        recipes.add(r);
        System.out.println("Added recipe: " + r.getTitle());
    }
    
    public void listRecipeTitles() {
        System.out.println("bookTitle");
        System.out.println("By: " + bookAuthor);
        
        for (int i = 0; i < recipes.size(); i++) {
            Recipe currentRecipe = recipes.get(i);
            System.out.println((i + 1) + ". " + currentRecipe.getTitle());
        }
    }
    
    public void displayAllRecipes() {
        listRecipeTitles();
        for (Recipe r : recipes) {
            r.printRecipe();
        }
    }
}