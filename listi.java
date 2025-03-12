public class listi<T>{

    private T[] list;
    private int size;
    private int index;


    listi(){
        list = null;
        size = 0;
        index = 0;
    }
    void add(T data){
        size++;
        T[] temp = (T[]) new Object[size];

        if(list != null){
            for(int i = 0; i < list.length; i++){
                temp[i] = list[i];
            }
        }
        temp[size-1] = data;
        list = temp;
        index = size;

    }

    void remove(int index){
        size--;
        T[] temp = (T[]) new Object[size];

        for (int i = 0, j = 0; i < list.length; i++) {
            if (i != index) {
                temp[j++] = list[i];
            }
        }
        list = temp;
    }

    public T search(int key){
        return list[key];
    }

    void GetElement(){
        T[] temp = (T[]) new Object[size];
        for(int i = 0; i < list.length; i++){
            temp[i] = list[i];
        }
        for(int i = 0; i < size; i++){
            System.out.println(temp[i]);
        }
    }

    int FindMin(){
        T[] temp= (T[]) new Object[size];
        for(int i = 0; i < list.length; i++){
            temp[i] = list[i];
        }
        int mini = (Integer) list[0];
        for(int i = 1; i < size; i++){
            if((Integer) list[i] < mini){
                mini = (Integer) list[i];
            }
        }
        return mini;
    }

    int FindMax(){
        T[] temp = (T[]) new Object[size];
        for(int i = 0; i < list.length; i++){
            temp[i]=list[i];
        }
        int maxi = (Integer) list[0];
        for(int i = 1; i < size; i++){
            if((Integer) list[i] > maxi) maxi = (Integer) list[i];
        }
        return  maxi;
    }
}
