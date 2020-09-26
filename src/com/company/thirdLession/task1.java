package com.company.thirdLession;

import java.util.*;

public class task1 {



    public task1() {
    }

    public static <K, V> Map<V, HashSet<K>> revertMap(Map<? extends K, ? extends V>) {
        Map<V, Collection<K>> resultMap = new HashMap<>();

        Set<K> keys = (Set<K>) map.keySet();
        for(K key : keys){
            V value = map.get(key);
            resultMap.compute(value, (v.ks) -> {
                if(ks == null) {
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }
    }
}
