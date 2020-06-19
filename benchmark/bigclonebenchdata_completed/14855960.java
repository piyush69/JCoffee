


class c14855960 {

    private static List loadIMDescriptors() {
        MyHelperClass SERVICES = new MyHelperClass();
        String nm = SERVICES + InputMethodDescriptor.class.getName();
        Enumeration en;
        LinkedList imdList = new LinkedList();
        MyHelperClass ContextStorage = new MyHelperClass();
        NativeIM nativeIM =(NativeIM)(Object) ContextStorage.getNativeIM();
        imdList.add(nativeIM);
        try {
            en =(Enumeration)(Object) ClassLoader.getSystemResources(nm);
            ClassLoader cl = ClassLoader.getSystemClassLoader();
            while ((boolean)(Object)en.hasMoreElements()) {
                URL url =(URL)(Object) en.nextElement();
                InputStreamReader isr = new InputStreamReader(url.openStream(), "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                String str =(String)(Object) br.readLine();
                while (str != null) {
                    str = str.trim();
                    int comPos = str.indexOf("#");
                    if (comPos >= 0) {
                        str = str.substring(0, comPos);
                    }
                    if (str.length() > 0) {
                        imdList.add((InputMethodDescriptor) cl.loadClass(str).newInstance());
                    }
                    str =(String)(Object) br.readLine();
                }
            }
        } catch (Exception e) {
        }
        return (List)(Object)imdList;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getNativeIM(){ return null; }}

class List {

}

class InputMethodDescriptor {

}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class LinkedList {

public MyHelperClass add(InputMethodDescriptor o0){ return null; }
	public MyHelperClass add(NativeIM o0){ return null; }}

class NativeIM {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
