
public class LinkedList {
    private Node head;

      public LinkedList()
      {
         head = null;
      }
      
      public void addFirst(int item)
      {
         head = new Node (item, head);
      }
      
      
}
