public class StackAL<D> implements Stack<D>{
    Object arr[];
    Integer size,buffer;
    StackAL(){
        size = 0;
        buffer = 10;
        arr = new Object[buffer];
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
        return (D)arr[size-1];
    }
    public void push(D o){
        arr[size] = o;
        size++;
        if(size==buffer){
            Object arr2[] = new Object[buffer*2];
            buffer*=2;
            for(int i = 0; i<size;i++){
                   arr2[i] = arr[i];
            }
            arr = arr2;
        }
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
        Object ob1 = arr[size-1];
        arr[size-1] = null;
        size--;
        return (D)ob1;
    }
    public int size(){
        return size;
    }
}