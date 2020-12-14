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
import java.util.LinkedList;

public class LinkedListTest {
    public void operation()
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Ghani");
        ll.add("Antora");
        ll.add(1, "Dilip");

        System.out.println("Initial LinkedList " + ll);

        ll.set(1, "Imran");

        System.out.println("Updated LinkedList " + ll);
    }
}
