

public class ArrayPoweredList <I extends Comparable<? super I>> implements ListInterface<I> {


    private  I[] items;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;


 @SuppressWarnings("unchecked")
    public ArrayPoweredList(){

        items = (I[]) new Comparable[DEFAULT_CAPACITY];

        size = 0;
    }


    @Override
    public ListInterface<I> copy(){

        ArrayPoweredList<I> newList = new ArrayPoweredList<>();
        for(int i =0; i < size;i++){

            newList.add(items[i]);
        }


        return newList;



    }
    public int size(){


        return size;
    }

    public boolean isEmpty(){


        return (size == 0);

    }
    public void add(I element){

        if(size == items.length)
        this.resize();
          items[size++] = element;


    }
    public void add(I element, int index) throws IndexOutOfBoundsException{

        if(index < 0 || index > this.size()){

            throw new IndexOutOfBoundsException("The index is out of bound");
        }
        if(size == items.length){
            this.resize();
        }
        for(int i = size; i > index; i--){

            items[i] = items[i-1];
        }
        items[index] = element;
        size++;



    }

    public I get(int index) throws IndexOutOfBoundsException{

        if(index < 0 || index >= this.size()){

            throw new IndexOutOfBoundsException("Index is not in range");
        }
        


        return items[index];



    }
    public I replace(I element, int index) throws IndexOutOfBoundsException{

        if(index < 0 || index >= size){


            throw new IndexOutOfBoundsException("Index is not in range");
        }

        I old = items[index];
        items[index] = element;

        return old;





      


    }

    public I remove(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size()){

            throw new IndexOutOfBoundsException("Index is not in range");
        }
        I removed = items[index];  // the item that need to be removed 
        for(int i = index; i < size -1;i++){

            items[i] = items[i + 1 ];


        }

        items[--size] = null;



        return removed;


    }

    public void removeAll(){
//remove all the items from the array

        for(int i=0; i < size;i++){

// loop through the array and  and set all the  values to null
            items[i] = null;
        }

        size = 0; // set the size of the array to 0



    }
@SuppressWarnings("unchecked")
    public void resize(){

        int newCapacity = items.length * 2; // double the size of the array

        I[] newArray = (I[]) new Comparable[newCapacity];
        
        for( int i =0; i < size; i++){
                //add the items from the old array to the new array
            newArray[i] = items[i];
        }
        // set the array to the new array
        items = newArray;


    }
    
}
