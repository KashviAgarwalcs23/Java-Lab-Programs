
class CollegeThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class CseThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
System.out.println("Name: KashviAgarwal");
System.out.println("USN: 1BM23CS142");
        CollegeThread collegeThread = new CollegeThread();
        CseThread cseThread = new CseThread();
        collegeThread.start();
        cseThread.start();
    }
}
