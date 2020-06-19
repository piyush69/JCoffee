import java.io.*;
import java.lang.*;
import java.util.*;



class c22554509 {
public MyHelperClass NULL;

    public void initialize(AtomPropsMenu menu) {
        AtomPropsMenu propertiesMenu =(AtomPropsMenu)(Object) NULL; //new AtomPropsMenu();
        propertiesMenu = menu;
        MyHelperClass shieldings = new MyHelperClass();
        if (shieldings == null) {
            try {
                MyHelperClass RF = new MyHelperClass();
                URL url =(URL)(Object) this.getClass().getClassLoader().getResource((String)(Object)RF);
                InputStreamReader isr = new InputStreamReader((InputStream)(Object)url.openStream());
                BufferedReader br = new BufferedReader(isr);
                SharcReader sr1 = new SharcReader(br);
//                MyHelperClass shieldings = new MyHelperClass();
                shieldings =(MyHelperClass)(Object) new Hashtable();
                while ((boolean)(Object)sr1.hasNext()) {
                    SharcShielding ss1 =(SharcShielding)(Object) sr1.next();
//                    MyHelperClass shieldings = new MyHelperClass();
                    shieldings.put(ss1.getMethod(), ss1);
                }
//                MyHelperClass shieldings = new MyHelperClass();
                String[] shieldingNames = new String[(int)(Object)shieldings.size()];
                int i = 0;
//                MyHelperClass shieldings = new MyHelperClass();
                Enumeration k =(Enumeration)(Object) shieldings.keys();
                while (k.hasMoreElements()) {
                    shieldingNames[i] = (String) k.nextElement();
                    i++;
                }
                SelectSharcReference dialog =(SelectSharcReference)(Object) NULL; //new SelectSharcReference();
                dialog = new SelectSharcReference(null, shieldingNames, true);
            } catch (Exception ex) {
//                MyHelperClass shieldings = new MyHelperClass();
                shieldings = null;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(MyHelperClass o0, SharcShielding o1){ return null; }
	public MyHelperClass keys(){ return null; }
	public MyHelperClass size(){ return null; }}

class AtomPropsMenu {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class SharcReader {

SharcReader(BufferedReader o0){}
	SharcReader(){}
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class SharcShielding {

public MyHelperClass getMethod(){ return null; }}

class SelectSharcReference {

SelectSharcReference(Object o0, String[] o1, boolean o2){}
	SelectSharcReference(){}}
