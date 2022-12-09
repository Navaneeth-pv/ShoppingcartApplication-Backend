package com.Nest.ShoppingcartAppBackend.dao;

import com.Nest.ShoppingcartAppBackend.model.UserRegistration;
import org.springframework.data.repository.CrudRepository;

public interface UserRegistrationDao extends CrudRepository<UserRegistration, Integer> {
}
