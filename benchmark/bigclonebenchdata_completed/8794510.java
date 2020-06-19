


class c8794510 {

    public static void bubbleSort(Auto[] xs) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < xs.length - 1; i++) {
                if (!((int)(Object)xs[i].getPreis() >= (int)(Object)xs[i + 1].getPreis())) {
                    Auto dummy = xs[i];
                    xs[i] = xs[i + 1];
                    xs[i + 1] = dummy;
                    unsorted = true;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Auto {

public MyHelperClass getPreis(){ return null; }}
