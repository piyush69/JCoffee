import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2285441 {
public static MyHelperClass patterns;
	public static MyHelperClass data;
public MyHelperClass[] patterns;
	public MyHelperClass[] data;
	public static MyHelperClass city;
//public MyHelperClass city;
//	public static MyHelperClass patterns;
	public static MyHelperClass ReverseLookupUnitedStates;
//	public static MyHelperClass data;
	public static MyHelperClass ReverseLookup;
	public static MyHelperClass ReverseLookupAustria;
	public static MyHelperClass ReverseLookupTurkey;
	public static MyHelperClass ReverseLookupGermany;
//public MyHelperClass ReverseLookupTurkey;
//	public MyHelperClass ReverseLookupGermany;
//	public MyHelperClass[] data;
//	public MyHelperClass[] patterns;
//	public MyHelperClass ReverseLookupUnitedStates;
//	public MyHelperClass ReverseLookupAustria;
//	public MyHelperClass ReverseLookup;
//public static MyHelperClass patterns;
	public static MyHelperClass HTMLUtil;
	public static MyHelperClass JFritzUtils;
//	public static MyHelperClass data;
//public MyHelperClass HTMLUtil;
//	public MyHelperClass[] patterns;
//	public MyHelperClass[] data;
//	public MyHelperClass JFritzUtils;
public static MyHelperClass Pattern;
	public static MyHelperClass firstname;
	public static MyHelperClass street;
//	public static MyHelperClass patterns;
	public static MyHelperClass ReverseLookupSite;
//	public static MyHelperClass data;
	public static MyHelperClass zipcode;
//	public MyHelperClass[] patterns;
	public static MyHelperClass company;
	public static MyHelperClass lastname;
	public static MyHelperClass NULL;
public static MyHelperClass rlsMap;
//	public MyHelperClass Pattern;
//	public MyHelperClass lastname;
//	public MyHelperClass[] data;
//	public MyHelperClass NULL;
//	public MyHelperClass zipcode;
//	public MyHelperClass street;
//	public MyHelperClass patterns;
//	public MyHelperClass company;
	public static MyHelperClass str;
//	public MyHelperClass ReverseLookupSite;
//	public MyHelperClass firstname;
public static MyHelperClass Debug;
	public static MyHelperClass prefix;
	public static MyHelperClass ac_length;
	public static MyHelperClass urlstr;
	public static MyHelperClass userAgent;
//	public static MyHelperClass data;
//	public MyHelperClass rlsMap;
	public static MyHelperClass dataLength;
	public static MyHelperClass header;
	public static MyHelperClass charSet;
	public static MyHelperClass con;
	public static MyHelperClass url;
	public static MyHelperClass rls;
	public static MyHelperClass yield(){ return null; }
//public MyHelperClass con;
//	public MyHelperClass str;
//	public MyHelperClass charSet;
//	public MyHelperClass Debug;
//	public MyHelperClass ac_length;
//	public MyHelperClass url;
//	public MyHelperClass userAgent;
//	public MyHelperClass data;
//	public MyHelperClass urlstr;
	public MyHelperClass rls_list;
//	public MyHelperClass rls;
//	public MyHelperClass dataLength;
//	public MyHelperClass prefix;
//	public MyHelperClass header;
	public MyHelperClass nummer;
//	public MyHelperClass yield(){ return null; }

    static synchronized Person lookup(PhoneNumber number, String siteName) {
        Vector<Person> foundPersons = new Vector<Person>(5);
        if ((boolean)(Object)number.isFreeCall()) {
            Person p = new Person("", "FreeCall");
            p.addNumber(number);
            foundPersons.add(p);
        } else if ((Boolean)(Object)number.isSIPNumber() || (Boolean)(Object)number.isQuickDial()) {
            Person p = new Person();
            p.addNumber(number);
            foundPersons.add(p);
        } else if ((boolean)(Object)rlsMap.containsKey(number.getCountryCode())) {
            MyHelperClass nummer = new MyHelperClass();
            nummer = number.getAreaNumber();
            MyHelperClass rls_list = new MyHelperClass();
            rls_list = rlsMap.get((int)(Object)number.getCountryCode());
//            MyHelperClass nummer = new MyHelperClass();
            Debug.info("Begin reverselookup for: " + nummer);
//            MyHelperClass nummer = new MyHelperClass();
            if ((boolean)(Object)nummer.startsWith(number.getCountryCode())) nummer = nummer.substring(number.getCountryCode().length());
            String city =(String)(Object) NULL; //new String();
            city = "";
//            MyHelperClass rls_list = new MyHelperClass();
            for (int i = 0; i < (int)(Object)rls_list.size(); i++) {
                yield();
                rls = rls_list.get(i);
                if (!siteName.equals("") && !siteName.equals(rls.getName())) {
                    Debug.warning("This lookup should be done using a specific site, skipping");
                    continue;
                }
                prefix = rls.getPrefix();
                ac_length = rls.getAreaCodeLength();
                if (!(Boolean)(Object)nummer.startsWith(prefix)) nummer =(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) prefix + (int)(Object)nummer;
                urlstr = rls.getURL();
                if ((boolean)(Object)urlstr.contains("$AREACODE")) {
                    urlstr = urlstr.replaceAll("\\$AREACODE", nummer.substring(prefix.length(),(int)(Object) ac_length + (int)(Object)prefix.length()));
                    urlstr = urlstr.replaceAll("\\$NUMBER", nummer.substring((int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)prefix.length() + (int)(Object)ac_length));
                } else if ((boolean)(Object)urlstr.contains("$PFXAREACODE")) {
                    urlstr = urlstr.replaceAll("\\$PFXAREACODE", nummer.substring(0,(int)(Object) prefix.length() + (int)(Object)ac_length));
                    urlstr = urlstr.replaceAll("\\$NUMBER", nummer.substring((int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)(MyHelperClass)(Object)(int)(Object)prefix.length() + (int)(Object)ac_length));
                } else urlstr = urlstr.replaceAll("\\$NUMBER", nummer);
                Debug.info("Reverse lookup using: " + urlstr);
                url = null;
                data =(MyHelperClass[])(Object)(MyHelperClass)(Object)(MyHelperClass[])(Object)(MyHelperClass)(Object)(MyHelperClass[])(Object)(MyHelperClass)(Object)(MyHelperClass[])(Object)(MyHelperClass)(Object) new String[(int)(Object)dataLength];
                try {
                    url =(MyHelperClass)(Object) new URL((String)(Object)urlstr);
                    if (url != null) {
                        try {
                            con = url.openConnection();
                            con.setConnectTimeout(5000);
                            con.setReadTimeout(15000);
                            con.addRequestProperty("User-Agent", userAgent);
                            con.connect();
                            header =(MyHelperClass)(Object) "";
                            charSet =(MyHelperClass)(Object) "";
                            for (int j = 0; ; j++) {
                                String headerName =(String)(Object) con.getHeaderFieldKey(j);
                                String headerValue =(String)(Object) con.getHeaderField(j);
                                if (headerName == null && headerValue == null) {
                                    break;
                                }
                                if ("content-type".equalsIgnoreCase(headerName)) {
                                    String[] split = headerValue.split(";", 2);
                                    for (int k = 0; k < split.length; k++) {
                                        if (split[k].trim().toLowerCase().startsWith("charset=")) {
                                            String[] charsetSplit = split[k].split("=");
                                            charSet =(MyHelperClass)(Object) charsetSplit[1].trim();
                                        }
                                    }
                                }
                                header += headerName + ": " +(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) headerValue + " | ";
                            }
                            Debug.debug("Header of " + rls.getName() + ":" + header);
                            Debug.debug("CHARSET : " + charSet);
                            BufferedReader d;
                            if (charSet.equals("")) {
                                d = new BufferedReader(new InputStreamReader((InputStream)(Object)con.getInputStream(), "ISO-8859-1"));
                            } else {
                                d = new BufferedReader(new InputStreamReader((InputStream)(Object)con.getInputStream(),(String)(Object) charSet));
                            }
                            int lines = 0;
                            while (null != ((str =(MyHelperClass)(Object) d.readLine()))) {
                                data[lines] = str;
                                yield();
                                if (lines >= (int)(Object)dataLength) {
                                    System.err.println("Result > " + dataLength + " Lines");
                                    break;
                                }
                                lines++;
                            }
                            d.close();
                            Debug.info("Begin processing response from " + rls.getName());
                            for (int j = 0; j < (int)(Object)rls.size(); j++) {
                                yield();
                                firstname =(MyHelperClass)(Object) "";
                                lastname =(MyHelperClass)(Object) "";
                                company =(MyHelperClass)(Object) "";
                                street =(MyHelperClass)(Object) "";
                                zipcode =(MyHelperClass)(Object) "";
                                city = "";
                                Person p = null;
                                patterns =(MyHelperClass[])(Object)(MyHelperClass)(Object)(MyHelperClass[])(Object)(MyHelperClass)(Object)(MyHelperClass[])(Object) rls.getEntry(j);
                                Pattern namePattern = null;
                                Pattern streetPattern = null;
                                Pattern cityPattern = null;
                                Pattern zipcodePattern = null;
                                Pattern firstnamePattern = null;
                                Pattern lastnamePattern = null;
                                Matcher nameMatcher = null;
                                Matcher streetMatcher = null;
                                Matcher cityMatcher = null;
                                Matcher zipcodeMatcher = null;
                                Matcher firstnameMatcher = null;
                                Matcher lastnameMatcher = null;
                                if (!patterns[(int)(Object)ReverseLookupSite.NAME].equals("") && (patterns[(int)(Object)ReverseLookupSite.FIRSTNAME].equals("") && patterns[(int)(Object)ReverseLookupSite.LASTNAME].equals(""))) {
                                    namePattern =(Pattern)(Object) Pattern.compile(patterns[(int)(Object)ReverseLookupSite.NAME]);
                                }
                                if (!patterns[(int)(Object)ReverseLookupSite.STREET].equals("")) {
                                    streetPattern =(Pattern)(Object) Pattern.compile(patterns[(int)(Object)ReverseLookupSite.STREET]);
                                }
                                if (!patterns[(int)(Object)ReverseLookupSite.CITY].equals("")) {
                                    cityPattern =(Pattern)(Object) Pattern.compile(patterns[(int)(Object)ReverseLookupSite.CITY]);
                                }
                                if (!patterns[(int)(Object)ReverseLookupSite.ZIPCODE].equals("")) {
                                    zipcodePattern =(Pattern)(Object) Pattern.compile(patterns[(int)(Object)ReverseLookupSite.ZIPCODE]);
                                }
                                if (!patterns[(int)(Object)ReverseLookupSite.FIRSTNAME].equals("")) {
                                    firstnamePattern =(Pattern)(Object) Pattern.compile(patterns[(int)(Object)ReverseLookupSite.FIRSTNAME]);
                                }
                                if (!patterns[(int)(Object)ReverseLookupSite.LASTNAME].equals("")) {
                                    lastnamePattern =(Pattern)(Object) Pattern.compile(patterns[(int)(Object)ReverseLookupSite.LASTNAME]);
                                }
                                for (int line = 0; line < (int)(Object)dataLength; line++) {
                                    if (data[line] != null) {
                                        int spaceAlternative = 160;
                                        data[line] = data[line].replaceAll(new Character((char) spaceAlternative).toString(),(MyHelperClass)(Object) " ");
                                        if (lastnamePattern != null) {
                                            lastnameMatcher =(Matcher)(Object) lastnamePattern.matcher(data[line]);
                                            if ((boolean)(Object)lastnameMatcher.find()) {
                                                str =(MyHelperClass)(Object) "";
                                                for (int k = 1; k <= (int)(Object)lastnameMatcher.groupCount(); k++) {
                                                    if (lastnameMatcher.group(k) != null) str =(int)(Object) str +(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) (int)(Object)lastnameMatcher.group(k).trim() + " ";
                                                }
                                                lastname = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(str));
                                                lastname = lastname.trim();
                                                lastname = lastname.replaceAll(",",(MyHelperClass)(Object) "");
                                                lastname = lastname.replaceAll("%20",(MyHelperClass)(Object) " ");
                                                lastname = JFritzUtils.replaceSpecialCharsUTF(lastname);
                                                lastname = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(lastname));
                                                lastname = JFritzUtils.removeDuplicateWhitespace(lastname);
                                                if ("lastname".equals(patterns[(int)(Object)ReverseLookupSite.FIRSTOCCURANCE])) {
                                                    p = new Person();
                                                    p.addNumber(number.getIntNumber(), "home");
                                                    foundPersons.add(p);
                                                }
                                                if (p != null) {
                                                    p.setLastName(lastname);
                                                }
                                            }
                                        }
                                        yield();
                                        if (firstnamePattern != null) {
                                            firstnameMatcher =(Matcher)(Object) firstnamePattern.matcher(data[line]);
                                            if ((boolean)(Object)firstnameMatcher.find()) {
                                                str =(MyHelperClass)(Object) "";
                                                for (int k = 1; k <= (int)(Object)firstnameMatcher.groupCount(); k++) {
                                                    if (firstnameMatcher.group(k) != null) str =(int)(Object) str +(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) (int)(Object)firstnameMatcher.group(k).trim() + " ";
                                                }
                                                firstname = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(str));
                                                firstname = firstname.trim();
                                                firstname = firstname.replaceAll(",",(MyHelperClass)(Object) "");
                                                firstname = firstname.replaceAll("%20",(MyHelperClass)(Object) " ");
                                                firstname = JFritzUtils.replaceSpecialCharsUTF(firstname);
                                                firstname = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(firstname));
                                                firstname = JFritzUtils.removeDuplicateWhitespace(firstname);
                                                if ("firstname".equals(patterns[(int)(Object)ReverseLookupSite.FIRSTOCCURANCE])) {
                                                    p = new Person();
                                                    p.addNumber(number.getIntNumber(), "home");
                                                    foundPersons.add(p);
                                                }
                                                if (p != null) {
                                                    p.setFirstName(firstname);
                                                }
                                            }
                                        }
                                        yield();
                                        if (namePattern != null) {
                                            nameMatcher =(Matcher)(Object) namePattern.matcher(data[line]);
                                            if ((boolean)(Object)nameMatcher.find()) {
                                                str =(MyHelperClass)(Object) "";
                                                for (int k = 1; k <= (int)(Object)nameMatcher.groupCount(); k++) {
                                                    if (nameMatcher.group(k) != null) str =(int)(Object) str +(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) (int)(Object)nameMatcher.group(k).trim() + " ";
                                                }
                                                String[] split;
                                                split =(String[])(Object) str.split(" ", 2);
                                                lastname = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(split[0]));
                                                lastname = lastname.trim();
                                                lastname = lastname.replaceAll(",",(MyHelperClass)(Object) "");
                                                lastname = lastname.replaceAll("%20",(MyHelperClass)(Object) " ");
                                                lastname = JFritzUtils.replaceSpecialCharsUTF(lastname);
                                                lastname = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(lastname));
                                                lastname = JFritzUtils.removeDuplicateWhitespace(lastname);
                                                if (split[1].length() > 0) {
                                                    firstname = HTMLUtil.stripEntities(split[1]);
                                                    if (((int)(Object)firstname.indexOf("  ") > -1) && ((int)(Object)firstname.indexOf("  u.") == -1)) {
                                                        company = JFritzUtils.removeLeadingSpaces(firstname.substring(firstname.indexOf("  ")).trim());
                                                        firstname = JFritzUtils.removeLeadingSpaces(firstname.substring((MyHelperClass)(Object)0,(int)(Object) firstname.indexOf("  ")).trim());
                                                    } else {
                                                        firstname = JFritzUtils.removeLeadingSpaces(firstname.replaceAll("  u. ",(MyHelperClass)(Object) " und "));
                                                    }
                                                }
                                                firstname = firstname.replaceAll("%20",(MyHelperClass)(Object) " ");
                                                firstname = JFritzUtils.replaceSpecialCharsUTF(firstname);
                                                firstname = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(firstname));
                                                firstname = JFritzUtils.removeDuplicateWhitespace(firstname);
                                                firstname = firstname.trim();
                                                company = company.replaceAll("%20",(MyHelperClass)(Object) " ");
                                                company = JFritzUtils.replaceSpecialCharsUTF(company);
                                                company = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(company));
                                                company = JFritzUtils.removeDuplicateWhitespace(company);
                                                company = company.trim();
                                                if ("name".equals(patterns[(int)(Object)ReverseLookupSite.FIRSTOCCURANCE])) {
                                                    p = new Person();
                                                    if ((int)(Object)company.length() > 0) {
                                                        p.addNumber(number.getIntNumber(), "business");
                                                    } else {
                                                        p.addNumber(number.getIntNumber(), "home");
                                                    }
                                                    foundPersons.add(p);
                                                }
                                                if (p != null) {
                                                    p.setFirstName(firstname);
                                                    p.setLastName(lastname);
                                                    p.setCompany(company);
                                                }
                                            }
                                        }
                                        yield();
                                        if (streetPattern != null) {
                                            streetMatcher =(Matcher)(Object) streetPattern.matcher(data[line]);
                                            if ((boolean)(Object)streetMatcher.find()) {
                                                str =(MyHelperClass)(Object) "";
                                                for (int k = 1; k <= (int)(Object)streetMatcher.groupCount(); k++) {
                                                    if (streetMatcher.group(k) != null) str =(int)(Object) str +(int)(Object)(MyHelperClass)(Object) (int)(Object)streetMatcher.group(k).trim() + " ";
                                                }
                                                street = str.replaceAll("%20",(MyHelperClass)(Object) " ");
                                                street = JFritzUtils.replaceSpecialCharsUTF(street);
                                                street = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(street));
                                                street = JFritzUtils.removeDuplicateWhitespace(street);
                                                street = street.trim();
                                                if ("street".equals(patterns[(int)(Object)ReverseLookupSite.FIRSTOCCURANCE])) {
                                                    p = new Person();
                                                    p.addNumber(number.getIntNumber(), "home");
                                                    foundPersons.add(p);
                                                }
                                                if (p != null) {
                                                    p.setStreet(street);
                                                }
                                            }
                                        }
                                        yield();
                                        if (cityPattern != null) {
                                            cityMatcher =(Matcher)(Object) cityPattern.matcher(data[line]);
                                            if ((boolean)(Object)cityMatcher.find()) {
                                                str =(MyHelperClass)(Object) "";
                                                for (int k = 1; k <= (int)(Object)cityMatcher.groupCount(); k++) {
                                                    if (cityMatcher.group(k) != null) str =(int)(Object) str +(int)(Object)(MyHelperClass)(Object) (int)(Object)cityMatcher.group(k).trim() + " ";
                                                }
                                                city =(String)(Object) str.replaceAll("%20",(MyHelperClass)(Object) " ");
                                                city =(String)(Object) JFritzUtils.replaceSpecialCharsUTF((MyHelperClass)(Object)city);
                                                city =(String)(Object) JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(city));
                                                city =(String)(Object) JFritzUtils.removeDuplicateWhitespace((MyHelperClass)(Object)city);
                                                city = city.trim();
                                                if ("city".equals(patterns[(int)(Object)ReverseLookupSite.FIRSTOCCURANCE])) {
                                                    p = new Person();
                                                    p.addNumber(number.getIntNumber(), "home");
                                                    foundPersons.add(p);
                                                }
                                                if (p != null) {
                                                    p.setCity(city);
                                                }
                                            }
                                        }
                                        yield();
                                        if (zipcodePattern != null) {
                                            zipcodeMatcher =(Matcher)(Object) zipcodePattern.matcher(data[line]);
                                            if ((boolean)(Object)zipcodeMatcher.find()) {
                                                str =(MyHelperClass)(Object) "";
                                                for (int k = 1; k <= (int)(Object)zipcodeMatcher.groupCount(); k++) {
                                                    if (zipcodeMatcher.group(k) != null) str =(int)(Object) str +(int)(Object)(MyHelperClass)(Object) (int)(Object)zipcodeMatcher.group(k).trim() + " ";
                                                }
                                                zipcode = str.replaceAll("%20",(MyHelperClass)(Object) " ");
                                                zipcode = JFritzUtils.replaceSpecialCharsUTF(zipcode);
                                                zipcode = JFritzUtils.removeLeadingSpaces(HTMLUtil.stripEntities(zipcode));
                                                zipcode = JFritzUtils.removeDuplicateWhitespace(zipcode);
                                                zipcode = zipcode.trim();
                                                if ("zipcode".equals(patterns[(int)(Object)ReverseLookupSite.FIRSTOCCURANCE])) {
                                                    p = new Person();
                                                    p.addNumber(number.getIntNumber(), "home");
                                                    foundPersons.add(p);
                                                }
                                                if (p != null) {
                                                    p.setPostalCode(zipcode);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!firstname.equals("") || !lastname.equals("") || !company.equals("")) break;
                            }
                            yield();
                            if (!firstname.equals("") || !lastname.equals("") || !company.equals("")) {
                                if (city.equals("")) {
                                    if (number.getCountryCode().equals(ReverseLookup.GERMANY_CODE)) city =(String)(Object) ReverseLookupGermany.getCity(nummer); else if (number.getCountryCode().equals(ReverseLookup.AUSTRIA_CODE)) city =(String)(Object) ReverseLookupAustria.getCity(nummer); else if (number.getCountryCode().startsWith(ReverseLookup.USA_CODE)) city = ReverseLookupUnitedStates.getCity(nummer); else if (number.getCountryCode().startsWith(ReverseLookup.TURKEY_CODE)) city = ReverseLookupTurkey.getCity(nummer);
                                }
                                return foundPersons.get(0);
                            }
                        } catch (IOException e1) {
                            Debug.error("Error while retrieving " + urlstr);
                        }
                    }
                } catch (MalformedURLException e) {
                    Debug.error("URL invalid: " + urlstr);
                }
            }
            yield();
            Debug.warning("No match for " + nummer + " found");
            if (city.equals("")) {
                if (number.getCountryCode().equals(ReverseLookup.GERMANY_CODE)) city =(String)(Object) ReverseLookupGermany.getCity(nummer); else if (number.getCountryCode().equals(ReverseLookup.AUSTRIA_CODE)) city =(String)(Object) ReverseLookupAustria.getCity(nummer); else if (number.getCountryCode().startsWith(ReverseLookup.USA_CODE)) city = ReverseLookupUnitedStates.getCity(nummer); else if (number.getCountryCode().startsWith(ReverseLookup.TURKEY_CODE)) city = ReverseLookupTurkey.getCity(nummer);
            }
            Person p = new Person("", "", "", "", "", city, "", "");
            p.addNumber(number.getAreaNumber(), "home");
            return p;
        } else {
            Debug.warning("No reverse lookup sites for: " + number.getCountryCode());
            Person p = new Person();
            p.addNumber(number.getAreaNumber(), "home");
            if (number.getCountryCode().equals(ReverseLookup.GERMANY_CODE)) city = ReverseLookupGermany.getCity(number.getIntNumber()); else if (number.getCountryCode().equals(ReverseLookup.AUSTRIA_CODE)) city = ReverseLookupAustria.getCity(number.getIntNumber()); else if ((boolean)(Object)number.getCountryCode().startsWith(ReverseLookup.USA_CODE)) city = ReverseLookupUnitedStates.getCity(number.getIntNumber()); else if ((boolean)(Object)number.getCountryCode().startsWith(ReverseLookup.TURKEY_CODE)) city = ReverseLookupTurkey.getCity(number.getIntNumber());
            p.setCity((String)(Object)city);
            return p;
        }
        return new Person("not found", "Person");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FIRSTOCCURANCE;
	public MyHelperClass TURKEY_CODE;
	public MyHelperClass GERMANY_CODE;
	public MyHelperClass AUSTRIA_CODE;
	public MyHelperClass CITY;
	public MyHelperClass LASTNAME;
	public MyHelperClass NAME;
	public MyHelperClass USA_CODE;
	public MyHelperClass FIRSTNAME;
	public MyHelperClass ZIPCODE;
	public MyHelperClass STREET;
