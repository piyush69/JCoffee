


class c18744498 {

    private void read(String url) {
        MyHelperClass session = new MyHelperClass();
        session.beginTransaction();
        try {
            MyHelperClass reader = new MyHelperClass();
            Document doc =(Document)(Object) reader.read(new URL(url).openStream());
            Element root =(Element)(Object) doc.getRootElement();
            Dict dic = new Dict();
            Vector v = new Vector();
            for (Object o : (Object[])(Object)root.elements()) {
                Element e = (Element) o;
                if (e.getName().equals("key")) {
                    dic.setName(e.getTextTrim());
                } else if (e.getName().equals("audio")) {
                    dic.setAudio(e.getTextTrim());
                } else if (e.getName().equals("pron")) {
                    dic.setPron(e.getTextTrim());
                } else if (e.getName().equals("def")) {
                    dic.setDef(e.getTextTrim());
                } else if (e.getName().equals("sent")) {
                    Cent cent = new Cent();
                    for (Object subo : (Object[])(Object)e.elements()) {
                        Element sube = (Element) subo;
                        if (sube.getName().equals("orig")) {
                            cent.setOrig(sube.getTextTrim());
                        } else if (sube.getName().equals("trans")) {
                            cent.setTrans(sube.getTextTrim());
                        }
                    }
                    v.add(cent);
                }
            }
            if (dic.getName() == null || "".equals(dic.getName())) {
//                MyHelperClass session = new MyHelperClass();
                session.getTransaction().commit();
                return;
            }
//            MyHelperClass session = new MyHelperClass();
            session.save(dic);
            dic.setCent(new HashSet());
            for (Cent c :(Cent[])(Object) (Object[])(Object)v) {
                c.setDict(dic);
                dic.getCent().add(c);
            }
//            MyHelperClass session = new MyHelperClass();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
//            MyHelperClass session = new MyHelperClass();
            session.getTransaction().rollback();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass save(Dict o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass beginTransaction(){ return null; }
	public MyHelperClass add(Cent o0){ return null; }
	public MyHelperClass getTransaction(){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class Element {

public MyHelperClass elements(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getTextTrim(){ return null; }}

class Dict {

public MyHelperClass setAudio(MyHelperClass o0){ return null; }
	public MyHelperClass getCent(){ return null; }
	public MyHelperClass setDef(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setCent(HashSet o0){ return null; }
	public MyHelperClass setPron(MyHelperClass o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

class Vector {

public MyHelperClass add(Cent o0){ return null; }}

class Cent {

public MyHelperClass setTrans(MyHelperClass o0){ return null; }
	public MyHelperClass setDict(Dict o0){ return null; }
	public MyHelperClass setOrig(MyHelperClass o0){ return null; }}

class HashSet {

}
