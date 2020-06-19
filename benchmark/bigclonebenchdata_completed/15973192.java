


class c15973192 {

    private SpequlosResponse executeGet(String targetURL, String urlParameters) {
        URL url;
        HttpURLConnection connection = null;
        boolean succ = false;
        try {
            url = new URL(targetURL + "?" + urlParameters);
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Content-Language", "en-US");
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);
            InputStream is =(InputStream)(Object) connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer log = new StringBuffer();
            ArrayList response = new ArrayList();
            while ((line =(String)(Object) rd.readLine()) != null) {
                if (line.startsWith("<div class=\"qos\">")) {
                    System.out.println("here is the line : " + line);
                    String resp = line.split(">")[1].split("<")[0];
                    System.out.println("here is the splitted line : " + resp);
                    if (!resp.startsWith("None")) {
                        succ = true;
                        String[] values = resp.split(" ");
                        ArrayList realvalues = new ArrayList();
                        for (String s : values) {
                            realvalues.add(s);
                        }
                        if ((int)(Object)realvalues.size() == 5) {
                            realvalues.add(2, realvalues.get(2) + " " + realvalues.get(3));
                            realvalues.remove(3);
                            realvalues.remove(3);
                        }
                        for (String n :(String[])(Object) (Object[])(Object)realvalues) {
                            response.add(n);
                        }
                    }
                } else {
                    log.append(line);
                    log.append('\r');
                }
            }
            rd.close();
            SpequlosResponse speqresp = new SpequlosResponse(response, log.toString(), succ);
            return speqresp;
        } catch (Exception e) {
            e.printStackTrace();
            String log = "Please check the availability of Spequlos server!<br />" + "URL:" + targetURL + "<br />" + "PARAMETERS:" + urlParameters + "<br />";
            return new SpequlosResponse(null, log, succ);
        } finally {
            if (connection != null) connection.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SpequlosResponse {

SpequlosResponse(Object o0, String o1, boolean o2){}
	SpequlosResponse(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class ArrayList {

public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass add(int o0, String o1){ return null; }
	public MyHelperClass remove(int o0){ return null; }
	public MyHelperClass get(int o0){ return null; }}
