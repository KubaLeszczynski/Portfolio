//package pl.kubal.portfolio;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
///**
// * Created by Jim on 2017-06-10.
// */
//@Component
//public class CronSimpleTask {
//
//    @Autowired
//    ProjectRepository projectRepository;
//
//    //@Scheduled(fixedRate = 1000*60*60*24) //hello pojawi sie co 24h
//    // format s m g d m (sekundy minuty godziny)
//    // * oznacza co kazda
//    // / oznacza co iles
//    @Scheduled(cron = "0 0 * * *")
//   // @Scheduled(cron = "*/10 * * * *")  // oznacza wyswietlenie co 10 sekund wiadomosci
//   // @Scheduled(cron = "0 0 20,21,22 * *") // oznacza wyswietlenie o 20,21 22
//   // @Scheduled(cron = "0 */30 20,21,22 * *") // oznacza wyswietlenie o 20,20:30,21,21:30 22
//   // @Scheduled(cron = "0 0 17-21 * * MON-FRI") // oznacza wyswietlenie o od poniedzialku do piatku miedzy 17-31
//   // @Scheduled(cron = "0 0 0 24 12") // wyswietli w wigilie (polnoc to godzina zero)
//    public void printSomething(){
//        System.out.println("Hello");
//    }
//}
