


class c19260977 {

    public int[] sort() {
        boolean t = true;
        int temp = 0;
        MyHelperClass N = new MyHelperClass();
        int[] mas = new int[(int)(Object)N];
        Random rand = new Random();
//        MyHelperClass N = new MyHelperClass();
        for (int i = 0; i < (int)(Object)N; i++) {
            mas[i] =(int)(Object) rand.nextInt(10) + 1;
        }
        while (t) {
            t = false;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    t = true;
                }
            }
        }
        return mas;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Random {

public MyHelperClass nextInt(int o0){ return null; }}
