package dev.scjoao.bootcampapi.service;

import dev.scjoao.bootcampapi.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}