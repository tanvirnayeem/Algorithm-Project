/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author nayeem
 */
import java.util.*;
class QueueTest{
    public void operation(){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Tanvir Nayeem");
        queue.add("Ghani Rezwanul");
        queue.add("Sobuj");
        queue.add("Tania Tanni");
        queue.add("Saju Rahman");
        System.out.println("Head:"+queue.element());
        System.out.println("Head:"+queue.peek());
        System.out.println("Iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("After removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}  
