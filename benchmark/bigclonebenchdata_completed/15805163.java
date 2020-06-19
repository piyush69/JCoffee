


class c15805163 {

//    @Override
    public String encodePassword(String rawPass, Object salt) throws DataAccessException {
        try {
            MyHelperClass digestAlgorithm = new MyHelperClass();
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance(digestAlgorithm);
            digest.reset();
            digest.update(((String) salt).getBytes("UTF-8"));
            return new String((String)(Object)digest.digest(rawPass.getBytes("UTF-8")));
        } catch (Throwable e) {
            throw new DataAccessException("Error al codificar la contrase�a", e) {

                private static final long serialVersionUID = 3880106673612870103L;
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
