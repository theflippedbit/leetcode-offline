package com.theflippedbit.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignHashMapTest {

    @Test
    void hashMapTest() {
        // Input
        // ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
        // [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
        //
        // Output
        // [null, null, null, 1, -1, null, 1, null, -1]

        DesignHashMap myHashMap = new DesignHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assertEquals(1, myHashMap.get(1));
        assertEquals(-1, myHashMap.get(3));
        myHashMap.put(2, 1);
        assertEquals(1, myHashMap.get(2));
        myHashMap.remove(2);
        assertEquals(-1, myHashMap.get(2));
    }

}
