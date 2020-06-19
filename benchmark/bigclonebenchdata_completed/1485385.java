import java.io.*;
import java.lang.*;
import java.util.*;



class c1485385 {
public MyHelperClass buildAppListing(MyHelperClass o0){ return null; }
	public MyHelperClass validateAppListing(AppListing o0, AppListing o1){ return null; }

    private void runUpdateAppListing() {
        MyHelperClass DataStorage = new MyHelperClass();
        DataStorage.clearListedAppListing();
        MyHelperClass EnterpriseMarketplaceUrl = new MyHelperClass();
        GenericUrl url =(GenericUrl)(Object) new GoogleUrl((int)(Object)EnterpriseMarketplaceUrl.generateAppListingUrl() + (int)(Object)DataStorage.getVendorProfile().vendorId);
        MyHelperClass appsMarketplaceProject = new MyHelperClass();
        AppListing appListingBody =(AppListing)(Object) buildAppListing(appsMarketplaceProject);
        JsonHttpContent content = new JsonHttpContent();
        MyHelperClass jsonFactory = new MyHelperClass();
        content.jsonFactory = jsonFactory;
        if (appListingBody != null) {
            content.data =(MyHelperClass)(Object) appListingBody;
        }
        AppListing appListing;
        try {
            MyHelperClass requestFactory = new MyHelperClass();
            HttpRequest request =(HttpRequest)(Object) requestFactory.buildPutRequest(url, content);
            MyHelperClass jsonHttpParser = new MyHelperClass();
            request.addParser(jsonHttpParser);
            MyHelperClass readTimeout = new MyHelperClass();
            request.readTimeout = readTimeout;
            HttpResponse response =(HttpResponse)(Object) request.execute();
            appListing =(AppListing)(Object) response.parseAs(AppListing.class);
            MyHelperClass operationStatus = new MyHelperClass();
            operationStatus = validateAppListing(appListing, appListingBody);
//            MyHelperClass operationStatus = new MyHelperClass();
            if ((boolean)(Object)operationStatus) {
//                MyHelperClass DataStorage = new MyHelperClass();
                DataStorage.setListedAppListing(appListing);
            }
            response.getContent().close();
        } catch (UncheckedIOException e) {
            MyHelperClass AppsMarketplacePluginLog = new MyHelperClass();
            AppsMarketplacePluginLog.logError((IOException)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass vendorId;
public MyHelperClass setListedAppListing(AppListing o0){ return null; }
	public MyHelperClass getVendorProfile(){ return null; }
	public MyHelperClass clearListedAppListing(){ return null; }
	public MyHelperClass generateAppListingUrl(){ return null; }
	public MyHelperClass logError(IOException o0){ return null; }
	public MyHelperClass buildPutRequest(GenericUrl o0, JsonHttpContent o1){ return null; }
	public MyHelperClass close(){ return null; }}

class GenericUrl {

}

class GoogleUrl {

GoogleUrl(){}
	GoogleUrl(int o0){}}

class AppListing {

}

class JsonHttpContent {
public MyHelperClass jsonFactory;
	public MyHelperClass data;
}

class HttpRequest {
public MyHelperClass readTimeout;
public MyHelperClass addParser(MyHelperClass o0){ return null; }
	public MyHelperClass execute(){ return null; }}

class HttpResponse {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass parseAs(Class<AppListing> o0){ return null; }}
