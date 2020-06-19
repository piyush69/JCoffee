import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18410603 {
public MyHelperClass LastUpdateCheckTime;
	public MyHelperClass LastBetaUpdateCheckVersion;
	public MyHelperClass LastUpdateCheckVersion;
	public MyHelperClass verifySignature(UpdateResponseParts o0){ return null; }
public MyHelperClass updateCheckError;
	public MyHelperClass releaseVersion;
	public MyHelperClass VersionUtils;
	public MyHelperClass logger;
	public MyHelperClass PhexCorePrefs;
	public MyHelperClass UPDATE_CHECK_URL;
	public MyHelperClass PhexVersion;
	public MyHelperClass betaVersion;
	public MyHelperClass XMLBuilder;
	public MyHelperClass Phex;
	public MyHelperClass fireUpdateNotification(){ return null; }
	public MyHelperClass buildXMLUpdateRequest(){ return null; }
	public MyHelperClass createResponseParts(InputStream o0){ return null; }

    private void performUpdateCheck()  throws Throwable {
        URL url;
        DPhex dPhex;
        try {
            byte[] data =(byte[])(Object) buildXMLUpdateRequest();
            if (data == null) {
                throw new IOException("Missing XML update data");
            }
            if ((boolean)(Object)logger.isDebugEnabled()) {
                logger.debug(new String(data));
            }
            url = new URL((String)(Object)UPDATE_CHECK_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setUseCaches(false);
            connection.setRequestProperty("User-Agent",(String)(Object) Phex.getFullPhexVendor());
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
            OutputStream outStream = connection.getOutputStream();
            outStream.write(data);
            LastUpdateCheckTime.set(Long.valueOf(System.currentTimeMillis()));
            InputStream inStream = connection.getInputStream();
            UpdateResponseParts parts =(UpdateResponseParts)(Object) createResponseParts(inStream);
            verifySignature(parts);
            dPhex =(DPhex)(Object) XMLBuilder.readDPhexFromStream(new ByteArrayInputStream((byte[])(Object)parts.xml.getBytes("UTF-8")));
        } catch (MalformedURLException exp) {
            updateCheckError =(MyHelperClass)(Object) exp;
            logger.error(exp.toString(), exp);
            assert false;
            throw new RuntimeException();
        } catch (UnknownHostException exp) {
            updateCheckError =(MyHelperClass)(Object) exp;
            logger.warn(exp.toString(), exp);
            return;
        } catch (SocketException exp) {
            updateCheckError =(MyHelperClass)(Object) exp;
            logger.warn(exp.toString(), exp);
            return;
        } catch (IOException exp) {
            updateCheckError =(MyHelperClass)(Object) exp;
            logger.warn(exp.toString(), exp);
            return;
        } finally {
            PhexCorePrefs.save(false);
        }
        DUpdateResponse response =(DUpdateResponse)(Object) dPhex.getUpdateResponse();
        List<VersionType> versionList =(List<VersionType>)(Object) response.getVersionList();
        VersionType latestReleaseVersion = null;
        VersionType latestBetaVersion = null;
        for (VersionType currentVersion : versionList) {
            if ((boolean)(Object)currentVersion.isBeta()) {
                if (latestBetaVersion == null ||(int)(Object) VersionUtils.compare(currentVersion.getId(), latestBetaVersion.getId()) > 0) {
                    latestBetaVersion = currentVersion;
                }
            } else {
                if (latestReleaseVersion == null ||(int)(Object) VersionUtils.compare(currentVersion.getId(), latestReleaseVersion.getId()) > 0) {
                    latestReleaseVersion = currentVersion;
                }
            }
        }
        betaVersion =(MyHelperClass)(Object) "0";
        releaseVersion =(MyHelperClass)(Object) "0";
        if (latestBetaVersion != null) {
            betaVersion = latestBetaVersion.getId();
        }
        if (latestReleaseVersion != null) {
            releaseVersion = latestReleaseVersion.getId();
        }
        int releaseCompare = 0;
        int betaCompare = 0;
        betaCompare =(int)(Object) VersionUtils.compare(betaVersion, PhexVersion.getFullVersion());
        releaseCompare =(int)(Object) VersionUtils.compare(releaseVersion, PhexVersion.getFullVersion());
        if (releaseCompare <= 0 && betaCompare <= 0) {
            return;
        }
        betaCompare =(int)(Object) VersionUtils.compare(betaVersion, LastBetaUpdateCheckVersion.get());
        releaseCompare =(int)(Object) VersionUtils.compare(releaseVersion, LastUpdateCheckVersion.get());
        int verDiff =(int)(Object) VersionUtils.compare(betaVersion, releaseVersion);
        boolean triggerUpdateNotification = false;
        if (releaseCompare > 0) {
            LastUpdateCheckVersion.set(releaseVersion);
            triggerUpdateNotification = true;
        }
        if (betaCompare > 0) {
            LastBetaUpdateCheckVersion.set(betaVersion);
            triggerUpdateNotification = true;
        }
        if (verDiff > 0) {
            releaseVersion = null;
        } else {
            betaVersion = null;
        }
        if (triggerUpdateNotification) {
            PhexCorePrefs.save(false);
            fireUpdateNotification();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass set(MyHelperClass o0){ return null; }
	public MyHelperClass warn(String o0, SocketException o1){ return null; }
	public MyHelperClass save(boolean o0){ return null; }
	public MyHelperClass getFullPhexVendor(){ return null; }
	public MyHelperClass getFullVersion(){ return null; }
	public MyHelperClass warn(String o0, UnknownHostException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass compare(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass set(Long o0){ return null; }
	public MyHelperClass error(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass readDPhexFromStream(ByteArrayInputStream o0){ return null; }}

class DPhex {

public MyHelperClass getUpdateResponse(){ return null; }}

class UpdateResponseParts {
public MyHelperClass xml;
}

class DUpdateResponse {

public MyHelperClass getVersionList(){ return null; }}

class VersionType {

public MyHelperClass getId(){ return null; }
	public MyHelperClass isBeta(){ return null; }}
