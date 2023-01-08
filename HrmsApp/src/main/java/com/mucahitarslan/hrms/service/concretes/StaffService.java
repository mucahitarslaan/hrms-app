package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.hrms.dataAccess.abstracts.IStaffRepository;
import com.mucahitarslan.hrms.entity.concretes.Staff;
import com.mucahitarslan.hrms.service.abstracts.IStaffService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService {
    private final IStaffRepository staffRepository;

    public StaffService(IStaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public DataResult<Staff> add(Staff staff) {
        return new SuccessDataResult<>(staffRepository.save(staff),"The staff is saved successfully");
    }

    @Override
    public DataResult<List<Staff>> getAll() {
        return new SuccessDataResult<>(staffRepository.findAll(),"The staffs are listed");
    }
}
