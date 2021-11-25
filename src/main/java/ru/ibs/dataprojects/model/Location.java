package ru.ibs.dataprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Timur Khidirov on 25.11.2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location {
    @Id
    @GeneratedValue
    private long id;
    private boolean isRemoteLocation;
    private boolean isOfficeLocation;
    private String addressLocation;
}
