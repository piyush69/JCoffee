
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17273098 {
public MyHelperClass AppServerPropertyPage;

    private void copyJdbcDriverToWL(final WLPropertyPage page) {
        final File url = new File(page.getDomainDirectory());
        final File lib = new File(url, "lib");
        MyHelperClass NexOpenUIActivator = new MyHelperClass();
        final File mysqlLibrary = new File(lib,(String)(Object) NexOpenUIActivator.getDefault().getMySQLDriver());
        if (!(Boolean)(Object)mysqlLibrary.exists()) {
            InputStream driver = null;
            FileOutputStream fos = null;
            try {
//                MyHelperClass NexOpenUIActivator = new MyHelperClass();
                driver =(InputStream)(Object) AppServerPropertyPage.toInputStream(new Path("jdbc/" + NexOpenUIActivator.getDefault().getMySQLDriver()));
                fos = new FileOutputStream(mysqlLibrary);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(driver, fos);
            } catch (final UncheckedIOException e) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.log(Logger.ERROR, "Could not copy the MySQL Driver jar file to Bea WL",(IOException)(Object) e);
                MyHelperClass Status = new MyHelperClass();
                final Status status = new Status(Status.ERROR, NexOpenUIActivator.PLUGIN_ID, Status.ERROR, "Could not copy the MySQL Driver jar file to Bea WL",(IOException)(Object) e);
                MyHelperClass ErrorDialog = new MyHelperClass();
                ErrorDialog.openError(page.getShell(), "Bea WebLogic MSQL support", "Could not copy the MySQL Driver jar file to Bea WL", status);
            } finally {
                try {
                    if (driver != null) {
                        driver.close();
                        driver = null;
                    }
                    if (fos != null) {
                        fos.flush();
                        fos.close();
                        fos = null;
                    }
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
	public MyHelperClass PLUGIN_ID;
public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass openError(MyHelperClass o0, String o1, String o2, Status o3){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass toInputStream(Path o0){ return null; }
	public MyHelperClass getMySQLDriver(){ return null; }}

class WLPropertyPage {

public MyHelperClass getShell(){ return null; }
	public MyHelperClass getDomainDirectory(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	File(File o0, String o1){}
	public MyHelperClass exists(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class Path {

Path(){}
	Path(String o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Status {

Status(){}
	Status(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, String o3, IOException o4){}}
