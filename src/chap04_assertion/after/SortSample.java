package chap04_assertion.after;


public class SortSample {
    private final int[] data;
    public SortSample(int[] data) {
        this.data = data;
    }

    public void sort(){
        for(int i=0; i<this.data.length; i++){
            int m = i;
            for (int j = i + 1; j < this.data.length; j++) if(data[m] > data[j]) m = j;

            assert isMin(m, i, data.length-1):"최솟값이 아닙니다.";
            int v = data[m];
            data[m] = data[i];
            data[i] = v;
            assert isSorted(0, i + 1):"정렬되지 않았습니다.";
        }
    }
    @Override
    public String toString() {
        String retVal = "[ ";
        for (int i : data) retVal += i+", ";
        return retVal+" ]";
    }
    public boolean isMin(int pos, int start, int end){
        for(int i=start; i<=end ; i++) if(data[pos] > data[i]) return false;
        return true;
    }
    public boolean isSorted(int start, int end){
        for(int i=start; i<=end; i++) if(data[i] > data[i+1]) return false;
        return true;
    }
}
