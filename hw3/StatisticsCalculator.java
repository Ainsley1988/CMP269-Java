
public class StatisticsCalculator <I extends Number & Comparable<I>> implements StatisticsCalculatorInterface<I> {

    

    private static final int INITIAL_ARRAY_SIZE = 5;
	private Object [] elements = new Object[INITIAL_ARRAY_SIZE];
	private int numElements;





public StatisticsCalculator(){
    elements = new Object[INITIAL_ARRAY_SIZE];
    numElements = 0;

}

public StatisticsCalculator(int size){


    elements = new Object[size];
    numElements = 0;
}

    @Override
    public void enter(I Item) throws IllegalArgumentException {

        if( Item == null){

            throw new IllegalArgumentException("Item cannot be null");

        }

    if(this.isFull()){

        this.resize();
    }

    this.elements[numElements] = Item;
    numElements++;


    }

    @Override
    public void enter(I item, int index)  throws IndexOutOfBoundsException, IllegalArgumentException {
        if(item == null) {
                throw new IllegalArgumentException("Item cannot be  null");
        }

        if(index < 0 || index > this.getCount()){
            throw new IndexOutOfBoundsException("index is out of bound");

        }
        if(this.isFull()){

            this.resize();
        }


        if(isEmpty() || index == numElements){

        enter(item);

        return;

        }


        for( int i = this.numElements; i > index;i--){

            this.elements[i] = this.elements[i-1];

        }

        elements[index] = item;
        numElements++;




    }
    @SuppressWarnings("unchecked")
    public void enterd(Object[] items) throws IllegalArgumentException {

        if(items == null){
            throw new IllegalArgumentException("Items can not be null");
        }
        for(Object item : items){
            if(item == null){
                throw new IllegalArgumentException("Item cannot be null");
            }
            try{

            enter((I)item);
            } catch (ClassCastException e){
                throw new IllegalArgumentException("Invalid items type:" + item.getClass().getTypeName() + "got" + item.getClass().getName());
            }
           

        }



    }

@Override
@SuppressWarnings("unchecked")
    public I get(int index) throws IndexOutOfBoundsException {

        if(index < 0 || index > getCount()){
            throw new IndexOutOfBoundsException("The index is out of bount");
        }

        return (I)elements[index];



    }
    public boolean isEmpty(){

       

        return (numElements == 0);
    }

    @Override
    public int getCount(){

        return numElements;
    }
    @SuppressWarnings("unchecked")
    @Override
    public I getSum(){

        if (numElements == 0) {
            throw new IllegalStateException("Dataset is empty, cannot compute sum");
        }

        double sum = 0.0;

        for (int i = 0; i < numElements; i++){
            sum += ((Number)elements[i]).doubleValue();
        }

        
        I first = (I) elements[0];

        if (first instanceof Integer) return (I) Integer.valueOf((int) sum);
        if (first instanceof Double)  return (I) Double.valueOf(sum);
        if (first instanceof Float)   return (I) Float.valueOf((float) sum);
        if (first instanceof Long)    return (I) Long.valueOf((long) sum);
    
        throw new UnsupportedOperationException(
            "Unsupported numeric type: " + first.getClass());


    }

    public double getMean() throws ArithmeticException{

        if(numElements == 0){

            throw new ArithmeticException("mean can not be calculated if the data is empty");
        }

double sum = 0.0;
        for(int i = 0; i < numElements; i++){
    sum += ((Number)elements[i]).doubleValue();

        }


      return sum / numElements;
    

    }
@Override
    public double getStandardDeviation() throws ArithmeticException{

        if(numElements < 2){

            throw new ArithmeticException("Standard deviation needs aleast 2  number to compute");

        }
       

        double mean = getMean();
        System.out.println("Mean: " + mean); // debug
        double varianceSum = 0.0;

        for(int i =0;i< numElements;i++){


            double diff = ((Number)elements[i]).doubleValue() - mean;
           
            varianceSum += diff * diff;
        }

        double variance = varianceSum / (numElements);
        System.out.println("Variance: " + variance); // debug

        

        return  Math.sqrt(variance);

    }

    public Object[] getData(){

        Object[] data = new Object[numElements];



        for(int i=0; i < this.numElements; i++){

            data[i] = elements[i];


        }



        return data;


    }


    @SuppressWarnings("unchecked")
    @Override
    public I remove(int index)  throws IndexOutOfBoundsException{

        if(index < 0 || index >= numElements){


            throw new IndexOutOfBoundsException("index is out of bound");
        }
        I item = (I) elements[index];


        for(int i = index; i < numElements - 1; i++){
   elements[i] = elements[i + 1 ];

        }
        numElements--;
        elements[numElements] = null;

        
        


        return item;


    }

    public I remove(I item) throws IllegalArgumentException{

        if(item == null){
          throw new IllegalArgumentException("Item can not be null");


        }
        for(int i=0; i < numElements;i++){


            if(elements[i].equals(item)){

                return remove(i);
            }
        }

        

        return null;


    }

    public void clear(){

        for(int i = 0; i < this.numElements;i++){

        elements[i] = null;

        }

        numElements = 0;   

       
        


    }
    @SuppressWarnings("unchecked")
     @Override
    public I getMin() throws IllegalArgumentException{

        if(this.isEmpty()){

            throw new IllegalArgumentException("Can not be empty");
        }  

        I min = (I)elements[0];
        for(int i=1; i < numElements;i++){
            I currentItem = (I) elements[i];

            if(currentItem.compareTo(min) < 0){
    min = currentItem;

}



        }




        return  min;

    }
    @SuppressWarnings("unchecked")
    @Override
    public I getMax() throws IllegalArgumentException{

        if (this.isEmpty()){

            throw new IllegalArgumentException("the list is empty");
        }

        I max =  (I)elements[0];

        for(int i=0; i < numElements;i++){

            I currentIem = (I) elements[i];
if(currentIem.compareTo(max) > 0){
    max = currentIem;
}

        }

        return max;

    }
    public double getRange() throws IllegalArgumentException{

        if(this.getCount() == 0){
            throw new IllegalArgumentException("the List can not be empty ");
        }

        I min = this.getMin();
        I max = this.getMax();

        double range = max.doubleValue() - min.doubleValue();

        return  range;
    }

    private void resize(){

        Object [] elemsCopy = new Object[elements.length * 2];

        for( int i=0; i < this.numElements;i++){
elemsCopy[i] = elements[i];

        }
        elements = elemsCopy;
    }

    private boolean isFull(){
       

        return (this.numElements == this.elements.length);

    }
	
    
}
