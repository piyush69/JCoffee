


class c359113 {

    public static void bubbleSort(String[] a) {
        MyHelperClass Collator = new MyHelperClass();
        Collator myCollator =(Collator)(Object) Collator.getInstance();
        boolean switched = true;
        for (int pass = 0; pass < a.length - 1 && switched; pass++) {
            switched = false;
            for (int i = 0; i < a.length - pass - 1; i++) {
                if ((int)(Object)myCollator.compare(a[i], a[i + 1]) > 0) {
                    switched = true;
                    String temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }}

class Collator {

public MyHelperClass compare(String o0, String o1){ return null; }}
