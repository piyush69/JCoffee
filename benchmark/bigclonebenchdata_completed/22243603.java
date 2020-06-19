import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22243603 {
public MyHelperClass controlContext;

//    @Override
    protected PermissionCollection getPermissions(CodeSource _codeSource)  throws Throwable {
        PermissionCollection perms = this.getPermissions(_codeSource);
        URL url = _codeSource.getLocation();
        Permission perm = null;
        URLConnection urlConnection = null;
        try {
            urlConnection = url.openConnection();
            urlConnection.connect();
            perm = urlConnection.getPermission();
        } catch (IOException excp) {
            perm = null;
            urlConnection = null;
        }
        if (perm == null) {
            perm = new ModulePermission(url.getHost(), "read");
        }
        if (perm != null) {
            final SecurityManager sm = System.getSecurityManager();
            if (sm != null) {
                final Permission fp = perm;
                AccessController.doPrivileged(new PrivilegedAction<Object>() {

                    public Object run() throws SecurityException {
                        sm.checkPermission(fp);
                        return null;
                    }
                }, this.controlContext);
            }
            perms.add(perm);
        }
        return perms;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ModulePermission {

}
