


class c15805164 {

//    @Override
    public boolean isPasswordValid(String encPass, String rawPass, Object salt) throws DataAccessException {
        try {
            MyHelperClass digestAlgorithm = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(digestAlgorithm);
            digest.reset();
            digest.update(((String) salt).getBytes("UTF-8"));
            String encodedRawPass = new String((String)(Object)digest.digest(rawPass.getBytes("UTF-8")));
            return encodedRawPass.equals(encPass);
        } catch (Throwable e) {
            throw new DataAccessException("Error al codificar la contrase�a", e) {

                private static final long serialVersionUID = -302443565702455874L;
            };
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class DataAccessException extends Exception{
	public DataAccessException(String errorMessage) { super(errorMessage); }
	DataAccessException(String o0, Throwable o1){}
	DataAccessException(){}
}

class MessageDigest {

public static MyHelperClass getInstance(MyHelperClass o0){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }
	public MyHelperClass reset(){ return null; }}
