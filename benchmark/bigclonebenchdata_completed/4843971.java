import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4843971 {
public MyHelperClass NULL;
public MyHelperClass CompositePageUtil;
	public MyHelperClass CacheManager;
	public MyHelperClass cuttleManagerList;
	public MyHelperClass logger;
	public MyHelperClass ConfigureDigester;
	public MyHelperClass isPrebuilding;
	public MyHelperClass getConfigPath(){ return null; }

    private synchronized void executePrebuildCache()  throws Throwable {
        boolean isPrebuilding =(boolean)(Object) NULL; //new boolean();
        isPrebuilding = true;
        String pathStr = "";
        String[] paths = null;
        XMLCacheBuilder cacheBuilder = null;
        if (this.getConfigPath() != null) {
            cacheBuilder =(XMLCacheBuilder)(Object) CompositePageUtil.getCacheBuilder();
            if (cacheBuilder == null) return;
            try {
                File file = new File((String)(Object)this.getConfigPath());
                FileInputStream is = new FileInputStream(file);
                OutputStream os = new ByteArrayOutputStream();
                int length = 0;
                if (is != null) {
                    byte[] buf = new byte[8192];
                    while (((length = is.read(buf)) != -1)) {
                        os.write(buf, 0, length);
                    }
                    is.close();
                    os.flush();
                    os.close();
                    is.close();
                }
                String filesStr = os.toString();
                if (filesStr == null) return;
                paths = filesStr.split("\n");
            } catch (FileNotFoundException e) {
                logger.error(e);
            } catch (IOException e) {
                logger.error(e);
            }
        } else {
            XMLRoot root =(XMLRoot)(Object) ConfigureDigester.getXmlRoot();
            cacheBuilder =(XMLCacheBuilder)(Object) root.getCacheBuilder();
            if (cacheBuilder == null) return;
            pathStr =(String)(Object) cacheBuilder.getPath();
            if (pathStr == null) return;
            paths = pathStr.split("\n");
        }
        logger.warn("[prebuildCache start:" + new java.util.Date() + "]");
        for (int i = 0; i < paths.length; i++) {
            try {
                String path = paths[i];
                logger.info("preBuildCache path:" + path);
                URL url = new URL(path);
                HttpURLConnection huc = (HttpURLConnection) url.openConnection();
                huc.setDoInput(true);
                huc.setDoOutput(true);
                huc.setUseCaches(false);
                huc.setRequestProperty("Content-Type", "text/html");
                DataOutputStream dos = new DataOutputStream(huc.getOutputStream());
                dos.flush();
                dos.close();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(huc.getInputStream()));
                StringBuffer result = new StringBuffer();
                String line;
                while (null != (line = bufferedReader.readLine())) result.append(line);
                bufferedReader.close();
                huc.disconnect();
            } catch (MalformedURLException e) {
                logger.warn("prebuildCache: MalformedURLException");
            } catch (IOException e) {
                logger.warn("prebuildCache: IOException");
                logger.warn("Is CACHE_SERVER dead? escape prebuild cache!");
                logger.error("[****Prebuild cache interrupted! Please check the CACHE_SERVER's status.****]");
            } catch (Exception e) {
                logger.warn("prebuildCache: Exception");
            }
        }
        logger.warn("[prebuildCache end:" + new java.util.Date() + "]");
        logger.info("[Time to migrate cache]");
        if (CacheManager.getPreCacheMap() == null ||(int)(Object) CacheManager.getPreCacheMap().size() == 0) {
            logger.warn("[****Something wrong in prebuild cache process is CACHE_SERVER dead? escape sending cache to CLIENT****]");
            return;
        } else {
            CacheManager.migrateCache();
        }
        logger.info("[Cache migration finish!]");
        if (cacheBuilder.getPoint() != null && cacheBuilder.getPoint().equals("SERVER")) {
            logger.info("Sending cache to CLIENT");
            if (cuttleManagerList != null) {
                for (int i = 0; i < (int)(Object)cuttleManagerList.size(); i++) {
                    try {
                        CuttleManager cuttleManager = (CuttleManager)(CuttleManager)(Object) cuttleManagerList.get(i);
                        cuttleManager.migrateCache(CacheManager.getCacheTimeoutMap(), CacheManager.getCacheMap());
                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.error(e);
                        logger.error("Sending cache to CLIENT:" + (i + 1) + " failed!");
                    }
                }
            }
            logger.info("Cache migrate to CLIENT finished!");
        }
        try {
            logger.info("Time to sleep for sending cache to CLIENT: 1 minute");
            Thread.sleep(60000);
            logger.info("Wake up for next prebuild cache!");
        } catch (Exception e) {
            logger.warn("thread sleep interrupt!");
        }
        isPrebuilding =(boolean)(Object)(MyHelperClass)(Object) false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass getXmlRoot(){ return null; }
	public MyHelperClass getCacheMap(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass error(FileNotFoundException o0){ return null; }
	public MyHelperClass migrateCache(){ return null; }
	public MyHelperClass getCacheTimeoutMap(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass getCacheBuilder(){ return null; }
	public MyHelperClass getPreCacheMap(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }}

class XMLCacheBuilder {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass getPoint(){ return null; }}

class XMLRoot {

public MyHelperClass getCacheBuilder(){ return null; }}

class CuttleManager {

public MyHelperClass migrateCache(MyHelperClass o0, MyHelperClass o1){ return null; }}
