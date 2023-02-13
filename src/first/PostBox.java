package first;

public class PostBox<T> {
    private T item;
    // getter
    public T getItem() {
        return item;
    }
    //setter
    public void setItem(T item) {
        this.item = item;
    }
}
