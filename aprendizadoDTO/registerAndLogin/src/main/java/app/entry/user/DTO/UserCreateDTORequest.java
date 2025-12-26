package app.entry.user.DTO;

public record UserCreateDTORequest(
        String name,
        String email,
        String password){}
