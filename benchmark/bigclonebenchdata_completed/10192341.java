


class c10192341 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        PositionParser pp;
        MyHelperClass Database = new MyHelperClass();
        Database.init("XIDResult");
        pp = new PositionParser("01:33:50.904+30:39:35.79");
        String url = "http://simbad.u-strasbg.fr/simbad/sim-script?submit=submit+script&script=";
        String script = "format object \"%IDLIST[%-30*]|-%COO(A)|%COO(D)|%OTYPELIST(S)\"\n";
        String tmp = "";
        script += pp.getPosition() + " radius=1m";
        MyHelperClass URLEncoder = new MyHelperClass();
        url += URLEncoder.encode(script, "ISO-8859-1");
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
                    String id = "";
                    for (int i = 0; i < pos; i++) {
                        id += fields[i];
                        if (i < (pos - 1)) {
                            id += "|";
                        }
                    }
                    if (id.length() <= 30) {
                        JSONArray darray = new JSONArray();
                        darray.add(id.trim());
                        darray.add(ra + " " + dec);
                        darray.add(type.trim());
                        dataarray.add(darray);
                        datasize++;
                    }
                }
            } else if (boeuf.startsWith("::data")) {
                data_found = true;
            }
        }
        retour.put("aaData", dataarray);
        retour.put("iTotalRecords", datasize);
        retour.put("iTotalDisplayRecords", datasize);
        System.out.println(retour.toJSONString());
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass init(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class PositionParser {

PositionParser(String o0){}
	PositionParser(){}
	public MyHelperClass getPosition(){ return null; }}

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

class JSONObject {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass put(String o0, JSONArray o1){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }
	public MyHelperClass toJSONString(){ return null; }}

class JSONArray {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass add(JSONArray o0){ return null; }
	public MyHelperClass add(JSONObject o0){ return null; }}
