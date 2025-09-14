package LinkedList;

public class linkedList 
{
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public int size; // size of LL
    
    // print LL - O(n)
    public void printLL()
    {
        if(head == null)
        {
            System.out.println("null");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ADD -- addFirst
    public void addFirst(int data)
    {
        // create new node
        Node newNode = new Node(data);
        size++;

        // linked list is empty
        if(head == null)
        {
            head = tail = newNode;
            return;
        } 

        // newNode next = head
        newNode.next = head; // link 

        // head = newNode
        head = newNode;
    }

    // addLast
    public void addLast(int data)
    {
        // create new Node
        Node newNode = new Node(data);
        size++;

        //Linked List is empty
        if(head == null)
        {
            head = tail = newNode;
            return; 
        }
        
        // tail next = newNode
        tail.next = newNode;

        // tail = newNode
        tail = newNode;
    }

    // add in the middle --> add(index, data) -- O(n)
    public void addAtPos(int index, int data)
    {
        // if index = 0, we have to create or change head and tail as well
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;
        while(i<index-1)
        {
            temp = temp.next;
            i++;
        }
        // temp --> previous node [i = idx-1]
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove first in the Linked List
    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // previous : i = size - 2 (2nd last)
        Node prev  = head;
        for(int i = 0; i<size-2; i++)
        {
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // iterative search
    public int itrSearch(int key)
    {
        Node temp = head;
        int i = 0;

        while(temp!=null)
        {
            if(temp.data == key)
            {
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }

    // recursive search
    public int helper(Node head, int key)// main recursive function
    {
        if(head == null)
        {
            return -1;
        }

        if(head.data == key)
        {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1)
        {
            return -1;
        }
        return idx+1;
    }

    // reSearch
    public int reSearch(int key)
    {
        return helper(head, key);
    }

    // reverse a Linked List - O(n)
    public void reverse()
    {
        Node prev = null;
        Node curr = tail = head; // curr <- tail <- head
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // deleteNthfromEnd
    public void deleteNthfromEnd(int n)
    {
        int sz = 0;
        Node temp = head;

        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }

        if(n == sz)
        {
            head = head.next; // removeFirst
            return;
        }

        // sz - n
        int i = 1;
        int idxToFind = sz - n;
        Node prev = head;
        while(i < idxToFind)
        {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Palindrome or not

    // findMid -> Slow Fast approach
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is middle node
    }

    // Palindrome Func
    public boolean checkPalindrome()
    {
        if(head == null || head.next == null)
        {
            return true;
        }
        // 1. find mid
        Node midNode = findMid(head);

        // 2. reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head; // left half head

        // 3. check left half and right half
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;
            } 
            left = left.next;
            right = right.next;
        }

        return true;

    }

    // Main
    public static void main(String[] args) 
    {
        linkedList LL = new linkedList();
        // LL.printLL();
        LL.addFirst(2);
        // LL.printLL();
        LL.addFirst(1); 
        // LL.printLL();
        LL.addLast(2);
        // LL.printLL();
        LL.addLast(1); 

        // LL.addAtPos(2, 9);

        LL.printLL();

        // LL.removeFirst();
        // LL.printLL();

        // LL.removeLast();
        // LL.printLL();

        // System.out.println("size of LL is: " + LL.size); 

        // System.out.println(LL.itrSearch(3));
        // System.out.println(LL.itrSearch(10));

        // System.out.println(LL.reSearch(3));
        // System.out.println(LL.reSearch(10)); 

        // LL.reverse();
        // LL.printLL();

        // LL.deleteNthfromEnd(3);
        // LL.printLL();

        System.out.println(LL.checkPalindrome());
    }
}