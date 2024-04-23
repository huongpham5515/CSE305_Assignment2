
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class RentalContract {
    

    
    public RentalContract(String contractId, String propertyId, String tenantId, String RentAmount) {
        
        this.contractId = contractId;
        this.propertyId = propertyId;
        this.tenantId = tenantId;
        this.RentAmount = RentAmount;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getRentAmount() {
        return RentAmount;
    }

    public void setRentAmount(String RentAmount) {
        this.RentAmount = RentAmount;
    }
    
    String contractId;
    String propertyId;
    String tenantId;
    String RentAmount;
    
    public void removeContract(String contractId, String propertyId, String tenantId, String rentAmount) {
        
    }
    
    public void addContract(String contractId) {
        
    }
}
