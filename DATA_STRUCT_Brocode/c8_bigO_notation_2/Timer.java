package c8_bigO_notation_2;

public class Timer {
    private final Runnable function;
    private long startTime;
    private long endTime;
    private long duration;

    Timer(Runnable function) {
        this.function = function;
    }

    public long go() {
        startTime = System.nanoTime();
        function.run();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println( duration + " ns");
        return duration;
    }
}