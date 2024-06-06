package com.system.client.dao;

import java.util.List;

import com.system.client.models.PhoneDTO;



public interface PhoneDAO {

    void savePhone(PhoneDTO phone);

    List<PhoneDTO> getAllPhones();

    PhoneDTO getPhoneById(Long id);

    void updatePhone(PhoneDTO phone);

    void deletePhone(PhoneDTO phone);
}
