public class IntStack {
    private int capacity;
    private  int STACK_CAPACITY  = 50;
    private int [] stack;


    private  int topValue = -1;
    private  int popValue = topValue;


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
        stack = new int [capacity];
        for(int i = 0; i<stack.length;i++){


        }
    }

    public  IntStack(){
        setCapacity(STACK_CAPACITY);
        stack = new int[STACK_CAPACITY];
    }
    public IntStack(int capacity_){
        setCapacity(capacity_);
    }

    public void push(int element){
            if (!isFull()){


            }

    }




}
