package test.liveInt;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.liveInt.LRUCache;

import static org.junit.Assert.*;

public class LRUCacheTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void putAndGet() {
        LRUCache lru = new LRUCache(2);
        lru.put("one", 1);
        lru.put("two", 2);

        assertEquals(2, lru.size());

        lru.get("one");

        lru.get("two");

        lru.put("three", 3); //evicts "one"
        assertEquals(2, lru.size());

        assertEquals(-1, lru.get("one"));

        lru.put("four", 4); //evicts "two"
        assertEquals(2, lru.size());


        assertEquals(-1, lru.get("two"));

    }

    @Test
    public void get() {
    }
}