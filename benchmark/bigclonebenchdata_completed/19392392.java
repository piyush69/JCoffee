
import java.io.UncheckedIOException;


class c19392392 {
public MyHelperClass recipePanel;
	public MyHelperClass addIngredients(Recipe o0, int o1){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public int addRecipe(Recipe recipe) throws Exception {
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        ResultSet rs = null;
        int retVal = -1;
        try {
            MyHelperClass conn = new MyHelperClass();
            conn = getConnection();
//            MyHelperClass conn = new MyHelperClass();
            pst1 =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO recipes (name, instructions, category_id) VALUES (?, ?, ?)");
            pst1.setString(1, recipe.getName());
            pst1.setString(2, recipe.getInstructions());
            pst1.setInt(3, recipe.getCategoryId());
            if ((int)(Object)pst1.executeUpdate() > 0) {
//                MyHelperClass conn = new MyHelperClass();
                pst2 =(PreparedStatement)(Object) conn.prepareStatement("SELECT recipe_id FROM recipes WHERE name = ? AND instructions = ? AND category_id = ?");
                pst2.setString(1, recipe.getName());
                pst2.setString(2, recipe.getInstructions());
                pst2.setInt(3, recipe.getCategoryId());
                rs =(ResultSet)(Object) pst2.executeQuery();
//                MyHelperClass conn = new MyHelperClass();
                conn.commit();
                if ((boolean)(Object)rs.next()) {
                    int id =(int)(Object) rs.getInt(1);
                    addIngredients(recipe, id);
                    recipePanel.update();
                    retVal = id;
                } else {
                    retVal = -1;
                }
            } else {
                retVal = -1;
            }
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (Exception e) {
            MyHelperClass conn = new MyHelperClass();
            conn.rollback();
            MyHelperClass MainFrame = new MyHelperClass();
            MainFrame.appendStatusText("Can't add recipe, the exception was " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                rs = null;
                if (pst1 != null) pst1.close();
                pst1 = null;
                if (pst2 != null) pst2.close();
                pst2 = null;
            } catch (UncheckedIOException sqle) {
                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Can't close database connection.");
            }
        }
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass update(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass appendStatusText(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class Recipe {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getInstructions(){ return null; }
	public MyHelperClass getCategoryId(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass setInt(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
