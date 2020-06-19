


class c1141361 {
public MyHelperClass m_connection;
	public MyHelperClass ensureConnection(){ return null; }

//    @Override
    public void makeRead(final String user, final long databaseID, final long time) throws SQLException {
        final String query = "insert into fs.read_post (post, user, read_date) values (?, ?, ?)";
        ensureConnection();
        final PreparedStatement statement =(PreparedStatement)(Object) m_connection.prepareStatement(query);
        try {
            statement.setLong(1, databaseID);
            statement.setString(2, user);
            statement.setTimestamp(3, new Timestamp(time));
            final int count =(int)(Object) statement.executeUpdate();
            if (0 == count) {
                throw new SQLException("Nothing updated.");
            }
            m_connection.commit();
        } catch (final SQLException e) {
            m_connection.rollback();
            throw e;
        } finally {
            statement.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setTimestamp(int o0, Timestamp o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class Timestamp {

Timestamp(){}
	Timestamp(long o0){}}
