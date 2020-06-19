import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8562659 {

    protected void validate(long googcmId, long reservePrice, String description, String category, int days, String status, String title, byte[] imgBytes) throws Throwable, PortalException, SystemException {
        MyHelperClass Validator = new MyHelperClass();
        if ((boolean)(Object)Validator.isNull(description)) throw new AuctionDescriptionException(); else if ((boolean)(Object)Validator.isNull(title)) throw new AuctionTitleException(); else if ((boolean)(Object)Validator.isNull(category)) throw new CategoryIdException();
        if (googcmId < 1000000000l | googcmId > 999999999999999l) throw new AuctionGoogCMIdException();
        long imgMaxSize = 1048576l;
        if ((imgBytes == null) || (imgBytes.length > ((int) imgMaxSize))) throw new AuctionImageSizeException();
        if (days != 3 & days != 7 & days != 10) throw new AuctionEndeDateException();
        if ((reservePrice < 0) || (reservePrice > 10000)) throw new AuctionReservePriceException();
        try {
            URL url = new URL("https://checkout.google.com/api/checkout/v2/checkoutForm/Merchant/" + googcmId);
            URLConnection conn = url.openConnection();
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            boolean sellerExists = true;
            String line;
            while ((line = rd.readLine()) != null) {
                if (line.contains("" + googcmId)) {
                    throw new AuctionGoogCMAccountException();
                }
            }
            rd.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isNull(String o0){ return null; }}

class PortalException extends Exception{
	public PortalException(String errorMessage) { super(errorMessage); }
}

class SystemException extends Exception{
	public SystemException(String errorMessage) { super(errorMessage); }
}

class AuctionGoogCMIdException extends Exception{
	public AuctionGoogCMIdException(String errorMessage) { super(errorMessage); }
	AuctionGoogCMIdException(){}
}

class AuctionImageSizeException extends Exception{
	public AuctionImageSizeException(String errorMessage) { super(errorMessage); }
	AuctionImageSizeException(){}
}

class AuctionEndeDateException extends Exception{
	public AuctionEndeDateException(String errorMessage) { super(errorMessage); }
	AuctionEndeDateException(){}
}

class AuctionReservePriceException extends Exception{
	public AuctionReservePriceException(String errorMessage) { super(errorMessage); }
	AuctionReservePriceException(){}
}

class AuctionGoogCMAccountException extends Exception{
	public AuctionGoogCMAccountException(String errorMessage) { super(errorMessage); }
	AuctionGoogCMAccountException(){}
}

class AuctionDescriptionException extends Exception{
	public AuctionDescriptionException(String errorMessage) { super(errorMessage); }
	AuctionDescriptionException(){}
}

class AuctionTitleException extends Exception{
	public AuctionTitleException(String errorMessage) { super(errorMessage); }
	AuctionTitleException(){}
}

class CategoryIdException extends Exception{
	public CategoryIdException(String errorMessage) { super(errorMessage); }
	CategoryIdException(){}
}
