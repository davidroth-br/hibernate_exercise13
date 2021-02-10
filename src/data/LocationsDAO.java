package data;

import entities.Locations;

import java.util.List;

public interface LocationsDAO {

    List<Locations> getAllLocations();
    Locations getLocationsById(Integer locationId);
    List<Locations> getLocationsFirstPage (int pageSize);
    void saveLocation(Locations loc);

}
