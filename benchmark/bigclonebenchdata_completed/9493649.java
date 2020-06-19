
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9493649 {

    public boolean loadFile(String inpfile) {
        MyHelperClass osmlContainer = new MyHelperClass();
        if (osmlContainer == null) return false;
        MyHelperClass hApdx = new MyHelperClass();
        hApdx.clear();
        try {
            BufferedReader in = null;
            if (inpfile.indexOf("http://") >= 0) {
                URL url = null;
                url = new URL(inpfile);
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.setUseCaches(false);
                InputStreamReader is = new InputStreamReader(conn.getInputStream());
                in = new BufferedReader(is);
            } else {
                in = new BufferedReader((InputStreamReader)(Object)new FileReader(inpfile));
            }
            String pline = null;
            while ((pline =(String)(Object) in.readLine()) != null) {
                StringTokenizer tok = new StringTokenizer(pline, "\t\n\r");
                if ((int)(Object)tok.countTokens() < 2) continue;
                String name =(String)(Object) tok.nextToken();
                String apdx =(String)(Object) tok.nextToken();
                String note = "";
                if ((int)(Object)tok.countTokens() > 0) note =(String)(Object) tok.nextToken();
                if (name.length() == 0 || apdx.length() == 0) continue;
                MyHelperClass OmicElementContainer = new MyHelperClass();
                OmicElementContainer element = (OmicElementContainer)(OmicElementContainer)(Object) OmicElementContainer.createContainer();
                element.setName(name);
                element.setNote(note);
                element.addAppendix(apdx);
                MyHelperClass commaPattern = new MyHelperClass();
                String keys[] =(String[])(Object) commaPattern.split(apdx);
                for (int j = 0; j < keys.length; j++) {
//                    MyHelperClass hApdx = new MyHelperClass();
                    ArrayList v = (ArrayList)(ArrayList)(Object) hApdx.get(keys[j]);
                    if (v == null) v = new ArrayList();
                    v.add(element);
//                    MyHelperClass hApdx = new MyHelperClass();
                    hApdx.put(keys[j], v);
                }
            }
            in.close();
        } catch (UncheckedIOException mfe) {
            System.out.println("MalformedURLException");
            return false;
        } catch (ArithmeticException ioe) {
            System.out.println("IOException");
            return false;
        }
//        MyHelperClass hApdx = new MyHelperClass();
        System.out.println("appendix name list size " + hApdx.size());
        MyHelperClass bElementDirected = new MyHelperClass();
        if ((boolean)(Object)bElementDirected) {
            int nCount = 0;
//            MyHelperClass osmlContainer = new MyHelperClass();
            ArrayList omicElementList =(ArrayList)(Object) osmlContainer.getAllOmicElementContainers();
            for (OmicElementContainer element :(OmicElementContainer[])(Object) (Object[])(Object)omicElementList) {
                String name =(String)(Object) element.getName();
                String apdx =(String)(Object) element.getAppendix();
                if (name.length() == 0) continue;
                MyHelperClass commaPattern = new MyHelperClass();
                String names[] =(String[])(Object) commaPattern.split(name);
//                MyHelperClass commaPattern = new MyHelperClass();
                String apdxs[] =(String[])(Object) commaPattern.split(apdx);
                String list[] = new String[names.length + apdxs.length];
                for (int j = 0; j < names.length; j++) list[j] = names[j];
                for (int j = 0; j < apdxs.length; j++) list[j + names.length] = apdxs[j];
                for (int j = 0; j < list.length; j++) {
//                    MyHelperClass hApdx = new MyHelperClass();
                    ArrayList v = (ArrayList)(ArrayList)(Object) hApdx.get(list[j]);
                    if (v == null) continue;
                    for (int k = 0; k < (int)(Object)v.size(); k++) {
                        OmicElementContainer appendix = (OmicElementContainer)(OmicElementContainer)(Object) v.get(k);
                        element.addAppendix((String)(Object)appendix.getName());
                        nCount++;
                    }
                }
            }
            System.out.println("match appendix element " + nCount + " items");
        }
        MyHelperClass bFunctionDirected = new MyHelperClass();
        if ((boolean)(Object)bFunctionDirected) {
            int nCount = 0;
//            MyHelperClass osmlContainer = new MyHelperClass();
            FunctionalClassContainer functions[] =(FunctionalClassContainer[])(Object) osmlContainer.getFunctionalClassContainer("[@container=all]");
            ArrayList vFunction = new ArrayList();
            for (int i = 0; i < functions.length; i++) {
                if (!(Boolean)(Object)vFunction.contains(functions[i])) vFunction.add(functions[i]);
            }
            for (int i = 0; i < (int)(Object)vFunction.size(); i++) {
                FunctionalClassContainer function = (FunctionalClassContainer)(FunctionalClassContainer)(Object) vFunction.get(i);
                String name =(String)(Object) function.getName();
                if (name.length() == 0) continue;
                String names[] = name.split(",");
                for (int j = 0; j < names.length; j++) {
//                    MyHelperClass hApdx = new MyHelperClass();
                    ArrayList v = (ArrayList)(ArrayList)(Object) hApdx.get(names[j]);
                    if (v == null) continue;
                    for (int k = 0; k < (int)(Object)v.size(); k++) {
                        OmicElementContainer appendix = (OmicElementContainer)(OmicElementContainer)(Object) v.get(k);
                        functions[i].addOmicElementContainer(appendix);
                        nCount++;
                    }
                }
            }
            System.out.println("match appendix function " + nCount + " items");
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass clear(){ return null; }
	public MyHelperClass put(String o0, ArrayList o1){ return null; }
	public MyHelperClass createContainer(){ return null; }
	public MyHelperClass getAllOmicElementContainers(){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getFunctionalClassContainer(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(String o0, String o1){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass countTokens(){ return null; }}

class OmicElementContainer {

public MyHelperClass addAppendix(String o0){ return null; }
	public MyHelperClass setNote(String o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass getAppendix(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ArrayList {

public MyHelperClass add(FunctionalClassContainer o0){ return null; }
	public MyHelperClass add(OmicElementContainer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass contains(FunctionalClassContainer o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FunctionalClassContainer {

public MyHelperClass addOmicElementContainer(OmicElementContainer o0){ return null; }
	public MyHelperClass getName(){ return null; }}
