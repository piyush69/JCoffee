


class c12102996 {
public MyHelperClass groovyObject;
	public MyHelperClass initDeclaredMethods(){ return null; }

//    @Override
    public Object init() throws Exception {
        MyHelperClass url = new MyHelperClass();
        if (url != null) {
//            MyHelperClass url = new MyHelperClass();
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            ClassLoader parent = getClass().getClassLoader();
            GroovyClassLoader loader = new GroovyClassLoader(parent);
//            MyHelperClass url = new MyHelperClass();
            Class groovyClass =(Class)(Object) loader.parseClass(new File(url.getFile()));
            GroovyObject groovyObject;// = new GroovyObject();
            groovyObject = (GroovyObject) groovyClass.newInstance();
            reader.close();
            initDeclaredMethods();
            return groovyObject;
        } else return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class GroovyClassLoader {

GroovyClassLoader(){}
	GroovyClassLoader(ClassLoader o0){}
	public MyHelperClass parseClass(File o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}}

class GroovyObject {

}
