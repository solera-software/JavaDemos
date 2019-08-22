package com.solerasoftware.decorator;

/**
 * An interior design strategy, used to determine if decor items match a particular design motif.
 *
 * The <code>FunctionalInterface</code> annotation denotes that this is a single-method
 * interface. This allows lambda expressions to be used in its place.
 */
@FunctionalInterface
public interface InteriorDesign {
    boolean doesMatchInterior(DecorItem decorItem);
}
