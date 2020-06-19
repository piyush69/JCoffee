


class c4149290 {

    private String getSearchResults(String id) {
        try {
            final URL url = new URL("http://www.jaap.nl/api/jaapAPI.do?clientId=iPhone&limit=5&request=details&id=" + id + "&format=JSON&field=street_nr&field=zip&field=city&field=price&field=thumb&field=since&field=houseType&field=area&field=rooms&field=id");
            final StringBuilder builder = new StringBuilder();
            final BufferedReader rd = new BufferedReader(new InputStreamReader(url.openStream()));
            String s = "";
            while ((s =(String)(Object) rd.readLine()) != null) {
                builder.append(s);
            }
            rd.close();
            return builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
