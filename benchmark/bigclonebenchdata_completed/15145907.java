import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15145907 {
public MyHelperClass NumberTools;

    public boolean authenticate(String userName, String loginPassword) {
        MyHelperClass systemConfigManager = new MyHelperClass();
        if (!(Boolean)(Object)systemConfigManager.getBool("ldap", "authEnable")) {
            return false;
        }
        String ldapName = userName;
        MyHelperClass userDAO = new MyHelperClass();
        AkteraUser user =(AkteraUser)(Object) userDAO.findUserByName(userName);
        MyHelperClass StringTools = new MyHelperClass();
        if (user != null && (boolean)(Object)StringTools.isNotTrimEmpty(user.getLdapName())) {
            ldapName =(String)(Object) user.getLdapName();
        }
//        MyHelperClass systemConfigManager = new MyHelperClass();
        String server =(String)(Object) systemConfigManager.getString("ldap", "authHost");
//        MyHelperClass StringTools = new MyHelperClass();
        if ((boolean)(Object)StringTools.isTrimEmpty(server)) {
            return false;
        }
//        MyHelperClass systemConfigManager = new MyHelperClass();
        int port =(int)(Object) NumberTools.toInt(systemConfigManager.get("ldap", "authPort"), 389);
//        MyHelperClass systemConfigManager = new MyHelperClass();
        String type =(String)(Object) StringTools.trim(systemConfigManager.getString("ldap", "authType"));
//        MyHelperClass systemConfigManager = new MyHelperClass();
        String baseDn =(String)(Object) StringTools.trim(systemConfigManager.getString("ldap", "authBaseDn"));
//        MyHelperClass systemConfigManager = new MyHelperClass();
        String userDn =(String)(Object) StringTools.trim(systemConfigManager.getString("ldap", "authUserDn"));
//        MyHelperClass systemConfigManager = new MyHelperClass();
        String password =(String)(Object) StringTools.trim(systemConfigManager.getString("ldap", "authPassword"));
//        MyHelperClass systemConfigManager = new MyHelperClass();
        String query =(String)(Object) StringTools.trim(systemConfigManager.getString("ldap", "authQuery"));
//        MyHelperClass systemConfigManager = new MyHelperClass();
        String bindDn =(String)(Object) StringTools.trim(systemConfigManager.getString("ldap", "authBindDn"));
//        MyHelperClass systemConfigManager = new MyHelperClass();
        String passwordAttributeName =(String)(Object) StringTools.trim(systemConfigManager.getString("ldap", "authPasswordAttributeName"));
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userName", userName);
        params.put("ldapName", ldapName);
//        MyHelperClass StringTools = new MyHelperClass();
        params.put("loginName",(boolean)(Object) StringTools.isTrimEmpty(ldapName) ? userName : ldapName);
//        MyHelperClass StringTools = new MyHelperClass();
        query =(String)(Object) StringTools.replaceTemplate(query, params);
//        MyHelperClass StringTools = new MyHelperClass();
        bindDn =(String)(Object) StringTools.replaceTemplate(bindDn, params);
        Hashtable<String, Object> env = new Hashtable<String, Object>();
        MyHelperClass Context = new MyHelperClass();
        env.put((String)(Object)Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
//        MyHelperClass Context = new MyHelperClass();
        env.put((String)(Object)Context.PROVIDER_URL, "ldap://" + server + ":" + port + "/" + baseDn);
//        MyHelperClass Context = new MyHelperClass();
        env.put((String)(Object)Context.SECURITY_AUTHENTICATION, "simple");
        if ("ldapAuthBind".equals(type)) {
//            MyHelperClass Context = new MyHelperClass();
            env.put((String)(Object)Context.SECURITY_PRINCIPAL, bindDn);
//            MyHelperClass Context = new MyHelperClass();
            env.put((String)(Object)Context.SECURITY_CREDENTIALS, loginPassword);
            try {
                DirContext ctx =(DirContext)(Object) new InitialDirContext(env);
                try {
                    ctx.close();
                } catch (Exception ignored) {
                }
                return true;
            } catch (Exception ignored) {
                return false;
            }
        }
//        MyHelperClass StringTools = new MyHelperClass();
        if ((Boolean)(Object)StringTools.isTrimEmpty(userDn) || (Boolean)(Object)StringTools.isTrimEmpty(password)) {
            return false;
        }
//        MyHelperClass Context = new MyHelperClass();
        env.put((String)(Object)Context.SECURITY_PRINCIPAL, userDn);
//        MyHelperClass Context = new MyHelperClass();
        env.put((String)(Object)Context.SECURITY_CREDENTIALS, password);
        DirContext ctx = null;
        NamingEnumeration results = null;
        try {
            ctx =(DirContext)(Object) new InitialDirContext(env);
            SearchControls controls = new SearchControls();
            MyHelperClass SearchControls = new MyHelperClass();
            controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
            results =(NamingEnumeration)(Object) ctx.search("", query, controls);
            if ((boolean)(Object)results.hasMore()) {
                SearchResult searchResult =(SearchResult)(Object) results.next();
                Attributes attributes =(Attributes)(Object) searchResult.getAttributes();
                if (attributes.get(passwordAttributeName) == null) {
                    return false;
                }
                String pass = new String((byte[])(byte[])(Object) attributes.get(passwordAttributeName).get());
                if (pass.startsWith("{SHA}") || pass.startsWith("{MD5}")) {
                    String method = pass.substring(1, pass.indexOf('}'));
                    MessageDigest digest = MessageDigest.getInstance(method);
                    digest.update(loginPassword.getBytes(), 0, loginPassword.length());
                    if (pass.equals("{" + method + "}" + Base64.encode(digest.digest()))) {
                        return true;
                    }
                } else {
                    if (pass.equals(loginPassword)) {
                        return true;
                    }
                }
            }
        } catch (Exception x) {
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (Exception e) {
                }
            }
            if (ctx != null) {
                try {
                    ctx.close();
                } catch (Exception e) {
                }
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PROVIDER_URL;
	public MyHelperClass SUBTREE_SCOPE;
	public MyHelperClass INITIAL_CONTEXT_FACTORY;
	public MyHelperClass SECURITY_PRINCIPAL;
	public MyHelperClass SECURITY_CREDENTIALS;
	public MyHelperClass SECURITY_AUTHENTICATION;
public MyHelperClass getBool(String o0, String o1){ return null; }
	public MyHelperClass getString(String o0, String o1){ return null; }
	public MyHelperClass trim(MyHelperClass o0){ return null; }
	public MyHelperClass get(String o0, String o1){ return null; }
	public MyHelperClass replaceTemplate(String o0, Map<String,Object> o1){ return null; }
	public MyHelperClass findUserByName(String o0){ return null; }
	public MyHelperClass toInt(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass isNotTrimEmpty(MyHelperClass o0){ return null; }
	public MyHelperClass isTrimEmpty(String o0){ return null; }}

class AkteraUser {

public MyHelperClass getLdapName(){ return null; }}

class DirContext {

public MyHelperClass close(){ return null; }
	public MyHelperClass search(String o0, String o1, SearchControls o2){ return null; }}

class InitialDirContext {

InitialDirContext(){}
	InitialDirContext(Hashtable<String,Object> o0){}}

class NamingEnumeration {

public MyHelperClass next(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass hasMore(){ return null; }}

class SearchResult {

public MyHelperClass getAttributes(){ return null; }}

class SearchControls {

public MyHelperClass setSearchScope(MyHelperClass o0){ return null; }}

class Attributes {

public MyHelperClass get(String o0){ return null; }}

class Base64 {

public static MyHelperClass encode(byte[] o0){ return null; }}
