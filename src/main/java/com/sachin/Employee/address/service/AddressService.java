package com.sachin.Employee.address.service;

import com.sachin.Employee.address.model.Address;
import com.sachin.Employee.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return (List<Address>) addressRepository.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Long id, Address updatedAddress) {
        Address address = addressRepository.findById(id).orElse(null);
        if (address != null) {
            address.setStreet(updatedAddress.getStreet());
            address.setCity(updatedAddress.getCity());
            address.setState(updatedAddress.getState());
            address.setZipcode(updatedAddress.getZipcode());
            return addressRepository.save(address);
        }
        return null;
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}

