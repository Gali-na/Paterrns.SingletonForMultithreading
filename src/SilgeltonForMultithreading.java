public class SilgeltonForMultithreading {

    private static  SilgeltonForMultithreading singelton =null;

    private SilgeltonForMultithreading() {
    }

    public static SilgeltonForMultithreading getInstance() {
              if(singelton == null){
                  synchronized (SilgeltonForMultithreading.class){
                      if(singelton == null){
                          singelton = new SilgeltonForMultithreading();
                      }
                  }
              }
        return singelton;
    }
}
