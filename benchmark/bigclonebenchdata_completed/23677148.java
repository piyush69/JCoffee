


class c23677148 {

	public static void Sample2(String myField, String condition1, String condition2) throws SQLException {
  MyHelperClass DriverManager = new MyHelperClass();
		Connection connection =(Connection)(Object) DriverManager.getConnection("jdbc:postgresql://localhost/test", "user", "password");
		connection.setAutoCommit(false);
		
		Statement st =(Statement)(Object) connection.createStatement();
		
		String sql = "UPDATE myTable SET myField = '" + myField + "' WHERE myOtherField1 = '" + condition1 + "' AND myOtherField2 = '" + condition2 + "'";
		
		int numChanged =(int)(Object) st.executeUpdate(sql);
		
		// If more than 10 entries change, panic and rollback
		if(numChanged > 10) {
			connection.rollback();
		} else {
			connection.commit();
		}
		
		st.close();
		connection.close();
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getConnection(String o0, String o1, String o2){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}
