


class c21723842 {
public MyHelperClass assertThat(URL o0){ return null; }
	public MyHelperClass assertThat(InputStream o0){ return null; }

//    @Test
    public void lookingUpResources() throws IOException {
        StickyEmbedder b = new StickyEmbedder("--debug", "--trace") {

//            @Override
            protected File deriveApplicationFile() {
                return new File("src/test/samples/sticky-deployer-sample-2jar-1.2-sample.jar");
            }
        };
        b.initialise();
        assertThat((URL)(Object)b.getLibraries()).hasSize(2);
        assertThat((URL)(Object)b.getLibraries().iterator().next().getClasses()).hasSize(1);
        assertThat((URL)(Object)b.getLibraries().iterator().next().getResources()).hasSize(8);
        URL url =(URL)(Object) b.getClassLoader().findResource("net/stickycode/deploy/sample/babysteps/run.properties");
        assertThat(url).isNotNull();
        InputStream i =(InputStream)(Object) url.openStream();
        assertThat(i).isNotNull();
        assertThat((URL)(Object)new BufferedReader(new InputStreamReader(i)).readLine()).isEqualTo("run=running is step 3");
        Enumeration e =(Enumeration)(Object) b.getClassLoader().findResources("net/stickycode/deploy/sample/babysteps/run.properties");
        assertThat((URL)(Object)e.hasMoreElements()).isTrue();
        assertThat((URL)(Object)e.nextElement()).isNotNull();
        assertThat((URL)(Object)e.hasMoreElements()).isFalse();
        Enumeration manifests =(Enumeration)(Object) b.getClassLoader().findResources("net/stickycode/deploy/sample/duplicate.properties");
        assertThat((URL)(Object)manifests.hasMoreElements()).isTrue();
        assertThat((URL)(Object)manifests.nextElement()).isNotNull();
        assertThat((URL)(Object)manifests.hasMoreElements()).isTrue();
        assertThat((URL)(Object)manifests.nextElement()).isNotNull();
        assertThat((URL)(Object)manifests.hasMoreElements()).isFalse();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isEqualTo(String o0){ return null; }
	public MyHelperClass isTrue(){ return null; }
	public MyHelperClass findResource(String o0){ return null; }
	public MyHelperClass isNotNull(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass isFalse(){ return null; }
	public MyHelperClass getResources(){ return null; }
	public MyHelperClass findResources(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass hasSize(int o0){ return null; }
	public MyHelperClass getClasses(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class StickyEmbedder {

StickyEmbedder(){}
	StickyEmbedder(String o0, String o1){}
	public MyHelperClass getLibraries(){ return null; }
	public MyHelperClass initialise(){ return null; }
	public MyHelperClass getClassLoader(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class File {

File(String o0){}
	File(){}}
