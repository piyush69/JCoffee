import java.io.*;
import java.lang.*;
import java.util.*;



class c13099033 {
public MyHelperClass NULL;
public MyHelperClass CommUtils;
	public MyHelperClass CsvReader;

    public void process(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String UrlStr = req.getRequestURL().toString();
        URL domainurl = new URL(UrlStr);
        MyHelperClass domain = new MyHelperClass();
        domain = domainurl.getHost();
        MyHelperClass pathinfo = new MyHelperClass();
        pathinfo = req.getPathInfo();
        String user_agent =(String)(Object) req.getHeader("user-agent");
        MyHelperClass UserAgent = new MyHelperClass();
        UserAgent userAgent =(UserAgent)(Object) UserAgent.parseUserAgentString(user_agent);
        String browser =(String)(Object) userAgent.getBrowser().getName();
//        MyHelperClass domain = new MyHelperClass();
        String[] shot_domain_array =(String[])(Object) domain.split("\\.");
        String shot_domain =(String)(Object) NULL; //new String();
        shot_domain = shot_domain_array[1] + "." + shot_domain_array[2];
        if (browser.equalsIgnoreCase("Robot/Spider") || browser.equalsIgnoreCase("Lynx") || browser.equalsIgnoreCase("Downloading Tool")) {
//            MyHelperClass shot_domain = new MyHelperClass();
            JSONObject domainJsonObject =(JSONObject)(Object) CsvReader.CsvReader("domainparUpdated.csv", shot_domain);
            MyHelperClass log = new MyHelperClass();
            log.info(domainJsonObject.toString());
        } else {
            String title;
            String locale;
            String facebookid;
            String color;
            String headImage;
            String google_ad_client;
            String google_ad_slot1;
            String google_ad_width1;
            String google_ad_height1;
            String google_ad_slot2;
            String google_ad_width2;
            String google_ad_height2;
            String google_ad_slot3;
            String google_ad_width3;
            String google_ad_height3;
            String countrycode = null;
            String city = null;
            String gmclickval = null;
            String videos = null;
            int intcount = 0;
            String strcount = "0";
            boolean countExist = false;
            Cookie[] cookies =(Cookie[])(Object) req.getCookies();
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("count")) {
                        strcount =(String)(Object) cookies[i].getValue();
                        if (strcount != null && strcount.length() > 0) {
                            MyHelperClass log = new MyHelperClass();
                            log.info("Check count " + strcount + " path " + cookies[i].getPath());
                            intcount = Integer.parseInt(strcount);
                            intcount++;
                        } else {
                            intcount = 1;
                        }
                        MyHelperClass log = new MyHelperClass();
                        log.info("New count " + intcount);
                        LongLivedCookie count = new LongLivedCookie("count", Integer.toString(intcount));
                        resp.addCookie(count);
                        countExist = true;
                    }
                    if (cookies[i].getName().equals("countrycode")) {
                        countrycode =(String)(Object) cookies[i].getValue();
                    }
                    if (cookies[i].getName().equals("city")) {
                        city =(String)(Object) cookies[i].getValue();
                    }
                    if (cookies[i].getName().equals("videos")) {
                        videos =(String)(Object) cookies[i].getValue();
                        MyHelperClass log = new MyHelperClass();
                        log.info("Welcome videos " + videos);
                    }
                    if (cookies[i].getName().equals("gmclick")) {
                        MyHelperClass log = new MyHelperClass();
                        log.info("gmclick exist!!");
                        gmclickval =(String)(Object) cookies[i].getValue();
                        if (intcount % 20 == 0 && intcount > 0) {
//                            MyHelperClass log = new MyHelperClass();
                            log.info("Cancell gmclick -> " + gmclickval + " intcount " + intcount + " path " + cookies[i].getPath());
                            Cookie gmclick = new Cookie("gmclick", "0");
                            gmclick.setPath("/");
                            gmclick.setMaxAge(0);
                            resp.addCookie(gmclick);
                        }
                    }
                }
                if (!countExist) {
                    LongLivedCookie count = new LongLivedCookie("count", "0");
                    resp.addCookie(count);
                    MyHelperClass log = new MyHelperClass();
                    log.info(" Not First visit count Don't Exist!!");
                }
                if (videos == null) {
                    LongLivedCookie videoscookies = new LongLivedCookie("videos", "0");
                    resp.addCookie(videoscookies);
                    MyHelperClass log = new MyHelperClass();
                    log.info("Not First visit VIDEOS Don't Exist!!");
                }
            } else {
                LongLivedCookie count = new LongLivedCookie("count", strcount);
                resp.addCookie(count);
                LongLivedCookie videosfirstcookies = new LongLivedCookie("videos", "0");
                resp.addCookie(videosfirstcookies);
                MyHelperClass log = new MyHelperClass();
                log.info("First visit count = " + intcount + " videos 0");
            }
