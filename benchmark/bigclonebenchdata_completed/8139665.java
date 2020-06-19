


class c8139665 {
public MyHelperClass getCurrencyMonitor(CurrencyEntityManager o0, Long o1){ return null; }

    public ActionResponse executeAction(ActionRequest request) throws Exception {
        BufferedReader in = null;
        try {
            CurrencyEntityManager em = new CurrencyEntityManager();
            String id = (String)(String)(Object) request.getProperty("ID");
            CurrencyMonitor cm =(CurrencyMonitor)(Object) getCurrencyMonitor(em, Long.valueOf(id));
            String code =(String)(Object) cm.getCode();
            MyHelperClass DEFAULT_SYMBOL = new MyHelperClass();
            if (code == null || code.length() == 0) code =(String)(Object) DEFAULT_SYMBOL;
            MyHelperClass URL = new MyHelperClass();
            String tmp =(String)(Object) URL.replace("@", code);
            ActionResponse resp = new ActionResponse();
            URL url = new URL(tmp);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            int status =(int)(Object) conn.getResponseCode();
            if (status == 200) {
                in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder value = new StringBuilder();
                while (true) {
                    String line =(String)(Object) in.readLine();
                    if (line == null) break;
                    value.append(line);
                }
                cm.setLastUpdateValue(new BigDecimal(value.toString()));
                cm.setLastUpdateTs(new Date());
                em.updateCurrencyMonitor(cm);
                resp.addResult("CURRENCYMONITOR", cm);
            } else {
                MyHelperClass ActionResponse = new MyHelperClass();
                resp.setErrorCode(ActionResponse.GENERAL_ERROR);
                resp.setErrorMessage("HTTP Error [" + status + "]");
            }
            return resp;
        } catch (Exception e) {
            MyHelperClass MiscUtils = new MyHelperClass();
            String st =(String)(Object) MiscUtils.stackTrace2String(e);
            MyHelperClass logger = new MyHelperClass();
            logger.error(st);
            throw e;
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GENERAL_ERROR;
public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass stackTrace2String(Exception o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class ActionRequest {

public MyHelperClass getProperty(String o0){ return null; }}

class ActionResponse {

public MyHelperClass addResult(String o0, CurrencyMonitor o1){ return null; }
	public MyHelperClass setErrorMessage(String o0){ return null; }
	public MyHelperClass setErrorCode(MyHelperClass o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class CurrencyEntityManager {

public MyHelperClass updateCurrencyMonitor(CurrencyMonitor o0){ return null; }}

class CurrencyMonitor {

public MyHelperClass setLastUpdateTs(Date o0){ return null; }
	public MyHelperClass setLastUpdateValue(BigDecimal o0){ return null; }
	public MyHelperClass getCode(){ return null; }}

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

class BigDecimal {

BigDecimal(String o0){}
	BigDecimal(){}}

class Date {

}
