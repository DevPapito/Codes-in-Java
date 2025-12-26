package learn.dto.service;

import learn.dto.repository.AppRepository;

import learn.dto.DTO.AppDTORequest;
import learn.dto.DTO.AppDTOResponse;

import learn.dto.model.AppModel;

public class AppService {

    private AppRepository repository = new AppRepository();
    private long id;

    public AppDTOResponse register(AppDTORequest dto) {

        if (dto.name().isEmpty() || dto.text().isEmpty()) {

            throw new RuntimeException("Vazios!");

        }

        // Salvando dado do dominio real/estrutura real
        repository.save(new AppModel(id++,
                    dto.name(),
                    dto.text()));

        // retornando o encapsulado
        return new AppDTOResponse(id++,
                dto.name(),
                dto.text());

    }

    public AppDTOResponse update(AppDTOUpdateRequest dto) {

        AppModel app = repository.read(dto.id());

        if (dto.name != null) app.setName(dto.name());
        if (dto.text != null) app.setText(dto.text());

        return new AppDTOResponse(app.getId(),
                app.getName(),
                app.getText());

    }

}
