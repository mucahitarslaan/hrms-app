package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Staff;

import java.util.List;

public interface IStaffService {
    DataResult<Staff> add(Staff staff);

    DataResult<List<Staff>> getAll();
}
