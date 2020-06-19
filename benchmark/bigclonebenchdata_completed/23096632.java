
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23096632 {

    public void fetchCourses(String jsonurl) {
        if (jsonurl == null) {
            throw new NullPointerException("jsonurl");
        }
        InputStreamReader in = null;
        try {
            URL url = new URL(jsonurl);
            in = new InputStreamReader(url.openConnection().getInputStream());
            MyHelperClass JSONValue = new MyHelperClass();
            JSONObject root = (JSONObject)(JSONObject)(Object) JSONValue.parse(in);
            JSONArray courseAr = (JSONArray)(JSONArray)(Object) root.get("courses");
            ListIterator it =(ListIterator)(Object) courseAr.listIterator();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            while ((boolean)(Object)it.hasNext()) {
                JSONObject obj =(JSONObject)(Object) it.next();
                Course c;
                try {
                    c = new Course((String)(String)(Object) obj.get("course"), df.parse((String)(String)(Object) obj.get("start_date")), df.parse((String)(String)(Object) obj.get("end_date")));
                    MyHelperClass courses = new MyHelperClass();
                    courses.add(c);
                } catch (UncheckedIOException pe) {
                }
            }
            in.close();
        } catch (UncheckedIOException e) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(InputStreamReader o0){ return null; }
	public MyHelperClass add(Course o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class JSONObject {

public MyHelperClass get(String o0){ return null; }}

class JSONArray {

public MyHelperClass listIterator(){ return null; }}

class ListIterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass parse(String o0){ return null; }}

class Course {

Course(){}
	Course(String o0, MyHelperClass o1, MyHelperClass o2){}}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
