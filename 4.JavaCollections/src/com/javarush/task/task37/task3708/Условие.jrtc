taskKey="com.javarush.task.task37.task3708"\n\nКеширующий Proxy

Реализация паттерна Proxy предоставляет объект, который контролирует доступ к другому объекту.

Тебе необходимо создать класс CachingProxyRetriever в пакете retrievers, который будет обеспечивать ту же
функциональность что и класс OriginalRetriever, но с одним важным дополнением. Необходимо всегда пробовать
сначала получить объект из кеша, и только если его там нет - выполнять дорогостоящую операцию загрузки из
storage. После получения необходимого объекта из хранилища storage, его необходимо кешировать
с помощью объекта типа LRUCache.

Для клиента (в данном случае класс Solution) использование CachingProxyRetriever ничем не должно отличаться
от использования класса OriginalRetriever.

P.S. Тебе понадобятся поля типов LRUCache и OriginalRetriever в классе CachingProxyRetriever.


Требования:
1.	В классе CachingProxyRetriever должно быть создано поле типа OriginalRetriever.
2.	В классе CachingProxyRetriever должно быть создано поле типа LRUCache.
3.	Конструктор класса CachingProxyRetriever должен принимать один параметр типа Storage и инициализировать поле типа OriginalRetriever.
4.	Метод retrieve класса CachingProxyRetriever должен выполнять поиск подходящего объекта в кеше с помощью метода find.
5.	Метод retrieve класса CachingProxyRetriever должен получать объект из хранилища с помощью метода retrieve объекта типа OriginalRetriever и добавлять в кеш, если он не был там найден.
6.	Метод retrieve класса CachingProxyRetriever не должен вызывать метод retrieve класса OriginalRetriever, если объект был найден в кеше.
7.	Метод retrieve класса CachingProxyRetriever должен возвращать объект, которому в хранилище соответствует id, полученный в качестве параметра.
8.	Класс CachingProxyRetriever должен поддерживать интерфейс Retriever.


