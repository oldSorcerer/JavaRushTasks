taskKey="com.javarush.task.task33.task3312"\n\nСериализация зоопарка

Сделай так, чтобы при сериализации объекта типа Zoo, каждому элементу списка animals был добавлен тип
(dog для класса Dog, cat для класса Cat).
Для проверки можешь использовать метод main класса Solution.

Было:
{&quot;animals&quot;:[{&quot;name&quot;:&quot;doggy&quot;,&quot;barkVolume&quot;:0.0},{&quot;name&quot;:&quot;catty&quot;,&quot;lives&quot;:0}]}
Должно стать:
{&quot;animals&quot;:[{&quot;type&quot;:&quot;dog&quot;,&quot;name&quot;:&quot;doggy&quot;,&quot;barkVolume&quot;:0.0},{&quot;type&quot;:&quot;cat&quot;,&quot;name&quot;:&quot;catty&quot;,&quot;lives&quot;:0}]}


Требования:
1.	Класс Zoo.Animal должен быть отмечен аннотацией @JsonTypeInfo.
2.	Класс Zoo.Animal должен быть отмечен аннотацией @JsonSubTypes.
3.	Класс Zoo.Dog должен быть отмечен аннотацией @JsonTypeName.
4.	Класс Zoo.Cat должен быть отмечен аннотацией @JsonTypeName.
5.	При сериализации в JSON всем объектам списка animals должен быть добавлен тип и сохранен основной формат (пример в задании).


