package Stack;

public class ArrayStack implements Stack {
    private static final int buffor = 10;
    public int elementCount = 0;
    String[] data;
    public ArrayStack() {
        data = new String[buffor];
    }
    @Override
    public void push(String newElement) throws Exception {
        if(elementCount >= buffor) {
            throw new Exception("Full stack exception");
        }
        data[elementCount] = newElement;
        elementCount++;
    }
    // 1. zapełnia do buffor
    // 2. jesli buffor jest full to
    //  a) tworze tymczasowa tablice np. 2xbuffor
    //  b) przepisuje z obecnej tablicy od nowej
    //  c) data = newData (2 x wieksza)
    @Override
    public String pop() throws  Exception{
        if(elementCount == 0) {
            throw new Exception("Nie ma nic na stosie");
        }
        String temp = data[elementCount - 1];
        data[elementCount - 1] = null;
        elementCount--;
        return temp;
    }
    @Override
    public String peek() throws Exception{
        if(elementCount == 0) {
            throw new Exception("Nie ma nic na stosie");
        }
        return data[elementCount - 1];
    }
    @Override
    public boolean isEmpty() {
        return elementCount == 0;
    }
}
