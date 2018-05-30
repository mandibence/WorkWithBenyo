import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class QueueClass {

    List myList = new ArrayList();
    int myListMaxCapacity;

    public boolean add(Object e) throws IllegalStateException {
        if ( myList.size() == 0) {
            myList.add(e);
            return true;
        } else {
                if (myList.size() == myListMaxCapacity) {
                    throw new IllegalStateException();
                } else {
                    myList.add(e);
                }
            return true;
        }
    }

    public Object element() throws NoSuchElementException {
        if (myList.size() == 0) {
            throw new NoSuchElementException();
        } else {
            return myList.get(0);
        }
    }

    public boolean offer(Object e) {
        if (myList.size() == myListMaxCapacity) {
            return false;
        } else {
            myList.add(e);
            return true;
        }
    }

    public Object peek() {
        if (myList.size() == 0) {
            return null;
        } else {
            return myList.get(0);
        }
    }

    public Object poll() {
        if (myList.size() == 0) {
            return null;
        } else {
            Object myRemovedObject = myList.get(0);
            myList.remove(0);
            return myRemovedObject;
        }
    }

    public Object remove() throws NoSuchElementException{
        if (myList.size() == 0) {
            throw new NoSuchElementException();
        } else {
            Object myRemovedObject = myList.get(0);
            myList.remove(0);
            return myRemovedObject;
        }
    }
}
