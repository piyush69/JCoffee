


class c14291851 {
public MyHelperClass cacheFunction(UserFunction o0){ return null; }
public MyHelperClass directory;
	public MyHelperClass ErrorLogger;
	public MyHelperClass codeBase;
	public MyHelperClass Errors;
	public MyHelperClass getCachedFunction(String o0){ return null; }

    public Function findFunction(String functionName) {
        String code = "";
        UserFunction function = (UserFunction)(UserFunction)(Object) getCachedFunction(functionName);
        if (function != null) return (Function)(Object)function;
        ErrorLogger.debugLine("MFileWebLoader: loading >" + functionName + ".m<");
        try {
            URL url = new URL(codeBase, directory + "/" + functionName + ".m");
            InputStream in =(InputStream)(Object) url.openStream();
            BufferedReader inReader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line =(String)(Object) inReader.readLine()) != null) {
                code += line + "\n";
            }
            inReader.close();
        } catch (Exception e) {
            Errors.throwMathLibException("MFileWebLoader: m-file exception via web");
        }
        ErrorLogger.debugLine("MFileWebLoader: code: begin \n" + code + "\ncode end");
        FunctionParser funcParser = new FunctionParser();
        function =(UserFunction)(Object) funcParser.parseFunction(code);
        function.setName(functionName);
        cacheFunction(function);
        ErrorLogger.debugLine("MFileWebLoader: finished webloading >" + functionName + ".m<");
        return (Function)(Object)function;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debugLine(String o0){ return null; }
	public MyHelperClass throwMathLibException(String o0){ return null; }}

class Function {

}

class UserFunction {

public MyHelperClass setName(String o0){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

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
