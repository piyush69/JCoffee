
import java.io.UncheckedIOException;


class c1485384 {

    private void runGetVendorProfile() {
        MyHelperClass DataStorage = new MyHelperClass();
        DataStorage.clearVendorProfile();
        MyHelperClass EnterpriseMarketplaceUrl = new MyHelperClass();
        GenericUrl url =(GenericUrl)(Object) new GoogleUrl(EnterpriseMarketplaceUrl.generateVendorProfileUrl());
        VendorProfile vendorProfile = null;
        try {
            MyHelperClass requestFactory = new MyHelperClass();
            HttpRequest request =(HttpRequest)(Object) requestFactory.buildGetRequest(url);
            MyHelperClass jsonHttpParser = new MyHelperClass();
            request.addParser(jsonHttpParser);
            MyHelperClass readTimeout = new MyHelperClass();
            request.readTimeout = readTimeout;
            HttpResponse response =(HttpResponse)(Object) request.execute();
            vendorProfile =(VendorProfile)(Object) response.parseAs(VendorProfile.class);
            MyHelperClass StringUtilities = new MyHelperClass();
            if (vendorProfile != null && vendorProfile.vendorId != null && vendorProfile.email != null && !(Boolean)(Object)StringUtilities.isEmpty(vendorProfile.email)) {
//                MyHelperClass DataStorage = new MyHelperClass();
                DataStorage.setVendorProfile(vendorProfile);
                boolean operationStatus;// = new boolean();
                operationStatus = true;
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

public MyHelperClass generateVendorProfileUrl(){ return null; }
	public MyHelperClass clearVendorProfile(){ return null; }
	public MyHelperClass buildGetRequest(GenericUrl o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass setVendorProfile(VendorProfile o0){ return null; }
	public MyHelperClass logError(IOException o0){ return null; }}

class GenericUrl {

}

class GoogleUrl {

GoogleUrl(){}
	GoogleUrl(MyHelperClass o0){}}

class VendorProfile {
public MyHelperClass email;
	public MyHelperClass vendorId;
}

class HttpRequest {
public MyHelperClass readTimeout;
public MyHelperClass execute(){ return null; }
	public MyHelperClass addParser(MyHelperClass o0){ return null; }}

class HttpResponse {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass parseAs(Class<VendorProfile> o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
