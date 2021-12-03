taskKey="com.javarush.task.pro.task17.task1705"\n\nКосмическая одиссея ч.3

Сделаем наш предыдущий пример более правильным и универсальным.
Порядок, в котором добавляются астронавты в список astronauts, не всегда будет известен. Чтобы правильно распределить задачи членам экипажа,
необходимо определить, кем является астронавт. Для этого в методе runWorkingProcess() перебери всех астронавтов в цикле,
используя оператор instanceof определи, кем является астронавт и передай его в качестве аргумента соответствующему методу:
Human &mdash; в метод pilot(Human human);
Dog &mdash; в метод createDirection(Dog dog);
Cat &mdash; в метод research(Cat cat).
Метод runWorkingProcess() должен работать корректно независимо от количества астронавтов и порядка их добавления в astronauts.


Требования:
1.	Метод runWorkingProcess() должен вызывать pilot(Human human) для каждого объекта Human из списка astronauts.
2.	Метод runWorkingProcess() должен вызывать createDirection(Dog dog) для каждого объекта Dog из списка astronauts.
3.	Метод runWorkingProcess() должен вызывать research(Cat cat) для каждого объекта Cat из списка astronauts.


