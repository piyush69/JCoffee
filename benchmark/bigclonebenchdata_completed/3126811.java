


class c3126811 {

    public static void saveProperties(Properties props, String comment, URL url) throws IOException {
        if (props == null) throw new IllegalArgumentException();
        if (url == null) throw new IllegalArgumentException();
        OutputStream out =(OutputStream)(Object) url.openConnection().getOutputStream();
        props.store(out, comment);
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getOutputStream(){ return null; }}

class Properties {

public MyHelperClass store(OutputStream o0, String o1){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}
