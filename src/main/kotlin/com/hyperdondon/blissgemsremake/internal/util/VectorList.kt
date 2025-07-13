package com.hyperdondon.blissgemsremake.internal.util

class VectorList<K, V1, V2> {
    val value1list: HashMap<K?, V1?> = HashMap()
    val value2list: HashMap<K?, V2?> = HashMap()

    fun add(key: K?, value1: V1?, value2: V2?) {
        value1list.put(key, value1)
        value2list.put(key, value2)
    }

    fun remove(key: K?) {
        value1list.remove(key)
        value2list.remove(key)
    }

    fun getValue1(key: K?): V1? {
        return value1list.get(key)
    }

    fun getValue2(key: K?): V2? {
        return value2list.get(key)
    }

    fun setValue1(key: K?, value: V1?) {
        value1list.replace(key, value)
    }

    fun setValue2(key: K?, value: V2?) {
        value2list.replace(key, value)
    }

    fun containsKey(key: K?): Boolean {
        return value1list.containsKey(key)
    }

    fun keySet(): MutableSet<K?> {
        return value1list.keys
    }
}
