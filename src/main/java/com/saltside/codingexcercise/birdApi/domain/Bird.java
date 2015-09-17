package com.saltside.codingexcercise.birdApi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Neeraj on 9/14/2015.
 */
@Document
public class Bird {

    @Id
    private String id;



    /**
     * English bird name
     */
    private String name;

    /**
     * Latin bird family name
     */
    private String family;

    /**
     * Continents the bird exist on
     */
    private Set<String> continents = new LinkedHashSet<String>();


    /**
     * Date the bird was added to the registry. Format YYYY-MM-DD
     */
    private String added;

    /**
     * Determines if the bird should be visible in lists
     */
    private Boolean visible;


    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public Set<String> getContinents() {
        return continents;
    }

    public void setContinents(Set<String> continents) {
        this.continents = continents;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bird bird = (Bird) o;

        if (!id.equals(bird.id)) return false;
        if (!name.equals(bird.name)) return false;
        if (family != null ? !family.equals(bird.family) : bird.family != null) return false;
        if (continents != null ? !continents.equals(bird.continents) : bird.continents != null) return false;
        if (added != null ? !added.equals(bird.added) : bird.added != null) return false;
        return !(visible != null ? !visible.equals(bird.visible) : bird.visible != null);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + (continents != null ? continents.hashCode() : 0);
        result = 31 * result + (added != null ? added.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        return result;
    }
}
