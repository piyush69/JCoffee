


class c878123 {
public MyHelperClass stopRequested;
	public MyHelperClass pause(int o0, int o1){ return null; }

    void sort(int a[]) throws Exception {
        int j;
        int limit = a.length;
        int st = -1;
        while (st < limit) {
            boolean flipped = false;
            st++;
            limit--;
            for (j = st; j < limit; j++) {
                MyHelperClass stopRequested = new MyHelperClass();
                if ((boolean)(Object)stopRequested) {
                    return;
                }
                if (a[j] > a[j + 1]) {
                    int T = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = T;
                    flipped = true;
                    pause(st, limit);
                }
            }
            if (!flipped) {
                return;
            }
            for (j = limit; --j >= st; ) {
                if ((boolean)(Object)stopRequested) {
                    return;
                }
                if (a[j] > a[j + 1]) {
                    int T = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = T;
                    flipped = true;
                    pause(st, limit);
                }
            }
            if (!flipped) {
                return;
            }
        }
        pause(st, limit);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
