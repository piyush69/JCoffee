


class c8898759 {

    public static List getFiles(int year, int month, int day, String type) throws Exception {
        ArrayList list = new ArrayList();
        MyHelperClass baseUrl = new MyHelperClass();
        URL url = new URL(baseUrl + "/" + year + "/" + ((month > 9) ? month : ("0" + month)) + "/" + ((day > 9) ? day : ("0" + day)));
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line =(String)(Object) br.readLine()) != null && line != "") {
            if (line.startsWith("<tr>") && line.indexOf("[TXT]") >= 0) {
                int i = line.indexOf("href=");
                i = i + 6;
                int j = line.indexOf("\"", i);
                String filename = line.substring(i, j);
                if (filename.matches(".*" + type + ".*")) {
                    list.add(filename);
                }
            }
        }
        br.close();
        return (List)(Object)list;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class List {

}

class ArrayList {

public MyHelperClass add(String o0){ return null; }}

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
