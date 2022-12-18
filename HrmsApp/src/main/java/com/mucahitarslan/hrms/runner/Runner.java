package com.mucahitarslan.hrms.runner;

import com.mucahitarslan.hrms.dto.response.RecordEmployerResponse;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        deneme();
    }
    RecordEmployerResponse recordEmployerResponse=
            new RecordEmployerResponse("mucahitas","www.ss.com"
                    ,"+90567767767767","jsjs@mucahit.com");
    private String name = "ali";
    private String tempStr = "mucahitas";
    public void deneme(){
        tempStr = tempStr.replace("a","i");
        recordEmployerResponse.companyName().replace("a","i");
        String changeStr = recordEmployerResponse.companyName().replace("a","i");

        System.out.println(changeStr);
        System.out.println(recordEmployerResponse.companyName());
        System.out.println(tempStr);

    }
}
