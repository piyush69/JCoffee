


class c2046158 {

    String chooseHGVersion(String version) {
        String line = "";
        try {
            URL connectURL = new URL("http://genome.ucsc.edu/cgi-bin/hgGateway?db=" + version);
            InputStream urlStream =(InputStream)(Object) connectURL.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlStream));
            while ((line =(String)(Object) reader.readLine()) != null) {
                if (line.indexOf("hgsid") != -1) {
                    line = line.substring(line.indexOf("hgsid"));
                    line = line.substring(line.indexOf("VALUE=\"") + 7);
                    line = line.substring(0, line.indexOf("\""));
                    return line;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
