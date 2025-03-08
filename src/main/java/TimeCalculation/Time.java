package TimeCalculation;

/**
 * Класс для измерения времени выполнения операций с использованием наносекундной точности.
 */
public class Time {
    private long startTime;
    private long endTime;

    /**
     * Начинает отсчёт времени, сохраняя текущее значение времени в наносекундах.
     */
    public void start(){
        startTime = System.nanoTime();
    }

    /**
     * Заканчивает отсчёт времени, сохраняя текущее значение времени в наносекундах.
     */
    public void stop(){
        endTime = System.nanoTime();
    }

    /**
     * Рассчитывает продолжительность выполнения операции как разницу между временем окончания и временем начала.
     *
     * @return продолжительность выполнения операции в наносекундах.
     */
    public long getTime(){
        return endTime - startTime;
    }
}
