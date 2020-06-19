


class c22467291 {
public MyHelperClass assertFalse(String o0, boolean o1){ return null; }
	public MyHelperClass assertNotNull(String o0, String o1){ return null; }

    public void testExecute() throws Exception {
        LocalWorker worker =(LocalWorker)(Object) new JTidyWorker();
        URL url = new URL("http://www.nature.com/index.html");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String str;
        StringBuffer sb = new StringBuffer();
        while ((str =(String)(Object) in.readLine()) != null) {
            sb.append(str);
            MyHelperClass LINE_ENDING = new MyHelperClass();
            sb.append(LINE_ENDING);
        }
        in.close();
        Map inputMap =(Map)(Object) new HashMap();
        DataThingAdapter inAdapter = new DataThingAdapter(inputMap);
        inAdapter.putString("inputHtml", sb.toString());
        Map outputMap =(Map)(Object) worker.execute(inputMap);
        DataThingAdapter outAdapter = new DataThingAdapter(outputMap);
        assertNotNull("The outputMap was null",(String)(Object) outputMap);
        String results =(String)(Object) outAdapter.getString("results");
        assertFalse("The results were empty", results.equals(""));
        assertNotNull("The results were null", results);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class LocalWorker {

public MyHelperClass execute(Map o0){ return null; }}

class JTidyWorker {

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

class Map {

}

class HashMap {

}

class DataThingAdapter {

DataThingAdapter(){}
	DataThingAdapter(Map o0){}
	public MyHelperClass putString(String o0, String o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }}
