


class c3156557 {

    public boolean checkWebsite(String URL, String content) {
        boolean run = false;
        try {
            URL url = new URL(URL + "?a=" + Math.random());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = "";
            while ((line =(String)(Object) reader.readLine()) != null) {
                if (line.contains(content)) {
                    run = true;
                }
            }
        } catch (Exception e) {
            run = false;
        }
        return run;
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
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
