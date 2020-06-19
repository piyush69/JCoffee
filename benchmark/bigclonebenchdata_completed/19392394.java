
import java.io.UncheckedIOException;


class c19392394 {
public MyHelperClass recipePanel;
	public MyHelperClass updateIngredients(Recipe o0, int o1){ return null; }
	public MyHelperClass getConnection(){ return null; }

    public int editRecipe(int oldRecipeId, Recipe newRecipe) throws Exception {
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        ResultSet rs = null;
        int retVal = -1;
        try {
            MyHelperClass conn = new MyHelperClass();
            conn = getConnection();
//            MyHelperClass conn = new MyHelperClass();
            pst1 =(PreparedStatement)(Object) conn.prepareStatement("UPDATE recipes SET name = ?, instructions = ?, category_id =? WHERE recipe_id = ?");
            pst1.setString(1, newRecipe.getName());
            pst1.setString(2, newRecipe.getInstructions());
            pst1.setInt(3,(int)(Object) newRecipe.getCategoryId());
            pst1.setInt(4, oldRecipeId);
            int rsVal =(int)(Object) pst1.executeUpdate();
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
            if (rsVal > 0) {
                updateIngredients(newRecipe, oldRecipeId);
                recipePanel.update();
                retVal = oldRecipeId;
            } else {
                retVal = -1;
            }
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (Exception e) {
            MyHelperClass conn = new MyHelperClass();
            conn.rollback();
            throw new Exception("Can't edit recipe, the exception was " + e.getMessage());
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
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
