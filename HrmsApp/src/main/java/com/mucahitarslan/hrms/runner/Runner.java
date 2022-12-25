package com.mucahitarslan.hrms.runner;

import com.mucahitarslan.hrms.dto.response.EmployerResponse;
import mernis.CSDKPSPublicSoap;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

//@Component
public class Runner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {

        deneme();
    }
    EmployerResponse employerResponse =
            new EmployerResponse("mucahitas","www.ss.com"
                    ,"+90567767767767","jsjs@mucahit.com");
    private String name = "ali";
    private String tempStr = "mucahitas";
    public void deneme() throws Exception {
        tempStr = tempStr.replace("a","i");
        employerResponse.companyName().replace("a","i");
        String changeStr = employerResponse.companyName().replace("a","i");

        System.out.println(changeStr);
        System.out.println(employerResponse.companyName());
        System.out.println(tempStr);

        CSDKPSPublicSoap publicSoap = new CSDKPSPublicSoap();
        var isReal = publicSoap.TCKimlikNoDogrula(Long.valueOf("111111111"),"MÜCAHİT","ARSLAN",1995);
        System.out.println(isReal);
    }
}
