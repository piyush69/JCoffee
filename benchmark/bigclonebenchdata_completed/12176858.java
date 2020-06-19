


class c12176858 {
public MyHelperClass numc;

    void sortclasses() {
        int i, j;
        boolean domore;
        int[] vclassptr;// = new int[]();
        vclassptr = new int[(int)(Object)numc];
        MyHelperClass numc = new MyHelperClass();
        for (i = 0; i < (int)(Object)numc; i++) vclassptr[i] = i;
        domore = true;
        while (domore == true) {
            domore = false;
//            MyHelperClass numc = new MyHelperClass();
            for (i = 0; i <(int)(Object) numc - 1; i++) {
MyHelperClass[] vclassctr = new MyHelperClass[5];
                if ((int)(Object)vclassctr[vclassptr[i]] < (int)(Object)vclassctr[vclassptr[i + 1]]) {
//                    MyHelperClass vclassptr = new MyHelperClass();
                    int temp = vclassptr[i];
//                    MyHelperClass vclassptr = new MyHelperClass();
                    vclassptr[i] = vclassptr[i + 1];
//                    MyHelperClass vclassptr = new MyHelperClass();
                    vclassptr[i + 1] = temp;
                    domore = true;
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] vclassctr;
	public MyHelperClass[] vclassptr;
}
