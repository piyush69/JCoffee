import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13450633 {
public MyHelperClass Workbook;
public MyHelperClass fail(){ return null; }

    public void setUp() {
        try {
            String excelFile = "result" + java.io.File.separator + "input" + java.io.File.separator + "conextech.xls";
            java.io.File f1 = new java.io.File(excelFile);
            URL url = new URL("file:test/result/input/checksun.xls");
            InputStream is = url.openStream();
            MyHelperClass workbook = new MyHelperClass();
            workbook = Workbook.getWorkbook(is);
        } catch (MalformedURLException urlEx) {
            urlEx.printStackTrace();
            fail();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
            fail();
        } catch (UncheckedIOException biffEx) {
            biffEx.printStackTrace();
            fail();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getWorkbook(InputStream o0){ return null; }}

class BiffException extends Exception{
	public BiffException(String errorMessage) { super(errorMessage); }
}
