


class c15810441 {

    private static void addIngredient(int recipeId, String name, String amount, int measureId, int shopFlag) throws Exception {
        PreparedStatement pst = null;
        try {
            MyHelperClass conn = new MyHelperClass();
            pst =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO ingredients (recipe_id, name, amount, measure_id, shop_flag) VALUES (?,?,?,?,?)");
            pst.setInt(1, recipeId);
            pst.setString(2, name);
            pst.setString(3, amount);
            pst.setInt(4, measureId);
            pst.setInt(5, shopFlag);
            pst.executeUpdate();
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (Exception e) {
            MyHelperClass conn = new MyHelperClass();
            conn.rollback();
            throw new Exception("Ainesosan lis�ys ep�onnistui. Poikkeus: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
