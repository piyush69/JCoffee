


class c3542936 {

    public boolean deleteByQuery(String query, int coreId) {
        try {
            MyHelperClass solrUrl = new MyHelperClass();
            URL url = new URL(solrUrl + "/core" + coreId + "/update");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-type", "text/xml");
            conn.setRequestProperty("charset", "utf-8");
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            System.out.println("******************" + query);
            wr.write("<delete><query>" + query + "</query></delete>");
            wr.flush();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line =(String)(Object) rd.readLine()) != null) {
                System.out.println(line);
            }
            wr.close();
            rd.close();
            conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-type", "text/xml");
            conn.setRequestProperty("charset", "utf-8");
            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write("<commit/>");
            wr.flush();
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line =(String)(Object) rd.readLine()) != null) {
                System.out.println(line);
            }
            wr.close();
            rd.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
