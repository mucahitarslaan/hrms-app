package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.core.utilities.results.DataResult;
import com.mucahitarslan.hrms.core.utilities.results.SuccessDataResult;
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
    public DataResult<List<Address>> findAll() {
        return new SuccessDataResult<>(addressRepository.findAll(),"All addresses are listed");
    }

    @Override
    public DataResult<Address> save(Address address){
        return new SuccessDataResult<>(addressRepository.save(address),"The address is saved");
    }
}
