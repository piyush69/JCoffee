


class c22771106 {

    private void triggerBuild(Properties props, String project, int rev) throws IOException {
        boolean doBld = Boolean.parseBoolean((String)(Object)props.getProperty(project + ".bld"));
        String url =(String)(Object) props.getProperty(project + ".url");
        if (!doBld || project == null || project.length() == 0) {
            System.out.println("BuildLauncher: Not configured to build '" + project + "'");
            return;
        } else if (url == null) {
            throw new IOException("Tried to launch build for project '" + project + "' but " + project + ".url property is not defined!");
        }
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        System.out.println(fmt.format(new Date()) + ": Triggering a build via: " + url);
        BufferedReader r = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
        while (r.readLine() != null) ;
        System.out.println(fmt.format(new Date()) + ": Build triggered!");
        MyHelperClass LATEST_BUILD = new MyHelperClass();
        LATEST_BUILD.put(project, rev);
        r.close();
        System.out.println(fmt.format(new Date()) + ": triggerBuild() done!");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, int o1){ return null; }}

class Properties {

public MyHelperClass getProperty(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0){ return null; }}

class Date {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
