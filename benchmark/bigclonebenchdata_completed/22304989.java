


class c22304989 {

    public ArrayList loadData(String address) {
        URL url;
        BufferedReader bf_in = null;
        ArrayList a = new ArrayList();
        String line;
        try {
            url = new URL(address);
            bf_in = new BufferedReader(new InputStreamReader(url.openStream()));
            while (((line =(String)(Object) bf_in.readLine()) != null)) {
                if (line.startsWith("Date")) {
                    continue;
                }
                if (line != null && line.length() > 0) {
                    a.add(line);
                }
            }
            bf_in.close();
        } catch (Exception e) {
            System.out.println("StockValumeHistory:loadData:Error:" + e);
        }
        return a;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

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