//            MyHelperClass domain = new MyHelperClass();
            String[] dompar =(String[])(Object) CommUtils.CsvParsing(domain, "domainpar.csv");
            title = dompar[0];
            locale = dompar[1];
            facebookid = dompar[2];
            color = dompar[3];
            headImage = dompar[4];
            google_ad_client = dompar[5];
            google_ad_slot1 = dompar[6];
            google_ad_width1 = dompar[7];
            google_ad_height1 = dompar[8];
            google_ad_slot2 = dompar[9];
            google_ad_width2 = dompar[10];
            google_ad_height2 = dompar[11];
            google_ad_slot3 = dompar[12];
            google_ad_width3 = dompar[13];
            google_ad_height3 = dompar[14];
            String ip =(String)(Object) req.getRemoteHost();
            if ((countrycode == null) || (city == null)) {
                String ipServiceCall = "http://api.ipinfodb.com/v2/ip_query.php?key=abbb04fd823793c5343a046e5d56225af37861b9020e9bc86313eb20486b6133&ip=" + ip + "&output=json";
                String strCallResult = "";
                URL url = new URL(ipServiceCall);
                BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream)(Object)url.openStream(), "UTF8"));
                StringBuffer response = new StringBuffer();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                strCallResult = response.toString();
                try {
                    JSONObject jso = new JSONObject(strCallResult);
                    MyHelperClass log = new MyHelperClass();
                    log.info("Status -> " + jso.get("Status").toString());
//                    MyHelperClass log = new MyHelperClass();
                    log.info("City -> " + jso.get("City").toString());
                    city = jso.get("City").toString();
                    countrycode = jso.get("CountryCode").toString();
//                    MyHelperClass log = new MyHelperClass();
                    log.info("countrycode -> " + countrycode);
                    if ((city.length() == 0) || (city == null)) {
                        LongLivedCookie cookcity = new LongLivedCookie("city", "Helsinki");
                        resp.addCookie(cookcity);
                        city = "Helsinki";
                    } else {
                        LongLivedCookie cookcity = new LongLivedCookie("city", city);
                        resp.addCookie(cookcity);
                    }
                    if (countrycode.length() == 0 || (countrycode == null) || countrycode.equals("RD")) {
                        LongLivedCookie cookcountrycode = new LongLivedCookie("countrycode", "FI");
                        resp.addCookie(cookcountrycode);
                        countrycode = "FI";
                    } else {
                        LongLivedCookie cookcountrycode = new LongLivedCookie("countrycode", countrycode);
                        resp.addCookie(cookcountrycode);
                    }
                } catch (UncheckedIOException e) {
                    MyHelperClass log = new MyHelperClass();
                    log.severe(e.getMessage());
                } finally {
                    if ((countrycode == null) || (city == null)) {
                        MyHelperClass log = new MyHelperClass();
                        log.severe("need use finally!!!");
                        countrycode = "FI";
                        city = "Helsinki";
                        LongLivedCookie cookcity = new LongLivedCookie("city", "Helsinki");
                        resp.addCookie(cookcity);
                        LongLivedCookie cookcountrycode = new LongLivedCookie("countrycode", "FI");
                        resp.addCookie(cookcountrycode);
                    }
                }
            }
            JSONArray startjsonarray = new JSONArray();
            JSONArray memjsonarray = new JSONArray();
            Map<String, Object> map = new HashMap<String, Object>();
            Map<String, Object> mapt = new HashMap<String, Object>();
            mapt.put("img", headImage);
            mapt.put("color", color);
            mapt.put("title", title);
            mapt.put("locale", locale);
