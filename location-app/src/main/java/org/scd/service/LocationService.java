package org.scd.service;

import org.scd.config.exception.BusinessException;
import org.scd.model.dto.LocationCreateDTO;
import org.scd.model.dto.LocationDetailsDTO;
import org.scd.model.dto.LocationGetByIdDTO;
import org.scd.model.dto.LocationUpdateDTO;

import java.sql.Date;
import java.util.List;

public interface LocationService {
    /**
     * Create a new location
     * @param locationCreateDTO
     * @return created location id
     * @throws BusinessException
     */

    Long create(final LocationCreateDTO locationCreateDTO) throws BusinessException;

    /**
     * Get location by id
     * @param id
     * @return
     * @throws BusinessException
     */
    LocationGetByIdDTO getLocationById(final Long id) throws BusinessException;

    /**
     * Update location by id
     * @param id
     * @param locationUpdateDTO
     * @return
     * @throws BusinessException
     */
    LocationDetailsDTO updateLocationById(final Long id, LocationUpdateDTO locationUpdateDTO) throws BusinessException;

    /**
     * Delete location by id
     * @param id
     * @throws BusinessException
     */
    void deleteLocationById(Long id) throws BusinessException ;

    /**
     * Get list of users
     * @param userId
     * @param startDate
     * @param endDate
     * @return
     */
    List<LocationDetailsDTO> filterLocations(final Long userId, final Date startDate, final Date endDate);

}
