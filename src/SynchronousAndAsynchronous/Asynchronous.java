package SynchronousAndAsynchronous;

interface AsyncEventListner{
    void onRunningEvent();
}



public class Asynchronous {

    private AsyncEventListner aListner;

    public void registeringEvent(AsyncEventListner aListner){
        this.aListner = aListner;
    }

    public void checkingAsync(){
        new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Performing some Async Operations");
                if(aListner != null){
                    aListner.onRunningEvent();
                }
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException {
        Asynchronous obj1 = new Asynchronous();

        AsyncEventListner aListner = new SubClass();

        obj1.registeringEvent(aListner);

        obj1.checkingAsync();

    }
}

class SubClass implements AsyncEventListner{

    @Override
    public void onRunningEvent() {
        System.out.println("Performing some callback after the first" +
                "asynchronous task ");
    }
}
