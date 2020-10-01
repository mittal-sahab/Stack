public class StackLL<D> implements Stack<D>{
     ListObject<D> head,tail; Integer size;
     StackLL(){
        size = 0;
        head = null;
        tail = null;
        }
     public D peek(){
          try{
            if(size==0){
                BoundsException ob = new BoundsException();
                throw ob;
                }
            }
        catch(BoundsException x){
                x.printer();
                return null;
            }
        return tail.val;
        }
   public D pop(){
          try{
            if(size==0){
                BoundsException ob = new BoundsException();
                throw ob;
            }
        }
       catch(BoundsException x){
            x.printer();
            return null;
        }
        ListObject<D> temp = tail;
        ListObject<D> o = head;
        for(int i=0;i<size;i++){
            o = o.next;
        }
        size--;
        o.next = null;
        tail = o;
        return temp.val;
        }
     public int size(){
        return size;
        }
     public void push(D o){
         ListObject<D> ob = new ListObject<D>(o);
        if(head == null){
            head = ob;
            tail = ob;
        }
        else{
            tail.next = ob;
            tail = ob;
        }
        size++;
        }  
}
