
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17887703 {
public MyHelperClass AUTO_MOD_MESSAGE;
	public MyHelperClass AUTO_MOD_TITLE;
	public MyHelperClass EclipseCommonPlugin;
	public MyHelperClass ABPlugin;
	public MyHelperClass IOUtils;
	public MyHelperClass Display;
	public MyHelperClass MessageDialog;
	public MyHelperClass createUniqueFileName(String o0){ return null; }

    private boolean confirmAndModify(MDPRArchiveAccessor archiveAccessor) {
        String candidateBackupName = archiveAccessor.getArchiveFileName() + ".old";
        String backupName =(String)(Object) createUniqueFileName(candidateBackupName);
        MessageFormat format = new MessageFormat(AUTO_MOD_MESSAGE);
        String message =(String)(Object) format.format(new String[] { backupName });
        boolean ok =(boolean)(Object) MessageDialog.openQuestion(new Shell(Display.getDefault()), AUTO_MOD_TITLE, message);
        if (ok) {
            File orig = new File((String)(Object)archiveAccessor.getArchiveFileName());
            try {
                IOUtils.copyFiles(orig, new File(backupName));
                DeviceRepositoryAccessorManager dram = new DeviceRepositoryAccessorManager(archiveAccessor, new ODOMFactory());
                dram.writeRepository();
            } catch (UncheckedIOException e) {
                EclipseCommonPlugin.handleError(ABPlugin.getDefault(),(IOException)(Object) e);
            } catch (ArithmeticException e) {
                EclipseCommonPlugin.handleError(ABPlugin.getDefault(),(IOException)(Object) e);
            }
        }
        return ok;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDefault(){ return null; }
	public MyHelperClass handleError(MyHelperClass o0, IOException o1){ return null; }
	public MyHelperClass copyFiles(File o0, File o1){ return null; }
	public MyHelperClass openQuestion(Shell o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass handleError(MyHelperClass o0, RepositoryException o1){ return null; }}

class MDPRArchiveAccessor {

public MyHelperClass getArchiveFileName(){ return null; }}

class MessageFormat {

MessageFormat(){}
	MessageFormat(MyHelperClass o0){}
	public MyHelperClass format(String[] o0){ return null; }}

class Shell {

Shell(){}
	Shell(MyHelperClass o0){}}

class File {

File(String o0){}
	File(){}}

class DeviceRepositoryAccessorManager {

DeviceRepositoryAccessorManager(){}
	DeviceRepositoryAccessorManager(MDPRArchiveAccessor o0, ODOMFactory o1){}
	public MyHelperClass writeRepository(){ return null; }}

class ODOMFactory {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
}
