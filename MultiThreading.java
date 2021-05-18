///////////////////////////////  Multi-Threading  //////////////////////////////
/*


    Various stages of life cycle of thread

        1. New
        2. Runnable
        3. Running
        4. Waiting
        5. Dead



    MULTITHREADING (executing two or more threads simultaneously to maximum utilization of CPU)

        1. Multithreaded applications execute two or more threads run concurrently. Hence, it is also known as Concurrency in Java. Each thread runs parallel to each other. 

        2. Mulitple threads don't allocate separate memory area, hence they save memory. Also, context switching between threads takes less time.


    

*/

class ThreadOne extends Thread {
    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread : 1");
        }
    
    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 100; i++) {
            System.out.println("Thread : 2");
        }

    }
}

class RunnableThree implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread : 3");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {

        Thread threadOne = new ThreadOne();
        Thread threadTwo = new ThreadTwo();
        Runnable runnableThree = new RunnableThree();
        Thread threadThree = new Thread(runnableThree);


        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
