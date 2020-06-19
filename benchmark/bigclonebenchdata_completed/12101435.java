import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12101435 {

    private void invokeTest(String queryfile, String target)  throws Throwable {
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            String query = IOUtils.toString(XPathMarkBenchmarkTest.class.getResourceAsStream(queryfile)).trim();
            MyHelperClass EXEC_CMD = new MyHelperClass();
            String args = EXEC_CMD + " \"" + query + "\" \"" + target + '"';
            System.out.println("Invoke command: \n " + args);
            MyHelperClass benchmarkDir = new MyHelperClass();
            Process proc = Runtime.getRuntime().exec(args,(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[][])(Object)(String[])(Object) null, benchmarkDir);
            InputStream is = proc.getInputStream();
            MyHelperClass outDir = new MyHelperClass();
            File outFile = new File((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)outDir, queryfile + ".result");
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, new FileOutputStream(outFile));
            is.close();
            int ret = proc.waitFor();
            if (ret != 0) {
                System.out.println("process exited with value : " + ret);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        } catch (InterruptedException irre) {
            throw new IllegalStateException(irre);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class XPathMarkBenchmarkTest {

}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
