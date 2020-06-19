


class c10195219 {
public MyHelperClass loadKeyTabResource(MyHelperClass o0){ return null; }

    public void configureKerberos(boolean overwriteExistingSetup) throws Exception {
        OutputStream keyTabOut = null;
        InputStream keyTabIn = null;
        OutputStream krb5ConfOut = null;
        try {
            MyHelperClass keyTabResource = new MyHelperClass();
            keyTabIn =(InputStream)(Object) loadKeyTabResource(keyTabResource);
            MyHelperClass keyTabRepository = new MyHelperClass();
            File file = new File((String)(Object)(int)(Object)keyTabRepository + (int)(Object)keyTabResource);
            if (!(Boolean)(Object)file.exists() || overwriteExistingSetup) {
                keyTabOut =(OutputStream)(Object) new FileOutputStream(file, false);
                MyHelperClass logger = new MyHelperClass();
                if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Installing keytab file to : " + file.getAbsolutePath());
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(keyTabIn, keyTabOut);
            }
            MyHelperClass defaultKrb5Config = new MyHelperClass();
            File krb5ConfFile = new File(System.getProperty("java.security.krb5.conf",(String)(Object) defaultKrb5Config));
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("Using Kerberos config file : " + krb5ConfFile.getAbsolutePath());
            if (!(Boolean)(Object)krb5ConfFile.exists()) throw new Exception("Kerberos config file not found : " + krb5ConfFile.getAbsolutePath());
            FileInputStream fis = new FileInputStream(krb5ConfFile);
            MyHelperClass KerberosConfigUtil = new MyHelperClass();
            Wini krb5Conf = new Wini(KerberosConfigUtil.toIni(fis));
            Section krb5Realms =(Section)(Object) krb5Conf.get("realms");
            MyHelperClass kerberosRealm = new MyHelperClass();
            String windowsDomainSetup =(String)(Object) krb5Realms.get(kerberosRealm);
//            MyHelperClass kerberosRealm = new MyHelperClass();
            if (kerberosRealm == null || overwriteExistingSetup) {
                MyHelperClass keyDistributionCenter = new MyHelperClass();
                windowsDomainSetup = "{  kdc = " + keyDistributionCenter + ":88 admin_server = " + keyDistributionCenter + ":749  default_domain = " + kerberosRealm.toLowerCase() + "  }";
//                MyHelperClass kerberosRealm = new MyHelperClass();
                krb5Realms.put(kerberosRealm, windowsDomainSetup);
            }
            Section krb5DomainRealms =(Section)(Object) krb5Conf.get("domain_realm");
//            MyHelperClass kerberosRealm = new MyHelperClass();
            String domainRealmSetup =(String)(Object) krb5DomainRealms.get(kerberosRealm.toLowerCase());
            if (domainRealmSetup == null || overwriteExistingSetup) {
//                MyHelperClass kerberosRealm = new MyHelperClass();
                krb5DomainRealms.put(kerberosRealm.toLowerCase(), kerberosRealm);
//                MyHelperClass kerberosRealm = new MyHelperClass();
                krb5DomainRealms.put("." + kerberosRealm.toLowerCase(), kerberosRealm);
            }
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            krb5Conf.store(baos);
            InputStream bios =(InputStream)(Object) new ByteArrayInputStream(baos.toByteArray());
//            MyHelperClass KerberosConfigUtil = new MyHelperClass();
            bios =(InputStream)(Object) KerberosConfigUtil.toKrb5(bios);
            krb5ConfOut =(OutputStream)(Object) new FileOutputStream(krb5ConfFile, false);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(bios, krb5ConfOut);
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error while configuring Kerberos :" + e.getMessage(), e);
            throw e;
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(keyTabOut);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(keyTabIn);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(krb5ConfOut);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toKrb5(InputStream o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass toIni(FileInputStream o0){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class OutputStream {

}

class InputStream {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class Wini {

Wini(MyHelperClass o0){}
	Wini(){}
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass store(ByteArrayOutputStream o0){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class Section {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}
