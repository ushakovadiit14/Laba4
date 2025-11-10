Задание 1.1 - Сравнимое

Интерфейс:
`Comparable<T>` - обобщенный интерфейс сравнения
Метод `compareTo(T obj)` - принимает объект типа T, возвращает целое число
Реализация:
`Number<T extends Comparable<T>>` - обобщенный класс, реализующий Comparable
Конструктор `Number(T value)` - принимает значение обобщенного типа
Метод `compareTo(Number<T> other)` - делегирует сравнение встроенному compareTo
Логика сравнения:
Возвращает 0 если объекты равны
Отрицательное число если текущий объект меньше
Положительное число если текущий объект больше
Примеры работы:
`new Number<>(5).compareTo(new Number<>(6))` → отрицательное число
`new Number<>(7).compareTo(new Number<>(7))` → 0

Задание 1.2 - Обобщенный изменяемый массив
Класс:
`FillTheList<T>` - обобщенный изменяемый массив
Конструкторы:
`FillTheList(T[] elements)` - конструктор с массивом элементов типа T
`FillTheList(FillTheList<T> list)` - конструктор копирования
Основные методы:
`positionN(int index)` - получение значения по индексу с проверкой границ
`setValue(int index, T value)` - замена значения с возвратом нового объекта
`isEmpty()` - проверка на пустоту
`size()` - получение размера массива
`toArray()` - получение копии массива значений
`toString()` - строковое представление в формате "[val1, val2, val3]"
Примеры работы:
`new FillTheList<>(new Integer[]{1,2,3})` → массив целых чисел
`new FillTheList<>(new String[]{"A","B"})` → массив строк

Задание 2 - Заполнение списка**
Класс:
`GeneralizedImmutableList` - утилитный класс для заполнения списков
Метод:
`fillList(List<T> list, T sampleValue)` - заполняет список значениями от 1 до 100
Логика работы:
Определяет тип по sampleValue и заполняет соответственно
Для Integer: заполняет числами 1-100
Для Double: заполняет числами 1.0-100.0
Очищает список перед заполнением
Примеры использования:
`fillList(intList, 0)` → List с числами 1-100
`fillList(doubleList, 0.0)` → List с числами 1.0-100.0

Задание 3.1 - Функция 
Интерфейс:
`Function<T,R>` - функциональный интерфейс преобразования
Класс:
`FunctionUnits` - утилитный класс для операций map
Метод:
`map(List<T> list, Function<T,R> function)` - применяет функцию к каждому элементу
Примеры использования:
Строки → длины: `map(strings, String::length)` → List<Integer>
Числа → модули: `map(numbers, Math::abs)` → List<Integer>
Массивы → максимумы: `map(arrays, arr -> max)` → List<Integer>

Задание 3.2 - Фильтр
Интерфейс:
`Predicate<T>` - функциональный интерфейс проверки условия
Класс:
`Filters` - утилитный класс для фильтрации
Метод:
`filter(List<T> list, Predicate<T> predicate)` - фильтрует элементы по условию
Примеры использования:
Длинные строки: `filter(strings, s -> s.length() >= 3)`
Отрицательные числа: `filter(numbers, x -> x < 0)`
Массивы без положительных: `filter(arrays, arr -> allNegative)`

Задание 3.3 - Сокращение (reduce)
Класс:
`Reduction` - утилитный класс для операций свертки
Метод:
`reduce(List<T> list, T identity, BinaryOperator<T> operator)` - сводит список к одному значению
Логика работы:
Начинает с identity value
Последовательно применяет оператор к элементам
Проверяет параметры на null
Примеры использования:
Конкатенация строк: `reduce(strings, "", String::concat)`
Сумма чисел: `reduce(numbers, 0, Integer::sum)`
Количество элементов: `reduce(sizes, 0, Integer::sum)`

