package org.scd.service;

import org.scd.config.exception.BusinessException;
import org.scd.model.User;
import org.scd.model.dto.UserLoginDTO;
import org.scd.model.dto.UserRegisterDTO;
import org.scd.model.security.Role;
import org.scd.repository.RoleRepository;
import org.scd.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Objects;


public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final BCryptPasswordEncoder passwordEncoder;


    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<User> getUsers() {

        return (List<User>) userRepository.findAll();
    }

    @Override
    public User login(UserLoginDTO userLoginDTO) throws BusinessException {

        if (Objects.isNull(userLoginDTO)) {
            throw new BusinessException(401, "Body null !");
        }

        if (Objects.isNull(userLoginDTO.getEmail())) {
            throw new BusinessException(400, "Email cannot be null ! ");
        }

        if (Objects.isNull(userLoginDTO.getPassword())) {
            throw new BusinessException(400, "Password cannot be null !");
        }

        final User user = userRepository.findByEmail(userLoginDTO.getEmail());

        if (Objects.isNull(user)) {
            throw new BusinessException(401, "Bad credentials !");
        }

        if (!passwordEncoder.matches(userLoginDTO.getPassword(), user.getPassword())) {
            throw new BusinessException(401, "Bad credentials !");
        }

        return user;
    }

    @Override
    public Long register(UserRegisterDTO userRegisterDTO) throws BusinessException{
        if (Objects.isNull(userRegisterDTO)) {
            throw new BusinessException(401, "Body null !");
        }

        if (Objects.isNull(userRegisterDTO.getEmail())) {
            throw new BusinessException(400, "Email cannot be null ! ");
        }

        if (Objects.isNull(userRegisterDTO.getPassword())) {
            throw new BusinessException(400, "Password cannot be null !");
        }

        if (Objects.isNull(userRegisterDTO.getFirstName())){
            throw new BusinessException(400, "First Name cannot be null !");
        }

        if (Objects.isNull(userRegisterDTO.getLastName())){
            throw new BusinessException(400, "Last Name cannot be null !");
        }


          if (Objects.nonNull(userRepository.findByEmail(userRegisterDTO.getEmail()))){
              throw new BusinessException(409, "Email is already used by a different user!");
        }


        final User user = new User();
        user.setFirstName(userRegisterDTO.getFirstName());
        user.setLastName(userRegisterDTO.getLastName());
        user.setEmail(userRegisterDTO.getEmail());

        final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = bCryptPasswordEncoder.encode(userRegisterDTO.getPassword());

        user.setPassword(encodedPassword);


        Role role = roleRepository.findById(2L).get();
        user.getRoles().add(role);


        final User registerUser = userRepository.save(user);

        return registerUser.getId();
    }



}
