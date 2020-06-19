


class c10195648 {
public static MyHelperClass encode(MyHelperClass o0){ return null; }
public static MyHelperClass decode(String o0){ return null; }
//	public MyHelperClass encode(MyHelperClass o0){ return null; }
//public MyHelperClass decode(String o0){ return null; }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: HexStrToBin enc/dec <infileName> <outfilename>");
            System.exit(1);
        }
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            InputStream in =(InputStream)(Object) new FileInputStream(args[1]);
            int len = 0;
            byte buf[] = new byte[1024];
            while ((len =(int)(Object) in.read(buf)) > 0) os.write(buf, 0, len);
            in.close();
            os.close();
            byte[] data = null;
            if (args[0].equals("dec")) data =(byte[])(Object) decode(os.toString()); else {
                String strData =(String)(Object) encode(os.toByteArray());
                data = strData.getBytes();
            }
            FileOutputStream fos = new FileOutputStream(args[2]);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}
