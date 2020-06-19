


class c1890824 {
public MyHelperClass JOptionPane;
	public MyHelperClass transferComplete(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }

    private void internalTransferComplete(File tmpfile) {
        System.out.println("transferComplete : " + tmpfile);
        try {
            MyHelperClass m_destination = new MyHelperClass();
            File old = new File(m_destination.toString() + ".old");
            old.delete();
//            MyHelperClass m_destination = new MyHelperClass();
            File current =(File)(Object) m_destination;
            current.renameTo(old);
            FileInputStream fis = new FileInputStream(tmpfile);
//            MyHelperClass m_destination = new MyHelperClass();
            FileOutputStream fos = new FileOutputStream(m_destination);
            BufferedInputStream in = new BufferedInputStream(fis);
            BufferedOutputStream out = new BufferedOutputStream(fos);
            for (int read =(int)(Object) in.read(); read != -1; read =(int)(Object) in.read()) {
                out.write(read);
            }
            out.flush();
            in.close();
            out.close();
            fis.close();
            fos.close();
            tmpfile.delete();
            setVisible(false);
            transferComplete();
        } catch (Exception exc) {
            exc.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while downloading!", "ACLocator Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showMessageDialog(c1890824 o0, String o1, String o2, MyHelperClass o3){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}
