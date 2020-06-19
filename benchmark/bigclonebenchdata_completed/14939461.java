


class c14939461 {
public MyHelperClass getURL(String o0, PortfolioEntry o1){ return null; }
public MyHelperClass MiscUtils;
	public MyHelperClass ActionResponse;
	public MyHelperClass parseData(String o0, String o1){ return null; }

    private void populatePortfolioEntry(ActionResponse resp, PortfolioEntry e, String market) throws Exception {
        String tmp =(String)(Object) getURL(market, e);
        if (tmp == null) {
            MyHelperClass URL_QUOTE_DATA = new MyHelperClass();
            tmp =(String)(Object) URL_QUOTE_DATA;
        }
        tmp = tmp.replace((char)(Object)"@",(char)(Object) e.getSymbol());
        URL url = new URL(tmp);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        BufferedReader in = null;
        try {
            int status =(int)(Object) conn.getResponseCode();
            if (status == 200) {
                in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuffer responseBody = new StringBuffer();
                while (true) {
                    String line =(String)(Object) in.readLine();
                    if (line == null) break;
                    responseBody.append(line);
                }
                ArrayList data =(ArrayList)(Object) parseData(responseBody.toString(), ",");
                if ((int)(Object)data.size() == 2) {
                    e.setName(MiscUtils.trimChars((String)(Object)data.get(0), '"'));
                    String val =(String)(Object) data.get(1);
                    val =(String)(Object) MiscUtils.trimChars(val.trim(), '\r');
                    val =(String)(Object) MiscUtils.trimChars(val.trim(), '\n');
                    BigDecimal d = new BigDecimal(val);
                    e.setPricePerShare(d);
                } else {
                    resp.setErrorCode(ActionResponse.GENERAL_ERROR);
                    resp.setErrorMessage("Error retrieving data");
                }
            } else {
                resp.setErrorCode(ActionResponse.GENERAL_ERROR);
                resp.setErrorMessage("Error retrieving data Http code: " + status);
            }
        } finally {
            if (in != null) in.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GENERAL_ERROR;
public MyHelperClass trimChars(String o0, char o1){ return null; }}

class ActionResponse {

public MyHelperClass setErrorMessage(String o0){ return null; }
	public MyHelperClass setErrorCode(MyHelperClass o0){ return null; }}

class PortfolioEntry {

public MyHelperClass getSymbol(){ return null; }
	public MyHelperClass setPricePerShare(BigDecimal o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class BigDecimal {

BigDecimal(String o0){}
	BigDecimal(){}}
