package com.mucahitarslan.hrms.dto.request;

import com.mucahitarslan.hrms.entity.concretes.Role;
import com.mucahitarslan.hrms.entity.concretes.Staff;
import org.springframework.stereotype.Component;

@Component
public class StaffEntity {
    public Staff toStaff(StaffRequest staffRequest){
        Staff staff = new Staff();
        staff.setFirstName(staffRequest.getFirstName());
        staff.setLastName(staffRequest.getLastName());
        staff.setIdentityNumber(staffRequest.getIdentityNumber());
        staff.setPassword(staffRequest.getPassword());
        staff.setEmail(staffRequest.getEmail());
        staff.setRole(Role.USER);
        return staff;
    }
}
