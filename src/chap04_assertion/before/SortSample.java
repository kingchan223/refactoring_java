package chap04_assertion.before;


public class SortSample {
    private final int[] data;

    public SortSample(int[] data) {
        this.data = data;
    }

    public void sort(){
        for(int i=0; i<this.data.length; i++){
            int m = i;
            for (int j = i + 1; j < this.data.length; j++)
                if(data[m] > data[j]) m = j;
            int v = data[m];/*여기서 data[m]은 data[i] ~ data[data.length-1]의 최솟값이어야 한다.*/
            data[m] = data[i];
            data[i] = v;
            /*여기서 data[0]~data[i+1]은 정렬되어 있어야 한다.*/
        }
    }

    @Override
    public String toString() {
        String retVal = "[ ";
        for (int i : data) retVal += i+", ";
        return retVal+" ]";
    }
}
