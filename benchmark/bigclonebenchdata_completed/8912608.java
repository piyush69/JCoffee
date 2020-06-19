


class c8912608 {
public MyHelperClass Base64;
	public MyHelperClass getPostingKey(){ return null; }

    public String getValidationKey(String transactionId, double transactionAmount) {
        try {
            java.security.MessageDigest d = java.security.MessageDigest.getInstance("MD5");
            d.reset();
            String value = this.getPostingKey() + transactionId + transactionAmount;
            d.update(value.getBytes());
            byte[] buf = d.digest();
            return(String)(Object) Base64.encodeBytes(buf);
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeBytes(byte[] o0){ return null; }}