//            MyHelperClass domain = new MyHelperClass();
            mapt.put("domain", domain);
            mapt.put("facebookid", facebookid);
            mapt.put("ip", ip);
            mapt.put("countrycode", countrycode);
            mapt.put("city", city);
            map.put("theme", mapt);
            startjsonarray.put(map);
            String[] a = { "mem0", "mem20", "mem40", "mem60", "mem80", "mem100", "mem120", "mem140", "mem160", "mem180" };
            List memlist = Arrays.asList(a);
            Collections.shuffle(memlist);
            Map<String, Object> mammap = new HashMap<String, Object>();
            mammap.put("memlist", memlist);
            memjsonarray.put(mammap);
            MyHelperClass log = new MyHelperClass();
            log.info(memjsonarray.toString());
            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");
            PrintWriter out =(PrintWriter)(Object) resp.getWriter();
            out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
            out.println("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:fb=\"http://www.facebook.com/2008/fbml\">");
            out.println("<head>");
            out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
            out.println("<meta name=\"gwt:property\" content=\"locale=" + locale + "\">");
            out.println("<link type=\"text/css\" rel=\"stylesheet\" href=\"NewTube.css\">");
            out.println("<title>" + title + "</title>");
            out.println("<script type=\"text/javascript\" language=\"javascript\" src=\"newtube/newtube.nocache.js\"></script>");
            out.println("<script type='text/javascript'>var jsonStartParams = " + startjsonarray.toString() + ";</script>");
            MyHelperClass CommUtils = new MyHelperClass();
            out.println("<script type='text/javascript'>var girlsphones = " + CommUtils.CsvtoJson("girlsphones.csv").toString() + ";</script>");
            out.println("<script type='text/javascript'>");
            out.println("var mem = " + memjsonarray.toString() + ";");
            out.println("</script>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='fb-root'></div>");
            out.println("<script>");
            out.println("window.fbAsyncInit = function() {");
            out.println("FB.init({appId: '" + facebookid + "', status: true, cookie: true,xfbml: true});};");
            out.println("(function() {");
            out.println("var e = document.createElement('script'); e.async = true;");
            out.println("e.src = document.location.protocol +");
            out.println("'//connect.facebook.net/" + locale + "/all.js';");
            out.println("document.getElementById('fb-root').appendChild(e);");
            out.println("}());");
            out.println("</script>");
            out.println("<div id=\"start\"></div>");
            out.println("<div id=\"seo_content\">");
