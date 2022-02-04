package com.example.demo.address;

import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class AddressService {

private final AddressRepository addressRepository;

@Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAddress(){
        return addressRepository.findAll();
    }

    public void addNewAddress(Address address) {
        System.out.println(address);
    }

    public void deleteAddress(Long addressId) {
        boolean exists =addressRepository.existsById(addressId);
        if(!exists){
            throw new IllegalStateException("User with id"+ "does not exists");
        }
        addressRepository.deleteById(addressId);
    }

    public void updateAddress(Long addressId, int apt_number, String city, String name, String state, int zip) {
        Address address = addressRepository.findById(addressId).orElseThrow(()->new IllegalStateException(
                "User with id"+addressId+"does not exist"));

        if(apt_number>0 && !Objects.equals(address.getAptNumber(),apt_number)) {
            address.setAptNumber(apt_number);
        }
        if(city!=null&&city.length()>0 && !Objects.equals(address.getCity(),city)){
            address.setCity(city);
        }
        if(name!=null&&name.length()>0 && !Objects.equals(address.getName(),name)){
            address.setName(name);
        }
        if(state!=null&&state.length()>0 && !Objects.equals(address.getState(), state)) {
            address.setState(state);
        }
        if(zip>0 && !Objects.equals(address.getZip(),zip)){
            address.setZip(zip);
        }
    }
}
