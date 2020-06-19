import java.io.*;
import java.lang.*;
import java.util.*;



class c5159006 {
public MyHelperClass jarFile;
	public MyHelperClass p;
	public MyHelperClass QAUtil;
	public MyHelperClass terminate(){ return null; }

    public InputStream start(String classname, String jarFileURI, String... params) throws IOException {
        Runtime.getRuntime().addShutdownHook(new Thread() {

//            @Override
            public void run() {
                terminate();
            }
        });
        System.out.println("loading jar file " + jarFileURI + " ...");
        URL url = new URL(jarFileURI);
        InputStream is =(InputStream)(Object) url.openStream();
        jarFile = QAUtil.createTempfile();
        FileOutputStream fos = new FileOutputStream((String)(Object)jarFile);
        byte[] buffer = new byte[4096];
        int bytes_read;
        while ((bytes_read = is.read(buffer)) != -1) {
            fos.write(buffer, 0, bytes_read);
        }
        fos.close();
        is.close();
        String[] args = new String[params.length + 4];
        args[0] = "java";
        args[1] = "-cp";
        args[2] =(String)(Object) jarFile.getAbsolutePath();
        args[3] = classname;
        System.arraycopy(params, 0, args, 4, params.length);
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg + " ");
        }
        System.out.println("execute " + sb);
        ProcessBuilder pb = new ProcessBuilder(args);
        p =(MyHelperClass)(Object) pb.start();
        return(InputStream)(Object) p.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass createTempfile(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}
