package org.example;

class DownloadImage{
    synchronized void downloadImage(int num, String imagename){
        for(int i=0;i<num;i++){
            System.out.println("downloading image "+imagename+""+i+".jpg");
        }
    }
}
class mythread extends Thread{
    DownloadImage dref;
    mythread(DownloadImage dref){
        this.dref = dref;
    }
    @Override
    public void run(){
        dref.downloadImage(10,"dog");

    }
}

class yourthread extends Thread{
    DownloadImage dref;
    yourthread(DownloadImage dref){
        this.dref = dref;
    }
    @Override
    public void run(){
        dref.downloadImage(10,"cat");

    }
}

public class MultiThreadingExample {
    public static void main(String[] args) {
        DownloadImage dref = new DownloadImage();
        mythread t1 = new mythread(dref);
        yourthread t2= new yourthread(dref);
        t1.start();
        t2.start();
        try{
            t1.join();
        }
        catch(Exception ee){ee.printStackTrace();}
        t2.start();

    }

}
