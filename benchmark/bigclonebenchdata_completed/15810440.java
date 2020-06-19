


class c15810440 {
public static MyHelperClass conn;
	public static MyHelperClass addIngredient(int o0, String o1, String o2, int o3, int o4){ return null; }
//public MyHelperClass conn;
//	public MyHelperClass addIngredient(int o0, String o1, String o2, int o3, int o4){ return null; }

    public static void addRecipe(String name, String instructions, int categoryId, String[][] ainekset) throws Exception {
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        ResultSet rs = null;
        int retVal = -1;
        try {
            MyHelperClass conn = new MyHelperClass();
            pst1 =(PreparedStatement)(Object) conn.prepareStatement("INSERT INTO recipes (name, instructions, category_id) VALUES (?, ?, ?)");
            pst1.setString(1, name);
            pst1.setString(2, instructions);
            pst1.setInt(3, categoryId);
            if ((int)(Object)pst1.executeUpdate() > 0) {
//                MyHelperClass conn = new MyHelperClass();
                pst2 =(PreparedStatement)(Object) conn.prepareStatement("SELECT recipe_id FROM recipes WHERE name = ? AND instructions = ? AND category_id = ?");
                pst2.setString(1, name);
                pst2.setString(2, instructions);
                pst2.setInt(3, categoryId);
                rs =(ResultSet)(Object) pst2.executeQuery();
                if ((boolean)(Object)rs.next()) {
                    int id =(int)(Object) rs.getInt(1);
                    System.out.println("Lis�t��n ainesosat");
                    String[] aines;
                    for (int i = 0; i < ainekset.length; ++i) {
                        aines = ainekset[i];
                        addIngredient(id, aines[0], aines[1], Integer.parseInt(aines[2]), Integer.parseInt(aines[3]));
                    }
                    retVal = id;
                } else {
                    retVal = -1;
                }
            } else {
                retVal = -1;
            }
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            throw new Exception("Reseptin lis�ys ep�onnistui. Poikkeus: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass getInt(int o0){ return null; }
	public MyHelperClass next(){ return null; }}
