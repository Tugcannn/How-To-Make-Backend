package com.example.HowToMake.Configuration;

import com.example.HowToMake.Service.UserRepository;
import com.example.HowToMake.User.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class UserConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {

        return args -> {
            User tugcan = new User(
                    1L,
                    "Tugcan",
                    "Hoser",
                    LocalDate.now(),
                    "turkey",
                    "KarnıYarık",
                    120,
                    "-6 tane patlıcan\n" +
                            "\n" +
                            "-3 tane sivri biber\n" +
                            "\n" +
                            "-1 tane domates\n" +
                            "\n" +
                            "Kıymalı harcı için;\n" +
                            "\n" +
                            "-2 tane orta boy soğan\n" +
                            "\n" +
                            "-200 gr kıyma\n" +
                            "\n" +
                            "-2 tane domates\n" +
                            "\n" +
                            "-2 tane sivri biber\n" +
                            "\n" +
                            "-2 diş sarımsak\n" +
                            "\n" +
                            "-Sıvı yağ\n" +
                            "\n" +
                            "-Tuz\n" +
                            "\n" +
                            "-Karabiber\n" +
                            "\n" +
                            "-Kırmızıbiber\n" +
                            "\n" +
                            "-1 çay bardağı sıcak su\n" +
                            "\n" +
                            "Sosu İçin;\n" +
                            "\n" +
                            "-1 kaşık salça\n" +
                            "\n" +
                            "-1 bardak su",
                    "Öncelikle patlıcanlarınızı alacalı bir şekilde soyun, bir tarafını bıçakla yardıktan sonra 15-20 dakika tuzlu suyun içinde bekletin. Daha sonra kurulayarak yanmaz bir tavanın içinde çok az yak sürerek her tarafını kızartın. Kızarak patlıcanları da havlu kağıdın üzerine alın. Geniş bir tencerenin içinde soğanları küp küp doğrayıp yağ ile birlikte kavurun. Üzerine kıymayı ekleyip karıştırın. Bu şekilde de biraz kavrulduktan sonra biber ve sarımsağı ekleyin. Yine küp küp doğradığınız domatesleri ekledikten sonra baharatını atıp karıştırın. En son sıcak suyu da ekledikten sonra 5 dakika kadar kaynatın ocaktan alın.\n" +
                            "\n" +
                            "Daha sonra patlıcanların yarın kısmından hafifi ayırın ve içine kıymalı harçtan koyun tencerenin içine dizin. Üzer,ne bir biber ve dilimlediğiniz domatesten bir dilim koyun. Tüm patlıcanlara aynı işlemi yapın. Daha sonra bir kabın içinde sosunu hazırlayın ve patlıcanların arasından tencereye dökün. Ağzını kapatın. 25-30 dakika kadar pişirin.\n" +
                            "\n" +
                            "Afiyet olsun."
            );
            User aydin = new User(
                    2L,
                    "Aydin",
                    "Hoser",
                    LocalDate.now(),
                    "england",
                    "Adana Kebap",
                    140,
                    "500 gr kuzu kıyma\n" +
                            "100 gr kuyruk yağı\n" +
                            "Pul biber\n" +
                            "Toz biber\n" +
                            "Tuz\n" +
                            "1 adet soğan",
                    "Kuyruk Yağını rondo dan ve kıyma makinesinden geçirin.\n" +
                            "Soğanı alın ve rendeleyin suyu fazla çıkarsa suyunu süzün.\n" +
                            "Hazırladığınız bütün malzemeleri karıştırın.\n" +
                            "Karıştırıp elde ettiğiniz bu harcı 1 saat kadar buz dolabında bekletin.\n" +
                            "Şişlerinizi hazırlayın ve ıslatın.\n" +
                            "Hazırladığınız harçtan alın ve şişe dizin.\n" +
                            "Fırınınızı 200 derecede ısıtın ve şişlerinizi tepsiye dizin.\n" +
                            "İsteğe göre şişlerinizin altına biber ve patates koyabilirsiniz.\n" +
                            "Şişlerinizi 200 derecede pişirin.\n" +
                            "Kuyruk yağı eklerseniz lezzetinin ne kadar arttırdığını göreceksiniz."

            );

            repository.saveAll(
                    List.of(tugcan, aydin)
            );
        };
     }
}
