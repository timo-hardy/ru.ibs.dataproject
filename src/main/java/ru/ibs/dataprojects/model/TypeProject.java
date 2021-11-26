package ru.ibs.dataprojects.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Timur Khidirov on 24.11.2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public final class TypeProject {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long typeProjectId;
    private boolean isFixedAndPrice;
    private boolean isTimeAndMaterials;
    private boolean isSoftware;
    private boolean isSoftwareHardWareComplex;
    private boolean isMVP;
    private boolean isNotMvp;
    private boolean isNewDevelopment;
    private boolean isModernization;
}
