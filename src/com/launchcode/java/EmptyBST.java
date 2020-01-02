package com.launchcode.java;

public class EmptyBST<D extends Comparable> implements Tree<D> {

    public EmptyBST(){

    }
    public boolean isEmpty(){
        return true;
    }
    public int cardinality(){   // = size
        return 0;
    }
    public boolean member(D elt){
        return false;
    }

    public boolean number(D elt){   //checks to see if node is in BS tree
        return false;
    }
    public NonEmptyBST<D> add(D elt){
        return new NonEmptyBST<D>(elt);
    }
}