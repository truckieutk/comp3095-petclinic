package service;

import model.Owner;

public interface OwnerService {
    Owner findByLastName(String lastname);
    Owner findById(Long id);

}
