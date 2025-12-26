package app.entry.user.DTO;

public record UserDTOResponse(
        long id,
        String name,
        String email,
        String password){}
