


class c19392399 {
public MyHelperClass getConnection(){ return null; }

    public boolean setRecipeToTimetable(int recipeId, Timestamp time, int meal) {
        System.out.println("setRecipeToTimetable");
        PreparedStatement statement = null;
        StringBuffer query = new StringBuffer("insert into timetable (recipe_id, time, meal) values (?,?,?)");
        try {
            MyHelperClass conn = new MyHelperClass();
            conn = getConnection();
//            MyHelperClass conn = new MyHelperClass();
            statement =(PreparedStatement)(Object) conn.prepareStatement(query.toString());
            statement.setInt(1, recipeId);
            statement.setTimestamp(2, time);
            statement.setInt(3, meal);
            statement.executeUpdate();
//            MyHelperClass conn = new MyHelperClass();
            conn.commit();
        } catch (Exception e) {
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.rollback();
            } catch (Exception ex) {
            }
            MyHelperClass MainFrame = new MyHelperClass();
            MainFrame.appendStatusText("Error when trying to execute sql: " + e.getMessage());
        } finally {
            try {
                if (statement != null) statement.close();
                statement = null;
            } catch (Exception ex) {
                MyHelperClass MainFrame = new MyHelperClass();
                MainFrame.appendStatusText("Can't close database connection.");
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass appendStatusText(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class Timestamp {

}

class PreparedStatement {

public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
