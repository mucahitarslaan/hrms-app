package com.mucahitarslan.hrms.service.abstracts;

import com.mucahitarslan.hrms.entity.concretes.Address;

import java.util.List;

public interface IAddressService {
    List<Address> findAll();

    Address save(Address address);
}
