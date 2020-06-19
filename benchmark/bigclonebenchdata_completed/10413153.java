import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10413153 {

    public static JuneClass loadClass(Map<String, Entity> globals, String packageName, String baseClassName)  throws Throwable {
        try {
            JuneClass $class = null;
            String resourceName = (packageName.length() > 0 ? packageName.replace('.', '/') + "/" : "") + baseClassName.replace('.', '$') + ".class";
            URL url = Resolver.class.getClassLoader().getResource(resourceName);
            if (url != null) {
                ClassBuilder builder = new ClassBuilder(globals);
                InputStream stream = url.openStream();
                try {
                    MyHelperClass ClassReader = new MyHelperClass();
                    new ClassReader(new BufferedInputStream(stream)).accept(builder, ClassReader.SKIP_CODE);
                } finally {
                    stream.close();
                }
                $class =(JuneClass)(Object) builder.$class;
                $class.loaded =(MyHelperClass)(Object) true;
            }
            return $class;
        } catch (Exception e) {
            MyHelperClass Helper = new MyHelperClass();
            throw(Throwable)(Object) Helper.throwAny(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SKIP_CODE;
public MyHelperClass throwAny(Exception o0){ return null; }}

class Entity {

}

class JuneClass {
public MyHelperClass loaded;
}

class Resolver {

}

class ClassBuilder {
public MyHelperClass $class;
ClassBuilder(Map<String,Entity> o0){}
	ClassBuilder(){}}

class ClassReader {

ClassReader(BufferedInputStream o0){}
	ClassReader(){}
	public MyHelperClass accept(ClassBuilder o0, MyHelperClass o1){ return null; }}
