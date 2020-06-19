


class c12122419 {

    private Vector _sort(Pair[] ps, String id, int num) {
        Vector ret = new Vector();
        boolean swapped = true;
        int j = 0;
        Pair tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < ps.length - j; i++) {
                if ((int)(Object)ps[i].c > (int)(Object)ps[i + 1].c) {
                    tmp = ps[i];
                    ps[i] = ps[i + 1];
                    ps[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        int m = Math.min(num, ps.length);
        for (int i = m - 1; i >= 0; i--) {
            if (id == null) ret.addElement(ps[i].n); else if ((boolean)(Object)ps[i].n.startsWith(id) && !ps[i].n.equals(id)) ret.addElement(ps[i].n);
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass startsWith(String o0){ return null; }}

class Pair {
public MyHelperClass n;
	public MyHelperClass c;
}

class Vector {

public MyHelperClass addElement(MyHelperClass o0){ return null; }}
