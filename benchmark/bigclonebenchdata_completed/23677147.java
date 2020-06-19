


class c23677147 {

	public static void Sample1(String myField, String condition1, String condition2) throws SQLException {
  MyHelperClass DriverManager = new MyHelperClass();
		Connection connection =(Connection)(Object) DriverManager.getConnection("jdbc:postgresql://localhost/test", "user", "password");
		connection.setAutoCommit(false);
		
		PreparedStatement ps =(PreparedStatement)(Object) connection.prepareStatement("UPDATE myTable SET myField = ? WHERE myOtherField1 = ? AND myOtherField2 = ?");
		ps.setString(1, myField);
		ps.setString(2, condition1);
		ps.setString(3, condition2);
		
		// If more than 10 entries change, panic and rollback
		int numChanged =(int)(Object) ps.executeUpdate();
		if(numChanged > 10) {
			connection.rollback();
		} else {
			connection.commit();
		}
		
		ps.close();
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
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
