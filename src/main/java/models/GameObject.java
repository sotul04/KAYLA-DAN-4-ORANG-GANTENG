package models;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GameObject {

    private String typeObject;
    private String name;
    private boolean active;
    private Image image;

    public GameObject() {
        typeObject = "";
        name = "";
        active = false;
        image = null;
    }

    public GameObject(String typeObject, String name, boolean active, Image image) {
        this.typeObject = typeObject;
        this.name = name;
        this.active = active;
        this.image = image;
    }

    public GameObject(GameObject other) {
        this.typeObject = other.typeObject;
        this.name = other.name;
        this.active = other.active;
        this.image = other.image;
    }

    public String getTypeObject() {
        return typeObject;
    }

    public void setTypeObject(String typeObject) {
        this.typeObject = typeObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void deactivate(){
        setActive(false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GameObject that)) return false;
        return Objects.equals(typeObject, that.typeObject) && Objects.equals(name, that.name);
    }

}
