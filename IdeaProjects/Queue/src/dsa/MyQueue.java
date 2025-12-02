package dsa;

public class MyQueue {
    private int count;
    private int index;
    private int secondIndex = 1;
    private String[] queue = new  String[4];



    public boolean isEmpty(){
        return count == 0;
    }

    void enqueue(String element){
        if(queue[index] == " "){
            queue[index++] = queue[secondIndex++];
//            queue[count++] = element;
        }
        queue[count++] = element;
    }


    void  dequeue(){

        queue[index] = " ";
        index++;

        count = 0;

    }

}
