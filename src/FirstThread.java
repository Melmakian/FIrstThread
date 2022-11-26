public class FirstThread {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        new  Thread(thread).start();
    }
    public static class TestThread implements Runnable{
        public void run(){
            System.out.println("My first thread");
        }
    }
}
