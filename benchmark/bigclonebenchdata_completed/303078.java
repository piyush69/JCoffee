


class c303078 {

    private static void main(String[] args) {
        try {
            File f = new File("test.txt");
            if ((boolean)(Object)f.exists()) {
                throw new IOException(f + " already exists.  I don't want to overwrite it.");
            }
            StraightStreamReader in;
            char[] cbuf = new char[0x1000];
            int read;
            int totRead;
            FileOutputStream out = new FileOutputStream(f);
            for (int i = 0x00; i < 0x100; i++) {
                out.write(i);
            }
            out.close();
            in = new StraightStreamReader(new FileInputStream(f));
            for (int i = 0x00; i < 0x100; i++) {
                read =(int)(Object) in.read();
                if (read != i) {
                    System.err.println("Error: " + i + " read as " + read);
                }
            }
            in.close();
            in = new StraightStreamReader(new FileInputStream(f));
            totRead =(int)(Object) in.read(cbuf);
            if (totRead != 0x100) {
                System.err.println("Simple buffered read did not read the full amount: 0x" + Integer.toHexString(totRead));
            }
            for (int i = 0x00; i < totRead; i++) {
                if (cbuf[i] != i) {
                    System.err.println("Error: 0x" + i + " read as 0x" + cbuf[i]);
                }
            }
            in.close();
            in = new StraightStreamReader(new FileInputStream(f));
            totRead = 0;
            while (totRead <= 0x100 && (read =(int)(Object) in.read(cbuf, totRead, 0x100 - totRead)) > 0) {
                totRead += read;
            }
            if (totRead != 0x100) {
                System.err.println("Not enough read. Bytes read: " + Integer.toHexString(totRead));
            }
            for (int i = 0x00; i < totRead; i++) {
                if (cbuf[i] != i) {
                    System.err.println("Error: 0x" + i + " read as 0x" + cbuf[i]);
                }
            }
            in.close();
            in = new StraightStreamReader(new FileInputStream(f));
            totRead = 0;
            while (totRead <= 0x100 && (read =(int)(Object) in.read(cbuf, totRead + 0x123, 0x100 - totRead)) > 0) {
                totRead += read;
            }
            if (totRead != 0x100) {
                System.err.println("Not enough read. Bytes read: " + Integer.toHexString(totRead));
            }
            for (int i = 0x00; i < totRead; i++) {
                if (cbuf[i + 0x123] != i) {
                    System.err.println("Error: 0x" + i + " read as 0x" + cbuf[i + 0x123]);
                }
            }
            in.close();
            in = new StraightStreamReader(new FileInputStream(f));
            totRead = 0;
            while (totRead <= 0x100 && (read =(int)(Object) in.read(cbuf, totRead + 0x123, 7)) > 0) {
                totRead += read;
            }
            if (totRead != 0x100) {
                System.err.println("Not enough read. Bytes read: " + Integer.toHexString(totRead));
            }
            for (int i = 0x00; i < totRead; i++) {
                if (cbuf[i + 0x123] != i) {
                    System.err.println("Error: 0x" + i + " read as 0x" + cbuf[i + 0x123]);
                }
            }
            in.close();
            f.delete();
        } catch (IOException x) {
            System.err.println(x.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class StraightStreamReader {

StraightStreamReader(){}
	StraightStreamReader(FileInputStream o0){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(char[] o0){ return null; }
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
