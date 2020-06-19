


class c529986 {
public MyHelperClass pause(){ return null; }

    void bsort(int a[], int lo, int hi) throws Exception {
        for (int j = hi; j > lo; j--) {
            for (int i = lo; i < j; i++) {
                if (a[i] > a[i + 1]) {
                    int T = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = T;
                    pause();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
