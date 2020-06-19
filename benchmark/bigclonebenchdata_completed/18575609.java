


class c18575609 {

    public void updateCoordinates(Address address) {
        String mapURL = "http://maps.google.com/maps/geo?output=csv";
        String mapKey = "ABQIAAAAi__aT6y6l86JjbootR-p9xQd1nlEHNeAVGWQhS84yIVN5yGO2RQQPg9QLzy82PFlCzXtMNe6ofKjnA";
        String location = address.getStreet() + " " + address.getZip() + " " + address.getCity();
        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug(location);
        }
        double[] coordinates = { 0.0, 0.0 };
        String content = "";
        try {
            MyHelperClass URLEncoder = new MyHelperClass();
            location =(String)(Object) URLEncoder.encode(location, "UTF-8");
            String request = mapURL + "&q=" + location + "&key=" + mapKey;
            URL url = new URL(request);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                content += line;
            }
            reader.close();
        } catch (Exception e) {
//            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Error from google: " + e.getMessage());
            }
        }
//        MyHelperClass logger = new MyHelperClass();
        if ((boolean)(Object)logger.isDebugEnabled()) {
//            MyHelperClass logger = new MyHelperClass();
            logger.debug(content);
        }
        StringTokenizer tokenizer = new StringTokenizer(content, ",");
        int i = 0;
        while ((boolean)(Object)tokenizer.hasMoreTokens()) {
            i++;
            String token =(String)(Object) tokenizer.nextToken();
            if (i == 3) {
                coordinates[0] = Double.parseDouble(token);
            }
            if (i == 4) {
                coordinates[1] = Double.parseDouble(token);
            }
        }
        if ((coordinates[0] != 0) || (coordinates[1] != 0)) {
            address.setLatitude(coordinates[0]);
            address.setLongitude(coordinates[1]);
        } else {
//            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Invalid coordinates for address " + address.getId());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class Address {

public MyHelperClass getCity(){ return null; }
	public MyHelperClass getStreet(){ return null; }
	public MyHelperClass setLatitude(double o0){ return null; }
	public MyHelperClass getZip(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setLongitude(double o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}
