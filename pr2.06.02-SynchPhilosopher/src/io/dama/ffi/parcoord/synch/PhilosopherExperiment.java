package io.dama.ffi.parcoord.synch;

public class PhilosopherExperiment {
    static final int MAX_THINKING_DURATION_MS = 1000;
    static final int MAX_EATING_DURATION_MS = 3000;
    static final int MAX_TAKING_TIME_MS = 1000;
    static final int PHILOSOPHER_NUM = 3;
    static final int EXP_DURATION_MS = 10000;

    public static void main(final String[] args) throws InterruptedException {
        final var chopsticks = new Chopstick[PHILOSOPHER_NUM];
        final var philosophers = new Philosopher[PHILOSOPHER_NUM];
        for (var i = 0; i < PHILOSOPHER_NUM; i++) {
            chopsticks[i] = new Chopstick();
        }
        for (var i = 0; i < PHILOSOPHER_NUM; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % PHILOSOPHER_NUM]);
        }
        for (var i = 0; i < PHILOSOPHER_NUM; i++) {
            philosophers[i].start();
        }
        Thread.sleep(EXP_DURATION_MS);
        for (var i = 0; i < PHILOSOPHER_NUM; i++) {
            philosophers[i].stopPhilosopher();
        }
    }
}
