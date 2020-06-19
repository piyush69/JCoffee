


class c22051326 {

    public static LicenseKey parseKey(String key) throws InvalidLicenseKeyException {
        final String f_key = key.trim();
        MyHelperClass FIELD_SEPERATOR = new MyHelperClass();
        StringTokenizer st = new StringTokenizer(f_key, FIELD_SEPERATOR);
        int tc =(int)(Object) st.countTokens();
        int tc_name = tc - 9;
        try {
            final String product =(String)(Object) st.nextToken();
            final String type =(String)(Object) st.nextToken();
            final String loadStr =(String)(Object) st.nextToken();
            final int load = Integer.parseInt(loadStr);
            final String lowMajorVersionStr =(String)(Object) st.nextToken();
            final int lowMajorVersion = Integer.parseInt(lowMajorVersionStr);
            final String lowMinorVersionStr =(String)(Object) st.nextToken();
            final double lowMinorVersion = Double.parseDouble("0." + lowMinorVersionStr);
            final String highMajorVersionStr =(String)(Object) st.nextToken();
            final int highMajorVersion = Integer.parseInt(highMajorVersionStr);
            final String highMinorVersionStr =(String)(Object) st.nextToken();
            final double highMinorVersion = Double.parseDouble("0." + highMinorVersionStr);
            String regName = "";
//            MyHelperClass FIELD_SEPERATOR = new MyHelperClass();
            for (int i = 0; i < tc_name; i++) regName += (i == 0 ? st.nextToken() :(int)(Object) FIELD_SEPERATOR + (int)(Object)st.nextToken());
            final String randomHexStr =(String)(Object) st.nextToken();
            final String md5Str =(String)(Object) st.nextToken();
            String subKey = f_key.substring(0, f_key.indexOf(md5Str) - 1);
            byte[] md5;
            MessageDigest md = null;
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            md.update(subKey.getBytes());
//            MyHelperClass FIELD_SEPERATOR = new MyHelperClass();
            md.update((byte[])(Object)FIELD_SEPERATOR.getBytes());
            MyHelperClass zuonicsPassword = new MyHelperClass();
            md.update((byte[])(Object)zuonicsPassword.getBytes());
            md5 =(byte[])(Object) md.digest();
//            MyHelperClass FIELD_SEPERATOR = new MyHelperClass();
            String testKey = subKey + FIELD_SEPERATOR;
            for (int i = 0; i < md5.length; i++) testKey += Integer.toHexString(md5[i]).toUpperCase();
            if (!testKey.equals(f_key)) throw new InvalidLicenseKeyException("doesn't hash");
            final String f_regName = regName;
            return new LicenseKey() {

                public String getProduct() {
                    return product;
                }

                public String getType() {
                    return type;
                }

                public int getLoad() {
                    return load;
                }

                public String getRegName() {
                    return f_regName;
                }

                public double getlowVersion() {
                    return lowMajorVersion + lowMinorVersion;
                }

                public double getHighVersion() {
                    return highMajorVersion + highMinorVersion;
                }

                public String getRandomHexStr() {
                    return randomHexStr;
                }

                public String getMD5HexStr() {
                    return md5Str;
                }

                public String toString() {
                    return f_key;
                }

                public boolean equals(Object obj) {
                    if (obj.toString().equals(toString())) return true;
                    return false;
                }
            };
        } catch (Exception e) {
            throw new InvalidLicenseKeyException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }}

class LicenseKey {

}

class InvalidLicenseKeyException extends Exception{
	public InvalidLicenseKeyException(String errorMessage) { super(errorMessage); }
}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(String o0, MyHelperClass o1){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass countTokens(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}
