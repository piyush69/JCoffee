


class c5723876 {

    public static final String calculate(File f) {
        MessageDigest md;
        BufferedReader rd;
        StringBuffer buffer = new StringBuffer("");
        try {
            rd = new BufferedReader(new FileReader(f));
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
            String line = "";
            while ((line =(String)(Object) rd.readLine()) != null) buffer.append(line);
            md.update(buffer.toString().getBytes());
            byte[] digest =(byte[])(Object) md.digest();
            String result = "";
            for (byte b : digest) result += String.format("%h", b & 0xFF);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return "";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class File {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}
