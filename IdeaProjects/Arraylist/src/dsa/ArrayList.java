package dsa;

public class ArrayList {
    private int count;
    private String[] array = new String[2];
    public boolean isEmpty(){
        return count == 0;
    }

    void  add(String element){
        array[count] = element;
        count++;

    }

    void add(int index, String element){
        array[index] = element;
        count++;
    }

    void addAll(String[] elements){
        for(String element : elements){
            add(element);
        }
    }
}
