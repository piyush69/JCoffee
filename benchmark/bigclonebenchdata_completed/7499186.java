import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7499186 {
public MyHelperClass Log;
	public MyHelperClass getResources(){ return null; }
	public MyHelperClass finish(){ return null; }

    private void bootKernel(String conf)  throws Throwable {
        try {
            AssetManager am = getResources().getAssets();
            InputStream is = am.open(conf + ".conf");
            Properties props = new Properties();
            props.load(is);
            is.close();
            Log.d("bootKernel", "Listing sdcard assets...");
            String[] sdcardfiles = am.list("sdcard");
            for (String file : sdcardfiles) {
                Log.d("bootKernel", "Copying sdcard asset " + file + ".");
                AssetFileDescriptor afd = am.openFd("sdcard/" + file);
                FileInputStream fis = afd.createInputStream();
                FileChannel fic =(FileChannel)(Object) fis.getChannel();
                FileOutputStream fos = new FileOutputStream("/sdcard/" + file);
                FileChannel foc =(FileChannel)(Object) fos.getChannel();
                fic.transferTo(0, fic.size(), foc);
                fic.close();
                foc.close();
            }
            Configuration gconf = new JavaPropertiesConfiguration(props);
            Configuration bconf = gconf.subset("boot");
            String kclass_name = bconf.getString("kernel");
            Log.d("bootKernel", "Attempting to load kernel from class '" + kclass_name + "'...");
            Class<? extends Kernel> kclass = Class.forName(kclass_name).asSubclass(Kernel.class);
            Kernel kernel = kclass.newInstance();
            Log.d("bootKernel", "Kernel loaded, proceeding with boot...");
            BootContext bctx = new SimpleBootContext(gconf, AndroidBridgeService.class, AndroidBridgeServiceImpl.class);
            kernel.boot(bctx).get();
            Log.d("bootKernel", "Kernel boot complete.");
        } catch (Exception e) {
            Log.e("bootKernel", "Unable to boot kernel due to exception.", e);
            finish();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(String o0, String o1, Exception o2){ return null; }
	public MyHelperClass getAssets(){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }}

class AssetManager {

public MyHelperClass list(String o0){ return null; }
	public MyHelperClass openFd(String o0){ return null; }
	public MyHelperClass open(String o0){ return null; }}

class AssetFileDescriptor {

public MyHelperClass createInputStream(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class Configuration {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass subset(String o0){ return null; }}

class JavaPropertiesConfiguration {

JavaPropertiesConfiguration(Properties o0){}
	JavaPropertiesConfiguration(){}}

class Kernel {

public MyHelperClass boot(BootContext o0){ return null; }}

class BootContext {

}

class SimpleBootContext {

SimpleBootContext(){}
	SimpleBootContext(Configuration o0, Class<AndroidBridgeService>,Class<AndroidBridgeServiceImpl> o1){}}

class AndroidBridgeService {

}

class AndroidBridgeServiceImpl {

}
