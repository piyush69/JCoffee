


class c6491370 {
public MyHelperClass getHex(byte[] o0){ return null; }

//    @Override
    protected Object transform(Row inputs) throws FunctionException {
        StringBuffer buffer = new StringBuffer();
        for (IColumn c :(IColumn[])(Object) (Object[])(Object)inputs.getColumns()) {
            buffer.append(c.getValueAsString() + "|");
        }
        try {
            MessageDigest digest =(MessageDigest)(Object) java.security.MessageDigest.getInstance("MD5");
            digest.update(buffer.toString().getBytes());
            byte[] hash =(byte[])(Object) digest.digest();
            return getHex(hash);
        } catch (Exception e) {
            throw new FunctionException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Row {

public MyHelperClass getColumns(){ return null; }}

class FunctionException extends Exception{
	public FunctionException(String errorMessage) { super(errorMessage); }
}

class IColumn {

public MyHelperClass getValueAsString(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
