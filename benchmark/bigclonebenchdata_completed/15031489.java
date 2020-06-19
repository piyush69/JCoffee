
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15031489 {

    public Point getCoordinates(String address, String city, String state, String country) {
        StringBuilder queryString = new StringBuilder();
        StringBuilder urlString = new StringBuilder();
        StringBuilder response = new StringBuilder();
        if (address != null) {
            queryString.append(address.trim().replaceAll(" ", "+"));
            queryString.append("+");
        }
        if (city != null) {
            queryString.append(city.trim().replaceAll(" ", "+"));
            queryString.append("+");
        }
        if (state != null) {
            queryString.append(state.trim().replaceAll(" ", "+"));
            queryString.append("+");
        }
        if (country != null) {
            queryString.append(country.replaceAll(" ", "+"));
        }
        urlString.append("http://maps.google.com/maps/geo?key=");
        MyHelperClass key = new MyHelperClass();
        urlString.append(key);
        urlString.append("&sensor=false&output=json&oe=utf8&q=");
        urlString.append(queryString.toString());
        try {
            URL url = new URL(urlString.toString());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            MyHelperClass JSONValue = new MyHelperClass();
            JSONObject root = (JSONObject)(JSONObject)(Object) JSONValue.parse(response.toString());
            JSONObject placemark = (JSONObject)(JSONObject)(Object) ((JSONArray)(JSONArray)(Object) root.get("Placemark")).get(0);
            JSONArray coordinates = (JSONArray)(JSONArray)(Object) ((JSONObject)(JSONObject)(Object) placemark.get("Point")).get("coordinates");
            Point point = new Point();
            point.setLatitude((Double)(Double)(Object) coordinates.get(1));
            point.setLongitude((Double)(Double)(Object) coordinates.get(0));
            return point;
        } catch (UncheckedIOException ex) {
            return null;
        } catch (NullPointerException ex) {
            return null;
        } catch (ArithmeticException ex) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass parse(String o0){ return null; }}

class Point {

public MyHelperClass setLongitude(Double o0){ return null; }
	public MyHelperClass setLatitude(Double o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class JSONObject {

public MyHelperClass get(String o0){ return null; }}

class JSONArray {

public MyHelperClass get(int o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
