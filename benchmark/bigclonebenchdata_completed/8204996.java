import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8204996 {
public MyHelperClass addAuthentication(HttpGet o0){ return null; }
public MyHelperClass buildTemplateListFromJson(String o0){ return null; }

    public List<Template> getTemplatesByKeywordsAndPage(String keywords, int page)  throws Throwable {
        String newKeywords = keywords;
        if (keywords == null || keywords.trim().length() == 0) {
            MyHelperClass TemplateService = new MyHelperClass();
            newKeywords =(String)(Object) TemplateService.NO_KEYWORDS;
        }
        List<Template> templates = new ArrayList<Template>();
        MyHelperClass configuration = new MyHelperClass();
        String restURL = configuration.getBeehiveRESTRootUrl() + "templates/keywords/" + newKeywords + "/page/" + page;
        HttpGet httpGet = new HttpGet(restURL);
        httpGet.setHeader("Accept", "application/json");
        this.addAuthentication(httpGet);
        HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
        try {
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(httpGet);
            MyHelperClass HttpServletResponse = new MyHelperClass();
            if (response.getStatusLine().getStatusCode() != HttpServletResponse.SC_OK) {
//                MyHelperClass HttpServletResponse = new MyHelperClass();
                if (response.getStatusLine().getStatusCode() == HttpServletResponse.SC_UNAUTHORIZED) {
                    MyHelperClass userService = new MyHelperClass();
                    throw new NotAuthenticatedException("User " + userService.getCurrentUser().getUsername() + " not authenticated! ");
                }
                throw new BeehiveNotAvailableException("Beehive is not available right now! ");
            }
            InputStreamReader reader = new InputStreamReader((InputStream)(Object)response.getEntity().getContent());
            BufferedReader buffReader = new BufferedReader(reader);
            StringBuilder sb = new StringBuilder();
            String line = "";
            while ((line = buffReader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            String result = sb.toString();
            TemplateList templateList =(TemplateList)(Object) buildTemplateListFromJson(result);
            List<TemplateDTO> dtoes =(List<TemplateDTO>)(Object) templateList.getTemplates();
            for (TemplateDTO dto : dtoes) {
                templates.add((Template)(Object)dto.toTemplate());
            }
        } catch (IOException e) {
            throw new BeehiveNotAvailableException("Failed to get template list, The beehive is not available right now ", e);
        }
        return templates;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass NO_KEYWORDS;
	public MyHelperClass SC_UNAUTHORIZED;
public MyHelperClass getBeehiveRESTRootUrl(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getCurrentUser(){ return null; }}

class Template {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class NotAuthenticatedException extends Exception{
	public NotAuthenticatedException(String errorMessage) { super(errorMessage); }
}

class BeehiveNotAvailableException extends Exception{
	public BeehiveNotAvailableException(String errorMessage) { super(errorMessage); }
	BeehiveNotAvailableException(){}
	BeehiveNotAvailableException(String o0, IOException o1){}
}

class TemplateList {

public MyHelperClass getTemplates(){ return null; }}

class TemplateDTO {

public MyHelperClass toTemplate(){ return null; }}
