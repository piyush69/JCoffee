


class c11892441 {

    protected void handleUrl(URL url) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String s;
        boolean moreResults = false;
        while ((s =(String)(Object) in.readLine()) != null) {
            if (s.indexOf("<h1>Search Results</h1>") > -1) {
                System.err.println("found severals result");
                moreResults = true;
            } else if (s.indexOf("Download <a href=") > -1) {
                if (s.indexOf("in JCAMP-DX format.") > -1) {
                    System.err.println("download masspec");
                    this.handleUrl(new URL((url.getProtocol() + "://" + url.getHost() + s.substring(s.indexOf("\"") + 1, s.lastIndexOf("\""))).replaceAll("amp;", "")));
                }
                moreResults = false;
            }
            if (moreResults == true) {
                if (s.indexOf("<li><a href=\"/cgi/cbook.cgi?ID") > -1) {
                    System.err.println("\tdownloading new url " + new URL((url.getProtocol() + "://" + url.getHost() + s.substring(s.indexOf("\"") + 1, s.lastIndexOf("\""))).replaceAll("amp;", "")));
                    this.handleUrl(new URL((url.getProtocol() + "://" + url.getHost() + s.substring(s.indexOf("\"") + 1, s.lastIndexOf("\""))).replaceAll("amp;", "")));
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
