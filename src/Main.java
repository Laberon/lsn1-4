public class Main {
    public static void main(String[] args) {

        int start=5;
        while (start>0) {
            System.out.println (start);
            start -- ;
        }

        /*
        //Напишем оператор действия
        do {
        //Далее обозначим начало цикла аренды машины
            startRent();
        //После спросим у пользователя, хочет ли он взять машину в аренду снова
            userWantsToRepeat = askFeedback();
        //И если да, то повторим цикл с арендой авто
        } while (userWantsToRepeat);


        if (!isQueueEmpty) { // Если очередь перед нами не пуста
	    wait(); // Ждём
        }

        if (!isQueueEmpty) { // Если очередь перед нами не пуста
	    wait(); // Ждём
        }

        if (!isQueueEmpty) { // Если очередь перед нами не пуста
	    wait(); // Ждём
        }
         */

        for (int i=0; i<10; i=i+1){
            System.out.println("Итерация цикла "+i);
        }
        for (int i=2020; i<2070; i=i+4){
            System.out.println("Високосный год " +i);
        }
        int salary=65535;
        int total=0;
      int i=0;
        for (;total<1_000_000;i++){
            total=total+total/100;
            total= total+salary;
            if (i % 5 == 0) {
                System.out.println("Месяц "+i+" Итого "+total);
            }
//            System.out.println(total);
        }
        System.out.println(total);
        System.out.println(i);
    }
}