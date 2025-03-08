package TimeCalculation;

import java.util.List;
import java.util.Random;

/**
 * Класс, который работает со всеми подтипами List и выполняет стандартные методы
 *
 * @param <T> тип элементов, хранимых в коллекции.
 */
public class CollectionTest<T> {
    /**
     * Добавляет заданное количество элементов в список.
     *
     * @param list список, в который будут добавлены элементы.
     * @param count количество элементов для добавления.
     */
    public void myAdd(List<T> list, int count){
        for (int i = 0; i < count; i++) {
            list.add((T) Integer.valueOf(i));
        }
    }

    /**
     * Удаляет заданное количество элементов из списка, начиная с первого элемента.
     *
     * @param list список, из которого будут удалены элементы.
     * @param count количество элементов для удаления.
     */
    public void myDelete(List<T> list, int count){
        try {
            list.subList(0, count).clear();
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Ошибка: попытка удалить больше элементов, чем есть в списке.");
        }
    }

    /**
     * Выполняет случайный доступ к элементам списка заданное количество раз.
     *
     * @param list список, к элементам которого будет выполнен доступ.
     * @param count количество операций доступа к элементам списка.
     */
    public void mytGet(List<T> list, int count){
        try {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                list.get(random.nextInt(count));
                //System.out.println(list.get(count - 1).toString());
            }
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Ошибка: попытка получить значения за пределами листа.");
        }
    }
}
