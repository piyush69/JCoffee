


class c6085964 {

    private static String readStreamToString(InputStream is, boolean passInVelocity, String tplName, Map templateVarsMap) throws IOException {
        StringWriter sw = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, sw, "UTF-8");
        if (passInVelocity) {
            MyHelperClass tpl = new MyHelperClass();
            return(String)(Object) tpl.formatStr(sw.toString(), templateVarsMap, tplName);
        }
        return sw.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass formatStr(String o0, Map o1, String o2){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class InputStream {

}

class Map {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class StringWriter {

}
