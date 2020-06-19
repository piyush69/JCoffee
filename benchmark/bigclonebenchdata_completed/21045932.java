


class c21045932 {
public MyHelperClass logger;
	public MyHelperClass updateEntry(PortfolioEntry o0, String o1){ return null; }

    @SuppressWarnings("unchecked")
    private void updatePortfolio(List entries, String query) {
        BufferedReader in = null;
        try {
            URL url = new URL(query);
            System.out.println(query);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            int status =(int)(Object) conn.getResponseCode();
            if (status == 200) {
                in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                int count = 0;
                while (true) {
                    String line =(String)(Object) in.readLine();
                    if (line == null || count >= (int)(Object)entries.size()) break;
                    updateEntry((PortfolioEntry)(PortfolioEntry)(Object) entries.get(count), line);
                    count++;
                }
            }
        } catch (Exception e) {
            MyHelperClass MiscUtils = new MyHelperClass();
            logger.error(MiscUtils.stackTrace2String(e));
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception ignore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(MyHelperClass o0){ return null; }
	public MyHelperClass stackTrace2String(Exception o0){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class PortfolioEntry {

}
