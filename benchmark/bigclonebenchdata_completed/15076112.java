
import java.io.UncheckedIOException;


class c15076112 {

//    @Override
    public JSONObject getJsonObj(Trip trip, List stops) throws IOException {
        JSONObject jsonObject = null;
        try {
            List filtered =(List)(Object) new LinkedList();
            filtered.add((String)(Object)trip.getWaypoint().getFromLocation().getCity().replaceAll("\\W+", "+"));
            filtered.add((String)(Object)trip.getWaypoint().getToLocation().getCity().replaceAll("\\W+", "+"));
            for (Waypoint w :(Waypoint[])(Object) (Object[])(Object)stops) {
                String from =(String)(Object) w.getFromLocation().getCity().replaceAll("\\W+", "+");
                if (!(Boolean)(Object)filtered.contains(from)) filtered.add(from);
                String to =(String)(Object) w.getToLocation().getCity().replaceAll("\\W+", "+");
                if (!(Boolean)(Object)filtered.contains(to)) filtered.add(to);
            }
            StringBuilder urlBuilder = new StringBuilder();
            urlBuilder.append("http://maps.google.com/maps/api/directions/json");
            urlBuilder.append("?origin=").append(filtered.get(0));
            urlBuilder.append("&destination=").append(filtered.get(1));
            if ((int)(Object)filtered.size() > 2) {
                urlBuilder.append("&waypoints=");
                for (int i = 2; i <(int)(Object) filtered.size() - 1; i++) urlBuilder.append(filtered.get(i)).append("|");
                urlBuilder.append(filtered.get((int)(Object)filtered.size() - 1));
            }
            urlBuilder.append("&sensor=false");
            BufferedReader in = new BufferedReader(new InputStreamReader(new URL(urlBuilder.toString()).openStream()));
            StringBuilder answerBuilder = new StringBuilder();
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) answerBuilder.append(inputLine);
            in.close();
            jsonObject = new JSONObject(answerBuilder.toString());
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Problem with initializing JSONObject",(JSONException)(Object) e);
        }
        return jsonObject;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCity(){ return null; }
	public MyHelperClass getFromLocation(){ return null; }
	public MyHelperClass getToLocation(){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass error(String o0, JSONException o1){ return null; }}

class Trip {

public MyHelperClass getWaypoint(){ return null; }}

class List {

public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class Waypoint {

public MyHelperClass getToLocation(){ return null; }
	public MyHelperClass getFromLocation(){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class LinkedList {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
