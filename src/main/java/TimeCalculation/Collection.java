package TimeCalculation;

import java.util.List;
import java.util.Random;

/**
 * Класс, который работает со всеми подтипами List и выполняет стандартные методы
 *
 * @param <T> тип элементов, хранимых в коллекции.
 */
public class Collection<T> {
    /**
     * Добавляет заданное значение в список.
     *
     * @param list список, в который будут добавлен элемент.
     * @param value значение добавляемое в список.
     */
    public void myAdd(List<T> list, T value){
        list.add(value);
    }

    /**
     * Удаляет заданный элемент из списка.
     *
     * @param list список, из которого будут удален элемент.
     * @param index элемент под которым удалят значение.
     */
    public void myDelete(List<T> list, int index){
        try {
            list.remove(index);
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Ошибка: попытка удалить больше элементов, чем есть в списке.");
        }
    }

    /**
     * Выполняет случайный доступ к элементам списка.
     *
     * @param list список, к элементам которого будет выполнен доступ.
     * @param index индекс под которым надо вернуть значение.
     */
    public T mytGet(List<T> list, int index) {
        try {
            return list.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Ошибка: попытка получить значения за пределами листа.");
            return null;
        }
    }
}
