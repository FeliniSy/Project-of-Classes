public class axalilisti {
    private int size,lastindex;
    private int[] lst;

    public axalilisti(int size) {
        this.size = size;
        this.lst = new int[size];
        this.lastindex = -1;
    }

    public void add(int x){
        if(size <= lastindex) return;
        lst[++lastindex] = x;
    }

    public void elemet(int index){
        if(lastindex == -1) return;

        for(int i= index; i < lastindex; i++){
            lst[i] = lst[i+1];
        }lastindex -- ;
    }

    public boolean search(int x){
        for(int i = 0; i < lastindex; i++){
            if(lst[i] == x) return true;
        }
        return false;
    }
}