Задание 3.4 - Коллекционирование
Класс:
`Collectability` - утилитный класс для гибкого коллекционирования
Метод:
`collectValues(List<T> source, Supplier<P> factory, BiConsumer<P,T> accumulator)` - преобразует список в коллекцию
Параметры:
`source` - исходный список значений
`factory` - способ создания результирующей коллекции
`accumulator` - способ добавления элементов
Примеры использования:
Группировка по знаку: `HashMap::new, (map,num) -> groupBySign`
Группировка по длине: `HashMap::new, (map,str) -> groupByLength`
Уникальные значения: `HashSet::new, Set::add`
Класс ErrorChecker:
`checkInteger()` - валидация целых чисел
`checkDouble()` - валидация чисел с плавающей точкой  
`checkString()` - валидация строк (только буквы)
Класс Main:
Интерактивное меню для тестирования всех функций
Поддержка пользовательского ввода
Демонстрация работы всех методов


ТЕСТИРОВАНИЕ:

Залание 1.1:
<img width="368" height="332" alt="Снимок экрана 2025-11-10 в 08 09 31" src="https://github.com/user-attachments/assets/a3706ab7-39c5-4cd2-9058-086a3d448b81" />
<img width="446" height="440" alt="Снимок экрана 2025-11-10 в 08 10 01" src="https://github.com/user-attachments/assets/6db85838-f462-4ca1-b664-bbebc5a96472" />

Задание 1.2:
<img width="458" height="267" alt="Снимок экрана 2025-11-10 в 08 10 52" src="https://github.com/user-attachments/assets/097ca5ae-6209-494d-a734-efd7dd3cce72" />
<img width="590" height="528" alt="Снимок экрана 2025-11-10 в 08 11 57" src="https://github.com/user-attachments/assets/776df804-300d-4105-b513-a3244e6a7194" />

Задание 2:
<img width="1281" height="124" alt="Снимок экрана 2025-11-10 в 08 12 40" src="https://github.com/user-attachments/assets/b77b360b-e880-441a-a3a9-8a4c43204605" />

Задача 3.1:
<img width="332" height="217" alt="Снимок экрана 2025-11-10 в 08 17 38" src="https://github.com/user-attachments/assets/54158a0f-087f-4cae-bb14-5a94736b8368" />
<img width="503" height="310" alt="Снимок экрана 2025-11-10 в 08 18 14" src="https://github.com/user-attachments/assets/02a9238e-a262-405a-aaa4-c2d97bd0fe75" />

Задача 3.2:
<img width="547" height="217" alt="Снимок экрана 2025-11-10 в 08 19 48" src="https://github.com/user-attachments/assets/1cb82fb7-a7e4-4dbf-a7b6-62625f38d384" />
<img width="462" height="315" alt="Снимок экрана 2025-11-10 в 08 21 05" src="https://github.com/user-attachments/assets/d935d240-678d-47e7-ad04-5cb2fd406445" />
<img width="438" height="342" alt="Снимок экрана 2025-11-10 в 08 22 37" src="https://github.com/user-attachments/assets/618f8f48-9664-4820-bd4f-ef0c422f1a44" />

Задача 3.3:
<img width="411" height="256" alt="Снимок экрана 2025-11-10 в 08 24 55" src="https://github.com/user-attachments/assets/d232a66a-43b5-4e2e-9723-77e10f5083ac" />
<img width="470" height="442" alt="Снимок экрана 2025-11-10 в 08 25 39" src="https://github.com/user-attachments/assets/ec958eab-9219-4604-ad03-dc29ed3bb3c7" />
<img width="504" height="310" alt="Снимок экрана 2025-11-10 в 08 26 13" src="https://github.com/user-attachments/assets/073ab19d-5ee8-4136-9f46-e0fdd66cb7a1" />

Задача 3.4:
<img width="455" height="214" alt="Снимок экрана 2025-11-10 в 08 27 38" src="https://github.com/user-attachments/assets/26051c89-a3c1-498a-b4b7-ffe8f0859ebc" />
<img width="450" height="412" alt="Снимок экрана 2025-11-10 в 08 28 14" src="https://github.com/user-attachments/assets/eb65ac33-81c5-4685-831f-14d5533b0d0e" />
<img width="478" height="349" alt="Снимок экрана 2025-11-10 в 08 28 46" src="https://github.com/user-attachments/assets/d54a0824-f9e0-4bd0-800f-31392b9e0421" />

