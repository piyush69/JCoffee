


class c5543349 {

    public UserFunction loadMFileViaWeb(URL codeBase, String directoryAndFile, String mFileName) {
        String code = "";
        UserFunction function = null;
        MyHelperClass ErrorLogger = new MyHelperClass();
        ErrorLogger.debugLine("MFileLoader: loading >" + mFileName + ".m<");
        try {
            URL url = new URL(codeBase, directoryAndFile);
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader inReader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line =(String)(Object) inReader.readLine()) != null) {
                code += line + "\n";
            }
            inReader.close();
        } catch (Exception e) {
            MyHelperClass Errors = new MyHelperClass();
            Errors.throwMathLibException("MFileLoader: m-file exception via web");
        }
//        MyHelperClass ErrorLogger = new MyHelperClass();
        ErrorLogger.debugLine("MFileLoader: code: begin \n" + code + "\ncode end");
        FunctionParser funcParser = new FunctionParser();
        function =(UserFunction)(Object) funcParser.parseFunction(code);
        function.setName(mFileName);
//        MyHelperClass ErrorLogger = new MyHelperClass();
        ErrorLogger.debugLine("MFileLoader: finished webloading >" + mFileName + ".m<");
        return function;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debugLine(String o0){ return null; }
	public MyHelperClass throwMathLibException(String o0){ return null; }}

class URL {

URL(){}
	URL(URL o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class UserFunction {

public MyHelperClass setName(String o0){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class FunctionParser {

public MyHelperClass parseFunction(String o0){ return null; }}
