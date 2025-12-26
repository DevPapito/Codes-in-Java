package learn.dto.repository;

import learn.dto.model.AppModel;

import java.util.List;
import java.util.ArrayList;

public class AppRepository {

    private List<AppModel> fakeDB = new ArrayList<>();

    public AppModel save(AppModel app) { fakeDB.add(app);

        return app;

    }

    public AppModel read(long id) { return fakeDB.get((int)id);}

}
