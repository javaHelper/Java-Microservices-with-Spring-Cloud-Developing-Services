package com.pluralsight.customerservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerDetails {
    private String contactId;
    private String contactName;
    private String postalCode;
    private String carType;
    private String licensePlate;
   
}
