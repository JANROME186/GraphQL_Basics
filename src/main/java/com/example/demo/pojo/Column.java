package com.example.demo.pojo;

import com.example.demo.enums.ValueConditionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Column {

    private ValueConditionType valuesConditionType;
    private String columnName;
    private List<String> values;

}
