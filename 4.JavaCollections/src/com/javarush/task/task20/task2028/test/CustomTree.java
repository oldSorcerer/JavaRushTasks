package com.javarush.task.task20.task2028.test;

import java.io.Serializable;
import java.util.*;

public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    /**
     * Стартовый корень для дерева;
     */
    private Entry<String> root;

    /**
     * root инициализируется по умолчанию, и становится первым элементом обозначенным как "новый корневой элемент для
     * текущего уровня дерева"; newLineRootElement - всегда крайний левый нижний элемент дерева.
     */
    public CustomTree() {
        root = new Entry<String>(null);
        root.newLineRootElement = true;
        root.lineNumber = 0;
    }

    /**
     * Метод getParent принимает значение String value, ищет в древе Entry c значением elementName эквивалентным
     * значению value, и возвращает значение elementName у найденного Entry (Entry.parent)
     *
     * @param value elementName переданного Entry
     * @return parent.elementName найденного Entry (Entry.parent)
     */
    public String getParent(String value) {
        setValidCollection();
        String s = null;
        for (Entry<String> entry : queue) {
            if (entry.lineNumber != 1) {
                if (entry.elementName.equals(value)) {
                    s = entry.parent.elementName;
                    break;
                }
            }
        }
        return s;
    }

    /**
     * Коллекция для хранения элементов дерева.
     */
    private transient ArrayList<Entry<String>> queue;

    /**
     * Метод setUpCollection проходит по дереву, начиная с элемента Entry<String> root и перезаписывает все элементы в
     * queue;
     *
     * @param root начальный элемент Entry<String> для вертикального прохода по дереву.
     */
    private void setUpCollection(Entry<String> root) {
        queue = new ArrayList<>();
        Queue<Entry<String>> subQueue = new LinkedList<Entry<String>>();
        queue.add(root);
        subQueue.add(root);
        do {
            if (!subQueue.isEmpty()) {
                root = subQueue.poll();
            }
            if (root.leftChild != null) {
                queue.add(root.leftChild);
                subQueue.add(root.leftChild);
            }
            if (root.rightChild != null) {
                queue.add(root.rightChild);
                subQueue.add(root.rightChild);
            }
        } while (!subQueue.isEmpty());

    }

    /**
     * Метод  getCollection отличается от метода setUpCollection только тем, что возвращает полученную коллекцию;
     *
     * @param entry начальный элемент Entry<String> для вертикального прохода по дереву.
     * @return полученную коллекцию (List<Entry<String>>) элементов дерева.
     */
    private List<Entry<String>> getCollection(Entry<String> entry) {
        ArrayList<Entry<String>> list = new ArrayList<>();
        Queue<Entry<String>> subQueue = new LinkedList<Entry<String>>();
        list.add(entry);
        subQueue.add(entry);
        do {
            if (!subQueue.isEmpty()) {
                entry = subQueue.poll();
            }
            if (entry.leftChild != null) {
                list.add(entry.leftChild);
                subQueue.add(entry.leftChild);
            }
            if (entry.rightChild != null) {
                list.add(entry.rightChild);
                subQueue.add(entry.rightChild);
            }
        } while (!subQueue.isEmpty());
        return list;
    }

    /**
     * Метод setValidCollection записывает полную коллекцию элементов дерева, а затем удаляет 1 элемент коллекции,
     * который является изначальным корнем.
     * Используется в методах remove и т.д. для валидного прохода по коллекции.
     */
    private void setValidCollection() {
        setUpCollection(root);
        queue.remove(0);
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    /**
     * Метод indexOf() возвращает индекс элемента в коллекции, или -1 если такого элемента нет.
     *
     * @param o искомый элемент
     * @return индекс элемента в коллекции
     */
    @Override
    public int indexOf(Object o) {
        String string = String.valueOf(o);
        setValidCollection();
        for (Entry<String> entry : queue) {
            if (entry.elementName.equals(string)) {
                return queue.indexOf(entry);
            }
        }
        return -1;
    }

    /**
     * Метод lastIndexOf() возвращает индекс элемента в коллекции, или -1 если такого элемента нет.
     *
     * @param o искомый элемент
     * @return индекс элемента в коллекции
     */
    @Override
    public int lastIndexOf(Object o) {
        String string = String.valueOf(o);
        setValidCollection();
        Entry<String> element = null;
        for (Entry<String> entry : queue) {
            if (entry.elementName.equals(string)) {
                element = entry;
            }
        }
        return queue.lastIndexOf(element);
    }

    /**
     * Метод add добавляет элемент в дерево. Сначала устанавливается полная коллекция элементов, потом происходит
     * итерация по элементам. При итерации каждый элемент проверяется методом checkChildren на возможность иметь
     * ветви. isAvailableToAddChildren() возвращает true если такая возможность имеется; После чего создается и
     * инициализируется новый элемент Entry<String>, добавляется в коллекцию. После чего коллекция заного
     * проверяется и инициализируется с помощью setValidCollection();
     * Если после прохода по всей коллекции ни один элемент не способен иметь новые ветви, это означает, что все
     * вершины обрезаны. Тогда происходит повторная итерация по коллекции с целью поиска элемента с boolean флагом
     * newLineRootElement; Найденный элемент и все последующие элементы в коллекции восстанавливают возможность
     * иметь потомков;
     *
     * @param s строка (String) которую необходимо добавить в коллекцию;
     * @return true после добавления нового элемента;
     */
    @Override
    public boolean add(String s) {
        setUpCollection(root);
        for (Entry<String> entry : queue) {
            entry.checkChildren();
            if (entry.isAvailableToAddChildren()) {
                createChild(entry, s);
                setValidCollection();
                return true;
            }
        }

        boolean reAddingChildren = false;
        for (Entry<String> entry : queue) {
            if (entry.newLineRootElement) {
                reAddingChildren = true;
            }
            if (reAddingChildren) {
                entry.availableToAddLeftChildren = true;
                entry.availableToAddRightChildren = true;
            }
        }

        return add(s);
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    /**
     * Метод toArray возвращает массив elementName текущих элементов коллекции.
     *
     * @return массив строк elementName;
     */
    @Override
    public String[] toArray() {
        setValidCollection();
        int size = size();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = queue.get(i).elementName;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        int size = size();
        T[] array = a.length >= size ? a : (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), size);
        Iterator<String> iterator = iterator();
        for (int i = 0; i < array.length; i++) {
            if (!iterator.hasNext()) { // fewer elements than expected
                if (a != array) {
                    return Arrays.copyOf(array, i);
                }
                array[i] = null; // null-terminate
                return array;
            }
            array[i] = (T) iterator.next();
        }
        return array;
    }

    /**
     * Метод changeNewLineRootElement меняет boolean флаг newLineRootElement e элементов, подлежащих удалению.
     * Новый элемент ищется по принципу: если остались элементы справа, то выбирается соседний, если не осталось,
     * то поднимаемся на уровень выше и ищем там самый левый.
     *
     * @param entry   Entry<String> текущий элемент являющийся newLineRootElement;
     * @param delList список элементов коллекции Entry<String> подлежащий удалению;
     */
    private void changeNewLineRootElement(Entry<String> entry, List<Entry<String>> delList) {
        setValidCollection();
        int size = size();
        for (int i = 0; i < size; i++) {
            Entry<String> newEntry = queue.get(i);
            if (newEntry == entry) {
                if (i < size - 1) {
                    newEntry.newLineRootElement = false;
                    for (int k = i + 1; k < size; k++) {
                        Entry<String> newRootEntry = queue.get(k);
                        if (!delList.contains(newRootEntry)) {
                            newRootEntry.newLineRootElement = true;
                            break;
                        }
                    }
                    //Если все элементы справа подлежат удалению идем вверх по дереву:
                    Entry<String> element = getUndelRoot(newEntry.parent, delList);
                    element.newLineRootElement = true;
                    break;
                } else {
                    newEntry.newLineRootElement = false;
                    Entry<String> element = getUndelRoot(newEntry.parent, delList);
                    element.newLineRootElement = true;
                    break;
                }
            }
        }
    }

    /**
     * Метод getUndelRoot ищет вертикально и горизонтально первый элемент Entry<String> не входящий в лист delList
     * (список элементов подлежащих удалению);
     *
     * @param entry   начальный элемент Entry<String> от которого начинается поиск;
     * @param delList список элементов подлежащих удалению
     * @return первый найденный верхний левый элемент Entry<String> не входящий в delList;
     */
    private Entry<String> getUndelRoot(Entry<String> entry, List<Entry<String>> delList) {
        for (Entry<String> element : queue) {
            if (element.lineNumber == entry.lineNumber) {
                if (!delList.contains(element)) {
                    return element;
                }
            }
        }
        if (entry.lineNumber == 0) {   // Дошли до root и возвращаем его.
            return entry;
        }
        return getUndelRoot(entry.parent, delList);
    }

    /**
     * Доп. метод для подстраховки. При удалении иногда получается 2 элемента newLineRootElement;
     * Этот метод собирает вертикально все такие элементы и снимает флаги newLineRootElement;
     *
     * @param entry Entry<String> со значением true переменной newLineRootElement, которая подлежит
     *              изменению;
     * @return список начиная с Entry<String> entry и заканчивая всеми его parent со значением true
     * переменной newLineRootElement, которая подлежит изменению;
     */
    private List<Entry<String>> getNewLineRootElementsCollection(Entry<String> entry) {
        ArrayList<Entry<String>> list = new ArrayList<>();
        list.add(entry);
        if ((entry.parent != null) && (entry.parent.newLineRootElement)) {
            list.addAll(getNewLineRootElementsCollection(entry.parent));
        }
        return list;
    }

    /**
     * Метод createChild создает новый элемент Entry<String> и устанавливает значение переменной parent
     *
     * @param parent родительский элемент Entry<String>;
     * @param s      значение elementName для нового элемента Entry<String>;
     */
    private void createChild(Entry<String> parent, String s) {
        Entry<String> newOne = new Entry<String>(s);
        newOne.parent = parent;
        newOne.lineNumber = parent.lineNumber + 1;
        setChild(parent, newOne);
    }

    /**
     * Метод setChild присваивает переменным left/rightChild родителя ссылку на элемент Entry<String> child;
     * Если переменная newLineRootElement родителя имела значение true, то это значение передастся ребенку, у
     * родителя изменится на false;
     *
     * @param parent родительский элемент Entry<String>
     * @param child  элемент-потомок Entry<String>
     */
    private void setChild(Entry<String> parent, Entry<String> child) {
        if (parent.availableToAddLeftChildren) {
            parent.leftChild = child;
            parent.availableToAddLeftChildren = false;
            if (parent.newLineRootElement) {
                List<Entry<String>> list = getNewLineRootElementsCollection(parent);
                for (Entry<String> entry : list) {
                    entry.newLineRootElement = false;
                }
                child.newLineRootElement = true;
            }
        } else {
            parent.rightChild = child;
            parent.availableToAddRightChildren = false;
            if (parent.newLineRootElement) {
                List<Entry<String>> list = getNewLineRootElementsCollection(parent);
                for (Entry<String> entry : list) {
                    entry.newLineRootElement = false;
                }
                child.newLineRootElement = true;
            }
        }
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        setValidCollection();
        for (Object o : c) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Unsupported Operation
     *
     * @param index param
     * @return UnsupportedOperationException();
     */
    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * This implementation iterates over this collection, checking each
     * element returned by the iterator in turn to see if it's contained
     * in the specified collection.  If it's not so contained, it's removed
     * from this collection with the iterator's <tt>remove</tt> method.
     *
     * @param c Коллекция элементы которой будут оставлены в текущей коллекции.
     * @return true если текущая коллекция подверглась изменению, иначе false
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        setValidCollection();
        boolean modified = false;
        Iterator<String> iterator = iterator();
        while (iterator.hasNext()) {
            if (!c.contains(iterator.next())) {
                iterator.remove();
                modified = true;
            }
        }
        return modified;
    }

    /**
     * This implementation iterates over the specified collection, and adds
     * each object returned by the iterator to this collection, in turn.
     *
     * @param collection Элементы для добавления
     * @return true если коллекция изменилась
     */
    @Override
    public boolean addAll(Collection<? extends String> collection) {
        boolean modified = false;
        for (String line : collection) {
            if (add(line)) {
                modified = true;
            }
        }
        return modified;
    }

    /**
     * @return Размер коллекции элементов Entry<String>;
     */
    @Override
    public int size() {
        setValidCollection();
        return queue.size();
    }

    /**
     * Если ! о instanceof String throws UnsupportedOperationException();
     * Удаляет первый найденный в дереве элемент Entry<String> со значением параметра elementName
     * эквивалентного o и, в случае успеха возвращает true. Если элемент не найден возвращается false;
     *
     * @param o значение строки подлежащей удалению из дерева.
     * @return Если элемент найден и удален возвращается true, иначе false;
     */
    @Override
    public boolean remove(Object o) {
        if (!(o instanceof String)) {
            throw new UnsupportedOperationException();
        }
        String value = (String) o;
        setValidCollection();
        for (int i = 0; i < queue.size(); i++) {
            Entry<String> entry = queue.get(i);
            if (entry.elementName.equals(value)) {
                List<Entry<String>> list = getCollection(entry);
                for (Entry<String> stringEntry : list) {
                    if (stringEntry.newLineRootElement) {
                        changeNewLineRootElement(stringEntry, list);
                    }
                }
                if (entry.parent.leftChild == entry) {
                    entry.parent.leftChild = null;
                    setValidCollection();
                    return true;
                } else {
                    entry.parent.rightChild = null;
                    setValidCollection();
                    return true;
                }

            }
        }
        return false;
    }

    /**
     * Метод removeAll удаляет все элементы из текущей коллекции queue, elementName которых входят в коллекцию с;
     *
     * @param c коллекция с элементами подлежащими удалению;
     * @return true если удалился 1 и более элементов, иначе false;
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        setValidCollection();
        for (Entry<String> entry : queue) {
            if (c.contains(entry.elementName)) {
                remove(entry.elementName);
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    /**
     * @return true, если коллекция пуста;
     */
    @Override
    public boolean isEmpty() {
        setValidCollection();
        return size() == 0;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    /**
     * Removes all of the elements from this list (optional operation).
     * The list will be empty after this call returns.
     */
    @Override
    public void clear() {
        root.newLineRootElement = true;
        root.availableToAddLeftChildren = true;
        root.availableToAddRightChildren = true;
        root.leftChild = null;
        root.rightChild = null;
        setValidCollection();
    }

    /**
     * @param o объект для поиска (Строка);
     * @return true если в дереве найден элемент Entry<String> со значением параметра elementName
     * эквивалентным значению о; В противном случае возвращает false;
     */
    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }


    /**
     * Creates and returns a copy of this object.  The precise meaning
     * of "copy" may depend on the class of the object.
     *
     * @return a clone of this instance.
     * @throws CloneNotSupportedException if the object's class does not
     *                                    support the {@code Cloneable} interface. Subclasses
     *                                    that override the {@code clone} method can also
     *                                    throw this exception to indicate that an instance cannot
     *                                    be cloned.
     */
    @Override
    protected CustomTree clone() throws CloneNotSupportedException {
        CustomTree customTree = (CustomTree) super.clone();
        return customTree;
    }

    /**
     * Реализация equals для тестов;
     *
     * @param o another object
     * @return true if objects equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomTree customTree = (CustomTree) o;
        this.setValidCollection();
        customTree.setValidCollection();
        int size = size();
        for (int i = 0; i < size; i++) {
            Entry first = queue.get(i);
            Entry second = customTree.queue.get(i);
            if (!first.equals(second)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Реализация hashCode для тестов;
     *
     * @return hashCode объекта
     */
    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (queue != null ? queue.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        setValidCollection();
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < queue.size(); i++) {
            builder.append(queue.get(i).elementName);
            if (i < queue.size() - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    /**
     * Метод возвращает лист-итератор для коллекции элементов;
     *
     * @return new SolutionListIterator;
     */
    @Override
    public ListIterator<String> listIterator() {
        return new SolutionListIterator(0);
    }

    /**
     * Метод возвращает лист-итератор для прохода по коллекции элементов, начиная с индекса index;
     *
     * @param index - начальный индекс для прохода по коллекции.
     * @return new SolutionListIterator;
     */
    @Override
    public ListIterator<String> listIterator(int index) {
        checkElementIndex(index);
        return new SolutionListIterator(index);
    }

    /**
     * Проверка индекса на валидность
     *
     * @param index индекс элемента
     * @return true если индекс находится в приделах нашей коллекции.
     */
    private boolean checkIndex(int index) {
        return index >= 0 && index < size();
    }

    /**
     * Если индекс элемента меньше 0 или больше размера коллекции выбросит исключение
     *
     * @param index индекс элемента
     */
    private void checkElementIndex(int index) {
        if (!checkIndex(index)) {
            throw new IndexOutOfBoundsException("List size: " + queue.size() + ", Index: " + index);
        }
    }

    /**
     * Метод возвращает итератор для коллекции элементов;
     *
     * @return new SolutionListIterator;
     */
    @Override
    public Iterator<String> iterator() {
        return new SolutionIterator();
    }

    private class SolutionIterator implements Iterator<String> {
        volatile ArrayList<Entry<String>> list;
        volatile int index, lastReturned = -1; // lastReturned - индекс последнего возвращенного элемента, -1 если такого элемента нет.

        SolutionIterator() {
            setValidCollection();
            list = queue;
        }

        @Override
        public synchronized boolean hasNext() {
            return index != list.size();
        }

        @Override
        public synchronized String next() {
            int i = index;
            if (i >= size()) {
                throw new NoSuchElementException();
            }
            index = i + 1;
            return list.get(lastReturned = i).elementName;
        }

        @Override
        public synchronized void remove() {
            if (lastReturned < 0) {
                throw new IllegalStateException();
            }
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("List size: " + list.size() + ", Index: " + index);
            }
            CustomTree.this.remove(list.get(lastReturned).elementName);
            index = lastReturned;
            lastReturned = -1;
            list = queue;
        }
    }

    private class SolutionListIterator extends SolutionIterator implements ListIterator<String> {

        SolutionListIterator(int index) {
            super();
            this.index = index;
        }

        @Override
        public synchronized boolean hasPrevious() {
            return index != 0;
        }

        @Override
        public synchronized String previous() {
            int i = index - 1;
            if (i < 0) {
                throw new NoSuchElementException("List size: " + list.size() + ", Index: " + i);
            }
            if (i >= list.size()) {
                throw new IllegalStateException();
            }
            index = i;
            return list.get(lastReturned = i).elementName;
        }

        @Override
        public synchronized int nextIndex() {
            return index;
        }

        @Override
        public synchronized int previousIndex() {
            return index - 1;
        }

        @Override
        public synchronized void set(String s) {
            if (lastReturned < 0) {
                throw new IllegalStateException();
            }
            for (Entry<String> entry : queue) {
                if (entry.equals(list.get(lastReturned))) {
                    entry.elementName = s;
                }
            }
        }

        @Override
        public synchronized void add(String s) {
            CustomTree.this.add(s);
            list = queue;
        }
    }


    private static class Entry<T> implements Serializable {

        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        boolean newLineRootElement;
        Entry<T> parent, leftChild, rightChild;

        private Entry(String name) {
            elementName = name;
            newLineRootElement = false;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        public void checkChildren() {
            if (this.leftChild != null) {
                availableToAddLeftChildren = false;
            }
            if (this.rightChild != null) {
                availableToAddRightChildren = false;
            }
        }

        public boolean isAvailableToAddChildren() {
            return this.availableToAddRightChildren || this.availableToAddLeftChildren;
        }
    }
}
