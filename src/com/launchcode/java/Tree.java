package com.launchcode.java;

/*
* Comparable to decide which nodes go on the left (nodes smaller
* than the root) and which ones go on the right (nodes larger than
* the root).
* */

public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();  //will use recursion
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);

}
