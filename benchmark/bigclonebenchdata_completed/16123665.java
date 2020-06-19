


class c16123665 {

    public static void bubbleSort(Drawable[] list) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; ++i) {
                if ((int)(Object)list[i].getSortValue() > (int)(Object)list[i + 1].getSortValue()) {
                    Drawable temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Drawable {

public MyHelperClass getSortValue(){ return null; }}
