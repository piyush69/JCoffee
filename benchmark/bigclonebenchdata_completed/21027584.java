


class c21027584 {
public MyHelperClass filterCyclic;

    public void run() {
        try {
            MyHelperClass url = new MyHelperClass();
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            MyHelperClass pedestrian = new MyHelperClass();
            Osm2Model osm = new Osm2Model(pedestrian, filterCyclic);
            osm.progress.connect(this, "progress(int)");
            osm.parseFile(con.getInputStream(), con.getContentLength());
            if ((boolean)(Object)osm.somethingImported()) {
                MyHelperClass done = new MyHelperClass();
                done.emit();
            } else {
                MyHelperClass nothing = new MyHelperClass();
                nothing.emit();
            }
        } catch (Exception e) {
            MyHelperClass failed = new MyHelperClass();
            failed.emit();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass emit(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass connect(c21027584 o0, String o1){ return null; }}

class HttpURLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Osm2Model {
public MyHelperClass progress;
Osm2Model(){}
	Osm2Model(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass somethingImported(){ return null; }
	public MyHelperClass parseFile(MyHelperClass o0, MyHelperClass o1){ return null; }}
