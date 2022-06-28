package org.scd.repository;

import org.scd.model.Location;
import org.scd.model.dto.LocationDetailsDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

/**
 * Location Repository
 */

public interface LocationRepository extends CrudRepository<Location, Long> {

    /**
     * Save location
     * @param location
     * @return
     */
    Location save(Location location);

    /**
     * Get location by id
     * @param id
     * @return
     */
    Location getById(final Long id);

    /**
     * Delete location by id
     * @param id
     */
    void deleteById(Long id);

    /**
     * Get list of users
     * @param userId
     * @param startDate
     * @param endDate
     * @return
     */
    @Query(value = "SELECT location FROM Location location WHERE (:userId is null OR  location.user_id = :userId) AND (:startDate is null OR location.date >= :startDate) AND (:endDate is null OR location.date <= :endDate)")
    List<Location> getLocations(@Param("userId") final Long userId, @Param("startDate") final Date startDate, @Param("endDate") final Date endDate);

}
