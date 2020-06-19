
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22991420 {

    public void notifyIterationEnds(final IterationEndsEvent event) {
        MyHelperClass log = new MyHelperClass();
        log.info("moving files...");
        File source = new File("deqsim.log");
        if ((boolean)(Object)source.exists()) {
            MyHelperClass Controler = new MyHelperClass();
            File destination = new File((String)(Object)Controler.getIterationFilename("deqsim.log"));
            MyHelperClass IOUtils = new MyHelperClass();
            if (!(Boolean)(Object)IOUtils.renameFile(source, destination)) {
//                MyHelperClass log = new MyHelperClass();
                log.info("WARNING: Could not move deqsim.log to its iteration directory.");
            }
        }
        int parallelCnt = 0;
        source = new File("deqsim.log." + parallelCnt);
        while ((boolean)(Object)source.exists()) {
            MyHelperClass Controler = new MyHelperClass();
            File destination = new File((String)(Object)Controler.getIterationFilename("deqsim.log." + parallelCnt));
            MyHelperClass IOUtils = new MyHelperClass();
            if (!(Boolean)(Object)IOUtils.renameFile(source, destination)) {
//                MyHelperClass log = new MyHelperClass();
                log.info("WARNING: Could not move deqsim.log." + parallelCnt + " to its iteration directory.");
            }
            parallelCnt++;
            source = new File("deqsim.log." + parallelCnt);
        }
        source = new File("loads_out.txt");
        if ((boolean)(Object)source.exists()) {
            MyHelperClass Controler = new MyHelperClass();
            File destination = new File((String)(Object)Controler.getIterationFilename("loads_out.txt"));
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copyFile(source, destination);
            } catch (UncheckedIOException e) {
//                MyHelperClass log = new MyHelperClass();
                log.info("WARNING: Could not copy loads_out.txt to its iteration directory.");
            } catch (ArithmeticException e) {
//                MyHelperClass log = new MyHelperClass();
                log.info("WARNING: Could not copy loads_out.txt to its iteration directory.");
            }
            destination = new File("loads_in.txt");
            MyHelperClass IOUtils = new MyHelperClass();
            if (!(Boolean)(Object)IOUtils.renameFile(source, destination)) {
//                MyHelperClass log = new MyHelperClass();
                log.info("WARNING: Could not move loads_out.txt to loads_in.txt.");
            }
        }
        source = new File("linkprocs.txt");
        if ((boolean)(Object)source.exists()) {
            MyHelperClass Controler = new MyHelperClass();
            File destination = new File((String)(Object)Controler.getIterationFilename("linkprocs.txt"));
            MyHelperClass IOUtils = new MyHelperClass();
            if (!(Boolean)(Object)IOUtils.renameFile(source, destination)) {
//                MyHelperClass log = new MyHelperClass();
                log.info("WARNING: Could not move linkprocs.txt to its iteration directory.");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getIterationFilename(String o0){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass renameFile(File o0, File o1){ return null; }}

class IterationEndsEvent {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
