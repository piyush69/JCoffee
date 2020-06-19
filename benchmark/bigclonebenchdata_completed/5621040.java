


class c5621040 {

    public MeetingScript getScript(Integer id) {
        MeetingScript script = null;
        try {
            MyHelperClass SCRIPT_URL = new MyHelperClass();
            URL url = new URL(SCRIPT_URL + "?script=" + id);
            ObjectInputStream ois = new ObjectInputStream(url.openStream());
            script = (MeetingScript)(MeetingScript)(Object) ois.readObject();
            ois.close();
            System.out.println("got script");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return script;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class MeetingScript {

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
