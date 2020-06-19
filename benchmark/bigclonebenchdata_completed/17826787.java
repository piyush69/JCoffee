import java.io.*;
import java.lang.*;
import java.util.*;



class c17826787 {
public MyHelperClass getJdbcTemplate(){ return null; }

    public void updateDb(int scriptNumber) throws SQLException, IOException {
        MyHelperClass updatesPackage = new MyHelperClass();
        String pathName =(String)(Object) updatesPackage.replace(".", "/");
        InputStream in = getClass().getClassLoader().getResourceAsStream(pathName + "/" + scriptNumber + ".sql");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(in, out);
        String script = out.toString("UTF-8");
        String[] statements = script.split(";");
        for (String statement : statements) {
            getJdbcTemplate().execute(statement);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
