package TimeCalculation;

import java.util.List;

public class CollectionTest<T> {
    public void myAdd(List<T> list, int count){
        for (int i = 0; i < count; i++) {
            list.add((T) Integer.valueOf(i));
        }
    }

    public void myDelete(List<T> list, int count){
        try {
            list.subList(0, count).clear();
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Ошибка: попытка удалить больше элементов, чем есть в списке.");
        }
    }

    public void mytGet(List<T> list, int index){
        try {
            System.out.println(list.get(index - 1).toString());
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Ошибка: попытка получить значения за пределами листа.");
        }
    }
}
