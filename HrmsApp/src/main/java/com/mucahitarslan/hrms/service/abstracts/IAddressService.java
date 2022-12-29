package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.entity.concretes.Address;

import java.util.List;

public interface IAddressService {
    DataResult<List<Address>> findAll();
}
