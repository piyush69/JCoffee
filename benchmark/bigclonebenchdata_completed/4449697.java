


class c4449697 {

    private int[] sortNodesToGoal(Graph g, int parent, int goal) {
        float a, b;
        int tempI, tempR;
        float tempF;
        int len = g.nodeList[parent].edges.length;
        int[] nodes = new int[len];
        float[] dists = new float[len];
        int[] ref = new int[len];
        if (len == 0) return null;
        if (len == 1) {
            ref[0] = 0;
            return ref;
        }
        for (int i = 0; i < len; i++) {
            nodes[i] =(int)(Object) g.getOtherNode(parent, g.nodeList[parent].edges[i]);
            a =(int)(Object) g.nodeList[nodes[i]].x - (int)(Object)g.nodeList[goal].x;
            b =(int)(Object) g.nodeList[nodes[i]].y - (int)(Object)g.nodeList[goal].y;
            dists[i] = (float) Math.sqrt(a * a + b * b);
            ref[i] = i;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (dists[j] > dists[j + 1]) {
                    tempI = nodes[j];
                    nodes[j] = nodes[j + 1];
                    nodes[j + 1] = tempI;
                    tempF = dists[j];
                    dists[j] = dists[j + 1];
                    dists[j + 1] = tempF;
                    tempR = ref[j];
                    ref[j] = ref[j + 1];
                    ref[j + 1] = tempR;
                }
            }
        }
        return ref;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass y;
	public MyHelperClass[] edges;
	public MyHelperClass x;
}

class Graph {
public MyHelperClass[] nodeList;
public MyHelperClass getOtherNode(int o0, MyHelperClass o1){ return null; }}
