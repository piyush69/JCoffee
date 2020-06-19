


class c14132422 {

    public static void bubble_sort(Sortable[] objects) {
        for (int i = objects.length; --i >= 0; ) {
            boolean flipped = false;
            for (int j = 0; j < i; j++) {
                if ((boolean)(Object)objects[j].greater_than(objects[j + 1])) {
                    Sortable tmp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = tmp;
                    flipped = true;
                }
            }
            if (!flipped) return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Sortable {

public MyHelperClass greater_than(Sortable o0){ return null; }}
