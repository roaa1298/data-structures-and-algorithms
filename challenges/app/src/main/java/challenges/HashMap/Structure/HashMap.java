package challenges.HashMap.Structure;

import challenges.HashMap.Data.HashNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashMap<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;
    private int buckets;
    private int size;

    public HashMap() {
        bucketArray = new ArrayList<>();
        buckets = 10;
        for (int index = 0; index < buckets; index++) {
            bucketArray.add(null);
        }
    }

    public int getSize() {
        return size;
    }

    public ArrayList<HashNode<K, V>> getBucketArray() {
        return bucketArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        arrayIndex = arrayIndex < 0 ? arrayIndex * -1 : arrayIndex;

        System.out.println("The index of => " + key + " is => " + arrayIndex);

        return arrayIndex;
    }

    public void put(K key, V value) {

        int index = getBucketIndex(key);
        int hashcode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(index);

        HashNode<K, V> newNode = new HashNode<>(key, value, hashcode);


        if (head == null) {
            bucketArray.set(index, newNode);
            size++;
        } else {
            // --------------------------- checking for redundant keys --------------------------

            HashNode<K, V> arrHead = bucketArray.get(index);
            while (arrHead != null) {
                if (arrHead.getKey().equals(key) && arrHead.getHashCode() == hashcode) {
                    arrHead.setValue(value);
                    return;
                }
                arrHead = arrHead.getNext();
            }

            // ------------------------------------------------------------------------------
            newNode.setNext(head);
            head=newNode;
            bucketArray.set(index, newNode);
            size++;
        }

        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<HashNode<K, V> > temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    put(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
        System.out.println(bucketArray);
    }

    public V get(K key){

            HashNode<K, V> head = bucketArray.get(getBucketIndex(key));
            while (head!=null)
            {
                if (head.getKey().equals(key))
                {
                    return head.getValue();
                }
                head=head.getNext();
            }
        return null;
    }

    public boolean contains(K key){

            HashNode<K, V> head = bucketArray.get(getBucketIndex(key));
            while (head!=null)
            {
                if (head.getKey().equals(key))
                {
                    return true;
                }
                head=head.getNext();
            }
            return false;
    }
    public List<K> keys(){
        List<K> keyList=new ArrayList<>();
        for (int i=0 ; i<bucketArray.size() ; i++)
        {
            HashNode<K, V> head = bucketArray.get(i);
            while (head!=null)
            {
                keyList.add(head.getKey());
                head=head.getNext();
            }
        }
        return keyList;
    }

    public Integer hash(K key){
        if (contains(key)) {
            return getBucketIndex(key);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "HashMap{" +
                "bucketArray=" + bucketArray +
                '}';
    }
}
