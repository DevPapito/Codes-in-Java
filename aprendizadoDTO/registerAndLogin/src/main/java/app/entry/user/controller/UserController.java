package app.entry.user.controller;

import app.entry.user.service.UserService;
import app.entry.user.repository.UserRepository;

import app.entry.user.DTO.UserCreateDTORequest;
import app.entry.user.DTO.UserUpdateDTORequest;
import app.entry.user.DTO.UserDeleteDTORequest;

import app.entry.user.DTO.UserDTOResponse;

public class UserController {

    private UserService service;
    private UserRepository repository;

    public UserController(UserService service, UserRepository repository) {

        this.service = service;
        this.repository = repository;

    }

    public String create(String name, String email, String password) {

        UserDTOResponse response = service.save(new UserCreateDTORequest(
                    name,
                    email,
                    password));

        if (response == null) return "Todos campos devem estar preenchidos";

        return "Usuario de nome "+response.name()+" foi criado com sucesso!";

    }

    public String read(long id) {

        UserDTOResponse response = service.showCurrentUser(id);

        if (response.id() == -1) return "Não é cadastrado ou campo errado";

        return String.format("Nome: %s\nEmail: %s\nPassword: %s\n",
                response.name(),
                response.email(),
                response.password());

    }

    public String update(long id, String name, String email, String password) {

        service.update(new UserUpdateDTORequest(
                    id,
                    name,
                    email,
                    password));

        return "Conta atualizada com sucesso!";

    }

    public String delete(long id, String name) {

        service.remove(new UserDeleteDTORequest(
                    id,
                    name));

        return "Conta "+name+"foi excluida com sucesos!";

    }

    public long readCurrentId(String password) {

        return service.getId(password);

    }

}
