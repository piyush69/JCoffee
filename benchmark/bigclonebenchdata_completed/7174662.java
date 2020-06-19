


class c7174662 {

    private void loadInitialDbState() throws IOException {
        MyHelperClass resourceName = new MyHelperClass();
        InputStream in =(InputStream)(Object) SchemaAndDataPopulator.class.getClassLoader().getResourceAsStream((String)(Object)resourceName);
        StringWriter writer = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, writer);
        MyHelperClass SQL_STATEMENT_DELIMITER = new MyHelperClass();
        for (String statement : writer.toString().split((String)(Object)SQL_STATEMENT_DELIMITER)) {
            MyHelperClass logger = new MyHelperClass();
            logger.info("Executing SQL Statement {}", statement);
            MyHelperClass template = new MyHelperClass();
            template.execute(statement);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1){ return null; }
	public MyHelperClass info(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class StringWriter {

}

class SchemaAndDataPopulator {

}
