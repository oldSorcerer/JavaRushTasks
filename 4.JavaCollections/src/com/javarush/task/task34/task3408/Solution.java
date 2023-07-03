package com.javarush.task.task34.task3408;

/* 
Кэширование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SomeKey someKey = new SomeKey();
        someKey.name = "test";

        SomeKey someKeyNew = new SomeKey();
        someKeyNew.name = "testNew";

        SomeValue value = new SomeValue(someKey);

        Cache<SomeKey, SomeValue> cache = new Cache<>();
        cache.put(value);

        SomeValue existingValueFromCache = cache.getByKey(someKey, SomeValue.class);
        System.out.println(existingValueFromCache);

        SomeValue newValueFromCache = cache.getByKey(someKeyNew, SomeValue.class);
        System.out.println(newValueFromCache);

        System.out.println(cache.size());
        /* Expected output:
        SomeValue{myKey=SomeKey{name='test'}}
        SomeValue{myKey=SomeKey{name='testNew'}}
        2
         */
    }

    public static class SomeKey {
        String name;

        @Override
        public String toString() {
            return "SomeKey{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class SomeValue {
        private SomeKey myKey;

        public SomeValue() {
        }

        public SomeValue(SomeKey myKey) {        //use this constructor
            this.myKey = myKey;
        }

        private SomeKey getKey() {
            return myKey;
        }

        @Override
        public String toString() {
            return "SomeValue{" +
                    "myKey=" + myKey +
                    '}';
        }
    }
}
