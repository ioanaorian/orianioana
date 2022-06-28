package org.scd.controller;

import org.scd.config.exception.BusinessException;
import org.scd.model.dto.LocationCreateDTO;
import org.scd.model.dto.LocationDetailsDTO;
import org.scd.model.dto.LocationGetByIdDTO;
import org.scd.model.dto.LocationUpdateDTO;
import org.scd.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.sql.Date;
import java.util.List;

@RestController()
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {

        this.locationService = locationService;
    }

    //Create new location
    @PostMapping
    public ResponseEntity createLocation(@RequestBody final LocationCreateDTO locationCreateDTO) throws BusinessException{
        final Long createLocationId = locationService.create(locationCreateDTO);
        final URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createLocationId)
                .toUri();
        return ResponseEntity.created(location).build();
    }

    //Get location by id
    @GetMapping("/{id}")
    public ResponseEntity<LocationGetByIdDTO> getLocationById(@PathVariable("id") final Long id) throws BusinessException {

        LocationGetByIdDTO response = locationService.getLocationById(id);
        return ResponseEntity.ok(response);

    }

    //Update location by id
    @PutMapping("/{id}")
    public ResponseEntity<LocationDetailsDTO> updateLocationById (@PathVariable("id") final Long id, @RequestBody final LocationUpdateDTO locationUpdateDTO) throws BusinessException{

        LocationDetailsDTO response = locationService.updateLocationById(id, locationUpdateDTO);
        return ResponseEntity.ok(response);

    }

    //Delete location by id
    @DeleteMapping("/{id}")
    public ResponseEntity deleteLocationById (@PathVariable("id") final Long id) throws BusinessException {

        locationService.deleteLocationById(id);
        return ResponseEntity.noContent().build();

    }

    //Filter locations byd userId/startDate/endDate
    @GetMapping(path = "/filter")
    public ResponseEntity<List<LocationDetailsDTO>> filterLocations(
            @RequestParam(name = "userId", required = false) final Long userId,
            @RequestParam(name = "startDate", required = false) final Date startDate,
            @RequestParam(name = "endDate", required = false) final Date endDate
            ){

        final List<LocationDetailsDTO> response = locationService.filterLocations(userId, startDate, endDate);
        return ResponseEntity.ok(response);
    }
}
