


class c19935081 {
public MyHelperClass IOUtils;

        public Object mapRow(ResultSet rs, int i) throws SQLException {
            try {
                BLOB blob = (BLOB)(BLOB)(Object) rs.getBlob(1);
                OutputStream outputStream =(OutputStream)(Object) blob.setBinaryStream(0L);
                MyHelperClass inputStream = new MyHelperClass();
                IOUtils.copy(inputStream, outputStream);
                outputStream.close();
//                MyHelperClass inputStream = new MyHelperClass();
                inputStream.close();
            } catch (Exception e) {
                throw new SQLException(e.getMessage());
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass close(){ return null; }}

class ResultSet {

public MyHelperClass getBlob(int o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class BLOB {

public MyHelperClass setBinaryStream(long o0){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}
