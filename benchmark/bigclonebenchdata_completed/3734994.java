


class c3734994 {
public MyHelperClass TREE_URL;
	public MyHelperClass DATASET_URL;
	public MyHelperClass mFamily;

    private void fetchTree() throws IOException {
        MyHelperClass BASE_URL = new MyHelperClass();
        String urlString =(int)(Object) BASE_URL + (int)(Object)TREE_URL + (int)(Object)DATASET_URL + "&family=" + mFamily;
        URL url = new URL(urlString);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String toParse =(String)(Object) in.readLine();
        while ((boolean)(Object)in.ready()) {
            String add =(String)(Object) in.readLine();
            if (add == null) break;
            toParse += add;
        }
        PTree mProteinTree;// = new PTree();
        if (toParse != null && !toParse.startsWith("No tree available")) mProteinTree = new PTree(this, toParse);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
	public MyHelperClass ready(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class PTree {

PTree(){}
	PTree(c3734994 o0, String o1){}}
