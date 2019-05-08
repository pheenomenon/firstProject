package src.liveInt;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private static int CACHE_CAPACITY = 0;

    public LRUCache(int capacity) {
        CACHE_CAPACITY = capacity;
    }

    Map<String,QNode> cacheMap = new HashMap<String, QNode>();
    QNode head = null;
    QNode tail = null;

    public int size(){
        return cacheMap.size();
    }

    //put in cache
    public void put(String key, int value) {
        //update existing cache
        if(cacheMap.containsKey(key)) {
            QNode node = cacheMap.get(key);
            node.data = value;

            //add it to the front of Q
            removeFromQ(node);
            addToFrontQ(node);

        } else {
            QNode node = new QNode(key, value);
            if(cacheMap.size() >= CACHE_CAPACITY) {
                cacheMap.remove(tail.key);
                removeFromQ(tail);
            }
            addToFrontQ(node);
            cacheMap.put(key,node);
        }
    }

    //get from cache
    public int get(String key) {
        int res = -1;
        if(cacheMap.containsKey(key)) {
            QNode node = cacheMap.get(key);
            removeFromQ(node);
            addToFrontQ(node);
            res = node.data;
        }

        return res;
    }

    private void removeFromQ(QNode node) {
        if(node. prev != null) {
            node.prev.next = node.next;
        } else {
            //this is head node
            head = node.next;
        }
        if(node.next != null) {
            node.next.prev = node.prev;
        } else {
            //this is tail node
            tail = node.prev;
        }

    }

    private void addToFrontQ(QNode node) {
        node.next = head;
        if(head != null) {
            head.prev = node;
        }
        head = node;

        if(tail == null) {
            tail = node;
        }
    }



}

class QNode {
    QNode prev;
    QNode next;
    int data;
    String key;

    public QNode(String key, int data) {
        this.data = data;
        this.key = key;
    }
}
