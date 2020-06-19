


class c16804988 {
public MyHelperClass getWindow(InputStream o0){ return null; }
	public MyHelperClass resize(Dimension o0){ return null; }
public MyHelperClass DEFAULT_SIZE;
	public MyHelperClass repaint(){ return null; }
	public MyHelperClass Error(String o0){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }

    public void init() {
        String filename =(String)(Object) getParameter("filename");
        if (filename == null) {
            Error("Illegal filename");
            return;
        }
        Dimension dim =(Dimension)(Object) DEFAULT_SIZE;
        try {
            int w = Integer.parseInt((String)(Object)getParameter("width"));
            int h = Integer.parseInt((String)(Object)getParameter("height"));
            dim = new Dimension(w, h);
        } catch (Exception e) {
        }
        InputStream in;
        try {
            File ff = new File(filename);
            in =(InputStream)(Object) new FileInputStream(ff);
        } catch (Exception ignore) {
            try {
                URL url = new URL(filename);
                in =(InputStream)(Object) url.openStream();
            } catch (Exception e) {
                Error("Graph viewer: Failed to open: " + filename + "\n" + e);
                return;
            }
        }
        getContentPane().add(getWindow(in));
        resize(dim);
        repaint();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class Dimension {

Dimension(){}
	Dimension(int o0, int o1){}}

class InputStream {

}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
