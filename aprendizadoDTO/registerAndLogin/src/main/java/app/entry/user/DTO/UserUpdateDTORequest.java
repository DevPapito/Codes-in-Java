package app.entry.user.DTO;

public record UserUpdateDTORequest(
        long id,
        String name,
        String email,
        String password
        ){}
