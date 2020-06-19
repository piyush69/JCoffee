


class c21933390 {

    public static List getServers() throws Exception {
        List servers =(List)(Object) new ArrayList();
        URL url = new URL("http://tfast.org/en/servers.php");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line = null;
        while ((line =(String)(Object) in.readLine()) != null) {
            if (line.contains("serv=")) {
                int i = line.indexOf("serv=");
                servers.add(line.substring(i + 5, line.indexOf("\"", i)));
            }
        }
        in.close();
        return servers;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
