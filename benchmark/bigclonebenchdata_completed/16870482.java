


class c16870482 {

    private void populateSessionId() throws IOException, java.net.MalformedURLException {
        String general_search_url = "http://agricola.nal.usda.gov/cgi-bin/Pwebrecon.cgi?" + "DB=local&CNT=1&Search_Arg=RNAi&Search_Code=GKEY&STARTDB=AGRIDB";
        String sidString = "", inputLine;
        BufferedReader in = new BufferedReader(new InputStreamReader((new URL(general_search_url)).openStream()));
        while ((inputLine =(String)(Object) in.readLine()) != null) {
            if (inputLine.startsWith("<INPUT TYPE=HIDDEN NAME=PID VALUE=")) {
                sidString = (inputLine.substring(inputLine.indexOf("PID VALUE=") + 11, inputLine.indexOf(">") - 1));
            }
        }
        int sessionId;// = new int();
        sessionId = Integer.parseInt(sidString.trim());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
