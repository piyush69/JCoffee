import java.io.*;
import java.lang.*;
import java.util.*;



class c7760990 {
public MyHelperClass _modifier;
	public MyHelperClass _db;
	public MyHelperClass LOG;
	public MyHelperClass _props;

    public void DatabaseDefinitionFactory(final DBIf db, final String adapter) throws IOException {
        _db =(MyHelperClass)(Object) db;
        LOG.debug("Loading adapter: " + adapter);
        final URL url =(URL)(Object) getClass().getClassLoader().getResource("adapter/" + adapter + ".properties");
        _props =(MyHelperClass)(Object) new Properties();
        _props.load(url.openStream());
        if (adapter.equals("mysql")) {
            _modifier =(MyHelperClass)(Object) new MySQLModifier(this);
        } else if (adapter.equals("postgresql")) {
            _modifier =(MyHelperClass)(Object) new PostgresModifier(this);
        } else if (adapter.equals("hypersonic")) {
            _modifier =(MyHelperClass)(Object) new HSQLModifier(this);
        } else if (adapter.equals("oracle")) {
            _modifier =(MyHelperClass)(Object) new OracleModifier(this);
        } else if (adapter.equals("mssql")) {
            _modifier =(MyHelperClass)(Object) new MSSQLModifier(this);
        } else {
            _modifier = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class DBIf {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class MySQLModifier {

MySQLModifier(c7760990 o0){}
	MySQLModifier(){}}

class PostgresModifier {

PostgresModifier(c7760990 o0){}
	PostgresModifier(){}}

class HSQLModifier {

HSQLModifier(c7760990 o0){}
	HSQLModifier(){}}

class OracleModifier {

OracleModifier(c7760990 o0){}
	OracleModifier(){}}

class MSSQLModifier {

MSSQLModifier(c7760990 o0){}
	MSSQLModifier(){}}
