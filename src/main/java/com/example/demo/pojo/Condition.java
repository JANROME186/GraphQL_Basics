package com.example.demo.pojo;

import com.example.demo.enums.ColumnConditionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Condition {
    private ColumnConditionType columnsConditionType;
    private List<Column> columns;
}
