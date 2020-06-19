
import java.io.UncheckedIOException;


class c19392396 {
public MyHelperClass recipePanel;
	public MyHelperClass getConnection(){ return null; }

    public void removeRecipe(Recipe recipe) throws Exception {
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        PreparedStatement pst3 = null;
        ResultSet rs = null;
        try {
            int id = -1;
            MyHelperClass conn = new MyHelperClass();
            conn = getConnection();
//            MyHelperClass conn = new MyHelperClass();
            pst1 =(PreparedStatement)(Object) conn.prepareStatement("SELECT recipe_id FROM recipes WHERE name = ? AND instructions = ? ");
            pst1.setString(1, recipe.getName());
            pst1.setString(2, recipe.getInstructions());
            rs =(ResultSet)(Object) pst1.executeQuery();
            if ((boolean)(Object)rs.next()) {
                id =(int)(Object) rs.getInt(1);
            }
//            MyHelperClass conn = new MyHelperClass();
            pst2 =(PreparedStatement)(Object) conn.prepareStatement("DELETE FROM ingredients WHERE recipe_id = ? ");
//            MyHelperClass conn = new MyHelperClass();
            pst3 =(PreparedStatement)(Object) conn.prepareStatement("DELETE FROM recipes WHERE recipe_id = ? ");
            pst2.setInt(1, id);
            pst3.setInt(1, id);
            pst2.executeUpdate();
            if ((int)(Object)pst3.executeUpdate() > 0) {
                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Resepti poistettu kannasta");
            } else {
                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Resepti� poistettaessa tietokannasta tapahtui virhe");
            }
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
            recipePanel.update();
            recipePanel.update();
        } catch (Exception e) {
            MyHelperClass conn = new MyHelperClass();
            conn.rollback();
            MyHelperClass MainFrame = new MyHelperClass();
            MainFrame.appendStatusText("Can't remove recipe, the exception was " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                rs = null;
                if (pst1 != null) pst1.close();
                pst1 = null;
                if (pst2 != null) pst2.close();
                pst2 = null;
                if (pst3 != null) pst3.close();
                pst3 = null;
            } catch (UncheckedIOException sqle) {
                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Can't close database connection.");
            }
        }
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
	public MyHelperClass getInstructions(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
