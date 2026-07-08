package com.in28minutes.microservices.limits_service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Limits {
private int minimum;
private int maximum;

}
