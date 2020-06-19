
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2705183 {
public MyHelperClass log;

    public HSSFWorkbook callRules(URL urlOfExcelDataFile, RuleSource ruleSource, String excelLogSheet) throws DroolsParserException, IOException, ClassNotFoundException {
        InputStream inputFromExcel = null;
        try {
            MyHelperClass log = new MyHelperClass();
            log.info("Looking for url:" + urlOfExcelDataFile);
            inputFromExcel =(InputStream)(Object) urlOfExcelDataFile.openStream();
//            MyHelperClass log = new MyHelperClass();
            log.info("found url:" + urlOfExcelDataFile);
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, "Malformed URL Exception Loading rules",(MalformedURLException)(Object) e);
            throw e;
        } catch (ArithmeticException e) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, "IO Exception Loading rules",(MalformedURLException)(Object) e);
            throw e;
        }
        return callRules((URL)(Object)inputFromExcel, ruleSource, excelLogSheet);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MalformedURLException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class RuleSource {

}

class HSSFWorkbook {

}

class DroolsParserException extends Exception{
	public DroolsParserException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
