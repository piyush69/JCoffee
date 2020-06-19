


class c2936895 {
public MyHelperClass StringTools;
	public MyHelperClass MessageDigest;
	public MyHelperClass cosGetDoc(){ return null; }
	public MyHelperClass getInfoDict(){ return null; }

    protected byte[] createFileID() {
        try {
            COSDocument cosDoc =(COSDocument)(Object) cosGetDoc();
            if (cosDoc == null) {
                return null;
            }
            ILocator locator =(ILocator)(Object) cosDoc.getLocator();
            if (locator == null) {
                return null;
            }
            IRandomAccess ra =(IRandomAccess)(Object) cosDoc.stGetDoc().getRandomAccess();
            if (ra == null) {
                ra =(IRandomAccess)(Object) new RandomAccessByteArray(StringTools.toByteArray("DummyValue"));
            }
            MessageDigest digest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            long time = System.currentTimeMillis();
            digest.update(String.valueOf(time).getBytes());
            digest.update((byte[])(Object)locator.getFullName().getBytes());
            digest.update(String.valueOf(ra.getLength()).getBytes());
            COSInfoDict infoDict =(COSInfoDict)(Object) getInfoDict();
            if (infoDict != null) {
                for (Iterator it =(Iterator)(Object) infoDict.cosGetDict().iterator();(boolean)(Object) it.hasNext(); ) {
                    COSObject object = (COSObject)(COSObject)(Object) it.next();
                    digest.update((byte[])(Object)object.stringValue().getBytes());
                }
            }
            return(byte[])(Object) digest.digest();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toByteArray(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getRandomAccess(){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class COSDocument {

public MyHelperClass getLocator(){ return null; }
	public MyHelperClass stGetDoc(){ return null; }}

class ILocator {

public MyHelperClass getFullName(){ return null; }}

class IRandomAccess {

public MyHelperClass getLength(){ return null; }}

class RandomAccessByteArray {

RandomAccessByteArray(MyHelperClass o0){}
	RandomAccessByteArray(){}}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class COSInfoDict {

public MyHelperClass cosGetDict(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class COSObject {

public MyHelperClass stringValue(){ return null; }}
