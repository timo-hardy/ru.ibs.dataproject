package ru.ibs.dataprojects.model;

/**
 * @author Timur Khidirov on 25.11.2021
 */
public enum DevelopmentMethodology {
    DEVELOPMENT_METHODOLOGY_WATERFALL("Waterfall"),
    DEVELOPMENT_METHODOLOGY_AGILE("Agile");

    private final String deveolpmentMethodology;

    DevelopmentMethodology(String deveolpmentMethodology) {
        this.deveolpmentMethodology = deveolpmentMethodology;
    }

    public String getDeveolpmentMethodology() {
        return deveolpmentMethodology;
    }
}
