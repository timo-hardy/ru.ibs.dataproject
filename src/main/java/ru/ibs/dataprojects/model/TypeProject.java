package ru.ibs.dataprojects.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author Timur Khidirov on 24.11.2021
 */
@Data
@RequiredArgsConstructor
public final class TypeProject {
    private boolean isFixedAndPrice;
    private boolean isTimeAndMaterials;
    private boolean isSoftware;
    private boolean isSoftwareHardWareComplex;
    private boolean isMVP;
    private boolean isNotMvp;
    private boolean isNewDevelopment;
    private boolean isModernization;
}
