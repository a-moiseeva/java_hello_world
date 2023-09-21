package myCollection;

public class MyArrayList {


    private String [] array = new String [10];
    private int size=0;

    public void add (String element){
        array[size]=element;
        size++;
        if (size==array.length){
            String [] arrayNew= new String[size*2];
            for(int i=0;i<size;i++){
                arrayNew[i]=array[i];
            }
            array = arrayNew;
        }
    }

    public void remove (int i){
        for (int x = i; x<size-1; x++){
            array[x]=array[x+1];
        }
        array[size-1]=null;
        size--;
    }
    public void remove (String s){
        for (int x = 0; x<size; x++) {
            if (array[x].equals(s)){
                remove(x);
                return;
            }
        }
    }

    public String get (int index){
        return array[index];
    }

    public int getSize() {
        return size;
    }
}
