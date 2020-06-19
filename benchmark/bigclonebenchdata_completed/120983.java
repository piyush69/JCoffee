


class c120983 {
public MyHelperClass pause(int o0, int o1){ return null; }

    void sort(int a[]) throws Exception {
        for (int i = a.length; --i >= 0; ) {
            boolean flipped = false;
            for (int j = 0; j < i; j++) {
                MyHelperClass stopRequested = new MyHelperClass();
                if ((boolean)(Object)stopRequested) {
                    return;
                }
                if (a[j] > a[j + 1]) {
                    int T = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = T;
                    flipped = true;
                }
                pause(i, j);
            }
            if (!flipped) {
                return;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
