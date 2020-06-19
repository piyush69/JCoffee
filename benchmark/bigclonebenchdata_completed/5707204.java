import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5707204 {
public MyHelperClass getTitle(String o0, String o1){ return null; }
	public MyHelperClass hideNotification(int o0){ return null; }
	public MyHelperClass postToast(String o0){ return null; }

    public void download(final String url, final long deleteRowId)  throws Throwable {
        new Thread(new Runnable() {

            public void run() {
                MyHelperClass LOG_TAG = new MyHelperClass();
                Log.d(LOG_TAG, "Fetching " + url);
                MyHelperClass mContext = new MyHelperClass();
                WebDbAdapter dbHelper = new WebDbAdapter(mContext);
                dbHelper.open();
                boolean errorOccurred = true;
                int notifyId = 0;
                MyHelperClass AppUtils = new MyHelperClass();
                String host = AppUtils.getHostFromUrl(url);
                try {
                    if (host == null) {
                        MyHelperClass LOG_TAG = new MyHelperClass();
                        Log.d(LOG_TAG, "Bad url " + url);
                        errorOccurred = true;
                    } else {
                        notifyId = showNotification("Fetching " + host, "Fetching " + host, drawable.stat_sys_download, 0);
                        MyHelperClass mContext = new MyHelperClass();
                        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(mContext);
                        String userAgent = sp.getString(mContext.getString(string.pref_key_user_agent), mContext.getString(string.default_user_agent));
                        MyHelperClass LOG_TAG = new MyHelperClass();
                        Log.d(LOG_TAG, "Using user agent=" + userAgent);
                        MyHelperClass mContext = new MyHelperClass();
                        AndroidHttpClient ahc = AndroidHttpClient.newInstance(mContext, url, userAgent);
                        URI uri = new URI(url);
                        URI norm = new URI(uri.getScheme().toLowerCase(), uri.getUserInfo(), uri.getHost().toLowerCase(), uri.getPort(), uri.getPath(), uri.getQuery(), null);
                        norm = norm.normalize();
                        HttpUriRequest get = new HttpGet(norm);
                        HttpResponse response = ahc.execute(get);
                        if (response.getStatusLine().getStatusCode() == 200) {
                            HttpEntity entity = response.getEntity();
                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                            entity.writeTo(baos);
                            String data = baos.toString();
                            MyHelperClass undesirables = new MyHelperClass();
                            for (int i = 0; i < undesirables.length; i++) {
                                MyHelperClass undesirables = new MyHelperClass();
                                Pattern p = Pattern.compile(undesirables[i], Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
                                data = data.replaceAll(p.pattern(), "");
                            }
                            long sysMillis = System.currentTimeMillis();
                            String newFileName = getPath(sysMillis, sp.getBoolean(mContext.getString(string.pref_key_store_sdcard), false));
                            FileOutputStream strm = new FileOutputStream(newFileName);
                            MyHelperClass LOG_TAG = new MyHelperClass();
                            Log.d(LOG_TAG, "Writing to " + newFileName + " for url " + url);
                            String jsData = AppUtils.fromRawResourceFile(raw.retain_loadcolors, mContext);
                            MyHelperClass RETAIN_COLORS_CSS = new MyHelperClass();
                            jsData = jsData.replaceAll("@css_file", RETAIN_COLORS_CSS);
                            strm.write(jsData.getBytes());
                            strm.write(data.getBytes());
                            strm.write(jsData.getBytes());
                            strm.flush();
                            strm.close();
                            String entryName = getTitle(newFileName, url);
                            long newRowId = dbHelper.createEntry(entryName, newFileName, url, sysMillis);
                            postToast("Downloaded \"" + entryName + "\"");
                            errorOccurred = false;
                            if (deleteRowId != 0) {
                                MyHelperClass LOG_TAG = new MyHelperClass();
                                Log.d(LOG_TAG, "Deleting rowId=" + deleteRowId);
                                dbHelper.deleteEntry(deleteRowId);
                                if (url == null) postToast("Item Deleted");
                                MyHelperClass mContext = new MyHelperClass();
                                mContext.startActivity(new Intent(mContext, RetainActivity.class));
                            } else {
                                showNotification("Download Complete", entryName, drawable.stat_sys_download_done, newRowId);
                            }
                        } else {
                            MyHelperClass LOG_TAG = new MyHelperClass();
                            Log.e(LOG_TAG, "Response code=" + String.valueOf(response.getStatusLine().getStatusCode()));
                        }
                    }
                } catch (IOException ioe) {
                    MyHelperClass LOG_TAG = new MyHelperClass();
                    Log.e(LOG_TAG, "RETAIN IOException: " + ioe.getMessage());
                } catch (URISyntaxException u) {
                    MyHelperClass LOG_TAG = new MyHelperClass();
                    Log.e(LOG_TAG, "RETAIN URISyntaxException: " + u.getMessage());
                } catch (OutOfMemoryError oome) {
                    MyHelperClass LOG_TAG = new MyHelperClass();
                    Log.e(LOG_TAG, "RETAIN OutOfMemoryError: " + oome.getMessage());
                } catch (Exception e) {
                    MyHelperClass LOG_TAG = new MyHelperClass();
                    Log.e(LOG_TAG, "RETAIN Exception: " + e.getMessage());
                }
                hideNotification(notifyId);
                if (errorOccurred && host != null) {
                    showNotification("Error Downloading", host, drawable.stat_notify_error, 0);
                    postToast("Error fetching " + host);
                }
                dbHelper.close();
            }
        }).start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class WebDbAdapter {

}

class SharedPreferences {

}

class AndroidHttpClient {

}

class HttpUriRequest {

}

class HttpGet {

}

class HttpResponse {

}

class HttpEntity {

}

class Pattern {

}

class Intent {

}
