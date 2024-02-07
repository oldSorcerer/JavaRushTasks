package com.javarush.task.task37.task3707;

import java.io.*;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {

    private static final Object PRESENT = new Object();

    private transient HashMap<E, Object> map;

    public AmigoSet() {
        this.map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max(16, (int) (collection.size() / 0.75f) + 1));
        addAll(collection);
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }


    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object clone() {
        try {
            AmigoSet<E> amigoSet = (AmigoSet<E>) super.clone();
            amigoSet.map = (HashMap<E, Object>) map.clone();
            return amigoSet;
        } catch (Exception e) {
            throw new InternalError(e);
        }
    }

    private void writeObject(ObjectOutputStream output) throws IOException {

        output.defaultWriteObject();

        output.writeInt(HashMapReflectionHelper.callHiddenMethod(map, "capacity"));
        output.writeFloat(HashMapReflectionHelper.callHiddenMethod(map, "loadFactor"));

        output.writeInt(map.size());
        for (E element : map.keySet()) {
            output.writeObject(element);
        }

    }

    @SuppressWarnings("unchecked")
    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {

        inputStream.defaultReadObject();

        int capacity = inputStream.readInt();
        float loadFactor = inputStream.readFloat();
        map = new HashMap<>(capacity, loadFactor);

        int size = inputStream.readInt();

        for (int i = 0; i < size; i++) {
            E element = (E) inputStream.readObject();
            map.put(element, PRESENT);
        }
    }
}
