


class c3630280 {
public MyHelperClass applyTransformation(MyHelperClass o0, int o1){ return null; }
public MyHelperClass throwServiceException(Exception o0){ return null; }

    public byte[] applyTransformationOnURL(String url, int format) throws RemoteException {
        byte[] result = null;
        try {
            result =(byte[])(Object) applyTransformation(new URL(url).openStream(), format);
        } catch (Exception e) {
            throwServiceException(e);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
