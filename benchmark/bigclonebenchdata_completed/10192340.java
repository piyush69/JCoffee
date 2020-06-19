
import java.io.UncheckedIOException;


class c10192340 {
public MyHelperClass reportJsonError(HttpServletRequest o0, HttpServletResponse o1, QueryException o2){ return null; }
	public MyHelperClass printAccess(HttpServletRequest o0, boolean o1){ return null; }
	public MyHelperClass reportJsonError(HttpServletRequest o0, HttpServletResponse o1, String o2){ return null; }

    @SuppressWarnings("unchecked")
    private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printAccess(request, false);
        try {
            response.setContentType("application/json");
            String position =(String)(Object) request.getParameter("pos");
            if (position == null || position.length() == 0) {
                reportJsonError(request, response, "Missing position parameter");
            } else {
                PositionParser pp;
                pp = new PositionParser(position);
                String url = "http://simbad.u-strasbg.fr/simbad/sim-script?submit=submit+script&script=";
                MyHelperClass URLEncoder = new MyHelperClass();
                url += URLEncoder.encode("format object \"%IDLIST[%-30*]|-%COO(A)|%COO(D)|%OTYPELIST(S)\"\n" + pp.getPosition() + " radius=1m", "ISO-8859-1");
                System.out.println(url);
                URL simurl = new URL(url);
                BufferedReader in = new BufferedReader(new InputStreamReader(simurl.openStream()));
                String boeuf;
                boolean data_found = false;
                JSONObject retour = new JSONObject();
                JSONArray dataarray = new JSONArray();
                JSONArray colarray = new JSONArray();
                JSONObject jsloc = new JSONObject();
                jsloc.put("sTitle", "ID");
                colarray.add(jsloc);
                jsloc = new JSONObject();
                jsloc.put("sTitle", "Position");
                colarray.add(jsloc);
                jsloc = new JSONObject();
                jsloc.put("sTitle", "Type");
                colarray.add(jsloc);
                retour.put("aoColumns", colarray);
                int datasize = 0;
                while ((boeuf =(String)(Object) in.readLine()) != null) {
                    if (data_found) {
                        String[] fields = boeuf.trim().split("\\|", -1);
                        int pos = fields.length - 1;
                        if (pos >= 3) {
                            String type = fields[pos];
                            pos--;
                            String dec = fields[pos];
                            pos--;
                            String ra = fields[pos];
                            String id = fields[0].split("\\s{2,}")[0].trim();
                            JSONArray darray = new JSONArray();
                            darray.add(id.trim());
                            darray.add(ra + " " + dec);
                            darray.add(type.trim());
                            dataarray.add(darray);
                            datasize++;
                            if (datasize >= 15) {
                                darray = new JSONArray();
                                darray.add("truncated to 15");
                                darray.add("");
                                darray.add("");
                                dataarray.add(darray);
                                datasize++;
                            }
                        }
                    } else if (boeuf.startsWith("::data")) {
                        data_found = true;
                    }
                }
                in.close();
                retour.put("aaData", dataarray);
                retour.put("iTotalRecords", datasize);
                retour.put("iTotalDisplayRecords", datasize);
                MyHelperClass JsonUtils = new MyHelperClass();
                JsonUtils.teePrint(response.getOutputStream(), retour.toJSONString());
            }
        } catch (UncheckedIOException e) {
            reportJsonError(request, response,(QueryException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass teePrint(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PositionParser {

PositionParser(){}
	PositionParser(String o0){}
	public MyHelperClass getPosition(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class JSONObject {

public MyHelperClass toJSONString(){ return null; }
	public MyHelperClass put(String o0, JSONArray o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }}

class JSONArray {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass add(JSONArray o0){ return null; }
	public MyHelperClass add(JSONObject o0){ return null; }}

class QueryException extends Exception{
	public QueryException(String errorMessage) { super(errorMessage); }
}
