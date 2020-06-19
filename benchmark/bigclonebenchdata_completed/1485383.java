
import java.io.UncheckedIOException;


class c1485383 {

    private void runGetAppListing() {
        MyHelperClass DataStorage = new MyHelperClass();
        DataStorage.clearAppListings();
        MyHelperClass EnterpriseMarketplaceUrl = new MyHelperClass();
        GenericUrl url =(GenericUrl)(Object) new GoogleUrl((int)(Object)EnterpriseMarketplaceUrl.generateAppListingUrl() + (int)(Object)DataStorage.getVendorProfile().vendorId);
        AppListingList appListingList;
        try {
            MyHelperClass requestFactory = new MyHelperClass();
            HttpRequest request =(HttpRequest)(Object) requestFactory.buildGetRequest(url);
            MyHelperClass jsonHttpParser = new MyHelperClass();
            request.addParser(jsonHttpParser);
            MyHelperClass readTimeout = new MyHelperClass();
            request.readTimeout = readTimeout;
            HttpResponse response =(HttpResponse)(Object) request.execute();
            appListingList =(AppListingList)(Object) response.parseAs(AppListingList.class);
            if (appListingList != null && appListingList.appListings != null) {
                boolean operationStatus;// = new boolean();
                operationStatus = true;
//                MyHelperClass DataStorage = new MyHelperClass();
                DataStorage.setAppListings(appListingList.appListings);
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
public MyHelperClass setAppListings(MyHelperClass o0){ return null; }
	public MyHelperClass getVendorProfile(){ return null; }
	public MyHelperClass logError(IOException o0){ return null; }
	public MyHelperClass buildGetRequest(GenericUrl o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass clearAppListings(){ return null; }
	public MyHelperClass generateAppListingUrl(){ return null; }}

class GenericUrl {

}

class GoogleUrl {

GoogleUrl(){}
	GoogleUrl(int o0){}}

class AppListingList {
public MyHelperClass appListings;
}

class HttpRequest {
public MyHelperClass readTimeout;
public MyHelperClass execute(){ return null; }
	public MyHelperClass addParser(MyHelperClass o0){ return null; }}

class HttpResponse {

public MyHelperClass parseAs(Class<AppListingList> o0){ return null; }
	public MyHelperClass getContent(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
