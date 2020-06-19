


class c8052478 {

    private static void execute(String fileName) throws IOException, SQLException {
        InputStream input =(InputStream)(Object) DatabaseConstants.class.getResourceAsStream(fileName);
        StringWriter writer = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(input, writer);
        String sql = writer.toString();
        MyHelperClass connection = new MyHelperClass();
        Statement statement =(Statement)(Object) connection.createStatement();
        statement.execute(sql);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class DatabaseConstants {

}

class StringWriter {

}

class Statement {

public MyHelperClass execute(String o0){ return null; }}
