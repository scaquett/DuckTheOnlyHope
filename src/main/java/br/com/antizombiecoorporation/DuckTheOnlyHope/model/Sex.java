package br.com.antizombiecoorporation.DuckTheOnlyHope.model;

import lombok.AllArgsConstructor;

/**
 *
 * @author Willian Scaquett
 */
@AllArgsConstructor
public enum Sex {
    MALE("Masculino"),
    FEMALE("Feminino"),
    UNKNOWN("Não informado");

    public String name;
}
