package home_work_5;

import java.util.Arrays;
import java.util.Comparator;


public class DataContainer<T> {
    private T[] data;

    // конструктор
    public DataContainer(T[] data) {
        this.data = data;
    }
    /**
     *
     * @param index Индекс массива, содержащего данные
     * @return Предварительно сохранённый объект, находящийся в ячейке под индексом
     */
    public T get(int index) {
        if (data.length-1 < index) {
            return null;
        }
        return data[index];
    }

    /**
     *
     * @return Данный метод возвращает массив из поля data
     */
    public T[] getItems() {
        return data;
    }

    /**
     * Метод удаляет элемент из нашего поля data по индексу
     * @param index Индекс, который следует удалить
     * @return Удалось ли удалить данные?
     */
    public boolean delete(int index) {
        int i=0;
        int j=0;
        if (data.length-1 < index) {
            return false;
        } else {
            T[] withoutElement = Arrays.copyOf(data, data.length-1);
            for (T element : data) {
                if (j != index) {
                    withoutElement[i] = element;
                    i++;
                }
                j++;
            }
            data = Arrays.copyOf(withoutElement, withoutElement.length);
            return true;
        }
    }

    /**
     * Метод, который будет удалять элемент из нашего поля data
     * @param index Элемент, который следует удалить
     * @return Удалось ли удалить данные?
     */
    public boolean delete(T index) {
        int i = 0;
        int j = -1;
        if (index == null) {
            return false;
        }
        while ((j < 0) & (i < data.length)) {  // Ищет индекс удаляемого элемента
            if (data[i] == index) {
                j = i;
            } else {
                i++;
            }
        }
            if ((j >= 0)) {         // Если индекс найден, то удаляет элемент с помощью метода удаления по индексу
                return (delete(j));
            } else {
                return false;
            }
    }

    /**Метод, который добавляет данные во внутреннее поле data и
     * возвращает номер позиции в которую были вставлены данные, начиная с 0
     * @param item принимает данные передаваемые в ячейку
     * @return возвращает номер позиции в которую были вставлены данные
     */
    public int add(T item) {
        if (data.length == 0) {
            data = Arrays.copyOf(data, 1);
            data[0] = item;
            System.out.println(0);
            return 0;
        }
        if (item == null) {
            return -1;
        } else {
            for (int i = 0; i <= data.length-1; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    System.out.println(i);
                    return i;
                } else if ((data.length-1 == i) & (data[data.length-1] != null)) {
                    int newLength = data.length+1;
                    T[] increaceArray = Arrays.copyOf(data, newLength);
                    data = Arrays.copyOf(increaceArray,increaceArray.length);
                    data[i+1] = item;
                    return i+1;
                }
            }
        }return 0;
    }

    /**
     * Метод занимается сортировкой данных записанных в поле data используя реализацию сравнения
     * @param comparator переданный объект реализующий метод сравнения в отдельном классе
     */
    public void sort (Comparator<T> comparator) {
        int arrayLength = data.length;                           //  сортировка - null, помещаются в конец массива
        int checkNull = 0;
        T tmp;
        for (int k=0; k < (arrayLength - 1); k++){
            if (data[k] == null) {
                checkNull++;                                    // и исключчаются из дальнейших сортировок
                for (int l = (arrayLength - 1); k<l; l--){
                    if (data[l] != null) {
                        tmp = data[l];
                        data[l] = data[k];
                        data[k] = tmp;
                    }
                }
            }
        }
        for (int j = 0; j < (arrayLength - 1 - checkNull); j++) {
            for (int i = (arrayLength - 1 - checkNull); i > j; i--) {
                if (0 < comparator.compare(data[i],data[i - 1])) {
                    tmp = data[i - 1];
                    data[i - 1] = data[i];
                    data[i] = tmp;
                }
            }
        }
    }

    /**
     * Переопредение метода toString()
     * @return вывод содержимого data без ячеек в которых хранится null
     */
    @Override
    public String toString() {
        T[] withoutNull = Arrays.copyOf(data, 0);
        int j =1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                withoutNull = Arrays.copyOf(withoutNull, j);
                withoutNull[j-1] = data[i];
                j++;
            }
        }
        if (j>1) {
            return Arrays.toString(withoutNull);
        }
        return "";
    }
}