package org.scd.service;

import org.scd.config.exception.BusinessException;
import org.scd.model.Location;
import org.scd.model.User;
import org.scd.model.dto.LocationCreateDTO;
import org.scd.model.dto.LocationDetailsDTO;
import org.scd.model.dto.LocationGetByIdDTO;
import org.scd.model.dto.LocationUpdateDTO;
import org.scd.model.security.CustomUserDetails;
import org.scd.repository.LocationRepository;
import org.springframework.security.core.context.SecurityContextHolder;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository){
        this.locationRepository=locationRepository;
    }

    @Override
    public Long create(LocationCreateDTO locationCreateDTO) throws BusinessException {
        if (Objects.isNull(locationCreateDTO)) {
            throw new BusinessException(401, "Body null !");
        }

        if (Objects.isNull(locationCreateDTO.getLat())) {
            throw new BusinessException(400, "Latitude cannot be null ! ");
        }

        if (Objects.isNull(locationCreateDTO.getLng())) {
            throw new BusinessException(400, "Longitude cannot be null ! ");
        }


        final Location location = new Location();
        location.setLat(locationCreateDTO.getLat());
        location.setLng(locationCreateDTO.getLng());

        final User currentUser = ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
        location.setUser(currentUser);

        final Location createLocation = locationRepository.save(location);

        return createLocation.getId();
    }

    @Override
    public LocationGetByIdDTO getLocationById(final Long id) throws BusinessException{
        final Optional<Location> existingLocationOptional = locationRepository.findById(id);

        if(!existingLocationOptional.isPresent()){
            throw new BusinessException(404, "Location not found!");
        }

        final Location existingLocation = existingLocationOptional.get();
        final LocationGetByIdDTO locationGetByIdDTO = new LocationGetByIdDTO();
        locationGetByIdDTO.setId(id);
        locationGetByIdDTO.setUser_id(existingLocation.getUser_id());
        locationGetByIdDTO.setLat(existingLocation.getLat());
        locationGetByIdDTO.setLng(existingLocation.getLng());
        locationGetByIdDTO.setDate(existingLocation.getDate());

        return locationGetByIdDTO;
    }

    public LocationDetailsDTO updateLocationById(final Long id, LocationUpdateDTO locationUpdateDTO) throws BusinessException{

        if (Objects.isNull(locationUpdateDTO)) {
            throw new BusinessException(401, "Body null !");
        }

        if (Objects.isNull(locationUpdateDTO.getLat())) {
            throw new BusinessException(400, "Latitude cannot be null ! ");
        }

        if (Objects.isNull(locationUpdateDTO.getLng())) {
            throw new BusinessException(400, "Longitude cannot be null ! ");
        }

        final Long currentUserId = ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser().getId();
        Location location = locationRepository.getById(id);

        if(Objects.isNull(location)){
            throw new BusinessException(404, "Location not found!");
        }

        if(currentUserId == location.getUser_id())
        {
            location.setLat(locationUpdateDTO.getLat());
            location.setLng(locationUpdateDTO.getLng());

            Location locationUpdate = locationRepository.save(location);

            LocationDetailsDTO locationDetailsDTO = new LocationDetailsDTO();
            locationDetailsDTO.setId(id);
            locationDetailsDTO.setLat(locationUpdate.getLat());
            locationDetailsDTO.setLng(locationUpdate.getLng());
            locationDetailsDTO.setUser_id(locationUpdate.getUser_id());
            locationDetailsDTO.setDate(locationUpdate.getDate());

            return locationDetailsDTO;
        }
        else throw new BusinessException(401, "Unauthorized");


    }

    public void deleteLocationById(Long id) throws BusinessException{

        final Long currentUserId = ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser().getId();
        Location location = locationRepository.getById(id);

        if(Objects.isNull(location)){
            throw new BusinessException(404, "Location not found!");
        }

        if (currentUserId == location.getUser_id()){
            locationRepository.deleteById(id);
        }
        else throw new BusinessException(401, "Unauthorized");


    }

    public List<LocationDetailsDTO> filterLocations(final Long userId, final Date startDate, final Date endDate){

        final List<Location> locationList = locationRepository.getLocations(userId, startDate, endDate);
        final List<LocationDetailsDTO> locationDetailsDTOList = new ArrayList<>();
        for(Location location : locationList){

            LocationDetailsDTO locationDetailsDTO = new LocationDetailsDTO();

            locationDetailsDTO.setId(location.getId());
            locationDetailsDTO.setUser_id(location.getUser_id());
            locationDetailsDTO.setLat(location.getLat());
            locationDetailsDTO.setLng(location.getLng());
            locationDetailsDTO.setDate(location.getDate());

            locationDetailsDTOList.add(locationDetailsDTO);
        }

        return locationDetailsDTOList;
    }

}
