package tr.com.mustafacay.singleton.service;

import java.util.UUID;

public class SingletonImpl implements Singleton{
    private static SingletonImpl singletonInstance;
    private static UUID uuId; //nesnenin tek olduğunun ispati


    /**
     * SingletonImpl sınıfına ait sınıfın çalışma zamanında
     * constructordan yararlanarak oluşturulmamamasını sağlar
     */
    private SingletonImpl() {

    }

    /**
     * multitheread uygulamalarda nesneye aynı anda erişimi önlemek amacı ile
     * double check işleminde kullanılmaktadır.
     */
    private static final Object synchronizedObject=new Object();

    public static  SingletonImpl getSingletonInstance() {
        System.out.println("getInstance");
        //Bu kısım, çoklu iş parçacığı ortamlarında güvenliği sağlamak için kritik bölgeyi belirtir.
        // synchronizedObject genellikle SingletonImpl sınıfının kendisi olur.
        // Bu, sadece bir iş parçacığının aynı anda bu bloğa girip içeriği çalıştırabileceği anlamına gelir.
        // Bu, birden fazla iş parçacığı aynı anda bu kodu yürütemez, bu da Singleton örneğinin yanlışlıkla
        // birden fazla kez oluşturulmasını engeller.
        synchronized (synchronizedObject)
        {
            System.out.println("Check --- 1"+synchronizedObject);
            if(singletonInstance==null) {
                System.out.println("Check --- 2");
                singletonInstance=new SingletonImpl();
            }
        }

        return singletonInstance;
    }
    @Override
    public Singleton clone() {
        try {
            return (Singleton)super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static UUID getUuId() {
        if(uuId==null) {
            uuId=java.util.UUID.randomUUID();
        }
        return uuId ;
    }
}
