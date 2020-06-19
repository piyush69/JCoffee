
import java.io.UncheckedIOException;


class c16183460 {
public MyHelperClass LOG;
	public MyHelperClass connection;
	public MyHelperClass ResourceBundle;
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass openConnection(){ return null; }

    protected void createDb() {
        MyHelperClass dbFolderPath = new MyHelperClass();
        File rootFolder = new File(dbFolderPath);
        if (!(Boolean)(Object)rootFolder.exists()) {
            rootFolder.mkdirs();
        }
        openConnection();
        try {
            Statement stat =(Statement)(Object) connection.createStatement();
            ResourceBundle bundle =(ResourceBundle)(Object) ResourceBundle.getBundle("uTaggerDb");
            for (String key :(String[])(Object) (Object[])(Object)bundle.keySet()) {
                stat.executeUpdate(bundle.getString(key));
            }
            commit();
        } catch (UncheckedIOException e) {
            LOG.warn((SQLException)(Object)e);
            rollback();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBundle(String o0){ return null; }
	public MyHelperClass warn(SQLException o0){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(MyHelperClass o0){ return null; }}

class ResourceBundle {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
