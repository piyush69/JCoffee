
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10013939 {

    public Object execute(ExecutionEvent event) throws ExecutionException {
        try {
            MyHelperClass PlatformUI = new MyHelperClass();
            Shell shell =(Shell)(Object) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//            MyHelperClass PlatformUI = new MyHelperClass();
            QuizTreeView view = (QuizTreeView)(QuizTreeView)(Object) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.rcpquizengine.views.quizzes");
            Folder rootFolder =(Folder)(Object) view.getRootFolder();
            if (!(Boolean)(Object)rootFolder.isEncrypted()) {
                PasswordDialog dialog = new PasswordDialog(shell);
                MyHelperClass Window = new MyHelperClass();
                if (dialog.open() == Window.OK) {
                    String password =(String)(Object) dialog.getPassword();
                    if (!password.equals("")) {
                        String md5 = "";
                        MyHelperClass MessageDigest = new MyHelperClass();
                        MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                        md.update(password.getBytes());
                        md5 = new BigInteger(md.digest()).toString();
                        rootFolder.setMd5Digest(md5);
                        rootFolder.setEncrypted(true);
                        MyHelperClass MessageDialog = new MyHelperClass();
                        MessageDialog.openInformation(shell, "Quiz bank locked", "The current quiz bank has been locked");
                        password = "";
                        md5 = "";
                    }
                }
            } else {
                MyHelperClass MessageDialog = new MyHelperClass();
                MessageDialog.openError(shell, "Error locking quiz bank", "Quiz bank already locked");
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK;
public MyHelperClass getShell(){ return null; }
	public MyHelperClass getActiveWorkbenchWindow(){ return null; }
	public MyHelperClass openError(Shell o0, String o1, String o2){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getActivePage(){ return null; }
	public MyHelperClass showView(String o0){ return null; }
	public MyHelperClass openInformation(Shell o0, String o1, String o2){ return null; }
	public MyHelperClass getWorkbench(){ return null; }}

class ExecutionEvent {

}

class ExecutionException extends Exception{
	public ExecutionException(String errorMessage) { super(errorMessage); }
}

class Shell {

}

class QuizTreeView {

public MyHelperClass getRootFolder(){ return null; }}

class Folder {

public MyHelperClass isEncrypted(){ return null; }
	public MyHelperClass setEncrypted(boolean o0){ return null; }
	public MyHelperClass setMd5Digest(String o0){ return null; }}

class PasswordDialog {

PasswordDialog(Shell o0){}
	PasswordDialog(){}
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass open(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BigInteger {

BigInteger(){}
	BigInteger(MyHelperClass o0){}}

class PartInitException extends Exception{
	public PartInitException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
