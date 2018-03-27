/*
 * Copyright (c) 2013, Netherlands Forensic Institute
 * All rights reserved.
 */
package nl.minvenj.nfi.common_source_identification.filter;

public interface ImageFilter {
    /**
     * Applies this filter to the image represented by {@code pixels}.
     * 
     * @param pixels the pixels of the image to filter.
     */
    void apply(float[][] pixels);
}
