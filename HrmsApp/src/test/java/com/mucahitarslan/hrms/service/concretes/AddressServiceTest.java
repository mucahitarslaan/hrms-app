package com.mucahitarslan.hrms.service.concretes;

import com.mucahitarslan.hrms.dataAccess.abstracts.IAddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceTest {
    private AddressService addressService;

    private IAddressRepository addressRepository;


    @BeforeEach
    void setUp() {
        addressRepository = Mockito.mock(IAddressRepository.class);

        addressService = new AddressService(addressRepository);
    }

    @Test
    public void whenCalledFindAllMethod_itShouldReturn() {
    }

    @Test
    void save() {
    }
}