


class c6635999 {

    public String grabId(String itemName) throws Exception {
        StringBuffer modified = new StringBuffer(itemName);
        for (int i = 0; i <= modified.length() - 1; i++) {
            char ichar = modified.charAt(i);
            if (ichar == ' ') modified = modified.replace(i, i + 1, "+");
        }
        itemName = modified.toString();
        try {
            MyHelperClass searchURL = new MyHelperClass();
            URL url = new URL(searchURL + itemName);
            InputStream urlStream =(InputStream)(Object) url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlStream, "UTF-8"));
            while ((boolean)(Object)reader.ready()) {
                String htmlLine =(String)(Object) reader.readLine();
                MyHelperClass searchForItemId = new MyHelperClass();
                int indexOfSearchStart = htmlLine.indexOf((int)(Object)searchForItemId);
                if (indexOfSearchStart != -1) {
                    int idStart = htmlLine.indexOf("=", indexOfSearchStart);
                    idStart++;
                    int idEnd = htmlLine.indexOf("'", idStart);
                    String id;// = new String();
                    id = htmlLine.substring(idStart, idEnd);
                }
            }
            MyHelperClass id = new MyHelperClass();
            if ((String)(Object)id == "") return null; else return (String)(Object)id;
        } catch (Exception ex) {
            System.out.println("Exception in lookup: " + ex);
            throw (ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass ready(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}
