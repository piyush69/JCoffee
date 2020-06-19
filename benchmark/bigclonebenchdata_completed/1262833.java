


class c1262833 {
public MyHelperClass fisier;
public MyHelperClass parseazaRegula(String o0){ return null; }

    public Collection citesteReguli() throws IOException {
        MyHelperClass urlulSpreLocatiaCurenta = new MyHelperClass();
        URL url = new URL(urlulSpreLocatiaCurenta, fisier);
        BufferedReader reader = new BufferedReader(new InputStreamReader((url.openStream())));
        Collection rezultat =(Collection)(Object) new ArrayList();
        String line = "";
        while (!"".equals(line =(String)(Object) reader.readLine())) {
            Regula r =(Regula)(Object) parseazaRegula(line);
            if (r != null) rezultat.add(r);
        }
        return rezultat;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Collection {

public MyHelperClass add(Regula o0){ return null; }}

class Regula {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0, MyHelperClass o1){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class ArrayList {

}
