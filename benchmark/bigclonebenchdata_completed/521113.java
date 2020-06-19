


class c521113 {
public MyHelperClass getValues(){ return null; }

    int[] slowSort() {
        int[] values =(int[])(Object) getValues();
        int n = values.length;
        for (int pass = 1; pass < n; pass++) {
            for (int i = 0; i < n - pass; i++) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
            }
        }
        return values;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
