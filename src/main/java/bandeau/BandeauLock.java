package bandeau;
//ESTADIEU 27/03/2025
//Nouvelle class BandeauLock -> Verrou explicit 
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class BandeauLock extends Bandeau {
    private Lock lock = new ReentrantLock();
    public void lock() { lock.lock();  }
    public void unlock() { lock.unlock();  }
}