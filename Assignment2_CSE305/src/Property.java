/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Property {
    String PropertyID;
    String Description;
    String PropertyOwnerID;

    public String getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(String PropertyID) {
        this.PropertyID = PropertyID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getPropertyOwnerID() {
        return PropertyOwnerID;
    }

    public void setPropertyOwnerID(String PropertyOwnerID) {
        this.PropertyOwnerID = PropertyOwnerID;
    }

    public Property(String PropertyID, String Description, String PropertyOwnerID) {
        this.PropertyID = PropertyID;
        this.Description = Description;
        this.PropertyOwnerID = PropertyOwnerID;
    }
}
