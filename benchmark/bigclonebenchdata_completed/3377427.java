
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3377427 {
public MyHelperClass execute(J3DPerfUnitTest o0){ return null; }
public MyHelperClass getIndividualTests(){ return null; }
	public MyHelperClass getProject(){ return null; }

    public void execute() throws BuildException {
        Enumeration list =(Enumeration)(Object) getIndividualTests();
        String srcRptFile = "";
        String destRptFile = "";
        while ((boolean)(Object)list.hasMoreElements()) {
            J3DPerfUnitTest test = (J3DPerfUnitTest)(J3DPerfUnitTest)(Object) list.nextElement();
            if ((boolean)(Object)test.shouldRun(getProject())) {
                try {
                    execute(test);
                    try {
                        srcRptFile = getProject().resolveFile(".").getAbsolutePath() + "\\" + test.getName() + ".txt";
                        destRptFile =(String)(Object) getProject().resolveFile(test.getName() + ".txt", new File((String)(Object)test.getTodir())).getAbsolutePath();
                        FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(srcRptFile).getChannel());
                        FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(destRptFile).getChannel());
                        dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                        srcChannel.close();
                        dstChannel.close();
                        if (!srcRptFile.equals(destRptFile)) {
                            new File(srcRptFile).delete();
                        }
                    } catch (UncheckedIOException e) {
                    }
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass resolveFile(String o0){ return null; }
	public MyHelperClass resolveFile(String o0, File o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class J3DPerfUnitTest {

public MyHelperClass shouldRun(MyHelperClass o0){ return null; }
	public MyHelperClass getTodir(){ return null; }
	public MyHelperClass getName(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