public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass removeDuplicateWhitespace(MyHelperClass o0){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass substring(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getHeaderFieldKey(int o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getEntry(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass split(String o0, int o1){ return null; }
	public MyHelperClass stripEntities(MyHelperClass o0){ return null; }
	public MyHelperClass containsKey(MyHelperClass o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass getHeaderField(int o0){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass stripEntities(String o0){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass compile(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass addRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass replaceSpecialCharsUTF(MyHelperClass o0){ return null; }
	public MyHelperClass removeLeadingSpaces(MyHelperClass o0){ return null; }
	public MyHelperClass getCity(MyHelperClass o0){ return null; }
	public MyHelperClass getPrefix(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass replaceAll(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getAreaCodeLength(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass startsWith(MyHelperClass o0){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass connect(){ return null; }}

class PhoneNumber {

public MyHelperClass isQuickDial(){ return null; }
	public MyHelperClass isFreeCall(){ return null; }
	public MyHelperClass getIntNumber(){ return null; }
	public MyHelperClass getCountryCode(){ return null; }
	public MyHelperClass isSIPNumber(){ return null; }
	public MyHelperClass getAreaNumber(){ return null; }}

class Person {

Person(String o0, String o1, String o2, String o3, String o4, String o5, String o6, String o7){}
	Person(){}
	Person(String o0, String o1){}
	public MyHelperClass setCity(String o0){ return null; }
	public MyHelperClass setPostalCode(MyHelperClass o0){ return null; }
	public MyHelperClass setLastName(MyHelperClass o0){ return null; }
	public MyHelperClass setCompany(MyHelperClass o0){ return null; }
	public MyHelperClass setFirstName(MyHelperClass o0){ return null; }
	public MyHelperClass addNumber(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass addNumber(PhoneNumber o0){ return null; }
	public MyHelperClass setStreet(MyHelperClass o0){ return null; }}

class Pattern {

public MyHelperClass matcher(MyHelperClass o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass groupCount(){ return null; }
	public MyHelperClass find(){ return null; }}
