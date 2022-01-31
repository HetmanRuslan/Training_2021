package com.example.demo.address;

import com.example.demo.user.User;
import com.example.demo.user.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService=addressService;

    }

	@GetMapping
    public List<Address> getAddress(){
            return addressService.getAddress();
	}

    @PostMapping
    public void registerNewAddress(@RequestBody Address address){
        addressService.addNewAddress(address);
    }
    @DeleteMapping(path = "{AddressId}")
    public void deleteUser(@PathVariable("AddressId")Long AddressId){
        addressService.deleteAddress(AddressId);
    }
    @PutMapping(path = {"addressId"})
    public void updateUser(
            @PathVariable("addressId") Long addressId,
            @RequestParam(required = false) int apt_number,
            @RequestParam(required = false)String city,
            @RequestParam(required = false)String name,
            @RequestParam(required = false)String state,
            @RequestParam(required = false)int zip){
        addressService.updateAddress(addressId,apt_number,city,name,state,zip);
    }

}
