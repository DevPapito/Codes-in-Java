package app.entry.user.service;

import app.entry.user.repository.UserRepository;

import app.entry.user.model.User;

import app.entry.user.DTO.UserCreateDTORequest;
import app.entry.user.DTO.UserUpdateDTORequest;
import app.entry.user.DTO.UserDeleteDTORequest;

import app.entry.user.DTO.UserDTOResponse;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {

        this.repository = repository;

    }

    //TODO:makeDTO

    public UserDTOResponse save(UserCreateDTORequest dto) {

        if (dto.name().isEmpty() || dto.email().isEmpty() || dto.password().isEmpty()) {

            return null;

        }

        // Dominio real
        User local = repository.save(new User(
                    dto.name(),
                    dto.email(),
                    dto.password()));

        // Retorno de dominio
        return new UserDTOResponse(
            local.getId(),
            local.getName(),
            local.getEmail(),
            local.getPassword());

    }

    public UserDTOResponse update(UserUpdateDTORequest dto) {

        User local = new User(
                dto.id(),
                dto.name(),
                dto.email(),
                dto.password());

        User userUpdate = repository.update(local);

        return new UserDTOResponse(
                userUpdate.getId(),
                userUpdate.getName(),
                userUpdate.getEmail(),
                userUpdate.getPassword());

    }

    public void remove(UserDeleteDTORequest dto) {

        repository.delete(dto.id());

    }

    public UserDTOResponse showCurrentUser(long id) {

        try{

            User local = repository.read(id);

            if (local == null) return new UserDTOResponse(-1, null, null, null);


            return new UserDTOResponse(
                    local.getId(),
                    local.getName(),
                    local.getEmail(),
                    local.getPassword());

        }catch(IndexOutOfBoundsException e) {

            return new UserDTOResponse(-1, null, null, null);

        }



    }

    public long getId(String password) {

        return repository.findByPassword(password);

    }

}
