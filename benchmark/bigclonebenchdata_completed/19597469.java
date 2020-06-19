


class c19597469 {
public MyHelperClass writeFile(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass genFileName;
	public MyHelperClass downloadInternal(URLConnection o0){ return null; }

    protected Element downloadAndVerify(Element gElem) throws CacheException {
        try {
            MyHelperClass XMLHelper = new MyHelperClass();
            String url =(String)(Object) XMLHelper.GetChildText(gElem, "originalLocation");
//            MyHelperClass XMLHelper = new MyHelperClass();
            String id =(String)(Object) XMLHelper.GetChildText(gElem, "id");
            URLConnection urlC =(URLConnection)(Object) (new URL(url).openConnection());
//            MyHelperClass XMLHelper = new MyHelperClass();
            String gElemStr =(String)(Object) XMLHelper.ToString(gElem);
            int index = gElemStr.indexOf("</generator>");
            String cachedFileName =(String)(Object) downloadInternal(urlC);
            gElemStr = gElemStr.substring(0, index) + "<location>" + cachedFileName + "</location>" + gElemStr.substring(index);
            index = gElemStr.indexOf("</generator>");
            gElemStr = gElemStr.substring(0, index) + "<downloadTime>" + System.currentTimeMillis() + "</downloadTime>" + gElemStr.substring(index);
            MyHelperClass genHash = new MyHelperClass();
            genHash.put(id, gElemStr);
//            MyHelperClass genHash = new MyHelperClass();
            writeFile(genHash, genFileName);
//            MyHelperClass XMLHelper = new MyHelperClass();
            return(Element)(Object) XMLHelper.GetRootElement(gElemStr);
        } catch (Exception e) {
            throw new CacheException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass GetRootElement(String o0){ return null; }
	public MyHelperClass GetChildText(Element o0, String o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass ToString(Element o0){ return null; }}

class Element {

}

class CacheException extends Exception{
	public CacheException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
