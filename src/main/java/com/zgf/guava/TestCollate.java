package com.zgf.guava;

import com.google.common.collect.*;

import java.util.*;

/**
 * Created by zgf on 17/11/15.
 */
public class TestCollate {
    public static void main(String[] args) {
        // 集合创建
        HashMap<Object, Object> hash = Maps.newHashMap();
        ArrayList<Object> objects = Lists.newArrayList();
        HashSet<Object> objects1 = Sets.newHashSet();
        String[] strings = ObjectArrays.newArray(String.class, 10);

        // 集合创建 + 初始化
        ImmutableMap<String, String> of = ImmutableMap.of("k1", "v1", "k2", "v2");
        HashSet<String> strings1 = Sets.newHashSet("s1", "s2", "s3");
        ArrayList<String> strings2 = Lists.newArrayList("l1", "l2");

        // 不可变集合 Immutable
        ImmutableMap<String, String> of1 = ImmutableMap.of("k1", "v1", "k2", "v2");
        ImmutableList<String> of2 = ImmutableList.of("l1", "l2");
        ImmutableSet<String> of3 = ImmutableSet.of("s1", "s2");

        // 新的集合类型
        // 1. Multimap, key可以重复的map, 子类有ListMultimap和SetMutlimap, 通过key可以得到list和set
        LinkedListMultimap<String, String> objectObjectLinkedListMultimap = LinkedListMultimap.create();
        objectObjectLinkedListMultimap.put("abc", "1");
        objectObjectLinkedListMultimap.put("abc", "1");
        objectObjectLinkedListMultimap.put("abc", "3");

        List<String> abc = objectObjectLinkedListMultimap.get("abc");
        System.out.println(abc);

        LinkedHashMultimap<String, String> objectObjectLinkedHashMultimap = LinkedHashMultimap.create();
        objectObjectLinkedHashMultimap.put("abc", "11");
        objectObjectLinkedHashMultimap.put("abc", "11");
        objectObjectLinkedHashMultimap.put("abc", "13");

        Set<String> abc1 = objectObjectLinkedHashMultimap.get("abc");
        System.out.println(abc1);

        // 2. Multiset, 可以添加重复元素的set，可以统计重复元素的个数
        LinkedHashMultiset<Object> objects2 = LinkedHashMultiset.create();
        objects2.add("a");
        objects2.add("a");
        objects2.add("a");
        objects2.add("b");
        objects2.add("c");
        System.out.println(objects2.count("a"));
        System.out.println(objects2.size());


        // 3. table, 多个key的map
        HashBasedTable<String, String, String> objectObjectObjectHashBasedTable = HashBasedTable.create();
        objectObjectObjectHashBasedTable.put("a1", "b1", "1");
        objectObjectObjectHashBasedTable.put("a1", "b2", "2");
        objectObjectObjectHashBasedTable.put("a2", "b1", "3");
        objectObjectObjectHashBasedTable.put("a2", "b2", "4");

        System.out.println(objectObjectObjectHashBasedTable.get("a1", "b1"));


        // 4. Bimap，一一映射，可以通过key得到value, 也可以通过value得到key
        HashBiMap<String, String> objectObjectHashBiMap = HashBiMap.create();
        objectObjectHashBiMap.put("a1", "b1");
        objectObjectHashBiMap.put("a2", "b2");

        System.out.println(objectObjectHashBiMap.get("a1"));
        System.out.println(objectObjectHashBiMap.inverse().get("b1"));

        // 5. ClassToInstanceMap, 有的时候，你的map的key并不是一种类型，他们是很多类型，你想通过映射他们得到这种类型，guava提供了ClassToInstanceMap满足了这个目的。
        MutableClassToInstanceMap<Number> objectMutableClassToInstanceMap = MutableClassToInstanceMap.create();
        objectMutableClassToInstanceMap.putInstance(Integer.class, Integer.valueOf(12));
        objectMutableClassToInstanceMap.putInstance(Double.class, Double.valueOf(12));

        System.out.println(objectMutableClassToInstanceMap.getInstance(Integer.class));
        System.out.println(objectMutableClassToInstanceMap.getInstance(Double.class));

    }
}
