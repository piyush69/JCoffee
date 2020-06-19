


class c5621039 {
public MyHelperClass customerID;

    public ScriptInfoList getScriptList() {
        ScriptInfoList scripts = null;
        try {
            MyHelperClass SCRIPT_URL = new MyHelperClass();
            URL url = new URL(SCRIPT_URL + "?customer=" + customerID);
            ObjectInputStream ois = new ObjectInputStream(url.openStream());
            scripts = (ScriptInfoList)(ScriptInfoList)(Object) ois.readObject();
            ois.close();
            System.out.println("got script list");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return scripts;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ScriptInfoList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class ObjectInputStream {

ObjectInputStream(MyHelperClass o0){}
	ObjectInputStream(){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }}
