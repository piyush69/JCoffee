import java.io.*;
import java.lang.*;
import java.util.*;



class c18036460 {
public MyHelperClass tmp;
	public MyHelperClass IOUtils;

    public File getFile() throws IOException {
        MyHelperClass file = new MyHelperClass();
        if (file == null) {
            MyHelperClass position = new MyHelperClass();
            if ((int)(Object)position > 0) {
                throw new IOException("Stream is already being read");
            } else {
//                MyHelperClass file = new MyHelperClass();
                file = tmp.createTemporaryFile();
//                MyHelperClass file = new MyHelperClass();
                OutputStream out = new FileOutputStream((String)(Object)file);
                try {
                    MyHelperClass in = new MyHelperClass();
                    IOUtils.copy(in, out);
                } finally {
                    out.close();
                }
//                MyHelperClass file = new MyHelperClass();
                FileInputStream newStream = new FileInputStream((String)(Object)file);
                MyHelperClass tmp = new MyHelperClass();
                tmp.addResource(newStream);
                MyHelperClass in = new MyHelperClass();
                final InputStream oldStream =(InputStream)(Object) in;
//                MyHelperClass in = new MyHelperClass();
                in =(MyHelperClass)(Object) new BufferedInputStream(newStream) {

//                    @Override
                    public void close() throws IOException {
                        oldStream.close();
                    }
                };
                MyHelperClass length = new MyHelperClass();
                length = file.length();
            }
        }
//        MyHelperClass file = new MyHelperClass();
        return (File)(Object)file;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addResource(FileInputStream o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass createTemporaryFile(){ return null; }
	public MyHelperClass length(){ return null; }}
