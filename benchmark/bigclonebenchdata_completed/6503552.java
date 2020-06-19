


class c6503552 {
public static MyHelperClass hexEncode(byte[] o0){ return null; }
//public MyHelperClass hexEncode(byte[] o0){ return null; }

    public static DataElement createMD5Sum(int type, String data) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(data.getBytes());
            byte[] dt =(byte[])(Object) md.digest();
            return new DataElement(type, hexEncode(dt));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new DataElement(type);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class DataElement {

DataElement(int o0){}
	DataElement(int o0, MyHelperClass o1){}
	DataElement(){}}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
