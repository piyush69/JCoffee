import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9075137 {

    public boolean implies(Permission permission)  throws Throwable {
        MyHelperClass permissionClass = new MyHelperClass();
        if (!(Boolean)(Object)permissionClass.isInstance(permission)) {
            return false;
        }
        GCFPermission perm = (GCFPermission)(GCFPermission)(Object) permission;
        int perm_low =(int)(Object) perm.getMinPort();
        int perm_high =(int)(Object) perm.getMaxPort();
        MyHelperClass permissions = new MyHelperClass();
        Enumeration search =(Enumeration)(Object) permissions.elements();
//        MyHelperClass permissions = new MyHelperClass();
        int count =(int)(Object) permissions.size();
        int port_low[] = new int[count];
        int port_high[] = new int[count];
        int port_range_count = 0;
        while (search.hasMoreElements()) {
            GCFPermission cur_perm = (GCFPermission) search.nextElement();
            if ((boolean)(Object)cur_perm.impliesByHost(perm)) {
                if ((boolean)(Object)cur_perm.impliesByPorts(perm)) {
                    return true;
                }
                port_low[port_range_count] =(int)(Object) cur_perm.getMinPort();
                port_high[port_range_count] =(int)(Object) cur_perm.getMaxPort();
                port_range_count++;
            }
        }
        for (int i = 0; i < port_range_count; i++) {
            for (int j = 0; j < port_range_count - 1; j++) {
                if (port_low[j] > port_low[j + 1]) {
                    int tmp = port_low[j];
                    port_low[j] = port_low[j + 1];
                    port_low[j + 1] = tmp;
                    tmp = port_high[j];
                    port_high[j] = port_high[j + 1];
                    port_high[j + 1] = tmp;
                }
            }
        }
        int current_low = port_low[0];
        int current_high = port_high[0];
        for (int i = 1; i < port_range_count; i++) {
            if (port_low[i] > current_high + 1) {
                if (current_low <= perm_low && current_high >= perm_high) {
                    return true;
                }
                if (perm_low <= current_high) {
                    return false;
                }
                current_low = port_low[i];
                current_high = port_high[i];
            } else {
                if (current_high < port_high[i]) {
                    current_high = port_high[i];
                }
            }
        }
        return (current_low <= perm_low && current_high >= perm_high);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isInstance(Permission o0){ return null; }
	public MyHelperClass elements(){ return null; }
	public MyHelperClass size(){ return null; }}

class GCFPermission {

public MyHelperClass impliesByHost(GCFPermission o0){ return null; }
	public MyHelperClass getMinPort(){ return null; }
	public MyHelperClass getMaxPort(){ return null; }
	public MyHelperClass impliesByPorts(GCFPermission o0){ return null; }}
