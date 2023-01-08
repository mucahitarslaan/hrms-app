package com.mucahitarslan.hrms.controller;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Skill;
import com.mucahitarslan.hrms.entity.concretes.Staff;
import com.mucahitarslan.hrms.service.abstracts.ISkillService;
import com.mucahitarslan.hrms.service.abstracts.IStaffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/staffs")
public class StaffController {
    private final IStaffService staffService;

    public StaffController(IStaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public DataResult<List<Staff>> getAll(){
        return staffService.getAll();
    }

    @PostMapping
    public DataResult<Staff> add(@RequestBody Staff staff){
        return staffService.add(staff);
    }
}
