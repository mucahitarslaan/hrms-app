package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.IAddressRepository;
import com.mucahitarslan.hrms.entity.concretes.Address;
import com.mucahitarslan.hrms.service.abstracts.IAddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService {

    private final IAddressRepository addressRepository;

    public AddressService(IAddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address save(Address address){
        return addressRepository.save(address);
    }

}
