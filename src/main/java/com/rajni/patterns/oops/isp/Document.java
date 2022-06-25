package com.rajni.patterns.oops.isp;

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
