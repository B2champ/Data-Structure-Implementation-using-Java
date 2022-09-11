import java.util.*;

class Queue{
    int arr[];
    int capacity, front, rear;
    Queue(int c){
        capacity = c;
        front = rear =-1;
        arr = new int[c];
    }
    
    boolean isFull(){
        if(front ==0 && rear ==capacity-1){
            return true;
        }
        else
        return false;
    }
    
    boolean isEmpty(){
        if(front == -1){
            return true;
        }
        else
        return false;
    }
     void enQueue(int data){
         if(isFull()){
             System.out.println("OVERFLOW CONDITION");
             return;
         }
         else{
             if(front == -1){
                 front =0;
             }
             rear++;
             arr[rear]= data;
         }
     }
     void deQueue(){
         int val;
         if(isEmpty()){
             System.out.print("UNDER FLOW");
             return;
         }
         val = arr[front];
         if(front>=rear){
             front = rear = -1;
         }
         front++;
         System.out.print("deQueue elememt"+ val+"\n");
     }
     void display(){
         if(isEmpty()){
             System.out.println("under flow condition");
             return;
         }
         else{
             for(int i=front;i<=rear;i++){
                 System.out.print(arr[i]+" ");
             }
             System.out.println();
         }
     }
     void peek(){
             System.out.println(arr[front]);
         }
     
     public static void main (String[] args) {
         Queue q1 = new Queue(6);
         q1.display();
         q1.enQueue(4);
         q1.enQueue(3);
         q1.enQueue(3);
         q1.enQueue(3);
         q1.enQueue(3);
         q1.enQueue(3);
         q1.deQueue();q1.deQueue();q1.deQueue();q1.deQueue();q1.deQueue();
         q1.display();
         q1.peek();
         
         
     }
}