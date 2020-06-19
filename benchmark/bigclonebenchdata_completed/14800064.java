


class c14800064 {

    protected Set moduleNamesFromReader(URL url) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        Set names =(Set)(Object) new HashSet();
        String line;
        while ((line =(String)(Object) reader.readLine()) != null) {
            line = line.trim();
            MyHelperClass nonCommentPattern = new MyHelperClass();
            Matcher m =(Matcher)(Object) nonCommentPattern.matcher(line);
            if ((boolean)(Object)m.find()) {
                names.add(m.group().trim());
            }
        }
        return names;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trim(){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Set {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class HashSet {

}

class Matcher {

public MyHelperClass group(){ return null; }
	public MyHelperClass find(){ return null; }}
