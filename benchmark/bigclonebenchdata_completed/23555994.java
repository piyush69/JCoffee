


class c23555994 {
public MyHelperClass getNArgIn(Token[] o0){ return null; }
public MyHelperClass throwMathLibException(String o0){ return null; }

    public OperandToken evaluate(Token[] operands, GlobalValues globals) {
        String s = "";
        String lineFile = "";
        ;
        if ((int)(Object)getNArgIn(operands) != 1) throwMathLibException("urlread: number of arguments < 1");
        if (!((CharToken)(Object)operands[0] instanceof CharToken)) throwMathLibException("urlread: argument must be String");
        String urlString = ((CharToken)(CharToken)(Object) operands[0]).toString();
        URL url = null;
        try {
            url = new URL(urlString);
        } catch (Exception e) {
            throwMathLibException("urlread: malformed url");
        }
        try {
            BufferedReader inReader = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((lineFile =(String)(Object) inReader.readLine()) != null) {
                s += lineFile + "\n";
            }
            inReader.close();
        } catch (Exception e) {
            throwMathLibException("urlread: error input stream");
        }
        return (OperandToken)(Object)new CharToken(s);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Token {

}

class GlobalValues {

}

class OperandToken {

}

class CharToken {

CharToken(String o0){}
	CharToken(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
