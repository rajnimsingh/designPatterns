package com.rajni.patterns.isp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class Document {
    private String title;
    private String description;
}
