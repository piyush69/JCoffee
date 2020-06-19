import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12847055 {
public MyHelperClass AnnotationElement;
public MyHelperClass defaults;
	public MyHelperClass props;
	public MyHelperClass log;

        public void MobileAgentProperties(Class declaringClass, String propertyFile) throws IOException {
            this.defaults =(MyHelperClass)(Object) (MobileAgent)(MobileAgent)(Object) AnnotationElement.getAnyAnnotation(declaringClass, MobileAgent.class);
            URL url = getClass().getClassLoader().getResource(propertyFile);
            if (url != null) {
                props.load(url.openStream());
                log.info("MobileAgent parameters loaded from file " + url);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }
	public MyHelperClass getAnyAnnotation(Class o0, Class<MobileAgent> o1){ return null; }}

class MobileAgent {

}