//            MyHelperClass domain = new MyHelperClass();
            BufferedReader bufRdr = new BufferedReader(new InputStreamReader(new FileInputStream(domain + ".html"), "UTF8"));
            String contline = null;
            while ((contline = bufRdr.readLine()) != null) {
                out.println(contline);
            }
            bufRdr.close();
            if (countrycode != null && !countrycode.equalsIgnoreCase("US") && !countrycode.equalsIgnoreCase("IE") && !countrycode.equalsIgnoreCase("UK") && intcount > 2 && intcount < 51) {
                out.println("<script type=\"text/javascript\"><!--");
                out.println("google_ad_client = \"" + google_ad_client + "\";");
                out.println("google_ad_slot = \"" + google_ad_slot1 + "\";");
                out.println("google_ad_width = " + google_ad_width1 + ";");
                out.println("google_ad_height = " + google_ad_height1 + ";");
                out.println("//-->");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"");
                out.println("src=\"" + google_ad_client + ".js\">");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"><!--");
                out.println("google_ad_client = \"" + google_ad_client + "\";");
                out.println("google_ad_slot = \"" + google_ad_slot2 + "\";");
                out.println("google_ad_width = " + google_ad_width2 + ";");
                out.println("google_ad_height = " + google_ad_height2 + ";");
                out.println("//-->");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"");
                out.println("src=\"" + google_ad_client + ".js\">");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"><!--");
                out.println("google_ad_client = \"" + google_ad_client + "\";");
                out.println("google_ad_slot = \"" + google_ad_slot3 + "\";");
                out.println("google_ad_width = " + google_ad_width3 + ";");
                out.println("google_ad_height = " + google_ad_height3 + ";");
                out.println("//-->");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"");
                out.println("src=\"" + google_ad_client + ".js\">");
                out.println("</script>");
            }
            if (countrycode != null && !countrycode.equalsIgnoreCase("US") && !countrycode.equalsIgnoreCase("IE") && !countrycode.equalsIgnoreCase("UK") && intcount > 50) {
                out.println("<script type=\"text/javascript\"><!--");
                out.println("google_ad_client = \"" + "pub-9496078135369870" + "\";");
                out.println("google_ad_slot = \"" + "8683942065" + "\";");
                out.println("google_ad_width = " + "160" + ";");
                out.println("google_ad_height = " + "600" + ";");
                out.println("//-->");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"");
                out.println("src=\"pub-9496078135369870" + "" + ".js\">");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"><!--");
                out.println("google_ad_client = \"" + "pub-9496078135369870" + "\";");
                out.println("google_ad_slot = \"" + "0941291340" + "\";");
                out.println("google_ad_width = " + "728" + ";");
                out.println("google_ad_height = " + "90" + ";");
                out.println("//-->");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"");
                out.println("src=\"" + "pub-9496078135369870" + ".js\">");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"><!--");
                out.println("google_ad_client = \"" + "pub-9496078135369870" + "\";");
                out.println("google_ad_slot = \"" + "4621616265" + "\";");
                out.println("google_ad_width = " + "468" + ";");
                out.println("google_ad_height = " + "60" + ";");
                out.println("//-->");
                out.println("</script>");
                out.println("<script type=\"text/javascript\"");
                out.println("src=\"" + "pub-9496078135369870" + ".js\">");
                out.println("</script>");
            }
            out.println("</div>");
            out.println("</body></html>");
            out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass CsvReader(String o0, String o1){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass CsvtoJson(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass CsvParsing(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass parseUserAgentString(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getRequestURL(){ return null; }
	public MyHelperClass getHeader(String o0){ return null; }
	public MyHelperClass getPathInfo(){ return null; }
	public MyHelperClass getCookies(){ return null; }
	public MyHelperClass getRemoteHost(){ return null; }}

class HttpServletResponse {

public MyHelperClass getWriter(){ return null; }
	public MyHelperClass addCookie(Cookie o0){ return null; }
	public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass addCookie(LongLivedCookie o0){ return null; }
	public MyHelperClass setCharacterEncoding(String o0){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class UserAgent {

public MyHelperClass getBrowser(){ return null; }}

class JSONObject {

JSONObject(){}
	JSONObject(String o0){}
	public MyHelperClass get(String o0){ return null; }}

class Cookie {

Cookie(String o0, String o1){}
	Cookie(){}
	public MyHelperClass setPath(String o0){ return null; }
	public MyHelperClass setMaxAge(int o0){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class LongLivedCookie {

LongLivedCookie(String o0, String o1){}
	LongLivedCookie(){}}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class JSONArray {

public MyHelperClass put(Map<String,Object> o0){ return null; }}
