import java.util.Iterator;
import java.lang.Object;

//Klasa z biura podrozy w razie potrzeby dodan nowe funkcjonalnosci

@SuppressWarnings("unchecked")
public class ExtendableArray<T> implements Iterable<T> {
    T[] array;
    int length;
    int currentMaxLength;
    int step;


    public ExtendableArray() {
        step = 8;
        length = 0;
        currentMaxLength = 32;
        array = (T[]) new Object[32];
    }


    public ExtendableArray(int step) {
        this.step = step;
    }


    private void Extend() {
        Extend(length + step);
    }


    private void Extend(int newLength) {
        if(length > newLength) return;
        T[] newArray =  (T[]) new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, length);
        array = newArray;
        currentMaxLength = newLength;
    }


    public void Append(T object) {
        if(length > currentMaxLength) Extend();
        array[length] = object;
        length++;
    }


    public void Set(int index, T object) {
        array[index] = object;
    }

    public T Get(int index) {
        return array[index];
    }


    public int size() {
        return length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < length && array[currentIndex] != null;
            }

            @Override
            public T next() {
                return array[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}