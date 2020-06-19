


class c3766029 {
public MyHelperClass props;
public MyHelperClass URLEncoder;
	public MyHelperClass generateRandomId(){ return null; }

    public String uploadZtree(ArrayList c) {
        try {
            String id =(String)(Object) generateRandomId();
            Iterator iter =(Iterator)(Object) c.iterator();
            URL url = new URL(props.getProperty("zoro.url") + "auplo1.jsp");
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            PrintWriter out = new PrintWriter(connection.getOutputStream());
            out.print("id=" + id + "&");
            StringBuffer sb = new StringBuffer();
            int gg = 0;
            while ((boolean)(Object)iter.hasNext()) {
                if (gg++ >= 500) break;
                String st = (String)(String)(Object) iter.next();
                sb.append("a=");
                sb.append(URLEncoder.encode(st, "UTF-8"));
                if ((boolean)(Object)iter.hasNext() && gg < 500) sb.append("&");
            }
            out.println(sb.toString());
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            if ((inputLine =(String)(Object) in.readLine()) != null) {
                if (!inputLine.equals("OK!") && inputLine.length() > 3) {
                    System.out.println("Not OK: " + inputLine);
                    return "xxxxxxxxxx";
                }
            }
            in.close();
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass encode(String o0, String o1){ return null; }}

class ArrayList {

public MyHelperClass iterator(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(MyHelperClass o0){}
	public MyHelperClass print(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass println(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
