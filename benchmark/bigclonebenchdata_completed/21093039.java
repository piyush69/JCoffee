


class c21093039 {
public MyHelperClass data;
	public MyHelperClass dumpampData(String o0, ArrayList o1){ return null; }
	public MyHelperClass dumpxData(String o0, ArrayList o1){ return null; }
	public MyHelperClass dumpyData(String o0, ArrayList o1){ return null; }

    public ArrayList parseFile(File newfile) throws IOException {
        String s;
        String firstname;
        String secondname;
        String direction;
        String header;
        String name = null;
        String[] tokens;
        boolean readingHArrays = false;
        boolean readingVArrays = false;
        boolean readingAArrays = false;
        ArrayList xturndat = new ArrayList();
        ArrayList yturndat = new ArrayList();
        ArrayList ampturndat = new ArrayList();
        int nvalues;
        URL url =(URL)(Object) newfile.toURI().toURL();
        InputStream is =(InputStream)(Object) url.openStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        s =(String)(Object) br.readLine();
        s =(String)(Object) br.readLine();
        s =(String)(Object) br.readLine();
        s =(String)(Object) br.readLine();
        s =(String)(Object) br.readLine();
        s =(String)(Object) br.readLine();
        s =(String)(Object) br.readLine();
        while ((s =(String)(Object) br.readLine()) != null) {
            tokens = s.split("\\s+");
            nvalues = tokens.length;
            if (nvalues < 1) continue;
            firstname = tokens[0];
            secondname = tokens[1];
            if (secondname.startsWith("BPM")) {
                if (readingHArrays) dumpxData(name, xturndat); else if (readingVArrays) dumpyData(name, yturndat); else if (readingAArrays) dumpampData(name, ampturndat);
                direction = tokens[4];
                if (direction.equals("HORIZONTAL")) {
                    readingHArrays = true;
                    readingVArrays = false;
                    readingAArrays = false;
                }
                if (direction.equals("VERTICAL")) {
                    readingVArrays = true;
                    readingHArrays = false;
                    readingAArrays = false;
                }
                if (direction.equals("AMPLITUDE")) {
                    readingVArrays = false;
                    readingHArrays = false;
                    readingAArrays = true;
                }
                name = tokens[3];
                xturndat.clear();
                yturndat.clear();
                ampturndat.clear();
            }
            if (secondname.startsWith("WAVEFORM")) continue;
            if (nvalues == 3) {
                if (readingHArrays) xturndat.add(new Double(Double.parseDouble(tokens[2]))); else if (readingVArrays) yturndat.add(new Double(Double.parseDouble(tokens[2]))); else if (readingAArrays) ampturndat.add(new Double(Double.parseDouble(tokens[2])));
            }
        }
        dumpampData(name, ampturndat);
        MyHelperClass xdatamap = new MyHelperClass();
        data.add(xdatamap);
        MyHelperClass ydatamap = new MyHelperClass();
        data.add(ydatamap);
        MyHelperClass ampdatamap = new MyHelperClass();
        data.add(ampdatamap);
        MyHelperClass data = new MyHelperClass();
        return (ArrayList)(Object)data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toURL(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class File {

public MyHelperClass toURI(){ return null; }}

class ArrayList {

public MyHelperClass add(Double o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}
