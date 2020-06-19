


class c12171364 {

    private static FrameworkFactory getFrameworkFactory() throws Exception {
        URL url =(URL)(Object) Main.class.getClassLoader().getResource("META-INF/services/org.osgi.framework.launch.FrameworkFactory");
        if (url != null) {
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                for (String s =(String)(Object) br.readLine(); s != null; s =(String)(Object) br.readLine()) {
                    s = s.trim();
                    if ((s.length() > 0) && (s.charAt(0) != '#')) {
                        return (FrameworkFactory) Class.forName(s).newInstance();
                    }
                }
            } finally {
                if (br != null) br.close();
            }
        }
        throw new Exception("Could not find framework factory.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FrameworkFactory {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class Main {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
