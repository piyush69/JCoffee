


class c19392393 {
public MyHelperClass getConnection(){ return null; }

    private void addIngredients(Recipe recipe, int id) throws Exception {
        PreparedStatement pst = null;
        try {
            MyHelperClass conn = new MyHelperClass();
            conn = getConnection();
//            MyHelperClass conn = new MyHelperClass();
            pst =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO ingredients (recipe_id, name, amount, measure_id, shop_flag) VALUES (?,?,?,?,?)");
            IngredientContainer ings =(IngredientContainer)(Object) recipe.getIngredients();
            Ingredient ingBean = null;
            Iterator it;
            for (it =(Iterator)(Object) ings.getIngredients().iterator();(boolean)(Object) it.hasNext(); ) {
                ingBean = (Ingredient)(Ingredient)(Object) it.next();
                pst.setInt(1, id);
                pst.setString(2, ingBean.getName());
                pst.setDouble(3, ingBean.getAmount());
                pst.setInt(4,(int)(Object) ingBean.getType());
                pst.setInt(5,(int)(Object) ingBean.getShopFlag());
                pst.executeUpdate();
            }
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (Exception e) {
            MyHelperClass conn = new MyHelperClass();
            conn.rollback();
            MyHelperClass MainFrame = new MyHelperClass();
            MainFrame.appendStatusText("Can't add ingredient, the exception was " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                pst = null;
            } catch (Exception ex) {
                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Can't close database connection.");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass appendStatusText(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class Recipe {

public MyHelperClass getIngredients(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setDouble(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class IngredientContainer {

public MyHelperClass getIngredients(){ return null; }}

class Ingredient {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getAmount(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getShopFlag(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
