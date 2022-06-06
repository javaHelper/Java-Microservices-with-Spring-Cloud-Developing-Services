package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TollRecord {
    private String stationId;
    private String licensePlate;
    private String timestamp;
}
