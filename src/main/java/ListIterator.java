import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    List<T> list;

    int pos = 0;

    public  ListIterator (List<T> list)
    {
        this.list = list;
    }

    public T next()
    {
        // return next element in the array and increment pos
        T item =  list.get(pos);
        pos += 1;
        return item;
    }

    public boolean hasNext()
    {
        if (pos >= list.size() ||
                list.get(pos) == null)
            return false;
        else
            return true;
    }
}
