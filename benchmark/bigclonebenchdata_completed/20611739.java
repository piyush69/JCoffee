


class c20611739 {

    private static void includePodDependencies(Curnit curnit, JarOutputStream jarout) throws IOException {
        Properties props = new Properties();
        Collection pods =(Collection)(Object) curnit.getReferencedPods();
        for (Pod pod :(Pod[])(Object) (Object[])(Object)pods) {
            PodUuid podId =(PodUuid)(Object) pod.getPodId();
            MyHelperClass PodArchiveResolver = new MyHelperClass();
            URL weburl =(URL)(Object) PodArchiveResolver.getSystemResolver().getUrl(podId);
            String urlString = "";
            if (weburl != null) {
                String uriPath =(String)(Object) weburl.getPath();
                MyHelperClass CurnitFile = new MyHelperClass();
                String zipPath = CurnitFile.WITHINCURNIT_BASEPATH + uriPath;
                jarout.putNextEntry(new JarEntry(zipPath));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(weburl.openStream(), jarout);
                jarout.closeEntry();
//                MyHelperClass CurnitFile = new MyHelperClass();
                urlString = CurnitFile.WITHINCURNIT_PROTOCOL + uriPath;
            }
            props.put(podId.toString(), urlString);
        }
        MyHelperClass CurnitFile = new MyHelperClass();
        jarout.putNextEntry(new JarEntry((String)(Object)CurnitFile.PODSREFERENCED_NAME));
        props.store(jarout, "pod dependencies");
        jarout.closeEntry();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PODSREFERENCED_NAME;
	public MyHelperClass WITHINCURNIT_BASEPATH;
	public MyHelperClass WITHINCURNIT_PROTOCOL;
public MyHelperClass getUrl(PodUuid o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, JarOutputStream o1){ return null; }
	public MyHelperClass getSystemResolver(){ return null; }}

class Curnit {

public MyHelperClass getReferencedPods(){ return null; }}

class JarOutputStream {

public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Properties {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass store(JarOutputStream o0, String o1){ return null; }}

class Collection {

}

class Pod {

public MyHelperClass getPodId(){ return null; }}

class PodUuid {

}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}}
