package ru.ibs.dataprojects.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public final class TypeOfDevelopment {
    @Id
    @GeneratedValue
    @JsonIgnore
    private Long typeOfDevelopmentId;
    private boolean isTypeOfProductDevelopment;
    private boolean isTypeOfDevelopmentDesign;
}
