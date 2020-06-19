


class c11904774 {
public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass assertEquals(List o0, List o1){ return null; }
public MyHelperClass fs;

    public void testFileSystem() throws IOException {
        MyHelperClass Fragment = new MyHelperClass();
        Fragment f =(Fragment)(Object) Fragment.EMPTY;
        Fragment g =(Fragment)(Object) f.plus(System.getProperty("java.io.tmpdir"));
        Fragment h =(Fragment)(Object) f.plus("april", "1971", "data.txt");
        Fragment i =(Fragment)(Object) f.plus(g, h);
        InOutLocation iol =(InOutLocation)(Object) fs.plus(i);
        PrintStream ps = new PrintStream(iol.openOutput());
        List expected =(List)(Object) new ArrayList();
        expected.add("So I am stepping out this old brown shoe");
        expected.add("Maybe I'm in love with you");
        for (String s :(String[])(Object) (Object[])(Object)expected) ps.println(s);
        ps.close();
        MyHelperClass locs = new MyHelperClass();
        InLocation inRoot =(InLocation)(Object) locs.fs;
        List lst =(List)(Object) read(inRoot.plus(i).openInput());
        assertEquals(expected, lst);
        URL url =(URL)(Object) iol.toUrl();
        lst =(List)(Object) read(url.openStream());
        assertEquals(expected, lst);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass fs;
	public MyHelperClass EMPTY;
public MyHelperClass plus(Fragment o0){ return null; }
	public MyHelperClass openInput(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Fragment {

public MyHelperClass plus(String o0){ return null; }
	public MyHelperClass plus(Fragment o0, Fragment o1){ return null; }
	public MyHelperClass plus(String o0, String o1, String o2){ return null; }}

class InOutLocation {

public MyHelperClass toUrl(){ return null; }
	public MyHelperClass openOutput(){ return null; }}

class PrintStream {

PrintStream(MyHelperClass o0){}
	PrintStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class InLocation {

public MyHelperClass plus(Fragment o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
