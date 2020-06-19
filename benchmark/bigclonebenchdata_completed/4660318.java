import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4660318 {
public static MyHelperClass try_warning(int o0, String o1, String o2){ return null; }
//public MyHelperClass try_warning(int o0, String o1, String o2){ return null; }
public static MyHelperClass check(double o0, double o1){ return null; }
public static MyHelperClass Matrix;
	public static MyHelperClass try_success(String o0, String o1){ return null; }
	public static MyHelperClass try_failure(int o0, String o1, String o2){ return null; }
	public static MyHelperClass check(double[] o0, double[] o1){ return null; }
	public static MyHelperClass check(double[][] o0, double[][] o1){ return null; }
	public static MyHelperClass print(String o0){ return null; }
//public MyHelperClass Matrix;
//	public MyHelperClass check(double[] o0, double[] o1){ return null; }
//	public MyHelperClass try_failure(int o0, String o1, String o2){ return null; }
//	public MyHelperClass check(double o0, double o1){ return null; }
//	public MyHelperClass try_success(String o0, String o1){ return null; }
//	public MyHelperClass print(String o0){ return null; }
//	public MyHelperClass check(double[][] o0, double[][] o1){ return null; }

    public static void main(String argv[])  throws Throwable {
        Matrix A, B, C, Z, O, I, R, S, X, SUB, M, T, SQ, DEF, SOL;
        int errorCount = 0;
        int warningCount = 0;
        double tmp, s;
        double[] columnwise = { 1., 2., 3., 4., 5., 6., 7., 8., 9., 10., 11., 12. };
        double[] rowwise = { 1., 4., 7., 10., 2., 5., 8., 11., 3., 6., 9., 12. };
        double[][] avals = { { 1., 4., 7., 10. }, { 2., 5., 8., 11. }, { 3., 6., 9., 12. } };
        double[][] rankdef = avals;
        double[][] tvals = { { 1., 2., 3. }, { 4., 5., 6. }, { 7., 8., 9. }, { 10., 11., 12. } };
        double[][] subavals = { { 5., 8., 11. }, { 6., 9., 12. } };
        double[][] rvals = { { 1., 4., 7. }, { 2., 5., 8., 11. }, { 3., 6., 9., 12. } };
        double[][] pvals = { { 1., 1., 1. }, { 1., 2., 3. }, { 1., 3., 6. } };
        double[][] ivals = { { 1., 0., 0., 0. }, { 0., 1., 0., 0. }, { 0., 0., 1., 0. } };
        double[][] evals = { { 0., 1., 0., 0. }, { 1., 0., 2.e-7, 0. }, { 0., -2.e-7, 0., 1. }, { 0., 0., 1., 0. } };
        double[][] square = { { 166., 188., 210. }, { 188., 214., 240. }, { 210., 240., 270. } };
        double[][] sqSolution = { { 13. }, { 15. } };
        double[][] condmat = { { 1., 3. }, { 7., 9. } };
        int rows = 3, cols = 4;
        int invalidld = 5;
        int raggedr = 0;
        int raggedc = 4;
        int validld = 3;
        int nonconformld = 4;
        int ib = 1, ie = 2, jb = 1, je = 3;
        int[] rowindexset = { 1, 2 };
        int[] badrowindexset = { 1, 3 };
        int[] columnindexset = { 1, 2, 3 };
        int[] badcolumnindexset = { 1, 2, 4 };
        double columnsummax = 33.;
        double rowsummax = 30.;
        double sumofdiagonals = 15;
        double sumofsquares = 650;
        print("\nTesting constructors and constructor-like methods...\n");
        try {
            A = new Matrix(columnwise, invalidld);
            errorCount =(int)(Object) try_failure(errorCount, "Catch invalid length in packed constructor... ", "exception not thrown for invalid input");
        } catch (IllegalArgumentException e) {
            try_success("Catch invalid length in packed constructor... ", e.getMessage());
        }
        try {
            A = new Matrix(rvals);
            tmp =(double)(Object) A.get(raggedr, raggedc);
        } catch (IllegalArgumentException e) {
            try_success("Catch ragged input to default constructor... ", e.getMessage());
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            errorCount =(int)(Object) try_failure(errorCount, "Catch ragged input to constructor... ", "exception not thrown in construction...ArrayIndexOutOfBoundsException thrown later");
        }
        try {
            A =(Matrix)(Object) Matrix.constructWithCopy(rvals);
            tmp =(double)(Object) A.get(raggedr, raggedc);
        } catch (IllegalArgumentException e) {
            try_success("Catch ragged input to constructWithCopy... ", e.getMessage());
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            errorCount =(int)(Object) try_failure(errorCount, "Catch ragged input to constructWithCopy... ", "exception not thrown in construction...ArrayIndexOutOfBoundsException thrown later");
        }
        A = new Matrix(columnwise, validld);
        B = new Matrix(avals);
        tmp =(double)(Object) B.get(0, 0);
        avals[0][0] = 0.0;
        C =(Matrix)(Object) B.minus(A);
        avals[0][0] = tmp;
        B =(Matrix)(Object) Matrix.constructWithCopy(avals);
        tmp =(double)(Object) B.get(0, 0);
        avals[0][0] = 0.0;
        if ((tmp - (double)(Object)B.get(0, 0)) != 0.0) {
            errorCount =(int)(Object) try_failure(errorCount, "constructWithCopy... ", "copy not effected... data visible outside");
        } else {
            try_success("constructWithCopy... ", "");
        }
        avals[0][0] = columnwise[0];
        I = new Matrix(ivals);
        try {
            check((double)(Object)(double[])(Object)I,(double)(Object) Matrix.identity(3, 4));
            try_success("identity... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "identity... ", "identity Matrix not successfully created");
        }
        print("\nTesting access methods...\n");
        B = new Matrix(avals);
        if ((int)(Object)B.getRowDimension() != rows) {
            errorCount =(int)(Object) try_failure(errorCount, "getRowDimension... ", "");
        } else {
            try_success("getRowDimension... ", "");
        }
        if ((int)(Object)B.getColumnDimension() != cols) {
            errorCount =(int)(Object) try_failure(errorCount, "getColumnDimension... ", "");
        } else {
            try_success("getColumnDimension... ", "");
        }
        B = new Matrix(avals);
        double[][] barray =(double[][])(Object) B.getArray();
        if (barray != avals) {
            errorCount =(int)(Object) try_failure(errorCount, "getArray... ", "");
        } else {
            try_success("getArray... ", "");
        }
        barray =(double[][])(Object) B.getArrayCopy();
        if (barray == avals) {
            errorCount =(int)(Object) try_failure(errorCount, "getArrayCopy... ", "data not (deep) copied");
        }
        try {
            check(barray, avals);
            try_success("getArrayCopy... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "getArrayCopy... ", "data not successfully (deep) copied");
        }
        double[] bpacked =(double[])(Object) B.getColumnPackedCopy();
        try {
            check(bpacked, columnwise);
            try_success("getColumnPackedCopy... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "getColumnPackedCopy... ", "data not successfully (deep) copied by columns");
        }
        bpacked =(double[])(Object) B.getRowPackedCopy();
        try {
            check(bpacked, rowwise);
            try_success("getRowPackedCopy... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "getRowPackedCopy... ", "data not successfully (deep) copied by rows");
        }
        try {
            tmp =(double)(Object) B.get((int)(Object)B.getRowDimension(),(int)(Object) B.getColumnDimension() - 1);
            errorCount =(int)(Object) try_failure(errorCount, "get(int,int)... ", "OutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                tmp =(double)(Object) B.get((int)(Object)B.getRowDimension() - 1,(int)(Object) B.getColumnDimension());
                errorCount =(int)(Object) try_failure(errorCount, "get(int,int)... ", "OutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("get(int,int)... OutofBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "get(int,int)... ", "OutOfBoundsException expected but not thrown");
        }
        try {
            if ((double)(Object)B.get((int)(Object)B.getRowDimension() - 1,(int)(Object) B.getColumnDimension() - 1) != avals[(int)(Object)B.getRowDimension() - 1][(int)(Object)B.getColumnDimension() - 1]) {
                errorCount =(int)(Object) try_failure(errorCount, "get(int,int)... ", "Matrix entry (i,j) not successfully retreived");
            } else {
                try_success("get(int,int)... ", "");
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            errorCount =(int)(Object) try_failure(errorCount, "get(int,int)... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        SUB = new Matrix(subavals);
        try {
            M =(Matrix)(Object) B.getMatrix(ib, ie + (int)(Object)B.getRowDimension() + 1, jb, je);
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int,int)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                M =(Matrix)(Object) B.getMatrix(ib, ie, jb, je + (int)(Object)B.getColumnDimension() + 1);
                errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int,int)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("getMatrix(int,int,int,int)... ArrayIndexOutOfBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int,int)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        }
        try {
            M =(Matrix)(Object) B.getMatrix(ib, ie, jb, je);
            try {
                check((double[])(Object)SUB,(double[])(Object) M);
                try_success("getMatrix(int,int,int,int)... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int,int)... ", "submatrix not successfully retreived");
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int,int)... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        try {
            M =(Matrix)(Object) B.getMatrix(ib, ie, badcolumnindexset);
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int[])... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                M =(Matrix)(Object) B.getMatrix(ib, ie + (int)(Object)B.getRowDimension() + 1, columnindexset);
                errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int[])... ", "ArrayIndexOutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("getMatrix(int,int,int[])... ArrayIndexOutOfBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int[])... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        }
        try {
            M =(Matrix)(Object) B.getMatrix(ib, ie, columnindexset);
            try {
                check((double)(Object)(double[])(Object)SUB,(double)(Object) M);
                try_success("getMatrix(int,int,int[])... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int[])... ", "submatrix not successfully retreived");
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int,int,int[])... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        try {
            M =(Matrix)(Object) B.getMatrix(badrowindexset, jb, je);
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int,int)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                M =(Matrix)(Object) B.getMatrix(rowindexset, jb, je + (int)(Object)B.getColumnDimension() + 1);
                errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int,int)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("getMatrix(int[],int,int)... ArrayIndexOutOfBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int,int)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        }
        try {
            M =(Matrix)(Object) B.getMatrix(rowindexset, jb, je);
            try {
                check((double)(Object)(double[])(Object)SUB,(double)(Object) M);
                try_success("getMatrix(int[],int,int)... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int,int)... ", "submatrix not successfully retreived");
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int,int)... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        try {
            M =(Matrix)(Object) B.getMatrix(badrowindexset, columnindexset);
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int[])... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                M =(Matrix)(Object) B.getMatrix(rowindexset, badcolumnindexset);
                errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int[])... ", "ArrayIndexOutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("getMatrix(int[],int[])... ArrayIndexOutOfBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int[])... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        }
        try {
            M =(Matrix)(Object) B.getMatrix(rowindexset, columnindexset);
            try {
                check((double)(Object)(double[])(Object)SUB,(double)(Object) M);
                try_success("getMatrix(int[],int[])... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int[])... ", "submatrix not successfully retreived");
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            errorCount =(int)(Object) try_failure(errorCount, "getMatrix(int[],int[])... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        try {
            B.set((int)(Object)B.getRowDimension(),(int)(Object) B.getColumnDimension() - 1, 0.);
            errorCount =(int)(Object) try_failure(errorCount, "set(int,int,double)... ", "OutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                B.set((int)(Object)B.getRowDimension() - 1,(int)(Object) B.getColumnDimension(), 0.);
                errorCount =(int)(Object) try_failure(errorCount, "set(int,int,double)... ", "OutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("set(int,int,double)... OutofBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "set(int,int,double)... ", "OutOfBoundsException expected but not thrown");
        }
        try {
            B.set(ib, jb, 0.);
            tmp =(double)(Object) B.get(ib, jb);
            try {
                check(tmp, 0.);
                try_success("set(int,int,double)... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "set(int,int,double)... ", "Matrix element not successfully set");
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "set(int,int,double)... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        M = new Matrix(2, 3, 0.);
        try {
            B.setMatrix(ib, ie + (int)(Object)B.getRowDimension() + 1, jb, je, M);
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int,int,Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                B.setMatrix(ib, ie, jb, je + (int)(Object)B.getColumnDimension() + 1, M);
                errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int,int,Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("setMatrix(int,int,int,int,Matrix)... ArrayIndexOutOfBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int,int,Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        }
        try {
            B.setMatrix(ib, ie, jb, je, M);
            try {
                check((double)(Object)M.minus((Matrix)(Object)B.getMatrix(ib, ie, jb, je)),(double)(Object) M);
                try_success("setMatrix(int,int,int,int,Matrix)... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int,int,Matrix)... ", "submatrix not successfully set");
            }
            B.setMatrix(ib, ie, jb, je, SUB);
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int,int,Matrix)... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        try {
            B.setMatrix(ib, ie + (int)(Object)B.getRowDimension() + 1, columnindexset, M);
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int[],Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                B.setMatrix(ib, ie, badcolumnindexset, M);
                errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int[],Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("setMatrix(int,int,int[],Matrix)... ArrayIndexOutOfBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int[],Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        }
        try {
            B.setMatrix(ib, ie, columnindexset, M);
            try {
                check((double)(Object)M.minus((Matrix)(Object)B.getMatrix(ib, ie, columnindexset)),(double)(Object) M);
                try_success("setMatrix(int,int,int[],Matrix)... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int[],Matrix)... ", "submatrix not successfully set");
            }
            B.setMatrix(ib, ie, jb, je, SUB);
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int,int,int[],Matrix)... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        try {
            B.setMatrix(rowindexset, jb, je + (int)(Object)B.getColumnDimension() + 1, M);
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int,int,Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                B.setMatrix(badrowindexset, jb, je, M);
                errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int,int,Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("setMatrix(int[],int,int,Matrix)... ArrayIndexOutOfBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int,int,Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        }
        try {
            B.setMatrix(rowindexset, jb, je, M);
            try {
                check((double)(Object)M.minus((Matrix)(Object)B.getMatrix(rowindexset, jb, je)),(double)(Object) M);
                try_success("setMatrix(int[],int,int,Matrix)... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int,int,Matrix)... ", "submatrix not successfully set");
            }
            B.setMatrix(ib, ie, jb, je, SUB);
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int,int,Matrix)... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        try {
            B.setMatrix(rowindexset, badcolumnindexset, M);
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int[],Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            try {
                B.setMatrix(badrowindexset, columnindexset, M);
                errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int[],Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
            } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
                try_success("setMatrix(int[],int[],Matrix)... ArrayIndexOutOfBoundsException... ", "");
            }
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int[],Matrix)... ", "ArrayIndexOutOfBoundsException expected but not thrown");
        }
        try {
            B.setMatrix(rowindexset, columnindexset, M);
            try {
                check((double)(Object)M.minus((Matrix)(Object)B.getMatrix(rowindexset, columnindexset)),(double)(Object) M);
                try_success("setMatrix(int[],int[],Matrix)... ", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int[],Matrix)... ", "submatrix not successfully set");
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "setMatrix(int[],int[],Matrix)... ", "Unexpected ArrayIndexOutOfBoundsException");
        }
        print("\nTesting array-like methods...\n");
        S = new Matrix(columnwise, nonconformld);
        R =(Matrix)(Object) Matrix.random(A.getRowDimension(), A.getColumnDimension());
        A = R;
        try {
            S =(Matrix)(Object) A.minus(S);
            errorCount =(int)(Object) try_failure(errorCount, "minus conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("minus conformance check... ", "");
        }
        if ((double)(Object)A.minus(R).norm1() != 0.) {
            errorCount =(int)(Object) try_failure(errorCount, "minus... ", "(difference of identical Matrices is nonzero,\nSubsequent use of minus should be suspect)");
        } else {
            try_success("minus... ", "");
        }
        A =(Matrix)(Object) R.copy();
        A.minusEquals(R);
        Z = new Matrix((double[])(Object)A.getRowDimension(),(int)(Object) A.getColumnDimension());
        try {
            A.minusEquals(S);
            errorCount =(int)(Object) try_failure(errorCount, "minusEquals conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("minusEquals conformance check... ", "");
        }
        if ((double)(Object)A.minus(Z).norm1() != 0.) {
            errorCount =(int)(Object) try_failure(errorCount, "minusEquals... ", "(difference of identical Matrices is nonzero,\nSubsequent use of minus should be suspect)");
        } else {
            try_success("minusEquals... ", "");
        }
        A =(Matrix)(Object) R.copy();
        B =(Matrix)(Object) Matrix.random(A.getRowDimension(), A.getColumnDimension());
        C =(Matrix)(Object) A.minus(B);
        try {
            S =(Matrix)(Object) A.plus(S);
            errorCount =(int)(Object) try_failure(errorCount, "plus conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("plus conformance check... ", "");
        }
        try {
            check((double)(Object)C.plus(B),(double)(Object) A);
            try_success("plus... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "plus... ", "(C = A - B, but C + B != A)");
        }
        C =(Matrix)(Object) A.minus(B);
        C.plusEquals(B);
        try {
            A.plusEquals(S);
            errorCount =(int)(Object) try_failure(errorCount, "plusEquals conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("plusEquals conformance check... ", "");
        }
        try {
            check((double)(Object)C,(double)(Object) A);
            try_success("plusEquals... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "plusEquals... ", "(C = A - B, but C = C + B != A)");
        }
        A =(Matrix)(Object) R.uminus();
        try {
            check((double)(Object)A.plus(R),(double)(Object) Z);
            try_success("uminus... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "uminus... ", "(-A + A != zeros)");
        }
        A =(Matrix)(Object) R.copy();
        O = new Matrix((int)(Object)A.getRowDimension(),(int)(Object) A.getColumnDimension(), 1.0);
        C =(Matrix)(Object) A.arrayLeftDivide(R);
        try {
            S =(Matrix)(Object) A.arrayLeftDivide(S);
            errorCount =(int)(Object) try_failure(errorCount, "arrayLeftDivide conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("arrayLeftDivide conformance check... ", "");
        }
        try {
            check((double)(Object)C,(double)(Object) O);
            try_success("arrayLeftDivide... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "arrayLeftDivide... ", "(M.\\M != ones)");
        }
        try {
            A.arrayLeftDivideEquals(S);
            errorCount =(int)(Object) try_failure(errorCount, "arrayLeftDivideEquals conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("arrayLeftDivideEquals conformance check... ", "");
        }
        A.arrayLeftDivideEquals(R);
        try {
            check((double)(Object)A,(double)(Object) O);
            try_success("arrayLeftDivideEquals... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "arrayLeftDivideEquals... ", "(M.\\M != ones)");
        }
        A =(Matrix)(Object) R.copy();
        try {
            A.arrayRightDivide(S);
            errorCount =(int)(Object) try_failure(errorCount, "arrayRightDivide conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("arrayRightDivide conformance check... ", "");
        }
        C =(Matrix)(Object) A.arrayRightDivide(R);
        try {
            check((double)(Object)C,(double)(Object) O);
            try_success("arrayRightDivide... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "arrayRightDivide... ", "(M./M != ones)");
        }
        try {
            A.arrayRightDivideEquals(S);
            errorCount =(int)(Object) try_failure(errorCount, "arrayRightDivideEquals conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("arrayRightDivideEquals conformance check... ", "");
        }
        A.arrayRightDivideEquals(R);
        try {
            check((double)(Object)A,(double)(Object) O);
            try_success("arrayRightDivideEquals... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "arrayRightDivideEquals... ", "(M./M != ones)");
        }
        A =(Matrix)(Object) R.copy();
        B =(Matrix)(Object) Matrix.random(A.getRowDimension(), A.getColumnDimension());
        try {
            S =(Matrix)(Object) A.arrayTimes(S);
            errorCount =(int)(Object) try_failure(errorCount, "arrayTimes conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("arrayTimes conformance check... ", "");
        }
        C =(Matrix)(Object) A.arrayTimes(B);
        try {
            check((double)(Object)C.arrayRightDivideEquals(B),(double)(Object) A);
            try_success("arrayTimes... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "arrayTimes... ", "(A = R, C = A.*B, but C./B != A)");
        }
        try {
            A.arrayTimesEquals(S);
            errorCount =(int)(Object) try_failure(errorCount, "arrayTimesEquals conformance check... ", "nonconformance not raised");
        } catch (IllegalArgumentException e) {
            try_success("arrayTimesEquals conformance check... ", "");
        }
        A.arrayTimesEquals(B);
        try {
            check((double)(Object)A.arrayRightDivideEquals(B),(double)(Object) R);
            try_success("arrayTimesEquals... ", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "arrayTimesEquals... ", "(A = R, A = A.*B, but A./B != R)");
        }
        print("\nTesting I/O methods...\n");
        try {
            DecimalFormat fmt = new DecimalFormat("0.0000E00");
            fmt.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
            PrintWriter FILE = new PrintWriter(new FileOutputStream("JamaTestMatrix.out"));
            A.print(FILE, fmt, 10);
            FILE.close();
            R =(Matrix)(Object) Matrix.read(new BufferedReader(new FileReader("JamaTestMatrix.out")));
            if ((double)(Object)A.minus(R).norm1() < .001) {
                try_success("print()/read()...", "");
            } else {
                errorCount =(int)(Object) try_failure(errorCount, "print()/read()...", "Matrix read from file does not match Matrix printed to file");
            }
        } catch (java.io.IOException ioe) {
            warningCount =(int)(Object) try_warning(warningCount, "print()/read()...", "unexpected I/O error, unable to run print/read test;  check write permission in current directory and retry");
        } catch (Exception e) {
            try {
                e.printStackTrace(System.out);
                warningCount =(int)(Object) try_warning(warningCount, "print()/read()...", "Formatting error... will try JDK1.1 reformulation...");
                DecimalFormat fmt = new DecimalFormat("0.0000");
                PrintWriter FILE = new PrintWriter(new FileOutputStream("JamaTestMatrix.out"));
                A.print(FILE, fmt, 10);
                FILE.close();
                R =(Matrix)(Object) Matrix.read(new BufferedReader(new FileReader("JamaTestMatrix.out")));
                if ((double)(Object)A.minus(R).norm1() < .001) {
                    try_success("print()/read()...", "");
                } else {
                    errorCount =(int)(Object) try_failure(errorCount, "print()/read() (2nd attempt) ...", "Matrix read from file does not match Matrix printed to file");
                }
            } catch (java.io.IOException ioe) {
                warningCount =(int)(Object) try_warning(warningCount, "print()/read()...", "unexpected I/O error, unable to run print/read test;  check write permission in current directory and retry");
            }
        }
        R =(Matrix)(Object) Matrix.random(A.getRowDimension(), A.getColumnDimension());
        String tmpname = "TMPMATRIX.serial";
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(tmpname));
            out.writeObject(R);
            ObjectInputStream sin = new ObjectInputStream(new FileInputStream(tmpname));
            A = (Matrix) sin.readObject();
            try {
                check((double)(Object)A,(double)(Object) R);
                try_success("writeObject(Matrix)/readObject(Matrix)...", "");
            } catch (java.lang.RuntimeException e) {
                errorCount =(int)(Object) try_failure(errorCount, "writeObject(Matrix)/readObject(Matrix)...", "Matrix not serialized correctly");
            }
        } catch (java.io.IOException ioe) {
            warningCount =(int)(Object) try_warning(warningCount, "writeObject()/readObject()...", "unexpected I/O error, unable to run serialization test;  check write permission in current directory and retry");
        } catch (Exception e) {
            errorCount =(int)(Object) try_failure(errorCount, "writeObject(Matrix)/readObject(Matrix)...", "unexpected error in serialization test");
        }
        print("\nTesting linear algebra methods...\n");
        A = new Matrix(columnwise, 3);
        T = new Matrix(tvals);
        T =(Matrix)(Object) A.transpose();
        try {
            check((double)(Object)A.transpose(),(double)(Object) T);
            try_success("transpose...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "transpose()...", "transpose unsuccessful");
        }
        A.transpose();
        try {
            check((double)(Object)A.norm1(), columnsummax);
            try_success("norm1...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "norm1()...", "incorrect norm calculation");
        }
        try {
            check((double)(Object)A.normInf(), rowsummax);
            try_success("normInf()...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "normInf()...", "incorrect norm calculation");
        }
        try {
            check((double)(Object)A.normF(), Math.sqrt(sumofsquares));
            try_success("normF...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "normF()...", "incorrect norm calculation");
        }
        try {
            check((double)(Object)A.trace(), sumofdiagonals);
            try_success("trace()...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "trace()...", "incorrect trace calculation");
        }
        try {
            check((double)(Object)A.getMatrix(0,(int)(Object) A.getRowDimension() - 1, 0,(int)(Object) A.getRowDimension() - 1).det(), 0.);
            try_success("det()...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "det()...", "incorrect determinant calculation");
        }
        SQ = new Matrix(square);
        try {
            check((double)(Object)A.times((Matrix)(Object)A.transpose()),(double)(Object) SQ);
            try_success("times(Matrix)...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "times(Matrix)...", "incorrect Matrix-Matrix product calculation");
        }
        try {
            check((double)(Object)A.times(0.),(double)(Object) Z);
            try_success("times(double)...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "times(double)...", "incorrect Matrix-scalar product calculation");
        }
        A = new Matrix(columnwise, 4);
        QRDecomposition QR =(QRDecomposition)(Object) A.qr();
        R =(Matrix)(Object) QR.getR();
        try {
            check((double)(Object)A,(double)(Object) QR.getQ().times(R));
            try_success("QRDecomposition...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "QRDecomposition...", "incorrect QR decomposition calculation");
        }
        SingularValueDecomposition SVD =(SingularValueDecomposition)(Object) A.svd();
        try {
            check((double)(Object)A, SVD.getU().times((Matrix)(Object)SVD.getS().times((Matrix)(Object)SVD.getV().transpose())));
            try_success("SingularValueDecomposition...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "SingularValueDecomposition...", "incorrect singular value decomposition calculation");
        }
        DEF = new Matrix(rankdef);
        try {
            check((double)(Object)DEF.rank(), Math.min((int)(Object)DEF.getRowDimension(),(int)(Object) DEF.getColumnDimension()) - 1);
            try_success("rank()...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "rank()...", "incorrect rank calculation");
        }
        B = new Matrix(condmat);
        SVD =(SingularValueDecomposition)(Object) B.svd();
        double[] singularvalues =(double[])(Object) SVD.getSingularValues();
        try {
            check((double)(Object)B.cond(), singularvalues[0] / singularvalues[Math.min((int)(Object)B.getRowDimension(),(int)(Object) B.getColumnDimension()) - 1]);
            try_success("cond()...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "cond()...", "incorrect condition number calculation");
        }
        int n =(int)(Object) A.getColumnDimension();
        A =(Matrix)(Object) A.getMatrix(0, n - 1, 0, n - 1);
        A.set(0, 0, 0.);
        LUDecomposition LU =(LUDecomposition)(Object) A.lu();
        try {
            check((double)(Object)A.getMatrix((int[])(Object)LU.getPivot(), 0, n - 1),(double)(Object) LU.getL().times((Matrix)(Object)LU.getU()));
            try_success("LUDecomposition...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "LUDecomposition...", "incorrect LU decomposition calculation");
        }
        X =(Matrix)(Object) A.inverse();
        try {
            check((double)(Object)A.times(X),(double)(Object) Matrix.identity(3, 3));
            try_success("inverse()...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "inverse()...", "incorrect inverse calculation");
        }
        O = new Matrix((int)(Object)SUB.getRowDimension(), 1, 1.0);
        SOL = new Matrix(sqSolution);
        SQ =(Matrix)(Object) SUB.getMatrix(0,(int)(Object) SUB.getRowDimension() - 1, 0,(int)(Object) SUB.getRowDimension() - 1);
        try {
            check((double)(Object)SQ.solve(SOL),(double)(Object) O);
            try_success("solve()...", "");
        } catch (java.lang.IllegalArgumentException e1) {
            errorCount =(int)(Object) try_failure(errorCount, "solve()...", e1.getMessage());
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "solve()...", e.getMessage());
        }
        A = new Matrix(pvals);
        CholeskyDecomposition Chol =(CholeskyDecomposition)(Object) A.chol();
        Matrix L =(Matrix)(Object) Chol.getL();
        try {
            check((double)(Object)A,(double)(Object) L.times((Matrix)(Object)L.transpose()));
            try_success("CholeskyDecomposition...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "CholeskyDecomposition...", "incorrect Cholesky decomposition calculation");
        }
        X =(Matrix)(Object) Chol.solve(Matrix.identity(3, 3));
        try {
            check((double)(Object)A.times(X),(double)(Object) Matrix.identity(3, 3));
            try_success("CholeskyDecomposition solve()...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "CholeskyDecomposition solve()...", "incorrect Choleskydecomposition solve calculation");
        }
        EigenvalueDecomposition Eig =(EigenvalueDecomposition)(Object) A.eig();
        Matrix D =(Matrix)(Object) Eig.getD();
        Matrix V =(Matrix)(Object) Eig.getV();
        try {
            check((double)(Object)A.times(V),(double)(Object) V.times(D));
            try_success("EigenvalueDecomposition (symmetric)...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "EigenvalueDecomposition (symmetric)...", "incorrect symmetric Eigenvalue decomposition calculation");
        }
        A = new Matrix(evals);
        Eig =(EigenvalueDecomposition)(Object) A.eig();
        D =(Matrix)(Object) Eig.getD();
        V =(Matrix)(Object) Eig.getV();
        try {
            check((double)(Object)A.times(V),(double)(Object) V.times(D));
            try_success("EigenvalueDecomposition (nonsymmetric)...", "");
        } catch (java.lang.RuntimeException e) {
            errorCount =(int)(Object) try_failure(errorCount, "EigenvalueDecomposition (nonsymmetric)...", "incorrect nonsymmetric Eigenvalue decomposition calculation");
        }
        print("\nTestMatrix completed.\n");
        print("Total errors reported: " + Integer.toString(errorCount) + "\n");
        print("Total warnings reported: " + Integer.toString(warningCount) + "\n");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(BufferedReader o0){ return null; }
	public MyHelperClass times(Matrix o0){ return null; }
	public MyHelperClass identity(int o0, int o1){ return null; }
	public MyHelperClass det(){ return null; }
	public MyHelperClass transpose(){ return null; }
	public MyHelperClass constructWithCopy(double[][] o0){ return null; }
	public MyHelperClass norm1(){ return null; }
	public MyHelperClass random(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Matrix {

Matrix(int o0, int o1, double o2){}
	Matrix(){}
	Matrix(double[][] o0){}
	Matrix(double[] o0, int o1){}
	public MyHelperClass times(Matrix o0){ return null; }
	public MyHelperClass getMatrix(int[] o0, int o1, int o2){ return null; }
	public MyHelperClass lu(){ return null; }
	public MyHelperClass getMatrix(int o0, int o1, int[] o2){ return null; }
	public MyHelperClass getMatrix(int[] o0, int[] o1){ return null; }
	public MyHelperClass trace(){ return null; }
	public MyHelperClass times(double o0){ return null; }
	public MyHelperClass inverse(){ return null; }
	public MyHelperClass set(int o0, int o1, double o2){ return null; }
	public MyHelperClass setMatrix(int o0, int o1, int[] o2, Matrix o3){ return null; }
	public MyHelperClass getArray(){ return null; }
	public MyHelperClass eig(){ return null; }
	public MyHelperClass getColumnDimension(){ return null; }
	public MyHelperClass copy(){ return null; }
	public MyHelperClass minus(Matrix o0){ return null; }
	public MyHelperClass arrayLeftDivideEquals(Matrix o0){ return null; }
	public MyHelperClass getRowDimension(){ return null; }
	public MyHelperClass arrayRightDivideEquals(Matrix o0){ return null; }
	public MyHelperClass getColumnPackedCopy(){ return null; }
	public MyHelperClass norm1(){ return null; }
	public MyHelperClass arrayTimes(Matrix o0){ return null; }
	public MyHelperClass rank(){ return null; }
	public MyHelperClass cond(){ return null; }
	public MyHelperClass setMatrix(int[] o0, int o1, int o2, Matrix o3){ return null; }
	public MyHelperClass plus(Matrix o0){ return null; }
	public MyHelperClass getRowPackedCopy(){ return null; }
	public MyHelperClass svd(){ return null; }
	public MyHelperClass get(int o0, int o1){ return null; }
	public MyHelperClass solve(Matrix o0){ return null; }
	public MyHelperClass arrayTimesEquals(Matrix o0){ return null; }
	public MyHelperClass transpose(){ return null; }
	public MyHelperClass chol(){ return null; }
	public MyHelperClass getArrayCopy(){ return null; }
	public MyHelperClass normInf(){ return null; }
	public MyHelperClass arrayLeftDivide(Matrix o0){ return null; }
	public MyHelperClass qr(){ return null; }
	public MyHelperClass arrayRightDivide(Matrix o0){ return null; }
	public MyHelperClass minusEquals(Matrix o0){ return null; }
	public MyHelperClass uminus(){ return null; }
	public MyHelperClass setMatrix(int[] o0, int[] o1, Matrix o2){ return null; }
	public MyHelperClass setMatrix(int o0, int o1, int o2, int o3, Matrix o4){ return null; }
	public MyHelperClass normF(){ return null; }
	public MyHelperClass print(PrintWriter o0, DecimalFormat o1, int o2){ return null; }
	public MyHelperClass getMatrix(int o0, int o1, int o2, int o3){ return null; }
	public MyHelperClass plusEquals(Matrix o0){ return null; }}

class DecimalFormat {

DecimalFormat(String o0){}
	DecimalFormat(){}
	public MyHelperClass setDecimalFormatSymbols(DecimalFormatSymbols o0){ return null; }}

class DecimalFormatSymbols {

DecimalFormatSymbols(Locale o0){}
	DecimalFormatSymbols(){}}

class QRDecomposition {

public MyHelperClass getQ(){ return null; }
	public MyHelperClass getR(){ return null; }}

class SingularValueDecomposition {

public MyHelperClass getU(){ return null; }
	public MyHelperClass getSingularValues(){ return null; }
	public MyHelperClass getV(){ return null; }
	public MyHelperClass getS(){ return null; }}

class LUDecomposition {

public MyHelperClass getPivot(){ return null; }
	public MyHelperClass getL(){ return null; }
	public MyHelperClass getU(){ return null; }}

class CholeskyDecomposition {

public MyHelperClass solve(MyHelperClass o0){ return null; }
	public MyHelperClass getL(){ return null; }}

class EigenvalueDecomposition {

public MyHelperClass getV(){ return null; }
	public MyHelperClass getD(){ return null; }}
