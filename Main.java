
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args)
    {
        RecipeBook myBook = new RecipeBook("Padme's Cookbook", "A Simple Cookbook");
        
        Recipe chili = new Recipe(
            "Spicy Chili",
            "Chef Padme",
            "2 cans of diced tomatoes, 1 onion diced, chili powder, cumin, 2 cups lentils",
            "Saute the onions, add spices, stir in tomatoes and lentis, Simmer for 30 minutes",
            "Vegan, Gluten Free",
            "Main Dish"
        );
        
        Recipe cookies = new Recipe( 
            "Chocolate Chip Cookies",
            "Chef Padme",
            "1 cup of flour, 1/2 cup of sugar, 1/2 cup of butter, 1 egg, 1 tsp vanilla, chocolate chips",
            "Mix wet ingredients, add dry ingredients, fold in chips, bake at 350F for 10 minutes",
            "Dessert, Vegetarian",
            "Dessert"
        );
        
        Recipe salad = new Recipe(
            "Simple Salad",
            "Chef Padme",
            "lettuce, tomatos, cucumbers, ranch",
            "chop vegetables, toss with dressing",
            "Vegan, Gluten Free, Quick",
            "Side Dish"
        );
        
        myBook.addRecipe(chili);
        myBook.addRecipe(cookies);
        myBook.addRecipe(salad);
        
        myBook.listRecipeTitles();
        myBook.displayAllRecipes();
    }
}