


class c19360796 {
public MyHelperClass channelId;

    private Set read() throws IOException {
        MyHelperClass urlPrefix = new MyHelperClass();
        URL url = new URL((int)(Object)urlPrefix + (int)(Object)channelId + ".dat");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line =(String)(Object) in.readLine();
        Set programs =(Set)(Object) new HashSet();
        while (line != null) {
            String[] values = line.split("~");
            if (values.length != 23) {
                throw new RuntimeException("error: incorrect format for radiotimes information");
            }
            MyHelperClass channelId = new MyHelperClass();
            Program program =(Program)(Object) new RadioTimesProgram(values, channelId);
            programs.add(program);
            line =(String)(Object) in.readLine();
        }
        return programs;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Set {

public MyHelperClass add(Program o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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

class HashSet {

}

class Program {

}

class RadioTimesProgram {

RadioTimesProgram(String[] o0, MyHelperClass o1){}
	RadioTimesProgram(){}}
