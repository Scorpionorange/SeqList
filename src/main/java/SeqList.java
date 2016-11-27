import java.util.*;
import java.util.Collection;

/**
 * Created by ScorpionOrange on 2016/11/27.
 */
public class SeqList implements List {
    final int defaultSize = 10;
    int maxSize;
    int size;
    Object[] listArray;

    public static void main (String[] args) throws Exception {
        SeqList sl = new SeqList();
        System.out.println("向顺序表中插入11, 22, 33, 44 这四个数");
        sl.insert(0, 11);
        sl.insert(1, 22);
        sl.insert(2, 33);
        sl.insert(3, 44);

        System.out.println("在顺序表中获取下标为1的数据：");
        System.out.println(sl.getData(1));

        System.out.println("向顺序表中删除下标为0的数据：");
        sl.delete(0);
        System.out.println("输出删除后顺序表的长度：");
        System.out.println(sl.size);
    }

    public SeqList(){
        initiate(defaultSize);
    }

    //初始化数组
    private void initiate(int sz){
        maxSize = sz;
        size = 0;
        listArray = new Object[sz];
    }

    //插入数据
    public void insert(int i, Object object) throws Exception{
        if(size == maxSize){
            throw new Exception("顺序表已满，无法插入！");
        }
        if(i < 0 || i > size){
            throw new Exception("参数错误！");
        }
        for(int j = size; j > i; j--){
            listArray[j] = listArray[j - 1];
        }
        listArray[i] = object;
        size++;
    }

    //删除数据
    public Object delete(int i) throws Exception{
        if(size == 0){
            throw new Exception("顺序表已空，无法删除！");
        }
        if(i < 0 || i > size - 1){
            throw new Exception("参数错误!");
        }
        Object it = listArray[i];
        for(int j = i; j < size - 1; j++){
            listArray[j] = listArray[j + 1];
        }
        size--;
        return it;
    }

    //获取数据
    public Object getData(int i) throws Exception{
        if(i < 0 || i > size - 1){
            throw new Exception("参数错误！");
        }
        return listArray[i];
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
